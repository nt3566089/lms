-- ★★★ここから制御文の為、誤って消さないよう注意する事★★★
-- #df:checkEnv(ut,saas,manual)#
-- ★★★ここまで制御文の為、誤って消さないよう注意する事★★★

-- #df:begin#
CREATE PROCEDURE `autoIncrementProc`()
BEGIN
  DECLARE flag  INT  DEFAULT 1;
  DECLARE tbl VARCHAR(200);
  DECLARE col VARCHAR(200);
  DECLARE cmt VARCHAR(200);
  DECLARE myCur CURSOR for
    select a.table_name, a.column_name, a.column_comment
    from information_schema.COLUMNS a
    where table_schema = schema()
    and column_key = 'PRI'
    and((
        concat(substring(table_name, 3), '_ID') = column_name
        and upper(table_name) <> upper('B_TOKEN')
    and (
 -- 除外したい場合は以下に条件を追加すること
          not (upper(table_name) = upper('H_STOCK') and upper(column_name) = upper('STOCK_ID'))
        )
    ) or (
        ((substring(table_name, 1, 2) = 'H_') and not (upper(table_name) = 'H_STOCK')  -- 履歴系は在庫以外はAUTO_INCREMENT
         and not (upper(table_name) = 'H_RECEIVE_SPARE') and not (upper(table_name) = 'H_SHIPPING_SPARE')) -- H_RECEIVE_SPARE/H_SHIPPING_SPAREの追加 2017.09.29 sampei
    ))
    order by table_name, column_name;
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET flag = 0;

  OPEN myCur;
  FETCH myCur INTO tbl, col, cmt;

  IF NOT flag THEN
    CLOSE myCur;
  END IF;

  WHILE flag DO
    SET @sqlstr = CONCAT('ALTER TABLE `', tbl, '` CHANGE `', col, '` `', col, '` BIGINT AUTO_INCREMENT COMMENT ''', cmt, '''');
    PREPARE stmt from @sqlstr;
    EXECUTE stmt;
    DEALLOCATE PREPARE stmt;
    FETCH myCur INTO tbl, col, cmt;
  END WHILE;

  CLOSE myCur;

END
-- #df:end#

CALL autoIncrementProc();

-- #df:begin#
DROP PROCEDURE autoIncrementProc;
-- #df:end#

SET foreign_key_checks=1;
