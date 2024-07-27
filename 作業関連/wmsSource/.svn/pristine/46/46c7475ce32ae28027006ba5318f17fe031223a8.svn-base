
-- #df:begin#
-- 暗号化
CREATE FUNCTION f_encrypt (value VARCHAR(255))
RETURNS VARCHAR(255)
BEGIN
  IF 0 < f_encrypt_valid() THEN
    RETURN cast(replace(to_base64(aes_encrypt(value, f_ek(), f_iv())), char(10), '') as char);
  ELSE
    RETURN value;
  END IF;
END
-- #df:end#

-- #df:begin#
-- 復号化
CREATE FUNCTION f_decrypt (value VARCHAR(255))
RETURNS VARCHAR(255)
BEGIN
  IF 0 < f_encrypt_valid() THEN
    RETURN cast(aes_decrypt(from_base64(value), f_ek(), f_iv()) as char);
  ELSE
    RETURN value;
  END IF;
END
-- #df:end#

-- #df:begin#
-- 暗号化有効判定
CREATE FUNCTION f_encrypt_valid ()
RETURNS INT
BEGIN
  DECLARE isValid INT DEFAULT 1;
  select property_value into isValid from b_property where property_nm = 'encryptionFlg' and del_flg = '0';
  RETURN isValid;
END
-- #df:end#

-- #df:begin#
-- 秘密鍵
CREATE FUNCTION f_ek ()
RETURNS VARCHAR(20) DETERMINISTIC
BEGIN
  RETURN 'WmsEncryptKey';
END
-- #df:end#

-- #df:begin#
-- 初期化ベクトル
CREATE FUNCTION f_iv ()
RETURNS VARCHAR(16) DETERMINISTIC
BEGIN
  RETURN 'ed7m4hrrnzfeum26';
END
-- #df:end#
