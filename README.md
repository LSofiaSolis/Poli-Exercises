# Foro — Práctica de conceptos fundamentales de programación (Escenario 1)

**Programa:** Desarrollo de Aplicaciones Móviles  
**Módulo:** Conceptos Fundamentales de Programación  
**Autora:** Laura Solis  

Este repositorio contiene mi aporte al foro del **Escenario 1**, implementado en Java.  
El código fuente está en **inglés** (nombres de variables, clases, métodos y comentarios), acorde a la consigna.

---

## Ejercicio implementado
**Ejercicio 3 — Evaluador de igualdad de reales con tolerancia**  
- **Entrada:** tres números reales `a b tol` (con `tol > 0`).  
- **Salida:**  
  - `equals` si `|a - b| <= tol`.  
  - `not equals` en caso contrario.  

---

## Ejemplos de ejecución
Entrada:
```
2.999 3 0.00000001
```
Salida:
```
equals
```

Entrada:
```
2.999 3 0.01
```
Salida:
```
not equals
```

---

## Compilación y ejecución

**Linux / macOS**
```bash
javac ExerciseThreePoli.java
echo "2.999 3 0.00000001" | java ExerciseThreePoli
```

**Windows (PowerShell)**
```powershell
javac ExerciseThreePoli.java
'2.999 3 0.00000001' | java ExerciseThreePoli
```

---

## Notas
- Compatible con **JDK 8+**.  
- Entrada por **stdin**, salida por **stdout**.  
- Sin librerías externas (solo `java.util` y `java.lang`).  
