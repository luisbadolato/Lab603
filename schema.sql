DROP SCHEMA IF EXISTS unit603_inventory_service;
CREATE SCHEMA unit603_inventory_service;
USE unit603_inventory_service;
CREATE TABLE inventory (
	serial_number BIGINT PRIMARY KEY,
    quantity INT
);
INSERT INTO inventory (serial_number, quantity) VALUES
	(1, 50),
	(2, 10),
	(3, 15)
;


DROP SCHEMA IF EXISTS unit603_price_service;
CREATE SCHEMA unit603_price_service;
USE unit603_price_service;
DROP TABLE IF EXISTS price;
CREATE TABLE price (
	serial_number BIGINT PRIMARY KEY,
    product_name VARCHAR(255),
    price DOUBLE
);
INSERT INTO price (serial_number, product_name, price) VALUES
	(1, "shirt", 15.00),
	(2, "pants", 30.00),
	(3, "socks", 1.50)
;
