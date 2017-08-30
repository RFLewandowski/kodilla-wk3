-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema MySQLBookDB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema MySQLBookDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `MySQLBookDB` DEFAULT CHARACTER SET utf8 ;
USE `MySQLBookDB` ;

-- -----------------------------------------------------
-- Table `MySQLBookDB`.`books`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `MySQLBookDB`.`books` (
  `ID` INT NOT NULL,
  `title` VARCHAR(120) NOT NULL,
  `author` VARCHAR(120) NOT NULL,
  `year` INT NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
