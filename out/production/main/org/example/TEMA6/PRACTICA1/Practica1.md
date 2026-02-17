# Práctica 1. Sistema de pago para e-commerce

## ÍNDICE

1. [Intro](#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)

    * Diagrama de clases UML
    * Código de PlantUML
    * Contenido de las clases (.java)
3. [Programa principal](#3-programa-principal)
4. [Pruebas](#4-pruebas)
5. [Entrega](#5-entrega)

---

### 1. Intro

> La práctica consiste en desarrollar una aplicación en **Java** que simula el sistema de pagos de una tienda online de cursos de programación.
>
> Se aplican los principios de la **Programación Orientada a Objetos**:
>
> * **Abstracción**, mediante la clase abstracta `MetodoPago`.
> * **Herencia**, en las clases `Bizum`, `PayPal` y `TarjetaCredito`.
> * **Polimorfismo**, al procesar pagos utilizando referencias del tipo `MetodoPago`.

---

### 2. Estructura de clases

#### Diagrama de clases UML

![](img/ecommerce.png)

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

#### Contenido de las clases (.java)

* Clase *MetodoPago.java*
  Define la abstracción común de todos los métodos de pago.

* Clase *Bizum.java*
  Implementa la validación de teléfono y PIN y el procesamiento del pago mediante Bizum.

* Clase *PayPal.java*
  Valida el correo electrónico y el saldo disponible antes de procesar el pago.

* Clase *TarjetaCredito.java*
  Comprueba número de tarjeta y tipo permitido antes de realizar el pago.

* Clase *Tienda.java*
  Gestiona el flujo completo del pago aplicando **polimorfismo** al trabajar con `MetodoPago`.

* Clase *AppEcommerce.java*
  Contiene el método `main` que inicia la aplicación.

---

### 3. Programa principal

El programa comienza en la clase **AppEcommerce**, que llama al método `iniciarPago()` de **Tienda**.

El flujo es:

1. El usuario selecciona el método de pago.
2. Se validan los datos según el tipo elegido.
3. Se solicita el importe.
4. Se procesa el pago mostrando un mensaje en consola.

---

### 4. Pruebas

Se han probado los siguientes casos:

* Selección correcta de cada método de pago.
* Validaciones incorrectas de teléfono, tarjeta o correo.
* Introducción de importes positivos.
* Cancelación del pago cuando la validación falla.

Todos los métodos funcionan según lo esperado.

---

### 5. Entrega

* [x] Código fuente en GitHub
* [x] Documentación Javadoc
* [x] README en Markdown
* [x] Pruebas de funcionamiento
