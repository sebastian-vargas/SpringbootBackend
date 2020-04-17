INSERT INTO materias(`id`, `nombre`) VALUES
(1, 'Materia de Java'),
(2, 'Materia de Angular'),
(3, 'Materia de Spring Boot');

INSERT INTO examenes(`id`, `fk_materia`, `descripcion`, `nota_maxima`) VALUES
(1, 1, 'Examen de Java', 5),
(2, 2, 'Examen de Angular', 5),
(3, 2, 'Examen de Angular Parte2',5),
(4, 3, 'Examen de SpringBoot', 5);

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


