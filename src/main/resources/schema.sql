CREATE TABLE estudiantes (
  id integer(11) NOT NULL,
  nombres varchar(255) NOT NULL,
  apellidos varchar(255) NOT NULL,
  fk_materia integer(11) NOT NULL
);
 
 
 
CREATE TABLE estudiantes_materias (
  fk_estudiante_id integer(11) NOT NULL,
  fk_materia_id integer(11) NOT NULL
);
 
 
CREATE TABLE examenes (
  id integer(11) NOT NULL,
  fk_materia integer(11) NOT NULL,
  descripcion varchar(255) NOT NULL,
  nota_maxima integer(11) NOT NULL
);
 
CREATE TABLE materias (
  id integer(11) NOT NULL,
  nombre varchar(255) NOT NULL
);
 
 
CREATE TABLE preguntas (
  id integer(11) NOT NULL,
  fk_examen_id integer(11) NOT NULL,
  descripcion varchar(255) NOT NULL,
  imagen text NOT NULL,
  valoracion integer(11) NOT NULL,
  tipo varchar(255) NOT NULL
);
 
 
CREATE TABLE profesores (
  id integer(11) NOT NULL,
  nombres varchar(255) NOT NULL,
  apellidos varchar(255) NOT NULL,
  fk_materia integer(11) NOT NULL
) ;
 
CREATE TABLE respuestas (
  id integer(11) NOT NULL,
  fk_pregunta_id integer(11) NOT NULL,
  respuesta varchar(255) NOT NULL,
  correcta tinyint(1) NOT NULL
);

CREATE TABLE solucion_examen(
    id integer(11) NOT NULL,
    fk_estudiante_id integer(11) NOT NULL,
    fk_pregunta_id integer(11) NOT NULL,
    fk_examen_id integer(11) NOT NULL,
    valoracion_obtenida integer(11) NOT NULL,
    respuesta_abierta text NOT NULL,
    tipo_pregunta varchar(255) NOT NULL,
    revisada tinyint(1) NOT NULL
); 
 
 
ALTER TABLE estudiantes
  ADD PRIMARY KEY (id);
 
ALTER TABLE examenes
  ADD PRIMARY KEY (id);
 
ALTER TABLE materias
  ADD PRIMARY KEY (id);
 
ALTER TABLE preguntas
  ADD PRIMARY KEY (id);
 
ALTER TABLE profesores
  ADD PRIMARY KEY (id);

ALTER TABLE solucion_examen
  ADD PRIMARY KEY (id);

ALTER TABLE respuestas
  ADD PRIMARY KEY (id);
 


ALTER TABLE estudiantes
  MODIFY id integer(11) NOT NULL AUTO_INCREMENT;
 
ALTER TABLE examenes
  MODIFY id integer(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE respuestas
  MODIFY id integer(11) NOT NULL AUTO_INCREMENT;
 
ALTER TABLE materias
  MODIFY id integer(11) NOT NULL AUTO_INCREMENT;
 
ALTER TABLE preguntas
  MODIFY id integer(11) NOT NULL AUTO_INCREMENT;
 
ALTER TABLE profesores
  MODIFY id integer(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE solucion_examen
  MODIFY id integer(11) NOT NULL AUTO_INCREMENT;
COMMIT;

