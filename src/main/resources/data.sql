INSERT INTO materias(`id`, `nombre`) VALUES
(1, 'Materia de Historia'),
(2, 'Materia de Java'),


INSERT INTO examenes(`id`, `fk_materia`, `descripcion`, `nota_maxima`) VALUES
(1, 1, 'Examen de Historia unica,multiple y respuesta abierta', 5),
(2, 2, 'Examen de Java solo unica y multiple respuesta', 5),


INSERT INTO profesores(`id`, `nombres`, `apellidos`, `fk_materia`) VALUES
(1, 'Johan', 'Vargas', 3);
INSERT INTO profesores(`id`, `nombres`, `apellidos`, `fk_materia`) VALUES
(2, 'Cesar', 'Diaz', 2);
INSERT INTO profesores(`id`, `nombres`, `apellidos`, `fk_materia`) VALUES
(3, 'Jean', 'Garcia', 1);

INSERT INTO estudiantes(`id`, `nombres`, `apellidos`, `fk_materia`) VALUES
(1, 'Juan', 'Ruiz', 1);
INSERT INTO estudiantes(`id`, `nombres`, `apellidos`, `fk_materia`) VALUES
(2, 'Jose', 'Ramirez', 2);
INSERT INTO estudiantes(`id`, `nombres`, `apellidos`, `fk_materia`) VALUES
(3, 'Carlos', 'Ovando', 3);

INSERT INTO preguntas(`id`,`fk_examen_id`,`descripcion`,`imagen`,`valoracion`,`tipo`) VALUES
(1,1,'¿Quien conquistó America?','',20,'unica'),
(2,1,'¿Cuál es el Pais ubicado en la imagen?','http://www.hernandezrabal.com/europa/italia/lacio/mapalacio.png',20,'unica'),
(3,1,'¿En que año descubrió Colón América?','',20,'unica'),
(4,1,'Según usted, ¿Qué Pais ha influido mas en el mundo? Sustente su respuesta','',20,'abierta'),
(5,1,'Para el primer viaje Colón utilizó tres naves, ¿Cuáles fueron?','',20,'multiple');

INSERT INTO preguntas(`id`,`fk_examen_id`,`descripcion`,`imagen`,`valoracion`,`tipo`) VALUES
(6,2,'¿Còmo se define una variable entera en Java?','',25,'unica'),
(7,2,'¿Seleccione la respuesta que defina el tipo de dato booleano?','',25,'unica'),
(8,2,'¿Selecciones las respuestas que caracterisen a Java?','',25,'unica'),
(9,2,'¿seleccione dos entornos de desarrollo para Java?','',25,'unica'),

INSERT INTO respuestas(`id`,`fk_pregunta_id`,`respuesta`,`correcta`) VALUES
(14,6,'int',1),
(15,6,'char',0),
(16,6,'String',0);

INSERT INTO respuestas(`id`,`fk_pregunta_id`,`respuesta`,`correcta`) VALUES
(17,7,'True, false',1),
(18,7,'i',0),
(19,7,'5',0);

INSERT INTO respuestas(`id`,`fk_pregunta_id`,`respuesta`,`correcta`) VALUES
(21,8,'Orientado a Objetos',1),
(22,8,'Distribuido',1),
(23,8,'Robusto',1),
(23,8,'inseguro',0);

INSERT INTO respuestas(`id`,`fk_pregunta_id`,`respuesta`,`correcta`) VALUES
(24,9,'Visual Studio',1),
(25,9,'Netbeans IDE',1),
(26,9,'Ninguna',0);

INSERT INTO respuestas(`id`,`fk_pregunta_id`,`respuesta`,`correcta`) VALUES
(1,1,'Cristobal Colon',1),
(2,1,'Napoleon',0),
(3,1,'Alejandro Magno',0);

INSERT INTO respuestas(`id`,`fk_pregunta_id`,`respuesta`,`correcta`) VALUES
(4,2,'Italia',1),
(5,2,'España',0),
(6,2,'Roma',0);

INSERT INTO respuestas(`id`,`fk_pregunta_id`,`respuesta`,`correcta`) VALUES
(7,3,'1600',0),
(8,3,'1803',0),
(9,3,'1492',1);

INSERT INTO respuestas(`id`,`fk_pregunta_id`,`respuesta`,`correcta`) VALUES
(10,5,'La pinta',1),
(11,5,'La española',0),
(12,5,'La niña',1),
(13,5,'La Santa Maria',1);


