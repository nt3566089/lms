-- ššš‚±‚±‚©‚ç§Œä•¶‚Ìˆ×AŒë‚Á‚ÄÁ‚³‚È‚¢‚æ‚¤’ˆÓ‚·‚é–ššš
-- #df:checkEnv(ut,saas,manual)#
-- ššš‚±‚±‚Ü‚Å§Œä•¶‚Ìˆ×AŒë‚Á‚ÄÁ‚³‚È‚¢‚æ‚¤’ˆÓ‚·‚é–ššš

-- #df:begin#
CREATE PROCEDURE `commonIndexCreateProc`()
BEGIN
  DECLARE flag  INT  DEFAULT 1;
  DECLARE tbl VARCHAR(200);
  DECLARE col VARCHAR(200);
  DECLARE cmt VARCHAR(200);
  DECLARE myCur CURSOR for
    select a.table_name, a.column_name
    from information_schema.COLUMNS a
    where table_schema = schema()
    and column_name = 'CONTROL_NO'
    order by table_name, column_name;
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET flag = 0;

  OPEN myCur;
  FETCH myCur INTO tbl, col;

  IF NOT flag THEN
    CLOSE myCur;
  END IF;

  WHILE flag DO
    SET @sqlstr = CONCAT('create index ', tbl, '_IXC on ', tbl, '(', col, ')');
    PREPARE stmt from @sqlstr;
    EXECUTE stmt;
    DEALLOCATE PREPARE stmt;
    FETCH myCur INTO tbl, col;
  END WHILE;

  CLOSE myCur;

END
-- #df:end#

CALL commonIndexCreateProc();

-- #df:begin#
DROP PROCEDURE commonIndexCreateProc;
-- #df:end#
