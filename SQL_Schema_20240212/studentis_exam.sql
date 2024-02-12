-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: studentis
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
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam` (
  `exam_id` int NOT NULL AUTO_INCREMENT,
  `exam_code` varchar(45) NOT NULL DEFAULT 'defaultexamcode',
  `semester` varchar(45) DEFAULT NULL,
  `from_date` date DEFAULT NULL,
  `to_date` date DEFAULT NULL,
  `record_created_by` int NOT NULL,
  `record_updated_by` int DEFAULT NULL,
  `record_created_at` datetime NOT NULL,
  `record_updated_at` datetime DEFAULT NULL,
  `exam_name` varchar(45) DEFAULT NULL,
  `details` text,
  `year` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES (1,'2024mid','Second Semester','2025-05-04','2025-05-12',1,1,'2024-01-29 16:44:10','2024-02-02 15:12:59','2024 mid year exam','This exam will be scheduled for all grades','2025'),(2,'2024final','Second Semester','2024-08-23','2024-08-30',1,NULL,'2024-01-29 18:37:08',NULL,'2024 final year exam','Thia exam will be scheduled for every grade','2024'),(3,'2025mid','First Semester','2025-04-04','2025-04-10',1,NULL,'2024-01-29 21:15:02',NULL,'2025 mid level exam','This exam will have practical sessions','2025'),(4,'2025final','Second Semester','2025-10-08','2025-10-26',1,NULL,'2024-01-29 22:33:19',NULL,'2025 final exam','Exam is conducted from District level','2025'),(5,'t1','Second Semester','2025-08-04','2025-08-14',1,NULL,'2024-01-29 22:37:47',NULL,'t1','t1','2025'),(6,'test12345','Second Semester','2028-05-03','2028-05-08',1,NULL,'2024-01-30 15:44:40',NULL,'test','test','2028'),(7,'t','Third Semester','2024-04-04','2024-04-04',1,NULL,'2024-01-30 19:17:10',NULL,'t','t','2024'),(8,'t','Forth Semester','2024-04-04','2024-04-07',1,NULL,'2024-01-30 19:18:48',NULL,'t','t','2024'),(9,'t','Third Semester','2025-04-04','2025-04-07',1,NULL,'2024-01-30 19:26:04',NULL,'t','t','2025'),(10,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 18:39:04',NULL,'t','t','2024'),(11,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 18:40:12',NULL,'t','t','2024'),(12,'ඒ','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 18:51:21',NULL,'ඒ','ඒ','2024'),(13,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:01:53',NULL,'t','t','2024'),(14,'s','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:13:18',NULL,'s','s','2024'),(15,'ඒ','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:15:43',NULL,'ඒ','ඒ','2024'),(16,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:17:50',NULL,'t','t','2024'),(17,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:20:53',NULL,'t','t','2024'),(18,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:23:11',NULL,'t','t','2024'),(19,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:24:22',NULL,'t','t','2024'),(20,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:25:23',NULL,'t','t','2024'),(21,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 19:56:29',NULL,'t','t','2024'),(22,'t','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 20:27:41',NULL,'t','g,h.h,s','2024'),(23,'rrrrek','First Semester','2024-01-31','2024-01-31',1,NULL,'2024-01-31 20:29:39',NULL,'s','d;k:n,b.j/b\\c\"g','2024');
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-12 23:05:34
