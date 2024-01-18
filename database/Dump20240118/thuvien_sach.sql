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
-- Table structure for table `sach`
--

DROP TABLE IF EXISTS `sach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sach` (
  `ma_sach` int NOT NULL AUTO_INCREMENT COMMENT 'Primary Key',
  `ten_sach` varchar(255) DEFAULT NULL,
  `nam_xb` varchar(255) DEFAULT NULL,
  `ma_nxb` int DEFAULT NULL,
  `ma_theloai` int DEFAULT NULL,
  `ma_tacgia` int DEFAULT NULL,
  `anhSach` longblob,
  PRIMARY KEY (`ma_sach`),
  KEY `ma_nxb` (`ma_nxb`),
  KEY `ma_theloai` (`ma_theloai`),
  KEY `ma_tacgia` (`ma_tacgia`),
  CONSTRAINT `sach_ibfk_1` FOREIGN KEY (`ma_nxb`) REFERENCES `nha_xuat_ban` (`ma_nxb`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sach_ibfk_2` FOREIGN KEY (`ma_theloai`) REFERENCES `theloai` (`ma_theloai`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sach_ibfk_3` FOREIGN KEY (`ma_tacgia`) REFERENCES `tacgia` (`ma_tacgia`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sach`
--

LOCK TABLES `sach` WRITE;
/*!40000 ALTER TABLE `sach` DISABLE KEYS */;
INSERT INTO `sach` VALUES (2,'Conan','1994',2,2,2,NULL),(3,'Đắc nhân tâm','1936',2,3,3,NULL);
/*!40000 ALTER TABLE `sach` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-18 15:28:39