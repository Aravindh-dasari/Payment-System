-- use payments;
LOAD DATA INFILE
'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/Bank.csv'
INTO TABLE bank
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY 'n'
IGNORE 1 ROWS
(bic,bankname);

-- SHOW VARIABLES LIKE 'secure_file_priv';