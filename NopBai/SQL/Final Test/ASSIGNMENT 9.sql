DROP DATABASE IF EXISTS test;
CREATE DATABASE IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS 	CUSTOMER;
CREATE TABLE IF NOT EXISTS 	CUSTOMER (
CustomerID TINYINT AUTO_INCREMENT PRIMARY KEY,
Name VARCHAR(30) NOT NULL,
Phone CHAR(10) NOT NULL,
Email VARCHAR(255),
Address VARCHAR(255) NOT NULL,
Note VARCHAR(255) NULL
);
INSERT INTO CUSTOMER (Name, Phone, Email, Address, Note)
VALUES 
('NGUYEN VIET ANH'	, '0123456789'	, 'anh@gmail.com'		, 'HA NOI'		, NULL),
('NGUYEN TAT THANH'	, '0123456987'	, 'thanh@gmail.com'		, 'HA NAM'		, NULL),
('NGUYEN ANH TUAN'	, '0321456789'	, 'tuan@gmail.com'		, 'HA TINH'		, NULL),
('QUE NGOC HAI'		, '0123654789'	, 'hai@gmail.com'		, 'HAI PHONG'	, NULL),
('NGUYEN QUANG HAI'	, '0111456789'	, 'quangh@gmail.com'	, 'BAC NINH'	, NULL),
('TRIEU VIET HUNG'	, '0122256789'	, 'hung@gmail.com'		, 'NAM DINH'	, NULL),
('DOAN VAN HAU'		, '0123666789'	, 'hau@gmail.com'		, 'HAI DUONG'	, NULL),
('DANG VAN LAM'		, '0123456888'	, 'lam@gmail.com'		, 'BAC GIANG'	, NULL),
('BUI TIEN DUNG'	, '0123456666'	, 'dung@gmail.com'		, 'NGHE AN'		, NULL),
('VU VAN THANH'		, '0123444489'	, 'vvthanh@gmail.com'	, 'THANH HOA'	, NULL);


DROP TABLE IF EXISTS 	CAR;
CREATE TABLE IF NOT EXISTS 	CAR (
CarID TINYINT AUTO_INCREMENT PRIMARY KEY,
Maker ENUM('HONDA','TOYOTA','NISSAN') NOT NULL,
Model VARCHAR(30) NOT NULL,
Year CHAR(4) NOT NULL,
Color CHAR(10) NOT NULL,
Note VARCHAR(30) NULL
);
INSERT INTO CAR ( Maker, Model, Year, Color, Note)
VALUES 
('HONDA'	, 'CR-V'	, '2010'	, 'XANH'	, NULL),
('TOYOTA'	, 'Vios'	, '2011'	, 'DO'	, NULL),
('NISSAN'	, 'Sunny'	, '2012'	, 'TIM'	, NULL),
('HONDA'	, 'Accord'	, '2013'	, 'VANG'	, NULL),
('TOYOTA'	, 'Altis'	, '2014'	, 'XANH'	, NULL),
('NISSAN'	, 'X-trail'	, '2015'	, 'DO'	, NULL),
('HONDA'	, 'City'	, '2016'	, 'TIM'	, NULL),
('TOYOTA'	, 'Fortuner', '2017'	, 'VANG'	, NULL),
('NISSAN'	, 'Terra'	, '2018'	, 'XANH'	, NULL),
('TOYOTA'	, 'Yaris'	, '2014'	, 'DO'	, NULL);


DROP TABLE IF EXISTS 	CAR_ORDER;
CREATE TABLE IF NOT EXISTS 	CAR_ORDER (
OrderID TINYINT AUTO_INCREMENT PRIMARY KEY,
CustomerID TINYINT NOT NULL,
CarID TINYINT NOT NULL,
Amount TINYINT DEFAULT 1 NOT NULL,
SalePrice INT NOT NULL,
OrderDate DATE NOT NULL,
DeliveryDate DATE,
DeliveryAddress VARCHAR(255) NOT NULL,
`Status` ENUM('0','1','2'),
Note VARCHAR(255) NULL,
FOREIGN KEY (CustomerID)
        REFERENCES CUSTOMER (CustomerID),
FOREIGN KEY (CarID)
        REFERENCES CAR (CarID)
);
INSERT INTO CAR_ORDER (CustomerID, CarID, Amount, SalePrice, OrderDate, DeliveryDate, DeliveryAddress, `Status`, Note)
VALUES 
(1	, 2	, 1	, 500000000		, '2011-05-05'	, '2011-05-19'	, 'HA NOI'		, '1'	, NULL),
(2	, 4	, 2	, 600000000		, '2013-05-05'	, '2013-05-20'	, 'HAI PHONG'	, '0'	, NULL),
(3	, 6	, 3	, 700000000		, '2015-05-05'	, '2015-05-22'	, 'HA NOI'		, '2'	, NULL),
(4	, 8	, 5	, 800000000		, '2017-05-05'	, '2017-05-20'	, 'HA NOI'		, '0'	, NULL),
(5	, 10, 4	, 900000000 	, '2018-05-05'	, '2018-05-19'	, 'HAI DUONG'	, '1'	, NULL),
(6	, 1	, 2	, 1000000000	, '2010-05-05'	, '2010-05-22'	, 'HA NOI'		, '2'	, NULL),
(7	, 3	, 1	, 500000000		, '2012-05-05'	, '2012-05-19'	, 'HA TINH'		, '1'	, NULL),
(8	, 5	, 2	, 550000000		, '2014-05-05'	, '2014-05-19'	, 'NAM DINH'	, '1'	, NULL),
(9	, 7	, 3	, 650000000		, '2018-05-05'	, '2018-05-22'	, 'HA NOI'		, '2'	, NULL),
(10	, 9	, 1	, 750000000		, '2018-05-05'	, '2018-05-20'	, 'HA NOI'		, '0'	, NULL);

-- CAU 2
SELECT cr.Name, co.Amount
FROM CUSTOMER cr 
JOIN CAR_ORDER co ON cr.CustomerID = co.CustomerID
WHERE co.`Status` = '1'
ORDER BY co.Amount ;

-- CAU 3
DROP TEMPORARY TABLE IF EXISTS TenHang;
CREATE TEMPORARY TABLE TenHang (CarID TINYINT);
INSERT INTO TenHang (CarID)
	SELECT CarID FROM CAR_ORDER WHERE YEAR(DeliveryDate) = '2018' AND `Status` = '1' ;

SELECT Maker
FROM CAR 
WHERE CarID IN (SELECT * 
				FROM TenHang);

-- CAU 4
DROP PROCEDURE IF EXISTS Old_Order;
DELIMITER $$
CREATE PROCEDURE Old_Order()
	BEGIN
		DELETE 	FROM CAR_ORDER
		WHERE `Status` = '2';
	END $$
DELIMITER ;

CALL Old_Order();
SELECT ROW_COUNT();

SELECT * FROM CAR_ORDER;

-- CAU 5
DROP PROCEDURE IF EXISTS DatHang;
DELIMITER $$
CREATE PROCEDURE DatHang()
	BEGIN
		SELECT cr.Name AS TenKhachHang, co.OrderID AS MaDonHang, co.Amount AS SoLuong, c.Maker AS TenHangSX
		FROM CUSTOMER cr
		JOIN CAR_ORDER co ON cr.CustomerID = co.CustomerID
		JOIN CAR c ON co.CarID = c.CarID
		WHERE `Status` = '0';
	END $$
DELIMITER ;

CALL DatHang();

-- CAU 6
DROP TRIGGER IF EXISTS CHECK_DATE;
DELIMITER $$
CREATE TRIGGER CHECK_DATE
BEFORE INSERT ON CAR_ORDER FOR EACH ROW
	BEGIN
		IF NEW.DeliveryDate > (NEW.OrderDate + 15) THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'NHAP SAI DU LIEU NGAY THANG';
		END IF;
	END $$
DELIMITER ;

INSERT INTO CAR_ORDER (CustomerID, CarID, Amount, SalePrice, OrderDate, DeliveryDate, DeliveryAddress, `Status`, Note)
VALUES (10	, 9	, 1	, 750000000		, '2018-05-05'	, '2019-05-05'	, 'HA NOI'		, '0'	, NULL); -- DL SAI