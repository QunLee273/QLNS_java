CREATE DATABASE QLTK;

USE QLTK;

CREATE TABLE TaiKhoan (
    email VARCHAR(50) PRIMARY KEY,
	username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
);

INSERT INTO TaiKhoan (username, password, email)
VALUES ('admin', 'admin123', 'admin@admin.com');

Select * From TaiKhoan;

delete from TaiKhoan where username='admin';

DROP TABLE TaiKhoan;