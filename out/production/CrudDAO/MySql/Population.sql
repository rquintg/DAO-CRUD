-- -----------------------------------------------------
-- Population
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Estado Civil
-- -----------------------------------------------------

INSERT INTO CrudDao.estado_civil (nombre, descripcion) VALUES ('Soltero', 'Sin Compromiso');
INSERT INTO CrudDao.estado_civil (nombre, descripcion) VALUES ('Casado', 'En union formal');
INSERT INTO CrudDao.estado_civil (nombre, descripcion) VALUES ('Union Libre', 'Viviendo con la toxi');
INSERT INTO CrudDao.estado_civil( nombre, descripcion) VALUES ('Otro', 'Otro estado civil');

-- -----------------------------------------------------
-- Tipo de Identficacion
-- -----------------------------------------------------
INSERT INTO CrudDao.tipos_indentificacion (nombre, descripcion) VALUES ('CC', 'Cedula de ciudadania');
INSERT INTO CrudDao.tipos_indentificacion (nombre, descripcion) VALUES ('Ce', 'Cedula de extranjeria');
INSERT INTO CrudDao.tipos_indentificacion (nombre, descripcion) VALUES ('TI', 'Tarjeta de identidad');
INSERT INTO CrudDao.tipos_indentificacion (nombre, descripcion) VALUES ('Otro', 'Otro tipo de identificacion');

-- -----------------------------------------------------
-- Funcionarios
-- -----------------------------------------------------

INSERT INTO CrudDao.funcionarios (numero_identificacion, nombres, apellidos, sexo, direccion, telefono, fecha_nacimiento, fecha_creacion, fecha_actualizacion, tipos_indentificacion_id, estado_civil_id)
VALUES ('123456789', 'Fuancho', 'PEREZ', 'M', 'CALLE 1', '123-456-7 -  ', '1990-01-01', '2021-11-12 05:09:06', '2022-11-11 00:57:48', 1, 1);

INSERT INTO CrudDao.funcionarios (numero_identificacion, nombres, apellidos, sexo, direccion, telefono, fecha_nacimiento, fecha_creacion, fecha_actualizacion, tipos_indentificacion_id, estado_civil_id)
VALUES ('1154731', 'Juanita', 'Gomez', 'F', 'Calle cuarent', '30045678', '2022-07-22', '2022-05-04 21:53:52', '2022-03-03 05:15:52', 2, 2);

INSERT INTO CrudDao.funcionarios (numero_identificacion, nombres, apellidos, sexo, direccion, telefono, fecha_nacimiento, fecha_creacion, fecha_actualizacion, tipos_indentificacion_id, estado_civil_id)
VALUES ('1154732', 'Ricardo', 'Quintero', 'M', 'Calle permont', '   -   -  -  ', '2022-06-04', '2022-07-30 10:07:56', '2022-11-11 01:34:26', 1, 1);

INSERT INTO CrudDao.funcionarios (numero_identificacion, nombres, apellidos, sexo, direccion, telefono, fecha_nacimiento, fecha_creacion, fecha_actualizacion, tipos_indentificacion_id, estado_civil_id)
VALUES ('8975576', 'Carolina', 'Morales', 'F', 'viva123', '345-678-94-44', '2022-11-20', '2022-11-10 01:45:24', '2022-11-11 01:07:44', 1, 1);

INSERT INTO CrudDao.funcionarios (numero_identificacion, nombres, apellidos, sexo, direccion, telefono, fecha_nacimiento, fecha_creacion, fecha_actualizacion, tipos_indentificacion_id, estado_civil_id)
VALUES ('4566', 'Andres', 'Perez', 'O', 'tum41', '776-565-75-67', '2022-11-01', '2022-11-11 01:08:45', '2022-11-11 21:09:25', 1, 1);


-- -----------------------------------------------------
-- Rol
-- -----------------------------------------------------

INSERT INTO CrudDao.rol (nombre, descripcion) VALUES ('Hermano/a', 'Familiar del funcionario');
INSERT INTO CrudDao.rol (nombre, descripcion) VALUES ('Esposo/a', 'Familiar del funcionario');
INSERT INTO CrudDao.rol (nombre, descripcion) VALUES ('Padre', 'Familiar del funcionario');
INSERT INTO CrudDao.rol (nombre, descripcion) VALUES ('Madre', 'Familiar del funcionario');

-- -----------------------------------------------------
-- Grupo Familiar
-- -----------------------------------------------------

INSERT INTO CrudDao.grupo_familiar (nombre, apellido, direccion, fecha_creacion, fecha_actualizacion, rol_id, funcionarios_id)
VALUES ('Pepita', 'Morales', 'dir 45','2022-06-04 16:22:41', '2022-07-30 10:07:56',1,1);
INSERT INTO CrudDao.grupo_familiar (nombre, apellido, direccion, fecha_creacion, fecha_actualizacion, rol_id, funcionarios_id)
VALUES ('Alberto', 'Lozano', 'calle trin 467','2022-05-04 21:53:52', '2022-03-03 05:15:52',2,2);
INSERT INTO CrudDao.grupo_familiar (nombre, apellido, direccion, fecha_creacion, fecha_actualizacion, rol_id, funcionarios_id)
VALUES ('andrea', 'Quintero', 'AV 123','2022-05-04 21:53:52', '2022-03-03 05:15:52',3,3);

-- -----------------------------------------------------
-- Semestre Academico
-- -----------------------------------------------------

INSERT INTO CrudDao.nivel (nombre, descripcion) VALUES ('Semestre1', 'Nivel 1');
INSERT INTO CrudDao.nivel (nombre, descripcion) VALUES ('Semestre2', 'Nivel 2');
INSERT INTO CrudDao.nivel (nombre, descripcion) VALUES ('Semestre3', 'Nivel 3');
INSERT INTO CrudDao.nivel (nombre, descripcion) VALUES ('Semestre4', 'Nivel 4');
INSERT INTO CrudDao.nivel (nombre, descripcion) VALUES ('Semestre5', 'Nivel 5');

-- -----------------------------------------------------
-- Estado Academico
-- -----------------------------------------------------

INSERT INTO CrudDao.estado (nombre, descripcion) VALUES ('Estudiante', 'Actualmente esta estudiando');
INSERT INTO CrudDao.estado (nombre, descripcion) VALUES ('Graduado', 'Ya Culmino Estudios');
INSERT INTO CrudDao.estado (nombre, descripcion) VALUES ('Retirado', 'Estudiante expulsado');
INSERT INTO CrudDao.estado (nombre, descripcion) VALUES ('Otro', 'Otro estado');

-- -----------------------------------------------------
-- Universidad
-- -----------------------------------------------------

INSERT INTO CrudDao.universidad (nombre, descripcion, fecha_creacion, fecha_actualizacion)
VALUES ('IU Didital de Antioquia', 'Universidad Publica Virtual', '2022-06-04 16:22:41', '2022-07-30 10:07:56');
INSERT INTO CrudDao.universidad (nombre, descripcion, fecha_creacion, fecha_actualizacion)
VALUES ('Universidad de la Calle', 'Universidad de la vida', '2022-06-04 16:22:41', '2022-07-30 10:07:56');

-- -----------------------------------------------------
-- Formacion Academica
-- -----------------------------------------------------

INSERT INTO CrudDao.formacion_academica (fecha_inicio, fecha_final, fecha_creacion, fecha_actualizacion, universidad_id, estado_id, nivel_id, funcionarios_id)
VALUES ('2022-09-06 10:19:00', '2021-12-12 08:43:02', '2021-11-20 14:11:05', '2021-12-03 11:07:51',1,1,4,1);
INSERT INTO CrudDao.formacion_academica (fecha_inicio, fecha_final, fecha_creacion, fecha_actualizacion, universidad_id, estado_id, nivel_id, funcionarios_id)
VALUES ('2022-08-04 04:35:14', '2022-08-25 19:46:40', '2022-01-27 14:15:16', '2022-08-30 18:34:38',2,2,5,2);