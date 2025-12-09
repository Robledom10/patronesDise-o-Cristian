# **Singleton**

### **¿Cuál es su intención?**

Garantizar que **solo exista un único objeto** de una clase en toda la aplicación y que todos lo usen.

### **¿Qué problema específico resuelve?**

Evita que se creen **varias instancias innecesarias** de algo que debe ser único, por ejemplo:

* la conexión a una base de datos,
* un logger,
* un manejador de configuración.

Si cada parte de tu programa crea instancias por su lado: caos, lag y bugs.

### **¿Cómo funciona la idea general? (sin teoría complicada)**

Piensa en la clase como un  **portero de discoteca** :

* Solo deja entrar  **a una única instancia** .
* Si alguien pide una nueva, devuelve  **la misma de siempre** .

Lo logra usando:

* Un **constructor privado** (nadie puede crear objetos).
* Un **método estático** que devuelve la única instancia.
