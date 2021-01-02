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
-- Table structure for table `hospital`
--

DROP TABLE IF EXISTS `hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospital` (
  `idhospital` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_hospital` varchar(100) NOT NULL,
  `direccion_hospital` varchar(256) NOT NULL,
  `iddistrito` int(11) NOT NULL,
  PRIMARY KEY (`idhospital`),
  UNIQUE KEY `nombre_hospital_UNIQUE` (`nombre_hospital`),
  KEY `hospital_distrito_idx` (`iddistrito`),
  CONSTRAINT `hospital_distrito` FOREIGN KEY (`iddistrito`) REFERENCES `distrito` (`iddistrito`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=428 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital`
--

LOCK TABLES `hospital` WRITE;
/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
INSERT INTO `hospital` VALUES (1,'Centro de Salud San José','Calle Pasto Andino S/N - Urb. San José (Ref. Paradero Chacas)',1),(2,'Centro de Salud Villa Estela','Mz B5 Lote 40 Villa Estela, Km. 39 Panamericana Norte',1),(3,'Centro de Salud Materno Infantil Ancón','Jr. Loa N° 595',1),(4,'Centro de Salud Santa Clara','Av. Estrella S/N Carretera Central Km 12',2),(5,'Centro de Salud Manylsa','Cooperativa Manylsa Mz F lote 1',2),(6,'Centro de Salud Horacio Zevallos','Av. Jaime Zubieta S/N AA.HH Horacio Zevallos',2),(7,'Centro de Salud Señor de los Milagros','Área de Servicio N° 11 B Lote 3 Zona K Huaycán',2),(8,'Centro de Salud Salamanca','Av. Los Mochicas N° 5131',2),(9,'Centro de Salud San Antonio','Asociación de Pobladores San Antonio',2),(10,'Centro de Salud Fortaleza','Av. Los Virreyes S/N',2),(11,'Centro de Salud Alfa y Omega','Cooperativa Alfa y Omega MZ W lote 4',2),(12,'Centro de Salud Gaudencio Bernasconi','Av. Almirante Grau N° 198',3),(13,'Centro de Salud La Flor','Jr. Puno Cdra. 3 S/N, Alt. Km.17 De Av. Tupac Amaru',5),(14,'Centro de Salud Villa Esperanza','Jr. 9 de Octubre Cdra. 02 S/N Pueblo Joven Villa Esperanza, Alt. Km 18 1/2 De Av. Tupac Amaru',5),(15,'Centro de Salud Raúl Porras Barrenechea','Jr. Arequipa Cdra. 04 S/N AA.HH Raúl Porras Barrenechea',5),(16,'Centro de Salud Juan Pablo III','Jr. San Fernando Mz N Lote 11 AA.HH Juan Pablo II',5),(17,'Centro Materno Infantil El Progreso','Av. Tupac Amaru Nº 2950 (Km 21)',5),(18,'Centro de Salud San Benito','MZ W1 - LOTE 2 - SAN BENITO 4TA. ETAPA',5),(19,'Centro de Salud Chaclacayo - López Silva','Las Retamas N° 300 Carretera Central Km 23',6),(20,'Centro de Salud Morón','Av. Unión AA.HH. Virgen de Fátima de Morón Carretera Central Km. 22.7, Mz E1 Lote 19-20',6),(21,'Centro de Salud Progreso','Av. Atahualpa N° 373 AA.HH Cultura y Progreso, referencia Paradero Ñaña',6),(22,'C.S. Tupac Amaru de Villa','- Chorrillos (Cerca al Mercado de Tupac)',7),(23,'C.M.I. San Genaro de Villa','Calle 8 S/N San Genaro (A espalda de la Comisar¡a de San Genaro ¾ Al frente)',7),(24,'Centro de Emergencia San Pedro de los Chorrillos','Jr. Ferrocarril S/N cruce con Av. Alejandro Iglesias',7),(25,'Centro de Salud Delicias de Villa','Jr. Carhuarazo S/N, cruce con la Av. Cordillera Occidental, II Zona Delicias de Villa',7),(26,'Centro Materno Infantil Buenos Aires de Villa','Calle 15 de Octubre cruce con calle Belén, Asoc. Pro NAv.idad de Villa',7),(27,'Centro de Salud Tambo Viejo','Av. Manco Capac S/N Zona A Km. 18.5',8),(28,'Centro de Salud El Álamo','Mz y Lote 1 Urb. El Álamo, a 2 cuadras del Aeroclub de Collique',9),(29,'Centro de Salud Santa Luzmila I','Av. Guillermo de la Fuente Cdra. 2 S/N - Urb. Santa Luzmila',9),(30,'Centro de Salud Año Nuevo','Jr. Bolognesi Cra.6 S/N Asociación Año Nuevo, Alt. Parroquia Año Nuevo',9),(31,'Centro de Salud Collique III Zona','Av. Santa Rosa Cdra. 9 III Zona De Collique, Alt. Km.14 1/2 De La Av. Tupac Amaru',9),(32,'Centro de Salud Carlos A. Protzel','Jr. Andrés Belaunde Este Cdra. 2 S/N, Carmen Bajo. Comas, altura Km. 13 De La Av. Tupac Amaru. Ingreso por la Av. Belaunde Este',9),(33,'Centro de Salud Clorinda Málaga','Jr. Atahualpa S/N Pueblo Joven Villa Clorinda, Alt. Km 8 1/2 de Av. Tupac Amaru',9),(34,'Centro de Salud Comas','Jr. Puno Cdra. 4 S/N Barrio Santa Rosa, Alt. Km 11 De La Av. Tupac Amaru',9),(35,'Centro de Salud Santiago Apóstol','Av. 2 De mayo Cdra. 7 S/N, Sector la Libertad, AA.HH. La Balanza, Alt. Cdra. 08 De Jr. Puno',9),(36,'Centro de Salud GustAv.o Lanatta','Jr. Arequipa S/N V Zona de Collique (Alt. Cdra. 29 De La Av. Revolución)',9),(37,'Centro de Salud Húsares De Junín','Jr. Húsares de Junín Cuadra 1 S/N Urb. Huaquillay II Etapa',9),(38,'Centro de Salud Carmen Alto','Jr. 03 de octubre Cdra.19, Pueblo Joven (Cruce Av. Tres De Octubre Con Av. Cierra Maestra)',9),(39,'Centro de Salud Carlos Phillips','Jr. Brasilia Cdra. 1, S/N Urb. El Parral, ingreso Por El Centro Comercial Mega 80',9),(40,'Centro de Salud Sangarara','Jr. Unión Cdra.6 S/N Coop. Paulo Vi, Alt. Km. 14 1/2 De La Av. Tupac Amaru',9),(41,'Centro Materno Infantil Santa Luzmila II','Av. 22 De agosto 1001, Urb. Santa Luzmila (Costado Del Mercado Modelo)',9),(42,'Centro Materno Infantil Laura Rodríguez Dulanto Duksil','Parcela A Mz.2 R1 S/N Urb. El Pinar, Alt. Del Mercado El Pinar',9),(43,'Centro de Salud Catalina Huanca','Calle Teresa González de Fanning N° 180',10),(44,'Centro de Salud PrimAv.era','URB.PRIMAv.ERA CALLE 23 DE SETIEMBRE S/N',10),(45,'Centro de Salud Santa Magdalena Sofia','Av. Garcilaso de la Vega cdra 3',10),(46,'Centro de Salud Mental Comunitario DAv.id Tejada de Rivero','Av. María Baldarrago S/N Cdra 5 - Urbanización Coorporación',10),(47,'Centro de Salud Ermitaño Alto','Av. Los Jazmines S/N, Cuadra 5 – AA. HH Ermitaño Alto, Alt. Paradero 08 De Ermitaño Alto',11),(48,'Centro de Salud Ermitaño Bajo','Av. Los Pinos Cuadra 1 (Costado Del Municipio)',11),(49,'Centro de Salud Tahuantinsuyo Alto','Jr. Hermanos Ayar Cuadra 2 S/N IV Zona De Tahuantinsuyo (Ingreso Por El Paradero Establo)',11),(50,'Centro de Salud Milagro De La Fraternidad','Av. Los Héroes Cdra.1 S/N AA. HH Milagro De la Fraternidad, espalda Metro UNI',11),(51,'Centro de Salud Tupac Amaru','Jr. Cajamarca Cuadra 2 S/N Urb. Payet, cruce De Jr. Cajabamba con Av. Payet',11),(52,'Centro Materno Infantil Tahuantinsuyo Bajo','Av. Chinchaysuyo Cuadra 4, Urb. Tahuantinsuyo',11),(53,'Centro de Salud Jesús María','Av. Arnaldo Márquez N° 1750',12),(54,'Centro de Salud La Molina','Calle El Haras S/N',13),(55,'Centro de Salud Viña Alta','Av. Los Olivos S/N Segunda Etapa - Viña Alta',13),(56,'Centro de Salud Musa ( Complejo deportivo Musa)','Complejo Deportivo de Musa',13),(57,'Centro de Salud Portada del Sol','Av. Principal Mz E6 Lote 3 II Etapa',13),(58,'Centro de Salud San Cosme','Av. Bauzate y Meza, Altura de la Cdra N° 23',14),(59,'Centro de Salud El Porvenir','Jr. Sebastián Barranca N° 977',14),(60,'Centro de Salud Max Arias Schreiber','Jr. Antonio Raymondi N° 220 Primer Piso',14),(61,'Centro de Salud Villa María Perpetuo Socorro','Jr. Villa María N° 745',15),(62,'Centro de Salud Mirones','Av. Luis Brayle N° 13',15),(63,'Centro de Salud San Sebastián','Jr. Ica N° 774-778',15),(64,'Centro de Salud Mirones Bajo','Jr. Bruno Terreros N° 144',15),(65,'Centro de Salud Conde De La Vega Baja','Jr. Conde De La Vega Baja N° 488',15),(66,'Centro de Salud Unidad Vecinal Nº 3','Otros Block Nª 1 unidada vecinal Nª 3',15),(67,'Centro Especializado de Referencia de ITSS y VIH/ SIDA Raúl Patrucco','Jr . Huanta 927',15),(68,'Centro de Salud La Libertad','Las Marganitas 1545 Inca Manco Capac (por Metro)',15),(69,'Centro de Salud Lince','Jr. Manuel Candamo N° 495',16),(70,'Centro de Salud Enrique Milla Ochoa','AA. HH Enrique M. Ochoa Cte. 8 Mz, Frente Al Complejo Deportivo',17),(71,'Centro de Salud Los Olivos De Pro','AA. HH Los Olivos de Pro (Local Comunal) Complejo Educ. Alberto Fujimori C.E. 2024',17),(72,'Centro de Salud Villa Del Norte','Av. Chillón S/N, Alt. De La Parroquia De La Reconciliación',17),(73,'Centro de Salud Carlos Cueto Fernandini','Av. Las Palmeras S/N, entre Calle Elvira García Y G. Y Alameda',17),(74,'Centro de Salud Laura Caller','Mz 10 Lt. S/N. AA. HH Laura Calle Zona 5, espalda de la comisaria',17),(75,'Centro de Salud San Martin De Porres Confraternidad','Av.enida Mz 143-A S/N, Av. Betancourt, AAHH San Martin De Porres S/N',17),(76,'Centro de Salud Sagrado Corazón De Jesús','Plaza Cívica S/N, Proyecto Integral Cueto Fernandini, 3era Etapa Número S/N',17),(77,'Centro de Salud Rio Santa','Calle 11, Asociación de Vivienda Rio Santa',17),(78,'Centro de Salud Los Olivos','Jr. Santa Cruz de Pachacútec, 2da Cuadra S/N, Urb. Panamericana Norte',17),(79,'Centro Materno Infantil Juan Pablo II','Calle 28 S/N AA. HH Juan Pablo II S/N',17),(80,'Centro Materno Infantil Lurín','Jr. Grau N° 370',19),(81,'Centro de Salud CLAS Julio C. Tello','Jr. Las Acacias Mz. B, Lt. 12, St. 1',19),(82,'Centro de Salud CLAS Nuevo Lurín - KM. 40','Av. 28 de Julio, Mz. 18, Lt. 20, AA.HH. Nuevo Lurín',19),(83,'Centro de Salud Materno Infantil Magdalena','Jr. Junin 322',20),(84,'Centro de Salud Santa Cruz De Miraflores','Av. José Pardo N° 796',21),(85,'Centro Materno Infantil Portada de Manchay','Calle 7, Mz. F, Lt. 11 cruce con Calle 4, AA.HH. Portada de Manchay',22),(86,'Centro de Salud CLAS Juan Pablo II','Av. Miguel Grau Mz K Lote 05 SECTOR K LOS JARDINES C.P.R. Huertos De Manchay (Cerca Cementerio de los Jardines)',22),(87,'Centro de Salud Pachacámac','Av. Colonial S/N cruce con Jr. Castilla',22),(88,'Centro de Salud Pucusana','Av. Lima N° 559',23),(89,'Centro de Salud La Ensenada','Jr. Jacarandá S/N – AA. HH La Ensenada (Costado De Comisaria)',25),(90,'Centro de Salud Laderas de Chillón','Av. Vía De Integración S/N - Mz C1 - Lote. 3a, 1 Explanada AA. HH Laderas de Chillón',25),(91,'Centro de Salud Jerusalén','AA. HH Jerusalén, Jr. Galilea Con San Juan S/N, (Costado Comisaría De Zapallal, Paradero Flecha)',25),(92,'Centro Materno Infantil Dr. Enrique Martin Altuna','Asociación De Vivienda Virgen De Las Nieves, Mz B Lote 18 - Zapallal',25),(93,'Centro Materno Infantil Santa Rosa','AA.HH. Santa Rosa, Mz. 50, Lote Pm, Av. Santa Rosa',25),(94,'Centro de Salud Materno Infantil Los Sureños','Cooperativa De Vivienda Los Sureños Frente Mz. C Lote 11k, Calle 1',25),(95,'Centro de Salud San Juan de Amancaes','AA. HH Pampas De S.J. Amancaes 2da, Alt. 1 cdra. 1/2 Mercado Chachi',28),(96,'Centro de Salud Flor de Amancaes','Av. Prolongación Flor de Amancaes, S/N AA. HH Flor de Amancaes',28),(97,'Centro de Salud Leoncio Prado','Alt. Cuadra 3 Av. Alcázar, Ce 2099 Urb. Leoncio Prado',28),(98,'Centro de Salud Mariscal Castilla','Jr. Pedro Arzola Cdra. 1 S/N AA. HH Mariscal Castilla, Parque Yolanda Vigil',28),(99,'Centro de Salud Caquetá','Av. Los Próceres Nº 1051, Frente Al Parque De Trabajo',28),(100,'Centro de Salud Ciudad Y Campo','Jacinto BenAv.ente 264 Urb. Ciudad Y Campo',28),(101,'Centro Materno Infantil Rímac','Pasaje. San German 270 Urb. Villacampa',28),(102,'Centro Materno Infantil Piedra Liza','Av. Santa Rosa S/N Piedraliza, Alt. Mercado De Flores Santa Rosa',28),(103,'Centro de Salud San Bartolo','Av. San Bartolo, Mz. A, LT. 1 y Av. El Golf',29),(104,'Centro de Salud Todos Los Santos San Borja','Jr. Franz Schubert S/N Esquina Con Jr Bozovich',30),(105,'Centro de Salud San Isidro','Av. Pérez Araníbar (Del Ejército) N° 1756',31),(106,'Centro de Salud La Huayrona','Calle Las Gemas S/N El Parque -Cooperativa La Huayrona',32),(107,'Centro de Salud Caja De Agua','Jr. Moquegua N° 202. Urb Caja De Agua',32),(108,'Centro de Salud San Hilarión','Jr. Los Silicios S/N Urb. San Hilarión S/N',32),(109,'Centro de Salud Chacarilla De Otero','Jr. José Antonio Encinas Nº 155 - Urb. Chacarilla De Otero',32),(110,'Centro de Salud Zarate','Jr. Los Chasquis con Yupanquis (Anexo Av. Los Amautas Nº 835)',32),(111,'Centro de Salud Medalla Milagrosa','Av. Del Parque s/n',32),(112,'Centro de Salud José Carlos Mariátegui','Av. Jose Carlos Mareategui s/n Pdr. 8 Mz 88 s/n',32),(113,'Centro de Salud Bayóvar','Pj. Bayovar sergunda etapa',32),(114,'Centro de Salud Huáscar XV','Av. Rio Grande Mz 129 Calle 57 Grupo 15 Alt. Cdra 9 Av.Jose carlos Mareategui - Huascar',32),(115,'Centro de Salud San Fernando','Las Ortigas 1893 San Hilarión Ref. Paradero 13 Las Flores',32),(116,'Centro de Salud Ganimedes','Av., El Sol s/n Mz J',32),(117,'Centro de Salud Santa María','AAHH Santa María',32),(118,'Centro de Salud Montenegro','Sector 1s/n espalda de la I.E: Néstor Escudero O.',32),(119,'Centro de Salud Campoy','Av. Malecón Checa',32),(120,'Centro de Salud Cruz de Motupe','AAHH Cruz de Motupe III- V',32),(121,'Centro de Salud Jaime Zubieta','Mz A l1 prd 15 Av. Wiesse Jr. Cocharcas',32),(122,'Centro Materno Infantil Manuel Barreto','Jr. Manuel Barreto S/N esquina con Máximo Abril zona K, Ciudad de Dios',33),(123,'Centro Materno Infantil Ollantay','Av. Gabriel Torres S/N, Sector Ollantay -Pamplona Alta',33),(124,'Centro de Salud San Luis','Calle Raúl Villarán N° 332',34),(125,'Centro de Salud San Miguel','Av. Libertad con Av. Los Mochicas S/N',36),(126,'Centro de Salud Chancas de Andahuaylas','Calle Viru S/N Parque N° 4 Cooperativa Andahuaylas II Etapa',37),(127,'Centro de Salud San Carlos','Asociación P-Vivi San carlos Mz B lote 7B',37),(128,'Centro de Salud Cooperativa Universal','Jr. Jose Carlos Mariátegui Cdra 5',37),(129,'Centro de Salud Nocheto','Calle JAv.ier Heraud S/N',37),(130,'Centro de Salud Santiago de Surco','Jr. Daniel Cornejo 182 - Surco (A Dos cuadras del Parque Antiguo de Surco)',40),(131,'Centro de Salud Surquillo','Jr. Colina 840 (Surquillo)',41),(132,'Centro Materno Infantil San José','Sector 01, Grupo 15 - Intersección Av. Revolución y Av. Los Ángeles',42),(133,'Centro de Salud San Martín de Porres','Sector 2, Grupo 15 S/N (frente a compañía de Bomberos de Villa El Salvador',42),(134,'Puesto de Salud Brisas de Pachacámac','Av. Maria Reich Mz. K S/N - Paradero las Brisas - Brisas de Pachacamac',42),(135,'Centro Materno Infantil César López Silva','Sector IV- Mz. B, Lote 1, I Etapa - Urb. Pachacámac',42),(136,'Centro Materno Infantil Villa María del Triunfo','Av. Pedro Valle S/N (Alt. 18 El triunfo)',43),(137,'Centro Materno Infantil José Galvez','Av. Agricultura s/n cruce con Av. Arica',43),(138,'Centro Materno Infantil Daniel Alcides Carrión','Av. Pachacútec N° 3470',43),(139,'Centro Materno Infantil José Carlos Mariátegui','Av. Simón Bolivar esquina con Jr. Mariano Necochea S/N altura 24 de Av. Jose C. Mariategui Urb. San Gabriel, Villa María del Triunfo',43),(140,'Centro Materno Infantil Tablada de Lurín','Av. Republica S/N Mz. 60 cruce con Av. Billinghurst, II Sector',43),(141,'Centro de Salud Nueva Esperanza','Av. 26 de Noviembre N° 835, Nueva Esperanza',43);
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-02 18:32:39