Ejercicio: La Escuela
En este ejercicio crearemos un programa para gestionar información de estudiantes en una escuela.

Crear una clase Materia con las propiedades: nombre (String), código (int), estado (boolean).
Implementar los métodos equals y hashCode de Materia para definir la igualdad de esos objetos a través del código de materia.
Crear una clase llamada HistoriaAcademica que tenga un Map que relacione a una materia con un conjunto de calificaciones (Set de Double). Implementar también:
Una función que permita calcular el promedio de calificaciones.
Una función que devuelva la cantidad de aplazos (calificación < 2).
Una función que devuelva la cantidad de materias cursadas.
Crear una clase Estudiante con las siguientes propiedades: nombre (String), matrícula (int), edad (int) y su historia académica (HistoriaAcademica).
Implementar los métodos equals y hashCode de Estudiante para definir la igualdad de esos objetos a través de la matrícula.
Crear una clase llamada Escuela que contendrá:
Una lista de estudiantes.
Un conjunto para almacenar las materias que se ofrecen en la escuela.
En el método main:
Crear un objeto Escuela, agregar algunos estudiantes a la escuela y algunas materias al conjunto de materias ofrecidas (algunas pueden estar con estado cerrada).
Ingresar calificaciones de los estudiantes en distintas materias. Validar que las materias existan en la escuela (deben ser objetos del conjunto de materias ofrecidas). Cada ingreso implica que se agrega la calificación al conjunto de calificaciones asociado a la materia en la historia académica del estudiante.
Mostrar para cada estudiante:
Listado de materias cursadas con su calificación
Promedio de calificaciones
Cantidad de aplazos
Cantidad de materias cursadas
