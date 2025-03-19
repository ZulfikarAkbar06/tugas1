-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Mar 2025 pada 18.35
-- Versi server: 10.1.36-MariaDB
-- Versi PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbms55`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbgaji`
--

CREATE TABLE `tbgaji` (
  `gol` int(1) NOT NULL,
  `gapok` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbgaji`
--

INSERT INTO `tbgaji` (`gol`, `gapok`) VALUES
(1, 1500000),
(2, 2000000),
(3, 3500000),
(4, 5000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbpegawai`
--

CREATE TABLE `tbpegawai` (
  `nip` varchar(5) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `kota` varchar(15) NOT NULL,
  `thn_masuk` year(4) NOT NULL,
  `gol` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbpegawai`
--

INSERT INTO `tbpegawai` (`nip`, `nama`, `tgl_lahir`, `kota`, `thn_masuk`, `gol`) VALUES
('001', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('002', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('003', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('004', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('005', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('006', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('007', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('008', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('009', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3),
('010', 'Ahmad Burhanuddin', '1990-12-12', 'Bandung', 2010, 3);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbgaji`
--
ALTER TABLE `tbgaji`
  ADD PRIMARY KEY (`gol`);

--
-- Indeks untuk tabel `tbpegawai`
--
ALTER TABLE `tbpegawai`
  ADD PRIMARY KEY (`nip`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
