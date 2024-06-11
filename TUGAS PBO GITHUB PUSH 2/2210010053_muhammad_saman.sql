-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2024 at 01:31 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2210010053_muhammad_saman`
--

-- --------------------------------------------------------

--
-- Table structure for table `komoditas`
--

CREATE TABLE `komoditas` (
  `Nama` varchar(70) NOT NULL,
  `Lokasi` varchar(70) NOT NULL,
  `Subsektor` varchar(70) NOT NULL,
  `Luas_tanam` float NOT NULL,
  `Luas_panen` float NOT NULL,
  `Produktivitas` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `Provinsi` varchar(70) NOT NULL,
  `Kabupaten` varchar(70) NOT NULL,
  `Kecamatan` varchar(70) NOT NULL,
  `Desa` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `penyuluh`
--

CREATE TABLE `penyuluh` (
  `Nama` varchar(70) NOT NULL,
  `Alamat` varchar(70) NOT NULL,
  `Status` varchar(70) NOT NULL,
  `Wilayah` varchar(70) NOT NULL,
  `Subsektor` varchar(70) NOT NULL,
  `Tgl_mulai` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `petani`
--

CREATE TABLE `petani` (
  `Nama` varchar(70) NOT NULL,
  `Alamat` varchar(70) NOT NULL,
  `Poktan` varchar(70) NOT NULL,
  `Komoditas` varchar(70) NOT NULL,
  `Pelatihan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `komoditas`
--
ALTER TABLE `komoditas`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD PRIMARY KEY (`Provinsi`);

--
-- Indexes for table `penyuluh`
--
ALTER TABLE `penyuluh`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `petani`
--
ALTER TABLE `petani`
  ADD PRIMARY KEY (`Nama`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
