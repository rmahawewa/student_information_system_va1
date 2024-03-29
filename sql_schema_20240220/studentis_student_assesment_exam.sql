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
-- Table structure for table `student_assesment_exam`
--

DROP TABLE IF EXISTS `student_assesment_exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_assesment_exam` (
  `student_assesment_exam_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `marks` varchar(45) DEFAULT NULL,
  `remarks` varchar(45) DEFAULT NULL,
  `description` mediumtext,
  `record_created_by` int DEFAULT NULL,
  `record_updated_by` int DEFAULT NULL,
  `record_created_at` datetime DEFAULT NULL,
  `record_updated_at` datetime DEFAULT NULL,
  `exam_assesment_id` int DEFAULT NULL,
  PRIMARY KEY (`student_assesment_exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_assesment_exam`
--

LOCK TABLES `student_assesment_exam` WRITE;
/*!40000 ALTER TABLE `student_assesment_exam` DISABLE KEYS */;
INSERT INTO `student_assesment_exam` VALUES (1,1,'75','Good','Consistancy is key',1,NULL,'2024-02-11 18:10:39',NULL,2),(2,1,'90','Very good','Consistancy is key',1,NULL,'2024-02-12 15:35:10',NULL,3),(3,1,'75','Better','Study mathematical permutations and combinations. You will be smart in UI designing.',1,NULL,'2024-02-17 20:15:00',NULL,1),(4,1,'85','better','Study Set theory in mathematics. You will be smart in Object Oriented Programming concepts like Super classes, Sub classes, and abstraction etc.',1,NULL,'2024-02-17 20:19:56',NULL,1);
/*!40000 ALTER TABLE `student_assesment_exam` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-20 19:27:32
