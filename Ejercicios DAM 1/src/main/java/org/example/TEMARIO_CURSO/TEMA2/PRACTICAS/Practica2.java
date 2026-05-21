    package org.example.TEMARIO_CURSO.TEMA2.PRACTICAS;

    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class Practica2 {

        static void main() {

            Scanner read = new Scanner(System.in);

            double operando1 = 0;
            double operando2 = 0;
            String operacion = "";

            System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

            try { //try-catch para controlar si el usuario pone en el teclado formato texto (Saldría por pantalla el mensaje de error del catch)

                System.out.println("> Introduce operando:"); // Se le pide al usuario el primer operando
                operando1 = read.nextDouble();
                read.nextLine();

                //Se muestra por pantalla un menú con todas las operaciones para que el usuario elija una u otra

                System.out.println("------------------------");

                System.out.println("[+] -> sumar");
                System.out.println("[-] -> restar");
                System.out.println("[x] -> multiplicar");
                System.out.println("[/] -> dividir");
                System.out.println("[R] -> raíz cuadrada");

                System.out.println("------------------------");

                System.out.println("Elige una operación:");
                operacion = read.nextLine().toLowerCase();

                System.out.println("> Introduce el segundo operando:"); // Se le pide al usuario el segundo operando
                operando2 = read.nextDouble();

            } catch (InputMismatchException e) { // Se especifica dentro del catch que error va a salir en específico
                System.out.println("ERROR EN EL FORMATO");
                return; //Si detecta el error, mostraría el mensaje y saldría del programa
            }

            // Control con if para detectar si el usuario selecciona la división como operación y pone como denominador un cero, sería incorrecto el número (0) introducido por teclado
            if (operacion.equals("/") && operando2 == 0) {
                System.out.println("ERROR EN EL DENOMINADOR, INTRODUCE UN NÚMERO VÁLIDO");
                return;
            }
            // Control con if para detectar si el usuario selecciona la raíz cuadrada como operación y pone un número negativo, sería incorrecto el número introducido por teclado
            if (operacion.equals("r") && operando1 < 0) {
                System.out.println("ERROR EN EL FORMATO, INTRODUCE UN NÚMERO POSITIVO");
                return;
            } else {

                double resultado = 0;

                // Dependiendo qué operación va a escoger el usuario se realiza una u otra a través de un switch-case

                switch (operacion) {

                    case "+":
                        resultado = operando1 + operando2;
                        System.out.println("El resultado de " + operando1 + " + " + operando2 + " es " + resultado);
                        break;
                    case "-":
                        resultado = operando1 - operando2;
                        System.out.println("El resultado de " + operando1 + " - " + operando2 + " es " + resultado);
                        break;
                    case "x":
                        resultado = operando1 * operando2;
                        System.out.println("El resultado de " + operando1 + " x " + operando2 + " es " + resultado);
                        break;
                    case "/":
                        resultado = operando1 / operando2;
                        System.out.println("El resultado de " + operando1 + " / " + operando2 + " es " + resultado);
                        break;
                    case "r":
                        resultado = Math.sqrt(operando1);
                        System.out.println("La raíz cuadrada de " + operando1 + " = " + resultado);
                        break;

                    default:
                        System.out.println("La operación introducida no es correcta."); // Este mensaje aparecerá por pantalla si el usuario no ha seccionado ninguna operación de las anteriores
                        break;
                }
            }
        }
    }