    package org.example._2_TEMARIO.UP2_Estructuras_Control.PRACTICAS;

    import java.util.Scanner;

    public class Practica3 {

        static void main() {

            Scanner read = new Scanner(System.in);

            int cifra; //Variable de una cifra

            char c; //Variable de cada carácter

            int suma = 0; // Variable de la suma

            String ISBN; //Variable del ISBN introducido por el usuario
            int longitud; //Longitud del ISBN

            boolean salir = false; //Un boolean para que el usuario pueda salir del programa


            do { //Bucle do-while de todo el programa (Si lo datos introducidos son incorrectos, se repite el programa como mínimo una vez)
                    //Menú (aún no interactivo)
                    System.out.println("---------------------");
                    System.out.println("*VALIDADOR ISBN*");
                    System.out.println("[1] - Validar ISBN");
                    System.out.println("[2] - Reparar ISBN");
                    System.out.println("[x] - Salir");
                    System.out.println("---------------------");

                    String menu = read.nextLine(); //Se lee lo que ha introducido el usuario por teclado

                    switch (menu) { //Menú (Interactivo)

                        case "1": //Si el usuario selecciona del menú, el número 1. Quiere validar el ISBN.

                            System.out.println("Introduzca ISBN: ");
                            ISBN = read.next().toUpperCase(); //Lee el ISBN introducido por el usuario y se pone en mayúsculas para no confundirlo con la x de salir

                            longitud = ISBN.length();  //Longitud del ISBN

                            if (longitud != 10) { //Se comprueba que el ISBN introducido por el usuario contenga 10 carácteres
                                System.out.println("Error de formato, introduce la longitud correcta");
                                break;
                            }

                            suma = 0;

                            for (int i = 0; i < 10; i++) { //Se calcula la suma de cada cifra multiplica por 10, 9, 8, 7... (10 - i)

                                c = ISBN.charAt(i); //Se asigna el carácter a la posición i

                                if (i == 9 && c == 'X') { //Si x se pone como carácter y está en la última posición el programa no dará error al detectar que x es un carácter
                                    cifra = 10;
                                } else {
                                    cifra = Integer.parseInt(String.valueOf(c));//Se convierte el carácter a número, para así poder realizar la suma
                                }
                                suma = suma + cifra * (10 - i); //Se calcula la suma total. En este caso, cada cifra del ISBN se multiplicaría la primera por 10, la segunda por 9...
                                // Como está dentro de un bucle cada vez el 10 va a disminuir un número y la cifra del ISBN avanzará 1 gracias al i++

                            }

                            if (longitud == 10) //Si el último carácter es X se le sumará 10 a la suma final
                                if (ISBN.charAt(9) == 'X') {
                                    suma = suma + 10;
                                }

                            int multiplo = suma % 11; //Se calcula si la suma total es múltiplo de 11 (El resto daría 0)

                            if (multiplo == 0) { //Si es múltiplo de 11 el programa te devuelve, que el ISBN es válido. Si no lo es, el programa te devuelve que no es válido
                                System.out.println("El ISBN es válido");

                            } else {
                                System.out.println("El ISBN no es válido");
                            }
                            break;

                        case "2": //Si el usuario selecciona del menú, el número 2. Quiere reparar el ISBN.

                            System.out.println("Introduzca ISBN (Muestra el número que falta con ?): ");
                            ISBN = read.next().toUpperCase(); //Se lee el ISBN introducido por el usuario por teclado con el número que falta (?)

                            longitud = ISBN.length();

                            if (longitud != 10) { //Se comprueba que el ISBN introducido por el usuario contenga 10 carácteres
                                System.out.println("Error de formato, introduce la longitud correcta");
                                break;
                            }

                            suma = 0;

                            int posicion = 0; //Se inicializa el valor de la posición del ? (número que falta)
                            for (int i = 0; i < 10; i++) { //Se calcula el total de la suma, como se ha hecho antes

                                c = ISBN.charAt(i);
                                if (c == '?')
                                    posicion = i; //Se asigna la posición del ? a i
                                else {
                                    cifra = Integer.parseInt(String.valueOf(c)); //Se convierte el carácter (?) a número
                                    suma = suma + cifra * (10 - i); //Se calcula la suma total, ya convertido el interrogante a número
                                }
                            }
                            if (longitud == 10) //Si el último carácter es X se le sumará 10 a la suma final
                                if (ISBN.charAt(9) == 'X') {
                                    suma = suma + 10;
                                }

                            for (int i = 0; i < 10; i++) { //Se calcula la suma de cada cifra multiplica por 10, 9, 8, 7... (10 - i)
                                if ((suma + i * (10 - posicion)) % 11 == 0) { //Se calcula la suma total. En este caso, cada cifra del ISBN se multiplicaría la primera por 10, la segunda por 9...
                                    //Como está dentro de un bucle cada vez el 10 va a disminuir un número y la cifra del ISBN avanzará 1 gracias al i++

                                    System.out.println("El ISBN correcto es " + ISBN.replace('?', (char) (i + '0'))); //Se sustituye ? por el número que se ha encontrado
                                    break;
                                }
                            }
                            break;

                        case "x": //Si el usuario selecciona del menú, la letra x. Quiere salir del programa.
                            salir = true;
                            break;

                        default: //Si el usuario no introduce ni 1, 2 o x.
                            // El programa mostrará un mensaje por pantalla diciendo que lo intente de nuevo ya que la opción introducida no es válida
                            System.out.println("Introduce una de las 3 opciones, por favor...");
                    }
            } while (! salir); //Esta opción boolean hace que se repita el programa hasta que el usuario eliga la opción x del menú
        }
    }