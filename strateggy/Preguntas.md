# Strateggy

## **¿Cuál es su intención?**

Permitir cambiar **el comportamiento de una clase en tiempo de ejecución** sin modificar su código.

## **¿Qué problema específico resuelve?**

Cuando tienes varias formas de hacer una tarea (ejemplo: algoritmos, cálculos, métodos de pago), en vez de usar mil `if/else`, encapsulas cada comportamiento en su propia clase.

## **¿Cómo funciona la idea general?**

Imagínalo como cambiar "el chip" del método sin tocar la clase principal.

* Tienes una **interfaz** que define la acción.
* Varias clases que implementan esa acción con distinto comportamiento.
* Un contexto que usa  **cualquiera de esas estrategias** .
