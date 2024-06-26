-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 26, 2024 lúc 10:37 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlns`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chamcong`
--

CREATE TABLE `chamcong` (
  `MaChamCong` varchar(15) NOT NULL,
  `MaNV` varchar(20) DEFAULT NULL,
  `Ngay` date DEFAULT NULL,
  `GioVao` time DEFAULT NULL,
  `GioRa` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `chamcong`
--

INSERT INTO `chamcong` (`MaChamCong`, `MaNV`, `Ngay`, `GioVao`, `GioRa`) VALUES
('mcc1', 'nv1', '2023-06-01', '08:00:00', '17:00:00'),
('mcc10', 'nv10', '2023-06-01', '08:15:00', '17:15:00'),
('mcc11', 'nv1', '2024-06-26', '15:35:26', '15:35:35'),
('mcc2', 'nv2', '2023-06-01', '08:15:00', '17:15:00'),
('mcc3', 'nv3', '2023-06-01', '08:30:00', '17:30:00'),
('mcc4', 'nv4', '2023-06-01', '09:00:00', '18:00:00'),
('mcc5', 'nv5', '2023-06-01', '08:00:00', '17:00:00'),
('mcc6', 'nv6', '2023-06-01', '08:15:00', '17:15:00'),
('mcc7', 'nv7', '2023-06-01', '08:30:00', '17:30:00'),
('mcc8', 'nv8', '2023-06-01', '09:00:00', '18:00:00'),
('mcc9', 'nv9', '2023-06-01', '08:00:00', '17:00:00');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hopdong`
--

CREATE TABLE `hopdong` (
  `MaHopDong` varchar(15) NOT NULL,
  `MaNV` varchar(20) DEFAULT NULL,
  `NgayBatDau` date DEFAULT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `Luong` float DEFAULT NULL,
  `CheDoDaiNgo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `hopdong`
--

INSERT INTO `hopdong` (`MaHopDong`, `MaNV`, `NgayBatDau`, `NgayKetThuc`, `Luong`, `CheDoDaiNgo`) VALUES
('hd1', 'nv1', '2023-01-01', '2023-12-31', 5000000, 'Abc@1'),
('hd10', 'nv10', '2023-10-01', '2023-12-31', 5700000, 'Abc@1'),
('hd2', 'nv2', '2023-02-01', '2023-12-31', 5500000, 'Abc@1'),
('hd3', 'nv3', '2023-03-01', '2023-12-31', 6000000, 'Abc@1'),
('hd4', 'nv4', '2023-04-01', '2023-12-31', 4500000, 'Abc@1'),
('hd5', 'nv5', '2023-05-01', '2023-12-31', 5200000, 'Abc@1'),
('hd6', 'nv6', '2023-06-01', '2023-12-31', 5300000, 'Abc@1'),
('hd7', 'nv7', '2023-07-01', '2023-12-31', 5400000, 'Abc@1'),
('hd8', 'nv8', '2023-08-01', '2023-12-31', 5500000, 'Abc@1'),
('hd9', 'nv9', '2023-09-01', '2023-12-31', 5600000, 'Abc@1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `luong`
--

CREATE TABLE `luong` (
  `MaLuong` varchar(15) NOT NULL,
  `MaNV` varchar(20) DEFAULT NULL,
  `LuongCoBan` float DEFAULT NULL,
  `PhuCap` float DEFAULT NULL,
  `Thuong` float DEFAULT NULL,
  `KhauTru` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `luong`
--

INSERT INTO `luong` (`MaLuong`, `MaNV`, `LuongCoBan`, `PhuCap`, `Thuong`, `KhauTru`) VALUES
('L1', 'nv1', 5000000, 500000, 1000000, 200000),
('L10', 'nv10', 5700000, 570000, 1140000, 228000),
('L2', 'nv2', 5500000, 550000, 1100000, 220000),
('L3', 'nv3', 6000000, 600000, 1200000, 240000),
('L4', 'nv4', 4500000, 450000, 900000, 180000),
('L5', 'nv5', 5200000, 520000, 1040000, 208000),
('L6', 'nv6', 5300000, 530000, 1060000, 212000),
('L7', 'nv7', 5400000, 540000, 1080000, 216000),
('L8', 'nv8', 5500000, 550000, 1100000, 220000),
('L9', 'nv9', 5600000, 560000, 1120000, 224000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nghiphep`
--

CREATE TABLE `nghiphep` (
  `MaNghiPhep` varchar(15) NOT NULL,
  `MaNV` varchar(20) DEFAULT NULL,
  `NgayBatDau` date DEFAULT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `LoaiNghiPhep` varchar(50) DEFAULT NULL,
  `LyDo` varchar(255) DEFAULT NULL,
  `TrangThai` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nghiphep`
--

INSERT INTO `nghiphep` (`MaNghiPhep`, `MaNV`, `NgayBatDau`, `NgayKetThuc`, `LoaiNghiPhep`, `LyDo`, `TrangThai`) VALUES
('np1', 'nv1', '2023-06-01', '2023-06-02', 'Nghỉ ốm', 'Ốm nặng', 'Đã duyệt'),
('np10', 'nv10', '2023-06-19', '2023-06-20', 'Nghỉ không lương', 'Việc cá nhân', 'Đã duyệt'),
('np2', 'nv2', '2023-06-03', '2023-06-04', 'Nghỉ phép', 'Đi du lịch', 'Đã duyệt'),
('np3', 'nv3', '2023-06-05', '2023-06-06', 'Nghỉ thai sản', 'Sinh con', 'Đã duyệt'),
('np4', 'nv4', '2023-06-07', '2023-06-08', 'Nghỉ tang', 'Gia đình có tang', 'Đã duyệt'),
('np5', 'nv5', '2023-06-09', '2023-06-10', 'Nghỉ không lương', 'Việc cá nhân', 'Đã duyệt'),
('np6', 'nv6', '2023-06-11', '2023-06-12', 'Nghỉ ốm', 'Ốm nhẹ', 'Đã duyệt'),
('np7', 'nv7', '2023-06-13', '2023-06-14', 'Nghỉ phép', 'Đi du lịch', 'Đã duyệt'),
('np8', 'nv8', '2023-06-15', '2023-06-16', 'Nghỉ thai sản', 'Sinh con', 'Đã duyệt'),
('np9', 'nv9', '2023-06-17', '2023-06-18', 'Nghỉ tang', 'Gia đình có tang', 'Đã duyệt');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(20) NOT NULL,
  `HoTen` varchar(255) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `GioiTinh` varchar(10) DEFAULT NULL,
  `DiaChi` varchar(255) DEFAULT NULL,
  `SoDienThoai` varchar(15) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `MaPB` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `HoTen`, `NgaySinh`, `GioiTinh`, `DiaChi`, `SoDienThoai`, `Email`, `MaPB`) VALUES
('nv1', 'Nguyễn Văn A', '1990-01-01', 'Nam', '123 Lê Lợi', '0901234567', 'a@gmail.com', 'pb1'),
('nv10', 'Hoàng Thị J', '1999-10-01', 'Nữ', '123 Nguyễn Huệ', '0910123456', 'j@gmail.com', 'pb10'),
('nv2', 'Trần Thị B', '1991-02-01', 'Nữ', '456 Hai Bà Trưng', '0902345678', 'b@gmail.com', 'pb2'),
('nv3', 'Lê Văn C', '1992-03-01', 'Nam', '789 Trần Hưng Đạo', '0903456789', 'c@gmail.com', 'pb3'),
('nv4', 'Phạm Thị D', '1993-04-01', 'Nữ', '123 Nguyễn Trãi', '0904567890', 'd@gmail.com', 'pb4'),
('nv5', 'Hoàng Văn E', '1994-05-01', 'Nam', '456 Lý Thường Kiệt', '0905678901', 'e@gmail.com', 'pb5'),
('nv6', 'Nguyễn Thị F', '1995-06-01', 'Nữ', '789 Lê Duẩn', '0906789012', 'f@gmail.com', 'pb6'),
('nv7', 'Trần Văn G', '1996-07-01', 'Nam', '123 Võ Thị Sáu', '0907890123', 'g@gmail.com', 'pb7'),
('nv8', 'Lê Thị H', '1997-08-01', 'Nữ', '456 Tôn Đức Thắng', '0908901234', 'h@gmail.com', 'pb8'),
('nv9', 'Phạm Văn I', '1998-09-01', 'Nam', '789 Lê Thánh Tôn', '0909012345', 'i@gmail.com', 'pb9');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phongban`
--

CREATE TABLE `phongban` (
  `MaPB` varchar(20) NOT NULL,
  `TenPB` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `phongban`
--

INSERT INTO `phongban` (`MaPB`, `TenPB`) VALUES
('pb1', 'Phòng Kế Toán'),
('pb10', 'Phòng Quản Lý Chất Lượng'),
('pb2', 'Phòng Nhân Sự'),
('pb3', 'Phòng IT'),
('pb4', 'Phòng Kinh Doanh'),
('pb5', 'Phòng Marketing'),
('pb6', 'Phòng Sản Xuất'),
('pb7', 'Phòng Thiết Kế'),
('pb8', 'Phòng Chăm Sóc Khách Hàng'),
('pb9', 'Phòng Nghiên Cứu Phát Triển');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MaNV` varchar(20) DEFAULT NULL,
  `TaiKhoan` varchar(255) DEFAULT NULL,
  `MatKhau` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`MaNV`, `TaiKhoan`, `MatKhau`) VALUES
(NULL, 'admin', 'admin1'),
('nv1', 'nv1', 'Abc@1'),
('nv2', 'nv2', 'Abc@1'),
('nv3', 'nv3', 'Abc@1'),
('nv4', 'nv4', 'Abc@1'),
('nv5', 'nv5', 'Abc@1'),
('nv6', 'nv6', 'Abc@1'),
('nv7', 'nv7', 'Abc@1'),
('nv8', 'nv8', 'Abc@1'),
('nv9', 'nv9', 'Abc@1'),
('nv10', 'nv10', 'Abc@1');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chamcong`
--
ALTER TABLE `chamcong`
  ADD PRIMARY KEY (`MaChamCong`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Chỉ mục cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD PRIMARY KEY (`MaHopDong`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Chỉ mục cho bảng `luong`
--
ALTER TABLE `luong`
  ADD PRIMARY KEY (`MaLuong`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Chỉ mục cho bảng `nghiphep`
--
ALTER TABLE `nghiphep`
  ADD PRIMARY KEY (`MaNghiPhep`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `MaPB` (`MaPB`);

--
-- Chỉ mục cho bảng `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`MaPB`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD UNIQUE KEY `TaiKhoan` (`TaiKhoan`),
  ADD KEY `MaNV` (`MaNV`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chamcong`
--
ALTER TABLE `chamcong`
  ADD CONSTRAINT `chamcong_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `luong`
--
ALTER TABLE `luong`
  ADD CONSTRAINT `luong_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `nghiphep`
--
ALTER TABLE `nghiphep`
  ADD CONSTRAINT `nghiphep_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`MaPB`) REFERENCES `phongban` (`MaPB`) ON DELETE SET NULL;

--
-- Các ràng buộc cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
