# CRUD de Servicios de Streaming y Licencias Digitales

Este proyecto consiste en el desarrollo de un sistema CRUD (Crear, Leer, Actualizar y Eliminar) utilizando Java, JDBC y MySQL, aplicado al manejo de servicios digitales.

## Descripción

El sistema permite gestionar servicios de streaming y licencias digitales, almacenando información como nombre, tipo y precio en una base de datos.  
Se implementa una estructura organizada utilizando clases para la conexión, modelo de datos y acceso a datos (DAO).

## Ejemplos utilizados
- Netflix Premium
- Crunchyroll
- Microsoft 365

## Funcionalidades
- Crear nuevos servicios
- Listar todos los servicios registrados
- Actualizar el precio de un servicio
- Eliminar servicios de la base de datos

## Menú interactivo

El sistema cuenta con un menú en consola que permite al usuario interactuar directamente con las operaciones CRUD:

===== MENU CRUD SERVICIOS =====
1. Agregar servicio
2. Listar servicios
3. Actualizar precio
4. Eliminar servicio
5. Salir

Esto permite que el programa sea más dinámico y simule un sistema real.

## Tecnologías utilizadas
- Java
- Eclipse IDE
- MySQL
- JDBC

## Base de datos
- Nombre: streaming_db
- Tabla: servicio

## Estructura de la tabla

CREATE TABLE servicio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    tipo VARCHAR(50),
    precio DOUBLE
);

## Ejecución del proyecto

1. Configurar la base de datos en MySQL (streaming_db)
2. Ejecutar la clase Main.java
3. Utilizar el menú interactivo desde consola

## Estructura del proyecto

- Conexion.java → Maneja la conexión a la base de datos
- ServicioStreaming.java → Modelo de datos
- ServicioDAO.java → Lógica del CRUD
- Main.java → Menú interactivo

## Autor
Gabriel Serrano Zaldúa