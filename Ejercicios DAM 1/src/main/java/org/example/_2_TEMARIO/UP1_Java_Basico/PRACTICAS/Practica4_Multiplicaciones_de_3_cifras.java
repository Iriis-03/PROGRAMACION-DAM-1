package org.example._2_TEMARIO.UP1_Java_Basico.PRACTICAS;


import java.util.Scanner;

public class Practica4_Multiplicaciones_de_3_cifras {


    static void main() {

        Scanner read = new Scanner(System.in);

        int multiplicando;//Tanto la variable "multiplicando" como "multiplicador" son números enteros porque el programa pide que sean números de 3 cifras sin decimales.
        int multiplicador;
        int resultado;
        int resultado_linea1;
        int resultado_linea2;
        int resultado_linea3;

    do {
        System.out.println("Introduce el multiplicando (3 cifras)"); //Se le pide al usuario que escriba un número de 3 cifras (multiplicando) en el teclado.
        multiplicando = read.nextInt(); //Se lee la variable "multiplicando" en el teclado, asignada en el bloque de declaraciones para que así la máquina lo pueda leer.
        if (multiplicando < 100 || multiplicando > 999) {
            System.out.println("ERROR: Debes introducir un número de 3 cifras.");
        }
    } while (multiplicando < 100 || multiplicando > 999);

    do {
        System.out.println("Introduce el multiplicador (3 cifras)"); //Se le pide al usuario que escriba un número de 3 cifras (multiplicador) en el teclado.
        multiplicador = read.nextInt(); //Se lee la variable "multiplicador" en el teclado, asignada en el bloque de declaraciones para que así la máquina lo pueda leer.
        if (multiplicador < 100 || multiplicador > 999) {
            System.out.println("ERROR: Debes introducir un número de 3 cifras.");
        }
    } while (multiplicador < 100 || multiplicador > 999);

        resultado = multiplicando * multiplicador; //Se calcula el resultado mediante la operación de variables "multiplicando" y "multiplicador".

        String number_string = Integer.toString(multiplicando); //Se utiliza Integer.toString para cambiar la variable "multiplicando" de número entero (Integer) a cadena de texto (String)

        String first_number = number_string.substring(0,1); //Se define el carácter individualmente para hacer la conversión correctamente, en este caso en un número de 3 cifras, el primer número se contará del 0 hasta el 1
        int first_number_int = Integer.parseInt (first_number); //Se define de carácter a entero la variable first_number_int, para que después al hacer la operación no haya problema de cálculo y pueda actuar como un número entero

        String middle_number = number_string.substring(1,2); //así pasa lo mismo con el número del medio (1,2)
        int middle_number_int = Integer.parseInt (middle_number); //Se define de carácter a entero la variable middle_number_int

        String last_number = number_string.substring(2,3); //y el del final (2,3)
        int last_number_int = Integer.parseInt (last_number); //Se define de carácter a entero la variable last_number_int



        System.out.println("El producto de la multiplicación es " + resultado); //Aquí se mostrará a través del teclado una string diciendo "El producto de la multiplicación es" + la variable "resultado" que calculamos previamente

        System.out.println("El proceso es:"); //Aquí se mostrará a través del teclado una string diciendo "El proceso es:"



        System.out.println("    " + multiplicando); //Se ponen espacios dentro de una string más que nada para que quede bien visualmente y el valor de multiplicando no quede descolocado
        System.out.println("  * " + multiplicador); //Se ponen espacios dentro de una string conjunto al símbolo de la multiplicación más que nada para que quede bien visualmente, ya que este simbolo "*" actua como string, no interfiere en el resultado del programa
        System.out.println("________"); //Se ponen guiones bajos para representar la separación entre la operación y el proceso

        resultado_linea1 = last_number_int * multiplicando; //Ahora se calcula el resultado de la línea 1 de la operación comenzando por el último número/cifra del multiplicador multiplicando todo el número del multiplicando
        String numero = Integer.toString(resultado_linea1); //Se convierte el número total del resultado de la línea 1, de entero a string
        int espacios = 4 - numero.length(); //Se crea una variable para referirse a los espacios que hay que dejar (4) dependiendo de la longitud del número
        String blank = " ".repeat(espacios); //Se repiten los espacios que se le asignan a la variable blank para que así visualmente se vea todo en su sitio
        System.out.println("   " + blank + resultado_linea1); //Aquí se mostrarán los espacios necesarios más la variable blank + el resultado de la línea 1

        resultado_linea2 = middle_number_int * multiplicando; //Aquí pasa lo mismo que antes pero multiplicando el número del medio del multiplicador por el multiplicando
        numero = Integer.toString(resultado_linea2);//Se realiza el mismo proceso que antes solo que cambiado las variables asignadas para cada número del multiplicador
        espacios = 4 - numero.length();
        blank = " ".repeat(espacios);
        System.out.println("  " + blank + resultado_linea2);

        resultado_linea3 = first_number_int * multiplicando; //Aquí pasa lo mismo que antes pero multiplicando el primer número del multiplicador por el multiplicando
        numero = Integer.toString(resultado_linea3);//Se realiza el mismo proceso que antes solo que cambiado las variables asignadas para cada número del multiplicador
        espacios = 4 - numero.length();
        blank = " ".repeat(espacios);
        System.out.println(" " + blank + resultado_linea3);

        System.out.println("________"); //Se muestra la separación del proceso con el resultado mediante barras bajas dentro de una string
        System.out.println(" " + resultado); //Aquí se muestra el espacio correspondiente más el resultado
    }
}

