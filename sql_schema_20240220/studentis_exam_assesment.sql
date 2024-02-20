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
-- Table structure for table `exam_assesment`
--

DROP TABLE IF EXISTS `exam_assesment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam_assesment` (
  `e_a_id` int NOT NULL AUTO_INCREMENT,
  `exam_id` int NOT NULL,
  `assesment_id` int NOT NULL,
  `e_a_session` int DEFAULT NULL,
  `grade_id` int DEFAULT NULL,
  `level` varchar(45) DEFAULT NULL,
  `record_created_by` int DEFAULT NULL,
  `record_updated_by` int DEFAULT NULL,
  `record_created_at` datetime DEFAULT NULL,
  `record_updated_at` datetime DEFAULT NULL,
  `date_and_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`e_a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_assesment`
--

LOCK TABLES `exam_assesment` WRITE;
/*!40000 ALTER TABLE `exam_assesment` DISABLE KEYS */;
INSERT INTO `exam_assesment` VALUES (1,3,2,1,1,'Regional Level',1,1,'2024-02-03 22:30:40','2024-02-10 15:11:42','2024-September-03 1:00:00'),(2,4,2,1,2,'Whole Island Level',1,1,'2024-02-03 22:43:13','2024-02-10 15:12:27','2024-August-03 1:00:00'),(3,4,1,1,1,'Regional Level',1,1,'2024-02-03 22:44:38','2024-02-10 15:10:45','2024-April-03 11:00:00');
/*!40000 ALTER TABLE `exam_assesment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-20 19:27:34
