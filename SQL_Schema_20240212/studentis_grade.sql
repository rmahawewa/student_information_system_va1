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
-- Table structure for table `grade`
--

DROP TABLE IF EXISTS `grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grade` (
  `grade_id` int NOT NULL AUTO_INCREMENT,
  `grade_in_number` int DEFAULT NULL,
  `grade_in_words` varchar(45) DEFAULT NULL,
  `record_created_by` int DEFAULT NULL,
  `record_updated_by` int DEFAULT NULL,
  `record_created_at` datetime DEFAULT NULL,
  `record_updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`grade_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grade`
--

LOCK TABLES `grade` WRITE;
/*!40000 ALTER TABLE `grade` DISABLE KEYS */;
INSERT INTO `grade` VALUES (1,1,'Grade one',1,NULL,'2024-01-29 11:06:52',NULL),(2,2,'Grade two',1,NULL,'2024-01-29 11:47:36',NULL),(3,3,'Grade three',1,NULL,'2024-01-29 11:47:50',NULL),(4,4,'Grade four',1,NULL,'2024-01-29 11:48:04',NULL),(5,5,'Grade five',1,NULL,'2024-01-29 11:48:15',NULL),(6,6,'Grade six',1,NULL,'2024-01-29 11:48:27',NULL),(7,7,'Grade seven',1,NULL,'2024-01-29 11:48:38',NULL),(8,8,'Grade eight',1,NULL,'2024-01-29 11:48:51',NULL),(9,9,'Grade nine',1,NULL,'2024-01-29 11:49:02',NULL),(10,10,'Grade ten',1,NULL,'2024-01-29 11:49:14',NULL),(11,11,'Grade eleven',1,NULL,'2024-01-29 11:52:54',NULL),(12,12,'Grade twelve',1,NULL,'2024-02-02 21:12:27',NULL);
/*!40000 ALTER TABLE `grade` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-12 23:05:33
