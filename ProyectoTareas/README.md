# Mini Gestor de Tareas — Práctica 10
## POO + Colecciones + I/O + Threads en Java

---

## Estructura del proyecto

```
ProyectoTareas/
├── pom.xml                        ← Configuración Maven (abre en IDE)
├── README.md                      ← Este archivo
└── src/
    └── main/
        └── java/
            ├── Tarea.java          ← Modelo: objeto del mundo real
            ├── GestorTareas.java   ← Lógica: colecciones + I/O
            ├── ProcesadorTareas.java ← Concurrencia: Runnable/Thread
            └── Main.java           ← Punto de entrada del programa
```

---

## Cómo abrir el proyecto

### ✅ IntelliJ IDEA (recomendado)
1. Abre IntelliJ IDEA
2. `File` → `Open`
3. Selecciona la carpeta **ProyectoTareas** (donde está el `pom.xml`)
4. Haz clic en `Open`
5. IntelliJ detecta Maven automáticamente
6. Abre `Main.java` y haz clic en el botón ▶ verde junto a `main()`

### ✅ Eclipse
1. `File` → `Import`
2. Selecciona `Maven` → `Existing Maven Projects`
3. Navega a la carpeta **ProyectoTareas**
4. Haz clic en `Finish`
5. Clic derecho en `Main.java` → `Run As` → `Java Application`

### ✅ VS Code
1. Instala la extensión **"Extension Pack for Java"** (de Microsoft)
2. `File` → `Open Folder` → selecciona **ProyectoTareas**
3. Abre `Main.java`
4. Haz clic en `Run` (aparece encima del método main)

---

## Cómo ejecutar desde terminal (sin IDE)

```bash
# Entrar a la carpeta del proyecto
cd ProyectoTareas

# Opción 1: Compilar y ejecutar con Maven
mvn compile exec:java

# Opción 2: Compilar manualmente con javac
cd src/main/java
javac Tarea.java GestorTareas.java ProcesadorTareas.java Main.java
java Main
```

---

## Conceptos cubiertos

| Archivo | Concepto |
|---|---|
| `Tarea.java` | POO: clase, atributos, constructor, getters/setters, toString, serialización |
| `GestorTareas.java` | ArrayList, HashMap, HashSet, LinkedList, BufferedReader, BufferedWriter, File |
| `ProcesadorTareas.java` | Thread, Runnable, run(), sleep(), InterruptedException |
| `Main.java` | Flujo completo, try-catch, thread.start(), thread.join() |

---

## Requisitos
- Java 8 o superior (Java 11/17/21 recomendado)
- Maven 3.x (opcional, solo si compilas desde terminal con mvn)
