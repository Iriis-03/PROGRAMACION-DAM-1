# Práctica 1. Sistema de pago para e-commerce

## ÍNDICE

1. [Intro](#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)
    * Diagrama de clases UML
    * Código de PlantUML
    * Clases 
3. [Programa principal](#3-programa-principal)
4. [Pruebas](#4-pruebas)
5. [Entrega](#5-entrega)

---

### 1. Intro

> La práctica consiste en simular el sistema de pagos de una tienda online.
>


---

### 2. Estructura de clases

#### Diagrama de clases UML

![](imgractica1.png)

#### Código de PlantUML

```
@startuml
package "org.example.TEMA6.PRACTICA1" {

abstract class MetodoPago {
    +procesarPago(importe : double)
    +validar() : boolean
}

class Bizum {
    -telefono : String
    -pin : int
    +procesarPago(importe : double)
    +validar() : boolean
}

class PayPal {
    -cuenta : String
    -saldo : double
    +procesarPago(importe : double)
    +validar() : boolean
}

class TarjetaCredito {
    -nro_tarjeta : String
    -tipo : String
    +procesarPago(importe : double)
    +validar() : boolean
}

class Tienda {
    +realizarPago(metodo : MetodoPago)
    +iniciarPago()
}

class AppEcommerce {
    +main(args : String[])
}

MetodoPago <|-- Bizum
MetodoPago <|-- PayPal
MetodoPago <|-- TarjetaCredito
Tienda --> MetodoPago
AppEcommerce --> Tienda
}
@enduml
```

#### Clases

* Clase *MetodoPago.java*

* Clase *Bizum.java*

* Clase *PayPal.java*

* Clase *TarjetaCredito.java*

* Clase *Tienda.java*

* Clase *AppEcommerce.java*
 

---

### 3. Programa principal

El programa se ejecuta desde **AppEcommerce**, que llama al método `iniciarPago()` de la clase **Tienda**.

Ahí el usuario introducirá todos los datos y se validarán, para poder realizar una compra online mediante los siguientes sistemas de pago:

* **Bizum**
* **Tarjeta de crédito**
* **PayPal**


---

### 4. Pruebas

* Camino feliz(Validar que todo esté introducido correctamente)
* Introducción de algún dato incorrecto de teléfono, tarjeta o correo.

---

### 5. Entrega

* [x] Link GitHub
* [x] Documentación Javadoc
* [x] Markdown
* [x] Pruebas 
