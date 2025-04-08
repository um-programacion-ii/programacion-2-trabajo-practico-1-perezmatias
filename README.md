[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/-JQrLgaz)
# 🧠 Trabajo Práctico: Sistema de Gestión de Vehículos (Java + SOLID + GitHub)

## 📌 Objetivo General

Desarrollar una aplicación en Java para gestionar vehículos de una empresa, aplicando los principios de programación orientada a objetos y los **primeros tres principios SOLID**:  
**SRP (Single Responsibility), OCP (Open/Closed) y LSP (Liskov Substitution)**.

A lo largo del trabajo se utilizará también la estructura `ArrayList` para manejar listas dinámicas de vehículos.

Además, deberán aplicar buenas prácticas de **gestión de proyectos usando GitHub**: `Issues`, `Milestones`, `Projects` y `Pull Requests`.

---

## 🧩 Tecnologías y Herramientas

- Java SE (cualquier versión compatible con JDK 8+)
- Git y GitHub
- GitHub Projects
- GitHub Issues
- GitHub Pull Requests

---

## 📘 Etapas del Trabajo

El trabajo está dividido en etapas. Cada etapa deberá registrarse como un **Milestone** en GitHub.

### Etapa 1: Clases Básicas
- Crear la clase `Vehiculo` con atributos: `patente`, `marca`, `año`, `capacidadCargaKg`.
- Agregar constructor, getters/setters y método `mostrarInformacion()`.
- Crear la clase `Main` que cree e imprima al menos 3 vehículos.

### Etapa 2: Aplicar SRP
- Extraer la responsabilidad de impresión a una nueva clase `VehiculoPrinter`.
- Eliminar el método `mostrarInformacion()` de `Vehiculo`.

### Etapa 3: Aplicar OCP
- Crear subclase `Camion` con atributo `tieneAcoplado`.
- Modificar `VehiculoPrinter` para imprimir camiones sin modificar el código existente (usar polimorfismo).

### Etapa 4: Aplicar LSP
- Crear subclase `Auto` con atributo `cantidadPasajeros`.
- Validar que se puedan tratar todos los vehículos desde una misma interfaz (`Vehiculo`).

### Etapa 5: Uso de ArrayList
- Usar `ArrayList<Vehiculo>` para gestionar todos los vehículos.
- Recorrer e imprimir usando `VehiculoPrinter`.
- (Opcional) Buscar por patente dentro de la lista.

---

## ✅ Entrega y Flujo de Trabajo con GitHub

Cada grupo debe:

1. Usar la asignación del repositorio compartido por Slack

2. **Proteger la rama main**:
   - Ir a Settings > Branches > Branch protection rules
   - Agregar regla para la rama `main`
   - Requerir que los tests pasen antes de mergear
   - No permitir push directo a main

3. Crear un **Project** nuevo tipo _Kanban_ con columnas:
   - `To Do`, `In Progress`, `In Review`, `Done`

4. Crear un **Milestone por etapa**:
   - `Etapa 1 - Clases básicas`
   - `Etapa 2 - SRP`
   - `Etapa 3 - OCP`
   - `Etapa 4 - LSP`
   - `Etapa 5 - ArrayList`

5. Crear **Issues** por cada tarea concreta, por ejemplo:
   - "Crear clase Vehiculo"
   - "Crear clase VehiculoPrinter"
   - "Crear subclase Camion"

   Cada Issue debe:
   - Tener un título claro y descripción breve
   - Estar asociado a un `Milestone` y al `Project`
   - Tener asignado al menos un miembro del equipo
   - Incluir labels apropiados (ej: `enhancement`, `bug`, `documentation`)
   - Ser implementado en una nueva rama (branch) creada desde `main`
   - La rama debe seguir el formato: `feature/descripcion-corta` o `fix/descripcion-corta`
   - Ser cerrado mediante un Pull Request (PR) que mergee la rama a `main`
   - Actualizar su estado en el Kanban board según corresponda

6. Hacer **Pull Requests** por cada Issue.
   - Cada PR debe mencionar el Issue que cierra (ej: `Closes #2`)
   - Debe incluir los mismos labels que el Issue asociado
   - Debe estar asociado al mismo Milestone que el Issue
   - Debe estar asociado al mismo Project que el Issue
   - El código debe estar revisado antes de ser fusionado a `main`
   - Al mergear, actualizar el estado del Issue en el Kanban board a `Done`

---

## ✅ Ejemplo de Issue

### Título
Crear clase Vehiculo

### Descripción
Implementar la clase base `Vehiculo` que servirá como punto de partida para la jerarquía de vehículos.

#### Requisitos
- Crear la clase con los siguientes atributos privados:
  ```java
  private String patente;
  private String marca;
  private int anio;
  private double capacidadCargaKg;
  ```
- Implementar:
  - Constructor con todos los atributos
  - Getters y setters para cada atributo
  - Método `mostrarInformacion()` que imprima todos los datos del vehículo

#### Validaciones
- La patente no puede ser null ni vacía
- El año debe ser mayor a 1900 y menor o igual al año actual
- La capacidad de carga debe ser positiva

#### Criterios de Aceptación
- [ ] La clase compila sin errores
- [ ] Se incluyen todos los atributos requeridos
- [ ] Se implementan todos los métodos necesarios
- [ ] Se incluyen las validaciones especificadas
- [ ] Se agrega documentación JavaDoc básica

#### Notas Adicionales
- Considerar agregar constantes para los valores mínimos/máximos
- Incluir mensajes de error descriptivos en las validaciones

### Labels
- `enhancement`
- `good first issue`

### Asignación
- Milestone: `Etapa 1 - Clases básicas`
- Project: `Sistema de Gestión de Vehículos`
- Estado: `To Do`

## ✅ Requisitos para la entrega final

- ✅ Todos los Issues cerrados
- ✅ Todos los Milestones completos
- ✅ Todos los PRs revisados y mergeados
- ✅ Project con todas las tareas en `Done`
- ✅ Este archivo `README.md` completo con:
  - Nombre y apellido del alumno
  - Instrucciones detalladas de cómo ejecutar el proyecto
  - Requisitos previos (JDK, IDE, etc.)
  - Pasos para compilar y ejecutar
  - Ejemplos de uso

> ⏰ **Fecha de vencimiento**: 09/04/2025 a las 13:00 hs

---

# Sistema de Gestión de Vehículos (Trabajo Práctico)

## 📌Autor

* **Matias Agustin Perez**
* **Legajo: 61218**

## Tecnologías Utilizadas

* Java SE (Compilado y probado con **JDK 21.0.2**)
* Git
* GitHub (Issues, Projects, Milestones, Pull Requests, Branch Protection)

## Requisitos Previos

Para compilar y ejecutar este proyecto, necesitarás:

1.  **Git:** Para clonar el repositorio.
2.  **Java Development Kit (JDK):** Versión 8 o superior. Se utilizó específicamente la **versión 21.0.2**.

## Instrucciones de Instalación y Ejecución

### 1. Clonar el Repositorio

Abre una terminal o consola y ejecuta el siguiente comando:
```bash
git clone https://github.com/um-programacion-ii/programacion-2-trabajo-practico-1-perezmatias.git

cd https://github.com/um-programacion-ii/programacion-2-trabajo-practico-1-perezmatias.git
```

### 2. Ejecutar

1. Abre el proyecto clonado con tu IDE (ej: IntelliJ IDEA).
2. Espera a que el IDE configure el proyecto y detecte el JDK.
3. Navega hasta el archivo src/Main.java.
4. Haz clic derecho sobre el archivo Main.java.
5. Selecciona la opción "Run 'Main.main()'" o similar.
6. La salida del programa y la parte interactiva aparecerán en la consola integrada del IDE.
7. Se mostrará un mensaje de bienvenida y la lista inicial de vehículos en la flota.
8. A continuación, verás el mensaje:
    ```bash
   --- Búsqueda Interactiva por Patente ---
   Ingrese la patente a buscar (o escriba 'salir' para terminar):
    ```
9. Para buscar: Escribe una patente (ej: HIJ456) y presiona Enter. El programa mostrará los detalles si la encuentra, o un mensaje si no.
10. Para terminar: Escribe salir (no importa mayúsculas/minúsculas) y presiona Enter. El programa finalizará limpiamente.

---
## 📝 Licencia

Este trabajo es parte del curso de Programación 2 de Ingeniería en Informática. Uso educativo únicamente.
