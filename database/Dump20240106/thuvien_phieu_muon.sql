-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: thuvien
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `phieu_muon`
--

DROP TABLE IF EXISTS `phieu_muon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieu_muon` (
  `ma_phieu` int NOT NULL AUTO_INCREMENT COMMENT 'Primary Key',
  `ngay_muon` date DEFAULT NULL COMMENT 'Create Time',
  `ngay_tra` date DEFAULT NULL,
  `ma_doc_gia` int NOT NULL,
  `ma_sach` int NOT NULL,
  `ma_nv` int NOT NULL,
  PRIMARY KEY (`ma_phieu`),
  KEY `ma_doc_gia` (`ma_doc_gia`),
  KEY `ma_sach` (`ma_sach`),
  KEY `ma_nv` (`ma_nv`),
  CONSTRAINT `phieu_muon_ibfk_1` FOREIGN KEY (`ma_doc_gia`) REFERENCES `doc_gia` (`ma_doc_gia`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `phieu_muon_ibfk_2` FOREIGN KEY (`ma_sach`) REFERENCES `sach` (`ma_sach`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `phieu_muon_ibfk_3` FOREIGN KEY (`ma_nv`) REFERENCES `nhanvien` (`ma_nv`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieu_muon`
--

LOCK TABLES `phieu_muon` WRITE;
/*!40000 ALTER TABLE `phieu_muon` DISABLE KEYS */;
INSERT INTO `phieu_muon` VALUES (1,'2024-01-04','2024-01-05',1,1,1),(2,'2024-01-04','2024-01-03',1,1,1),(3,'2024-01-11','2024-01-05',2,2,2);
/*!40000 ALTER TABLE `phieu_muon` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-06 22:12:23
