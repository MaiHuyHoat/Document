-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 28, 2022 lúc 02:29 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `thuchanhjdbc`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblophoc`
--

CREATE TABLE `tblophoc` (
  `malop` int(11) NOT NULL,
  `tenlop` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tblophoc`
--

INSERT INTO `tblophoc` (`malop`, `tenlop`) VALUES
(1, 'T2111E'),
(3, 'T2104E');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbsinhvien`
--

CREATE TABLE `tbsinhvien` (
  `id` int(11) NOT NULL,
  `masv` varchar(10) NOT NULL,
  `hoten` varchar(30) NOT NULL,
  `gioitinh` tinyint(1) NOT NULL,
  `diachi` varchar(100) NOT NULL,
  `malop` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbsinhvien`
--

INSERT INTO `tbsinhvien` (`id`, `masv`, `hoten`, `gioitinh`, `diachi`, `malop`) VALUES
(1, 'SV01', 'Nguyễn Văn Nam', 1, 'Hà nội', 1),
(2, 'SV02', 'Trần thị Linh', 0, 'Hà Nam', 3);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tblophoc`
--
ALTER TABLE `tblophoc`
  ADD PRIMARY KEY (`malop`);

--
-- Chỉ mục cho bảng `tbsinhvien`
--
ALTER TABLE `tbsinhvien`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uq_masv` (`masv`),
  ADD KEY `idx_malop` (`malop`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tblophoc`
--
ALTER TABLE `tblophoc`
  MODIFY `malop` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `tbsinhvien`
--
ALTER TABLE `tbsinhvien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tbsinhvien`
--
ALTER TABLE `tbsinhvien`
  ADD CONSTRAINT `tbsinhvien_ibfk_1` FOREIGN KEY (`malop`) REFERENCES `tblophoc` (`malop`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
