-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema_vacunas
-- ------------------------------------------------------
-- Server version	5.6.50-log

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
-- Table structure for table `distrito`
--

DROP TABLE IF EXISTS `distrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `distrito` (
  `iddistrito` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_distrito` varchar(100) NOT NULL,
  PRIMARY KEY (`iddistrito`),
  UNIQUE KEY `nombre_distrito_UNIQUE` (`nombre_distrito`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distrito`
--

LOCK TABLES `distrito` WRITE;
/*!40000 ALTER TABLE `distrito` DISABLE KEYS */;
INSERT INTO `distrito` VALUES (1,'Ancón'),(2,'Ate Vitarte'),(3,'Barranco'),(4,'Breña'),(5,'Carabayllo'),(6,'Chaclacayo'),(7,'Chorrillos'),(8,'Cieneguilla'),(9,'Comas'),(10,'El Agustino'),(11,'Independencia'),(12,'Jesús María'),(13,'La Molina'),(14,'La Victoria'),(15,'Lima'),(16,'Lince'),(17,'Los Olivos'),(18,'Lurigancho'),(19,'Lurín'),(20,'Magdalena del Mar'),(21,'Miraflores'),(22,'Pachacamac'),(23,'Pucusana'),(24,'Pueblo Libre'),(25,'Puente Piedra'),(26,'Punta Hermosa'),(27,'Punta Negra'),(28,'Rímac'),(29,'San Bartolo'),(30,'San Borja'),(31,'San Isidro'),(32,'San Juan de Lurigancho'),(33,'San Juan de Miraflores'),(34,'San Luis'),(35,'San Martín de Porres'),(36,'San Miguel'),(37,'Santa Anita'),(38,'Santa María del Mar'),(39,'Santa Rosa'),(40,'Santiago de Surco'),(41,'Surquillo'),(42,'Villa El Salvador'),(43,'Villa María del Triunfo');
/*!40000 ALTER TABLE `distrito` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-02 18:32:40
