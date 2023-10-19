-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 05, 2021 at 07:26 AM
-- Server version: 5.7.24
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_progmob`
--

-- --------------------------------------------------------

--
-- Table structure for table `master_petani`
--

CREATE TABLE `master_petani` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `provinsi` varchar(255) NOT NULL,
  `kabupaten` varchar(255) NOT NULL,
  `kecamatan` varchar(255) NOT NULL,
  `kelurahan` varchar(255) NOT NULL,
  `nama_istri` varchar(255) NOT NULL,
  `jumlah_lahan` int(11) NOT NULL,
  `foto` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `master_petani`
--

INSERT INTO `master_petani` (`id`, `nama`, `alamat`, `provinsi`, `kabupaten`, `kecamatan`, `kelurahan`, `nama_istri`, `jumlah_lahan`, `foto`) VALUES
(2, 'Argo Wibowo', 'Bantul', 'Daerah Istimewa Yogyakarta', 'Bantul', 'Bangunjiwo', 'Kasihan', 'Bu Argo Wibowo', 2, 'oisjdfshiuewyroiuwiohfsjdfsdf'),
(4, 'Argo Wibowo 4', 'Bantul', 'Daerah Istimewa Yogyakarta', 'Bantul', 'Bangunjiwo', 'Kasihan', 'Bu Argo Wibowo', 2, 'oisjdfshiuewyroiuwiohfsjdfsdf'),
(15, 'Nama', 'Alamat', 'Provinsi', 'Kabupaten', 'Kecamatan', 'Kelurahan', 'Nama Istri', 678789, 'Foto'),
(16, 'Nama', 'Alamat', 'Provinsi', 'Kabupaten', 'Kecamatan', 'Kelurahan', 'Nama Istri', 456, 'Foto'),
(17, 'Argo Wibowo', 'Bantul', 'Daerah Istimewa Yogyakarta', 'Bantul', 'Bangunjiwo', 'Kasihan', 'Bu Argo Wibowo', 2, 'oisjdfshiuewyroiuwiohfsjdfsdf'),
(18, 'Argo Wibowo', 'Bantul', 'Daerah Istimewa Yogyakarta', 'Bantul', 'Bangunjiwo', 'Kasihan', 'Bu Argo Wibowo', 2, 'oisjdfshiuewyroiuwiohfsjdfsdf'),
(19, 'Argo Wibowo', 'Bantul', 'Daerah Istimewa Yogyakarta', 'Bantul', 'Bangunjiwo', 'Kasihan', 'Bu Argo Wibowo', 2, 'oisjdfshiuewyroiuwiohfsjdfsdf'),
(20, 'Argo Wibowo', 'Bantul', 'Daerah Istimewa Yogyakarta', 'Bantul', 'Bangunjiwo', 'Kasihan', 'Bu Argo Wibowo', 2, 'oisjdfshiuewyroiuwiohfsjdfsdf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `master_petani`
--
ALTER TABLE `master_petani`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `master_petani`
--
ALTER TABLE `master_petani`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
