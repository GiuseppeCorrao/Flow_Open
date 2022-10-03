CREATE TABLE IF NOT EXISTS Product(
product_id INTEGER(100) NOT NULL AUTO_INCREMENT,
product_name VARCHAR(30),
product_price INTEGER(300),
PRIMARY KEY (product_id));

CREATE TABLE IF NOT EXISTS User(
User_id INTEGER(100) NOT NULL AUTO_INCREMENT,
User_name VARCHAR(30),
User_surname VARCHAR(255),
User_age INTEGER(120),
User_birthday DATE,
User_sex ENUM('male', 'female'),
User_email VARCHAR(50),
User_password VARCHAR(30),
PRIMARY KEY (User_id));




