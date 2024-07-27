-- ★★★ここから制御文の為、誤って消さないよう注意する事★★★
-- #df:checkEnv(ut,saas,demo)#
-- ★★★ここまで制御文の為、誤って消さないよう注意する事★★★

-- #df:begin#
CREATE PROCEDURE `recreateSchemaProc`()
BEGIN
  DECLARE flag  INT  DEFAULT 1;
  DECLARE sname VARCHAR(100);
  DECLARE cname VARCHAR(100);
  DECLARE oname VARCHAR(100);
  DECLARE myCur CURSOR for
    select
      schema_name
     ,default_character_set_name
     ,default_collation_name
    from
      information_schema.schemata
    where
      schema_name = schema();
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET flag = 0;

  OPEN myCur;
  FETCH myCur INTO sname, cname, oname;
  CLOSE myCur;

  IF flag THEN
    SET @sqlstr = CONCAT('DROP SCHEMA `', sname, '`');
    PREPARE stmt from @sqlstr;
    EXECUTE stmt;
    DEALLOCATE PREPARE stmt;

    SET @sqlstr = CONCAT('CREATE SCHEMA `', sname, '` CHARACTER SET=', cname, ' COLLATE=', oname);
    PREPARE stmt from @sqlstr;
    EXECUTE stmt;
    DEALLOCATE PREPARE stmt;
  END IF;

END
-- #df:end#

CALL recreateSchemaProc();

use /*$dfprop.mainCatalog*/;

