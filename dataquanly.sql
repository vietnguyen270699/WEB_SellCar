-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlyxe
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `donhang`
--

DROP TABLE IF EXISTS `donhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donhang` (
  `maHoaDon` varchar(45) NOT NULL,
  `tenTaiKhoan` varchar(45) DEFAULT NULL,
  `tongGia` int(11) DEFAULT NULL,
  `ngayBan` date DEFAULT NULL,
  PRIMARY KEY (`maHoaDon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES ('DH001','vantinh',56000,'2019-05-07'),('DH002','hongloan',70000,'2019-06-11'),('DH003','vanquan',78000,'2019-07-27'),('DH004','viet',96000,'2019-10-11');
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhacungcap`
--

DROP TABLE IF EXISTS `nhacungcap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhacungcap` (
  `maNhaCungCap` varchar(45) NOT NULL,
  `tenNhaCungCap` varchar(45) DEFAULT NULL,
  `diaChiNhaCungCap` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`maNhaCungCap`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhacungcap`
--

LOCK TABLES `nhacungcap` WRITE;
/*!40000 ALTER TABLE `nhacungcap` DISABLE KEYS */;
INSERT INTO `nhacungcap` VALUES ('NCCAUDI','AUDI','Duc'),('NCCBMW','BMW','Duc'),('NCCHONDA','HONDA','NhatBan'),('NCCLEXUS','LEXUS','NhatBan'),('NCCTOYOTA','TOYOTA','NhatBan');
/*!40000 ALTER TABLE `nhacungcap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `maSanPham` varchar(45) NOT NULL,
  `tenSanPham` varchar(45) DEFAULT NULL,
  `giaBan` int(11) DEFAULT NULL,
  `maNhaCungCap` varchar(45) DEFAULT NULL,
  `hinhAnh` varchar(45) DEFAULT NULL,
  `moTa` varchar(45) DEFAULT NULL,
  `soLuong` int(11) DEFAULT NULL,
  PRIMARY KEY (`maSanPham`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES ('AUDI001','AUDI A1',69000,'NCCAUDI','audia1.jpg','1',1),('AUDI002','AUDI A2',71000,'NCCAUDI','audia2.jpg','1',1),('AUDI003','AUDI A5',84500,'NCCAUDI','audia5.jpg','2',2),('AUDI004','AUDI Q7',80000,'NCCAUDI','audiq7.jpg','1',1),('HONDA001','HONDA CITY-2017',75000,'NCCHONDA','hd2017.jpg','1',2),('HONDA002','HONDA CITY-2018',79000,'NCCHONDA','hd2018.jpg','1',2),('HONDA003','HONDA CITY-2019',82000,'NCCHONDA','hd2019.jpg','2',1),('HONDA004','HONDA CRV',71000,'NCCHONDA','hdcrv.jpg','1',1),('LEXUS001','LEXUS RX350',66000,'NCCLEXUS','lexusrx350.jpg','2',1),('LEXUS002','LEXUS LX570',59000,'NCCLEXUS','lexuslx570.jpg','1',2),('TOYOTA001','TOYOTA INNOVA',70000,'NCCTOYOTA','innova.jpg','2',3),('TOYOTA002','TOYOTA WIGO',73000,'NCCTOYOTA','wigi.jpg','2',4),('TOYOTA003','TOYOTA HILUX',73500,'NCCTOYOTA','hilux.jpg','1',1),('TOYOTA004','TOYOTA VIOS',86000,'NCCTOYOTA','vios.jpg','1',1);
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoan` (
  `tenTaiKhoan` varchar(45) NOT NULL,
  `matKhau` varchar(45) DEFAULT NULL,
  `tenKhachHang` varchar(45) DEFAULT NULL,
  `gioiTinh` varchar(45) DEFAULT NULL,
  `soDienThoai` varchar(45) DEFAULT NULL,
  `diaChi` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tenTaiKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoan`
--

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan` VALUES ('hongloan','hongloan123','Nguyễn Thị Hồng Loan','Nữ','0976554432','Đồng Nai','use'),('lanvi','lanvi123','nguyen thi lan vi','Nữ','0961234881','tiền Giang','user'),('quocviet','admin','Việt Nguyễn','Nam','0963058536','Bến Tre','admin'),('vantinh','vantinh123','Nguyễn Văn Tịnh','Nam','0977088076','TPHCM','use'),('viet','viet123','vietnguyen','Nam','963058534','Bến Tre','user'),('vietpro','viet123','vietnguyenpro','Nam','963058534','Bến Tre','user'),('vietpro11','viet123','vietnguyenpro','Nam','0963058534','Bến Tre','user');
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-10 14:10:22
