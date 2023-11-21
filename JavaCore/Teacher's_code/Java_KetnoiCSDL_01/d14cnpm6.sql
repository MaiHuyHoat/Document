-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2021 at 06:24 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `d14cnpm6`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbsinhvien`
--

CREATE TABLE `tbsinhvien` (
  `masv` varchar(20) NOT NULL,
  `hoten` varchar(30) NOT NULL,
  `dienthoai` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbsinhvien`
--

INSERT INTO `tbsinhvien` (`masv`, `hoten`, `dienthoai`) VALUES
('SV01', 'Nguyễn Văn Dũng', '987654321'),
('SV02', 'Bùi Thị Vân Anh', '0987654321'),
('SV03', 'Nguyễn Thế Anh', '6457634734'),
('SV04', 'Nguyễn Thị Dung', '987654321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbsinhvien`
--
ALTER TABLE `tbsinhvien`
  ADD PRIMARY KEY (`masv`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
