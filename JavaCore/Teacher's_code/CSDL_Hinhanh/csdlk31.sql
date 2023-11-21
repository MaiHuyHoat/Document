-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 21, 2018 lúc 06:16 AM
-- Phiên bản máy phục vụ: 10.1.31-MariaDB
-- Phiên bản PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `csdlk31`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblophoc`
--

CREATE TABLE `tblophoc` (
  `Malop` int(11) NOT NULL,
  `Tenlop` varchar(30) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `tblophoc`
--

INSERT INTO `tblophoc` (`Malop`, `Tenlop`) VALUES
(1, 'Lập trình K30'),
(2, 'Lập trình K31'),
(3, 'Đồ họa K31'),
(4, 'Quản trị mạng K31'),
(5, 'Lớp mới 1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbsinhvien`
--

CREATE TABLE `tbsinhvien` (
  `id` int(11) NOT NULL,
  `masv` varchar(10) NOT NULL,
  `hoten` varchar(30) CHARACTER SET utf8 NOT NULL,
  `gioitinh` tinyint(1) NOT NULL,
  `diachi` varchar(100) CHARACTER SET utf8 NOT NULL,
  `malop` int(11) NOT NULL,
  `hinhanh` varchar(100) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `tbsinhvien`
--

INSERT INTO `tbsinhvien` (`id`, `masv`, `hoten`, `gioitinh`, `diachi`, `malop`, `hinhanh`) VALUES
(1, 'sv01', 'Nguyễn Văn Bình', 1, 'Hà nội', 1, NULL),
(3, 'SV02', 'Nguyễn Thị Hòa', 0, 'Hà Nam', 2, NULL),
(4, 'sv03', 'nguyen thi ha', 0, 'ho chi minh', 4, NULL),
(5, 'sv123456', 'Lê văn Bình', 1, 'Hà Nội', 1, '6LKK7UCZJNMTP8PJW1AE.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbuser`
--

CREATE TABLE `tbuser` (
  `username` varchar(30) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `tbuser`
--

INSERT INTO `tbuser` (`username`, `password`) VALUES
('admin', 'e10adc3949ba59abbe56e057f20f883e');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tblophoc`
--
ALTER TABLE `tblophoc`
  ADD PRIMARY KEY (`Malop`);

--
-- Chỉ mục cho bảng `tbsinhvien`
--
ALTER TABLE `tbsinhvien`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `masv` (`masv`),
  ADD KEY `malop` (`malop`);

--
-- Chỉ mục cho bảng `tbuser`
--
ALTER TABLE `tbuser`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tblophoc`
--
ALTER TABLE `tblophoc`
  MODIFY `Malop` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `tbsinhvien`
--
ALTER TABLE `tbsinhvien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tbsinhvien`
--
ALTER TABLE `tbsinhvien`
  ADD CONSTRAINT `tbsinhvien_ibfk_1` FOREIGN KEY (`malop`) REFERENCES `tblophoc` (`Malop`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
