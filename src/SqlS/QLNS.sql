create database QLNS;

use QLNS;

create table NHANVIEN (
	MaNV nvarchar(20) NOT NULL,
	HoTen nvarchar(255) NOT NULL,
	NgaySinh date NOT NULL,
    GioiTinh nvarchar(10) NOT NULL,
	DiaChi nvarchar(255),
	SoDienThoai nvarchar(15),
	Email nvarchar(255) NOT NULL,
    MaPB nvarchar(20) NOT NULL,
	PRIMARY KEY (MANV)
);

create table TAIKHOAN (
	MaNV nvarchar(20) NOT NULL,
	TaiKhoan nvarchar(255) NOT NULL,
    MatKhau nvarchar(255) NOT NULL,
	Email nvarchar(255),
	PRIMARY KEY (MANV)
);

Drop table TAIKHOAN;

insert into NHANVIEN (MaNV, HoTen, NgaySinh, GioiTinh, DiaChi, SoDienThoai, Email, MaPB)
values ('NV1', 'Nguyễn Văn A', '2003-01-01', 'Nam', 'Hà Nội', '0987654321', 'a@example.com', 'PB1');

insert into TAIKHOAN ( MaNV, TaiKhoan, Matkhau)
value ('000', 'admin', 'admin123'); 

select * from NHANVIEN;

select * from NHANVIEN where MaNV = '' or HoTen = 's';