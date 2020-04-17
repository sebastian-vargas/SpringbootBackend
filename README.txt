Profesor puede entrar y crear una nueva prueba (examen) donde se dará una descripción (introducción) a la prueba y cual es la nota máxima que se puede obtener.
Cada prueba está compuesta por varias preguntas que tienen una descripción, una imagen (opcional) y una valoración (peso) dentro de la prueba.
Las preguntas tendrán diferentes tipo de respuesta:
- Selección múltiple con única respuesta
- Selección múltiple con múltiple respuesta
- Respuesta abierta
Si la respuesta es de selección única o múltiple, se debe seleccionar cual(es) respuesta(s) es la válida.
Al momento de realizar la prueba, se debe publicar un enlace donde los estudiantes podrán tomar la prueba.
Si todas las preguntas son de selección múltiple, al terminar todas las preguntas y confirmar la terminación de la prueba por parte del estudiante, se le puede dar la nota según las respuestas correctas y el peso de cada pregunta.

Base de datos: H2
Cobertura total: 80% con la capa service al 100%
Repositorio: Github (Revisión de Commits)
Desplegado en: Heroku

API desarrollada con SpringBoot en el entorno de desarrollo de Netbeans IDE, aplicacion web para crear formularios de preguntas,
el profesor tiene la opcion de añadir imagen, decir si la pregunta es de respuesta multiple, unica o abierta y decir cual/cuales de ellas
es la respuesta correcta y cual no.
opcion para seguir añadiendo mas preguntas. se da la opcion de guardar para asi listar las preguntas creadas y decidir 
si terminar el formulario o seguir añadiendo o eliminando alguna pregunta. si la pregunta es abierta no se muestran opciones de decir 
si es correcta o no.
el estudiante realiza el examen y al final se muestra su puntuacion, dado el caso que tenga respuestas abiertas se notifica de pendiente a ser revisada por el profesor con check

se tiene la opcion de añadir Examenes con respecto a una lista de materias vinculadas a un profesor
