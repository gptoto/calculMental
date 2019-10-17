-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.7.23 - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Création de la base jeu_calcul_mental
DROP DATABASE IF EXISTS jeu_calcul_mental;
CREATE DATABASE IF NOT EXISTS jeu_calcul_mental /*!40100 DEFAULT CHARACTER SET latin1 */;
USE jeu_calcul_mental;

-- Création de la table Joueur
DROP TABLE IF EXISTS joueur;
CREATE TABLE IF NOT EXISTS joueur (
    id int(50) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    login VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    pseudo VARCHAR(50) NOT NULL,
    meilleur_score FLOAT DEFAULT NULL
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Création de la table Score
DROP TABLE IF EXISTS score;
CREATE TABLE IF NOT EXISTS score (
    id int(255) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nb_bonne_rep FLOAT DEFAULT NULL,
    id_joueur int,
    CONSTRAINT FK_joueurID FOREIGN KEY (id_joueur) REFERENCES joueur(id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
