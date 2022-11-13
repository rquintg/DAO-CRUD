-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema CrudDao
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema CrudDao
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `CrudDao` DEFAULT CHARACTER SET utf8 ;
USE `CrudDao` ;

-- -----------------------------------------------------
-- Table `CrudDao`.`tipos_indentificacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`tipos_indentificacion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CrudDao`.`estado_civil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`estado_civil` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CrudDao`.`funcionarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`funcionarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `numero_identificacion` VARCHAR(45) NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `sexo` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `fecha_nacimiento` DATE NOT NULL,
  `fecha_creacion` DATETIME NOT NULL,
  `fecha_actualizacion` DATETIME NOT NULL,
  `tipos_indentificacion_id` INT NOT NULL,
  `estado_civil_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `numero_identificacion_UNIQUE` (`numero_identificacion` ASC) VISIBLE,
  INDEX `fk_funcionarios_tipos_indentificacion_idx` (`tipos_indentificacion_id` ASC) VISIBLE,
  INDEX `fk_funcionarios_estado_civil1_idx` (`estado_civil_id` ASC) VISIBLE,
  CONSTRAINT `fk_funcionarios_tipos_indentificacion`
    FOREIGN KEY (`tipos_indentificacion_id`)
    REFERENCES `CrudDao`.`tipos_indentificacion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_funcionarios_estado_civil1`
    FOREIGN KEY (`estado_civil_id`)
    REFERENCES `CrudDao`.`estado_civil` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CrudDao`.`rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`rol` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CrudDao`.`grupo_familiar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`grupo_familiar` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `fecha_creacion` DATETIME NOT NULL,
  `fecha_actualizacion` DATETIME NOT NULL,
  `rol_id` INT NOT NULL,
  `funcionarios_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_grupo_familiar_rol1_idx` (`rol_id` ASC) VISIBLE,
  INDEX `fk_grupo_familiar_funcionarios1_idx` (`funcionarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_grupo_familiar_rol1`
    FOREIGN KEY (`rol_id`)
    REFERENCES `CrudDao`.`rol` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_grupo_familiar_funcionarios1`
    FOREIGN KEY (`funcionarios_id`)
    REFERENCES `CrudDao`.`funcionarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CrudDao`.`universidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`universidad` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  `fecha_creacion` DATETIME NOT NULL,
  `fecha_actualizacion` DATETIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CrudDao`.`estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`estado` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CrudDao`.`nivel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`nivel` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CrudDao`.`formacion_academica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CrudDao`.`formacion_academica` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fecha_inicio` DATETIME NOT NULL,
  `fecha_final` DATETIME NOT NULL,
  `fecha_creacion` DATETIME NOT NULL,
  `fecha_actualizacion` DATETIME NOT NULL,
  `universidad_id` INT NOT NULL,
  `estado_id` INT NOT NULL,
  `nivel_id` INT NOT NULL,
  `funcionarios_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_formacion_academica_universidad1_idx` (`universidad_id` ASC) VISIBLE,
  INDEX `fk_formacion_academica_estado1_idx` (`estado_id` ASC) VISIBLE,
  INDEX `fk_formacion_academica_nivel1_idx` (`nivel_id` ASC) VISIBLE,
  INDEX `fk_formacion_academica_funcionarios1_idx` (`funcionarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_formacion_academica_universidad1`
    FOREIGN KEY (`universidad_id`)
    REFERENCES `CrudDao`.`universidad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_formacion_academica_estado1`
    FOREIGN KEY (`estado_id`)
    REFERENCES `CrudDao`.`estado` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_formacion_academica_nivel1`
    FOREIGN KEY (`nivel_id`)
    REFERENCES `CrudDao`.`nivel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_formacion_academica_funcionarios1`
    FOREIGN KEY (`funcionarios_id`)
    REFERENCES `CrudDao`.`funcionarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

# ALTER TABLE CrudDao.funcionarios
#    MODIFY COLUMN fecha_nacimiento DATE NOT NULL;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
