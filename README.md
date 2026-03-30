Asignatura: Programación Orientada a Objetos

Tecnología: Java + JavaFX

Grupo: 2°D

Integrantes: Judith Desiree Aguilar Hernández y Naomy Sayuri Carranza Priego

Descripción del Proyecto
Este sistema es una aplicación de escritorio diseñada para un consultorio médico pequeño. Permite gestionar un directorio de pacientes mediante un CRUD completo (Crear, Leer, Actualizar, Eliminar) con persistencia de datos en archivos locales.

El sistema implementa un "Borrado Lógico", lo que significa que los pacientes no se eliminan físicamente del archivo, sino que cambian su estatus a INACTIVO, permitiendo mantener un historial clínico íntegro.

Funcionalidades Principales
Gestión de Pacientes: Alta, consulta en tabla, edición de datos y cambio de estatus.

Persistencia: Los datos se guardan en un archivo .csv dentro de la carpeta /data.

Validaciones: * CURP único (evita duplicados).

Nombre completo (mínimo 5 caracteres).

Edad válida (rango de 0 a 120 años).

Teléfono de 10 dígitos.

Estructura del Código
El proyecto sigue el patrón de diseño Modelo-Vista-Controlador para separar la lógica de la interfaz:

Models: Clase Paciente que define los atributos del sistema.

Repositories: FileRepository encargado exclusivamente de leer y escribir en el archivo.

Services: PacienteService donde reside la lógica de negocio, validaciones y cálculos.

Controllers: Manejan los eventos de JavaFX y la interacción con el usuario.