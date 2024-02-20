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
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `student_ic` varchar(45) DEFAULT NULL,
  `student_passport_number` varchar(45) DEFAULT NULL,
  `record_created_by` int DEFAULT NULL,
  `record_updated_by` int DEFAULT NULL,
  `record_created_at` datetime DEFAULT NULL,
  `record_updated_at` datetime DEFAULT NULL,
  `is_current_student` int DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `student_address` text,
  `student_contact_number` varchar(25) DEFAULT NULL,
  `student_birthday` varchar(25) DEFAULT NULL,
  `date_of_entarance` varchar(25) DEFAULT NULL,
  `student_photo_file_path` mediumtext,
  `grade_in_year_of_entarance` int DEFAULT NULL,
  `year_of_entarance` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'915245201v','375845236',1,NULL,'2024-02-11 18:36:20',NULL,1,'samana kireema','earth',NULL,NULL,NULL,NULL,1,'2020-01-01'),(2,'12345','12345678910',1,NULL,'2024-02-12 22:22:01',NULL,1,'g','g','0712735639','2015-01- 01','2020-01-01','C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\SIS\\.\\img\\g_1707756720638.jpg',5,'2020-01-01'),(3,'916832575V','12345678910',1,NULL,'2024-02-12 22:44:16',NULL,1,'Ravini Dimanthi Mahawewa','Colombo','0712735639','2015-01- 01','2020-01-01','C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\SIS\\.\\img\\Ravini Dimanthi Mahawewa_1707758055812.jpg',1,'2017-01-01'),(4,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,8,'2022-01-01');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-20 19:27:33
