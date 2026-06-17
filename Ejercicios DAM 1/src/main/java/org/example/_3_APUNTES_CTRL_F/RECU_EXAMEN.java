// ============================================================
//  CHULETA COMPLETA - EXAMEN RECUPERACIÓN PROGRAMACIÓN JAVA
//  Basada en los 4 exámenes + código de la profe (pbendom3)
//  Usa CTRL+F con las palabras clave marcadas con [BUSCAR: ...]
// ============================================================
// PALABRAS CLAVE GENERALES que usa la profe en enunciados:
//   "abstract", "extends", "implements", "enum", "static",
//   "ArrayList", "LinkedHashSet", "TreeMap", "Queue", "LinkedList",
//   "Comparator", "Collections.sort", "instanceof", "throws",
//   "LocalDate", "Random", "matches()", "while(true)", "salir"
// ============================================================

package org.example._3_APUNTES_CTRL_F;

//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.*;

// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 1 - HERENCIA + CLASES ABSTRACTAS                 ║
// ║  [BUSCAR: abstract · extends · votar · pagar · abstract] ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "Crea una clase abstracta [X] con los atributos [a,b,c].
//    Tendrá subclases [Y] y [Z]. El método [accion()] será
//    abstracto. Usa Lombok si te resulta útil."
// CUANDO USARLO: siempre que haya DISTINTOS TIPOS de un mismo
//   concepto (Votante→Nacional/Extranjero, Bañista→Adulto/Niño/Invitado)

@Getter
@Setter
@ToString
abstract class EntidadBase {

    // La profe pone los atributos compartidos aquí
    private String nombre;
    private String poblacion;
    private boolean procesado; // ej: votado, pagado...

    // Scanner SIEMPRE static en la clase abstracta o en la App
    static Scanner teclado = new Scanner(System.in);

    // Constructor que llaman los hijos con super()
    public EntidadBase(String nombre, String poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.procesado = false; // siempre se inicializa a false
    }

    // [BUSCAR: abstract] - método abstracto que OBLIGA a implementar en hijos
    // La profe usa void o String como retorno
    public abstract void accion(); // ej: votar(), pagar(), generar()

    // Método estático en la clase abstracta (patrón habitual de la profe)
    // [BUSCAR: encuestaSatisfaccion · static · Experiencia · values()]
    public static int encuestaSatisfaccion() {
        System.out.println("--------------------------");
        int aux = 1;
        for (TipoEnum exp : TipoEnum.values()) { // recorre el enum
            System.out.println(aux + " - " + exp);
            aux++;
        }
        System.out.println("Valora tu experiencia: ");
        return teclado.nextInt();
    }

    public Comparable<Object> getIdentificador() {
        return null;
    }

    public String getAtributoExtra() {
        return "";
    }

    public void setProcesado(boolean b) {
    }

    public String getPoblacion() {
        return "";
    }

    public String getNombre() {
        return "";
    }

    public boolean isProcesado() {
        return false;
    }
}

// Subclase concreta A - tiene su propio atributo identificador
// [BUSCAR: Nacional · dni · equals · hashCode]
@Getter @ToString
class TipoA extends EntidadBase {

    private String identificador; // dni, nie, matricula...

    // Constructor completo (para generar el censo/lista)
    public TipoA(String nombre, String poblacion, String identificador) {
        super(poblacion, nombre);
        this.identificador = identificador;
    }

    // Constructor mínimo (para buscar/comparar, ej: new Nacional("12345678X"))
    // La profe lo usa para crear objetos "de búsqueda" con solo el ID
    public TipoA(String identificador) {
        super(null, null);
        this.identificador = identificador;
    }

    // [BUSCAR: equals · hashCode · Objects.equals]
    // IMPORTANTE: equals solo con el identificador único (dni, nie, matricula)
    // Esto hace que contains() y remove() funcionen correctamente en colecciones
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TipoA that = (TipoA) o;
        return Objects.equals(identificador, that.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    @Override
    public void accion() {
        System.out.println("\nTipo A con ID " + identificador + " realizando acción...");
    }
}

// Subclase concreta B - tiene atributos extra
// [BUSCAR: Extranjero · nie · pais · Invitado · fecha_visita]
@Getter @ToString
class TipoB extends EntidadBase {

    private String identificador; // nie
    private String atributoExtra; // pais, telefono_contacto_adulto...

    public TipoB(String nombre, String poblacion, String identificador, String atributoExtra) {
        super(poblacion, nombre);
        this.identificador = identificador;
        this.atributoExtra = atributoExtra;
    }

    // Constructor mínimo para búsqueda
    public TipoB(String identificador, String atributoExtra) {
        super(null, null);
        this.identificador = identificador;
        this.atributoExtra = atributoExtra;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TipoB that = (TipoB) o;
        return Objects.equals(identificador, that.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    @Override
    public void accion() {
        System.out.println("\nTipo B con ID " + identificador + " realizando acción...");
    }
}

// Subclase C con LocalDate (ej: Invitado con fecha_visita)
// [BUSCAR: Invitado · fecha_visita · LocalDate.now()]
@Getter @ToString
class TipoC extends EntidadBase {

    private LocalDate fechaVisita; // se asigna automáticamente con LocalDate.now()

    public TipoC(String nombre, String poblacion) {
        super(poblacion, nombre);
        this.fechaVisita = LocalDate.now(); // SIEMPRE la fecha actual del sistema
    }

    @Override
    public void accion() {
        System.out.println("Tipo C (con fecha " + fechaVisita + ") realizando acción...");
    }
}


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 2 - ENUMS CON ATRIBUTOS                         ║
// ║  [BUSCAR: enum · HORRIBLE · PAYPAL · ADULTO · PENDIENTE] ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "Crea un enum [X] con los valores [A(val), B(val), C(val)]
//    con un atributo precio/coste."
// CUANDO USARLO: cuando hay categorías fijas con un valor
//   asociado (precio, descripción, nivel...)

enum TipoEnum {
    // Ejemplos reales de la profe:
    // Experiencia: HORRIBLE, MEJORABLE, INTUITIVA, EXCELENTE
    // MetodoPago: PAYPAL(0.5), BIZUM(1), APPLEPAY(1.5)
    // TipoUsuario: ADULTO(30), NIÑO(15), INVITADO(3.5)
    // Estado: PENDIENTE, GENERADO, RECOGIDO, PAGADO

    OPCION_A(10.0),   // ej: ADULTO(30), PAYPAL(0.5)
    OPCION_B(20.0),   // ej: NIÑO(15), BIZUM(1)
    OPCION_C(30.0);   // ej: INVITADO(3.5), APPLEPAY(1.5)

    // [BUSCAR: private · precio · double]
    private double precio; // el atributo del enum (siempre private)

    // Constructor del enum
    TipoEnum(double precio) {
        this.precio = precio;
    }

    // Getter del atributo
    public double getPrecio() {
        return precio;
    }
}

// Enum SIN atributos (solo nombres)
// [BUSCAR: HORRIBLE · MEJORABLE · INTUITIVA · EXCELENTE]
// [BUSCAR: PENDIENTE · GENERADO · RECOGIDO · PAGADO]
enum EstadoSimple {
    OPCION_1, OPCION_2, OPCION_3, OPCION_4
    // Ej real: HORRIBLE, MEJORABLE, INTUITIVA, EXCELENTE
    // Ej real: PENDIENTE, GENERADO, RECOGIDO, PAGADO
}


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 3 - EXCEPCIONES PERSONALIZADAS                  ║
// ║  [BUSCAR: Exception · RuntimeException · throw new]      ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "Si [condición], lanza una excepción personalizada
//    [NombreException] con el mensaje '[texto]'."
// CUANDO USARLO: fraude, edad inválida, tipo no permitido...

// Siempre extiende RuntimeException (unchecked) en los exámenes de la profe
class MiExcepcionPersonalizada extends RuntimeException {
    // [BUSCAR: FraudeException · EdadInvalidaException · TipoInvalidoException]
    public MiExcepcionPersonalizada(String message) {
        super(message);
    }
}

// CÓMO LANZARLA:
// throw new MiExcepcionPersonalizada("¡AVISO! Mensaje de error aquí");

// CÓMO CAPTURARLA (en el bucle principal):
// try {
//     if (condicion) throw new MiExcepcionPersonalizada("mensaje");
// } catch (MiExcepcionPersonalizada e) {
//     System.out.println(e.getMessage());
//     continue; // vuelve al inicio del bucle (patrón de la profe)
// }


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 4 - CLASE CONTENEDOR / FACHADA                  ║
// ║  [BUSCAR: Censo · TicketMutxa · Parking · static · List] ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "Crea una clase [X] con métodos static que gestionen
//    la lista/conjunto de [entidades]. Crea el método
//    generarDatos() para inicializar datos de prueba."
// CUANDO USARLO: siempre hay una clase "gestor" con datos estáticos

class ClaseContenedor {

    // [BUSCAR: static · ArrayList · censo · listaEventos · clientesActuales]
    // La profe usa distintas colecciones según lo que necesite:
    static ArrayList<EntidadBase> lista = new ArrayList<>();         // orden de inserción, duplicados OK
    static LinkedHashSet<EntidadBase> conjunto = new LinkedHashSet<>(); // sin duplicados, con orden
    static TreeMap<String, Integer> mapa = new TreeMap<>();          // ordenado por clave (ej: pueblo→votos)

    // [BUSCAR: generarCenso · generarUsuarios · insertarEvento · generarClientesAleatorios]
    // Método que crea datos de prueba hardcodeados
    public static void generarDatos() {
        lista.add(new TipoA("Nombre1", "Poblacion1", "ID001"));
        lista.add(new TipoA("Nombre2", "Poblacion1", "ID002"));
        lista.add(new TipoB("Nombre3", "Poblacion2", "ID003", "atributoExtra"));
        // ... etc
    }

    // [BUSCAR: borrarVotante · remove · censo.remove]
    // Método para eliminar un elemento (por equals/hashCode)
    public static void eliminarElemento(EntidadBase elemento) {
        lista.remove(elemento); // funciona si equals() está bien implementado
    }

    // [BUSCAR: getUsuariosRegistrados · unmodifiableList · Set<Usuario>]
    // Devuelve lista NO modificable (patrón de la profe en TicketMutxa)
    public static List<EntidadBase> getLista() {
        return Collections.unmodifiableList(lista); // no se puede modificar desde fuera
    }

    // Devuelve elemento por posición (índice)
    // [BUSCAR: getEvento · posicion · get(posicion-1)]
    public static EntidadBase getElemento(int posicion) {
        if (posicion < 1 || posicion > lista.size()) {
            return null; // la profe devuelve null si no existe
        }
        return lista.get(posicion - 1); // posicion empieza en 1, índice en 0
    }
}


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 5 - INTERFACES                                  ║
// ║  [BUSCAR: interface · implements · pagar · autenticarse] ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "La clase [X] implementa la interfaz [Acciones] que tiene
//    los métodos [pagar()] y [autenticarse()]."
// CUANDO USARLO: cuando la profe pone (I) en el diagrama UML

interface Acciones {
    // Métodos abstractos (sin cuerpo) - OBLIGATORIO implementarlos
    // [BUSCAR: pagar · void · autenticarse · boolean]
    void pagar();
    boolean autenticarse(Set<EntidadBase> usuarios);
    // Otros ejemplos de la profe: generar(), recoger()
}

// Clase que implementa la interfaz
// [BUSCAR: implements · @Override · autenticarse]
class ClaseConInterfaz extends EntidadBase implements Acciones {

    public ClaseConInterfaz(String nombre, String poblacion) {
        super(nombre, poblacion);
    }

    @Override
    public void accion() {
        System.out.println("Acción de ClaseConInterfaz");
    }

    @Override
    public void pagar() {
        System.out.println("Pagando con método de pago...");
    }

    @Override
    public boolean autenticarse(Set<EntidadBase> usuarios) {
        // Lógica de autenticación
        return false;
    }
}

// CLASE ANÓNIMA - implementar interfaz sin crear clase nueva
// [BUSCAR: new Acciones() · clase anónima · app3]
// La profe lo usa cuando no hay clase concreta para los "trabajadores"
// Acciones trabajador = new Acciones() {
//     @Override
//     public void pagar() {
//         System.out.println("Introduce los minutos a cobrar:");
//         int minutos = teclado.nextInt();
//         double importe = minutos * precioPorMinuto;
//         System.out.println("Importe a pagar: " + importe + "€.");
//         System.out.println("Pagando...");
//         System.out.println("Pago realizado. El cliente puede abandonar el parking.");
//     }
//     @Override
//     public boolean autenticarse(Set<EntidadBase> usuarios) { return false; }
// };
// trabajador.pagar();


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 6 - COLECCIONES + ORDENACIÓN                    ║
// ║  [BUSCAR: ArrayList · LinkedHashSet · TreeMap · sort]    ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "Muestra los eventos ordenados por fecha / Muestra la lista
//    ordenada por minutos de estancia / Votos por población."
// CUANDO USARLO: SIEMPRE. Elige la colección según el enunciado:
//   - ArrayList: lista normal con duplicados, acceso por índice
//   - LinkedHashSet: sin duplicados, mantiene orden de inserción
//   - TreeMap: mapa ordenado por clave automáticamente
//   - LinkedList/Queue: cola (FIFO), usada para cola virtual

class EjemplosColecciones {

    static void ejemplos() {
        Scanner teclado = new Scanner(System.in);

        // --- ArrayList ---
        // [BUSCAR: ArrayList · add · remove · get · size]
        ArrayList<TipoA> lista = new ArrayList<>();
        lista.add(new TipoA("ID001"));
        lista.remove(new TipoA("ID001")); // requiere equals() bien hecho
        TipoA primero = lista.get(0);
        int tamaño = lista.size();

        // --- LinkedHashSet ---
        // [BUSCAR: LinkedHashSet · yaHanVotado · no se pueden duplicar]
        // Uso: lista de "ya han votado", sin duplicados, mantiene orden inserción
        LinkedHashSet<TipoA> sinDuplicados = new LinkedHashSet<>();
        sinDuplicados.add(new TipoA("ID001")); // no añade si ya existe (por equals)
        sinDuplicados.contains(new TipoA("ID001")); // true si está

        // --- TreeMap ---
        // [BUSCAR: TreeMap · votosPorPueblo · ordenado · getOrDefault]
        // Uso: contar votos/accesos por población (se ordena solo por clave)
        TreeMap<String, Integer> votosPorPoblacion = new TreeMap<>();
        // Para acumular conteos:
        String poblacion = "Mutxamel";
        votosPorPoblacion.put(poblacion, votosPorPoblacion.getOrDefault(poblacion, 0) + 1);
        // Imprimir el TreeMap (ya sale ordenado por clave):
        for (Map.Entry<String, Integer> entry : votosPorPoblacion.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // --- LinkedList como Queue (Cola) ---
        // [BUSCAR: Queue · LinkedList · cola virtual · poll · peek · offer]
        // Uso: cola de espera (ej: cola virtual del TicketMutxa)
        Queue<TipoA> cola = new LinkedList<>();
        cola.offer(new TipoA("ID001")); // añadir al final
        cola.offer(new TipoA("ID002"));
        // Procesar la cola:
        while (!cola.isEmpty()) {
            TipoA actual = cola.poll(); // saca el primero (FIFO)
            System.out.println("Procesando: " + actual);
        }

        // --- ORDENAR ArrayList con Comparator ---
        // [BUSCAR: Collections.sort · Comparator · compareTo · sort · ordenado por]
        // Opción 1: Comparator anónimo (estilo que usa la profe)
        ArrayList<TipoA> listaOrdenar = new ArrayList<>();
        Collections.sort(listaOrdenar, new Comparator<TipoA>() {
            @Override
            public int compare(TipoA a, TipoA b) {
                // Ordenar por identificador (String):
                return a.getIdentificador().compareTo(b.getIdentificador());
                // Para ordenar por número: Integer.compare(a.getNumero(), b.getNumero())
                // Para ordenar por fecha: a.getFecha().compareTo(b.getFecha())
                // Para invertir: cambiar a y b de sitio
            }
        });

        // Opción 2: sort directo con Comparator (más moderna pero la profe la usa)
        // listaOrdenar.sort(Comparator.comparing(TipoA::getIdentificador));
        // listaOrdenar.sort(Comparator.comparingInt(TipoA::getNumero));
        // Con orden inverso:
        // listaOrdenar.sort(Comparator.comparing(TipoA::getIdentificador).reversed());
    }
}


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 7 - VALIDACIÓN CON .matches()                   ║
// ║  [BUSCAR: matches · regex · DNI · NIE · matrícula]       ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "Valida el formato del DNI/NIE mediante el método
//    validarDocumento() usando .matches()."
// CUANDO USARLO: cuando piden validar formato de un String

class EjemplosValidacion {
// -----------------------------------------------------------------------------------------
    // 1. LOS CLÁSICOS DE EXAMEN (Copia y pega el que te pida)
    // -----------------------------------------------------------------------------------------

    // [BUSCAR: regex DNI · regex NIE · 8 numeros y 1 letra]
    // Ejemplo: "12345678X" (8 dígitos del 0 al 9 seguidos de una letra mayúscula)
//    boolean esDNI = entrada.matches("[0-9]{8}[A-Z]");

    // [BUSCAR: regex matricula · 4 numeros y 3 letras]
    // Ejemplo: "1234BCD" (4 números y 3 letras mayúsculas)
//    boolean esMatricula = entrada.matches("[0-9]{4}[A-Z]{3}");

    // [BUSCAR: regex matricula sin vocales]
    // Ejemplo: "1234FGH" (Evita las vocales como en el sistema real español, patrón típico de la profe)
//    boolean esMatriculaReal = entrada.matches("[0-9]{4}[BCDFGHJKLMNPQRSTVWXYZ]{3}");

    // [BUSCAR: regex codigo examen · formato prefijo]
    // Ejemplo: "PROD-123" (Empieza exactamente por PROD-, seguido de 3 números)
//    boolean esCodigoProducto = entrada.matches("PROD-[0-9]{3}");

    // [BUSCAR: regex telefono · 9 numeros]
    // Ejemplo: "612345678" (Debe empezar por 6, 7, 8 o 9 y tener 8 dígitos más -> Total 9 números)
//    boolean esTelefono = entrada.matches("[6-9][0-9]{8}");

    // ^[0-9*]+ -> Empieza por uno o más caracteres que pueden ser números o asteriscos.
    // #$       -> Termina obligatoriamente con un único '#'.
    // Como el '#' está fuera de los corchetes y al final, garantizamos que SOLO esté ahí.

    // -----------------------------------------------------------------------------------------
    // 2. GUÍA DE SÍMBOLOS PARA MONTAR TU PROPIA REGEX (Diccionario rápido)
    // -----------------------------------------------------------------------------------------
        /*
           [0-9]    -> Cualquier número del 0 al 9.
           [a-z]    -> Cualquier letra minúscula.
           [A-Z]    -> Cualquier letra mayúscula.
           [a-zA-Z] -> Cualquier letra (da igual mayúscula o minúscula).
           [A-Za-z0-9] -> Cualquier carácter alfanumérico.
           [^0-9]   -> Cualquier carácter que NO sea un número (el ^ dentro de corchetes niega).
           .        -> Cualquier carácter individual (un punto significa "lo que sea").
        */


    // -----------------------------------------------------------------------------------------
    // 3. CUANTIFICADORES (Para decirle CUÁNTAS VECES se repite lo anterior)
    // -----------------------------------------------------------------------------------------
        /*
           {X}      -> Exactamente X veces. Ejemplo: [0-9]{4} (4 números exactos).
           {X,Y}    -> Entre X y Y veces. Ejemplo: [a-z]{3,5} (entre 3 y 5 letras minúsculas).
           {X,}     -> Como mínimo X veces. Ejemplo: [0-9]{2,} (2 o más números).

           * -> 0 o más veces (opcional y sin límite).
           +        -> 1 o más veces (mínimo obligatorio una vez).
           ?        -> 0 o 1 vez (es decir, ese carácter es opcional).
        */


    // -----------------------------------------------------------------------------------------
    // 4. CASOS COMPLEJOS (Trampas de recuperaciones)
    // -----------------------------------------------------------------------------------------

    // [BUSCAR: regex contraseña fuerte · longitud variable]
    // Ejemplo: Al menos 8 caracteres alfanuméricos obligatorios
//    boolean esPasswordValido = entrada.matches("[A-Za-z0-9]{8,}");

    // [BUSCAR: regex terminar en · termina con la letra F]
    // Ejemplo: Cualquier texto largo pero que acabe obligatoriamente en 'F' (ejercicio Squash del Github)
    // El '.*' significa "cualquier texto de cualquier longitud delante"
//    boolean terminaEnF = entrada.matches(".*F");

    // [BUSCAR: regex email simple]
    // Ejemplo: texto@texto.com -> "letras/números + @ + letras + . + letras(de 2 a 4)"
    // Alerta: El punto '.' es especial en regex. Para buscar un punto real hay que poner \\.
//    boolean esEmail = entrada.matches("[A-Za-z0-9.]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}");
}



// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 8 - instanceof + CASTING                        ║
// ║  [BUSCAR: instanceof · Invitado · casting · (TipoB)]    ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "El método mostrarInvitados() imprimirá los bañistas
//    de tipo Invitado. Ayúdate de instanceof."
// CUANDO USARLO: cuando hay que filtrar por subtipo concreto

class EjemplosInstanceof {

    static ArrayList<EntidadBase> lista = new ArrayList<>();

    public static void mostrarTipoB() {
        // [BUSCAR: instanceof · if · TipoB · Invitado]
        for (EntidadBase e : lista) {
            if (e instanceof TipoB) {
                // Casting para acceder a métodos específicos de TipoB
                TipoB b = (TipoB) e;
                System.out.println("Es TipoB con extra: " + b.getAtributoExtra());
            }
        }
    }

    // Eliminar todos los de un tipo (ej: eliminarInvitados)
    // [BUSCAR: eliminarInvitados · iterator · remove · ConcurrentModificationException]
    // OJO: no se puede hacer remove() en un for-each normal → usar Iterator
    public static void eliminarTipoB() {
        Iterator<EntidadBase> it = lista.iterator();
        while (it.hasNext()) {
            EntidadBase e = it.next();
            if (e instanceof TipoB) {
                it.remove(); // forma segura de eliminar durante iteración
            }
        }
    }
}


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 9 - GENERACIÓN ALEATORIA                        ║
// ║  [BUSCAR: Random · random · nextInt · caracteres]        ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "Genera [N] usuarios con nombre y contraseña aleatorios
//    de 8 caracteres que no se repitan."
//   "Genera matrículas aleatorias en formato 1234BCD."
// CUANDO USARLO: generarUsuarios(), generarClientesAleatorios()...

class EjemplosAleatorio {

    static Random random = new Random();

    // [BUSCAR: generarUsuarios · caracteres · 8 caracteres · no se pueden repetir]
    // Genera String aleatorio de N caracteres con un alfabeto dado
    public static String generarStringAleatorio(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        // Usar Set para no repetir caracteres si el enunciado lo pide
        // Aquí generamos posiciones aleatorias del String de caracteres:
        Set<Integer> usados = new HashSet<>();
        while (sb.length() < longitud) {
            int index = random.nextInt(caracteres.length());
            if (!usados.contains(index)) {
                sb.append(caracteres.charAt(index));
                usados.add(index);
            }
        }
        return sb.toString();
    }

    // [BUSCAR: generarClientesAleatorios · matrícula · formato · 1234BCD]
    // Genera matrícula aleatoria en formato 1234BCD
    public static String generarMatricula() {
        String letras = "BCDFGHJKLMNPQRSTVWXYZ"; // sin vocales (como la profe)
        String numeros = "0123456789";
        StringBuilder matricula = new StringBuilder();
        // 4 números
        for (int i = 0; i < 4; i++) {
            matricula.append(numeros.charAt(random.nextInt(numeros.length())));
        }
        // 3 letras
        for (int i = 0; i < 3; i++) {
            matricula.append(letras.charAt(random.nextInt(letras.length())));
        }
        return matricula.toString();
    }

    // [BUSCAR: generarDNI · DNI aleatorio · 8 dígitos · letra]
    // Genera DNI aleatorio en formato 12345678X
    public static String generarDNI() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder dni = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            dni.append(random.nextInt(10)); // 8 dígitos
        }
        dni.append(letras.charAt(random.nextInt(letras.length()))); // 1 letra
        return dni.toString();
    }

    // [BUSCAR: generarClientesAleatorios · máximo 10 · no repetir]
    // Patrón completo: generar N elementos únicos
    public static void generarElementosAleatorios(int cantidad, ArrayList<TipoA> lista) {
        Set<String> idsUsados = new HashSet<>();
        int generados = 0;
        while (generados < cantidad) {
            String id = generarMatricula();
            if (!idsUsados.contains(id)) { // comprueba unicidad
                idsUsados.add(id);
                lista.add(new TipoA(id));
                // la profe: System.out.println("Chivato -- " + id); // para ver los datos
                generados++;
            }
        }
    }
}


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 10 - LocalDate                                  ║
// ║  [BUSCAR: LocalDate · now() · fecha · LocalDate.of]      ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "El atributo fecha_visita será la fecha actual del sistema."
//   "Muestra eventos ordenados por fecha."
//   "Crea evento con fecha LocalDate.of(2025, 4, 16)."
// CUANDO USARLO: cualquier cosa con fechas

class EjemplosLocalDate {

    static void ejemplos() {
        // [BUSCAR: LocalDate.now() · fecha actual · sistema]
        LocalDate hoy = LocalDate.now();

        // [BUSCAR: LocalDate.of · fecha concreta]
        LocalDate fechaEspecifica = LocalDate.of(2025, 4, 16);

        // Comparar fechas (para ordenar)
        // [BUSCAR: compareTo · isBefore · isAfter · ordenados por fecha]
        int comparacion = hoy.compareTo(fechaEspecifica);
        boolean estaAntes = hoy.isBefore(fechaEspecifica);
        boolean estaDespues = hoy.isAfter(fechaEspecifica);

        // Ordenar lista por fecha con Comparator:
        // lista.sort(new Comparator<Evento>() {
        //     @Override
        //     public int compare(Evento a, Evento b) {
        //         return a.getFecha().compareTo(b.getFecha());
        //     }
        // });

        // Mostrar en formato legible:
        System.out.println("Hoy: " + hoy); // formato: 2025-04-16
    }
}


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 11 - MATRICES 2D (encuesta)                     ║
// ║  [BUSCAR: double[][] · matriz · fila · columna · %]      ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "Contabiliza en una matriz de tamaño 2x4 las respuestas.
//    Fila 1: conteo. Fila 2: porcentaje sobre 100."
// CUANDO USARLO: encuesta de satisfacción (Experiencia enum)

class EjemplosMatriz {

    // [BUSCAR: double[][] · 2x4 · matriz · static]
    // Siempre static en la clase principal (EleccionesApp)
    static double[][] matriz = new double[2][4];
    // Fila 0 (índice 0): conteos por categoría del enum
    // Fila 1 (índice 1): porcentajes

    // [BUSCAR: contabilizarDatosEncuesta · switch · opcion · matriz]
    public static void contabilizarDatosEncuesta(int opcion) {
        switch (opcion) {
            case 1: matriz[0][0]++; break; // HORRIBLE
            case 2: matriz[0][1]++; break; // MEJORABLE
            case 3: matriz[0][2]++; break; // INTUITIVA
            case 4: matriz[0][3]++; break; // EXCELENTE
            default: System.out.println("Opción no válida.");
        }
        System.out.println("Gracias por tu valoración. Nos sirve para mejorar.");
    }

    // [BUSCAR: imprimirDatosExperiencia · porcentaje · fila 2 · calcular]
    // Se llama al FINAL (en recuento()), calcula porcentajes y los imprime
    public static void imprimirDatosExperiencia() {
        // Calcular total de encuestados (suma de fila 0)
        double total = 0;
        for (int j = 0; j < 4; j++) {
            total += matriz[0][j];
        }

        // Calcular porcentajes (fila 1) si hay encuestados
        if (total > 0) {
            for (int j = 0; j < 4; j++) {
                matriz[1][j] = (matriz[0][j] / total) * 100;
            }
        }

        // Imprimir resultados con el enum para los nombres
        System.out.println("-----------------------------");
        System.out.println("Datos de experiencia de usuario con la app...");
        TipoEnum[] valores = TipoEnum.values();
        // Si usas el enum Experiencia real:
        // Experiencia[] valores = Experiencia.values();
        for (int j = 0; j < valores.length; j++) {
            System.out.println(" - " + valores[j] + ": "
                    + (int) matriz[0][j]           // conteo (entero)
                    + " (" + (int) matriz[1][j]     // porcentaje (entero)
                    + "%)");
        }
        System.out.println("-----------------------------");
    }
}


// ╔══════════════════════════════════════════════════════════╗
// ║  BLOQUE 12 - BUCLE PRINCIPAL + MENÚ (clase App)         ║
// ║  [BUSCAR: main · while · salir · Scanner · continue]     ║
// ╚══════════════════════════════════════════════════════════╝
// ENUNCIADO TIPO:
//   "El programa principal tendrá un bucle que solo terminará
//    cuando el usuario introduzca 'salir'."
//   "Crea una clase AppX con la lógica principal."
// CUANDO USARLO: SIEMPRE, es el esqueleto de la app

class AppEjemplo {

    // [BUSCAR: static Scanner · teclado · static int · contadores · static double[][]]
    static Scanner teclado = new Scanner(System.in);
    static int contadorSI = 0;
    static int contadorNO = 0;
    static double[][] matriz = new double[2][4];
    // La profe declara colecciones aquí:
    static LinkedHashSet<EntidadBase> yaHanActuado = new LinkedHashSet<>();
    static TreeMap<String, Integer> conteoPorPoblacion = new TreeMap<>();

    public static void main(String[] args) {

        // PASO 1: Cargar datos iniciales
        // [BUSCAR: generarCenso · generarUsuarios · insertarEvento]
        ClaseContenedor.generarDatos();

        // PASO 2: Mensaje de bienvenida + preguntar población
        System.out.println("**** APP ****");
        System.out.println("\nIntroduce la población: ");
        String poblacion = teclado.nextLine();
        System.out.println("\nEmpieza en " + poblacion + "!!");

        // PASO 3: BUCLE PRINCIPAL
        // [BUSCAR: while(true) · salir · break · continue]
        while (true) {

            // Pedir tipo de acción o "salir"
            System.out.println("\nIntroduce opción [OPCION_A, OPCION_B] ò SALIR: ");
            String tipoAccion = teclado.nextLine();

            // Condición de salida
            if (tipoAccion.equalsIgnoreCase("salir")) break;

            // Pedir dato principal (DNI, matrícula, usuario...)
            System.out.println("Introduce el identificador: ");
            String dato = teclado.nextLine();

            // PASO 4: Validar formato
            // [BUSCAR: validarDocumento · matches · continuar · continue]
//            if (!EjemplosValidacion.validarDocumento(dato)) {
//                System.out.println("El formato no es correcto");
//                continue; // vuelve al inicio del bucle
//            }

            // PASO 5: Crear objeto según tipo
            // [BUSCAR: new Nacional · new Extranjero · DNI · NIE]
            EntidadBase entidad;
            if (tipoAccion.equalsIgnoreCase("OPCION_A")) {
                entidad = new TipoA(dato);
            } else {
                entidad = new TipoB(dato, "valorExtra");
            }

            // PASO 6: Verificar empadronamiento / existencia
            // [BUSCAR: verificarEmpadronamiento · exists · contains · no existe]
            if (!verificarExistencia(entidad)) {
                continue; // vuelve al inicio
            }

            // PASO 7: Comprobar fraude / estado
            // [BUSCAR: comprobarFraude · votado · FraudeException · try-catch]
            try {
                comprobarEstado(entidad);
            } catch (MiExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
                continue; // vuelve al inicio del bucle
            }

            // PASO 8: Acción principal con bucle do-while para validar respuesta
            // [BUSCAR: do-while · SI · NO · respuesta válida · insistirá]
            String respuesta = "";
            do {
                entidad.accion();
                System.out.println("¿Opción A o B? [A, B]");
                respuesta = teclado.nextLine();
            } while (!respuesta.equalsIgnoreCase("A") && !respuesta.equalsIgnoreCase("B"));

            System.out.println("Respuesta registrada. Gracias.");

            // Contabilizar respuesta
            if (respuesta.equalsIgnoreCase("A")) {
                contadorSI++;
            } else {
                contadorNO++;
            }

            // PASO 9: Actualizar estado tras la acción
            // [BUSCAR: yaHanVotado · add · setVotado · borrarVotante · votosPorPueblo]
            yaHanActuado.add(entidad);
            entidad.setProcesado(true); // equivale a votado = true
            ClaseContenedor.eliminarElemento(entidad); // borra del censo

            // Contabilizar por población (TreeMap)
            String pob = entidad.getPoblacion();
            conteoPorPoblacion.put(pob, conteoPorPoblacion.getOrDefault(pob, 0) + 1);

            // PASO 10: Encuesta y contabilizar
            // [BUSCAR: encuestaSatisfaccion · contabilizarDatos]
            int opcionEncuesta = EntidadBase.encuestaSatisfaccion();
            EjemplosMatriz.contabilizarDatosEncuesta(opcionEncuesta);

        } // fin while

        // PASO 11: Recuento final (se llama automáticamente al salir)
        // [BUSCAR: recuento · imprimirResultados · imprimirVotos · imprimirExperiencia]
        recuento();
    }

    // --- MÉTODOS AUXILIARES ---

    // [BUSCAR: verificarEmpadronamiento · contains · foreach · coincide]
    // SOLUCIÓN 1: con contains (requiere equals/hashCode bien hechos)
    public static boolean verificarExistencia(EntidadBase entidad) {
        if (ClaseContenedor.lista.contains(entidad)) {
            // Recuperar el objeto completo de la lista (para obtener nombre, etc.)
            for (EntidadBase e : ClaseContenedor.lista) {
                if (e.equals(entidad)) {
                    System.out.println("Votante " + e.getNombre() + " censado correctamente.");
                    return true;
                }
            }
        }
        System.out.println("La persona no está empadronada en la población.");
        return false;
    }

    // [BUSCAR: comprobarFraude · votado · true · FraudeException · AVISO]
    public static void comprobarEstado(EntidadBase entidad) {
        System.out.println("\nComprobando datos...");

        // Buscar el objeto real en la lista (el que tiene el estado actualizado)
        for (EntidadBase e : ClaseContenedor.lista) {
            if (e.equals(entidad)) {
                if (e.isProcesado()) { // si votado == true → fraude
                    // [BUSCAR: throw new FraudeException · AVISO A LA GUARDIA CIVIL]
                    throw new MiExcepcionPersonalizada(
                            "¡AVISO! Intento de doble voto detectado");
                }
                System.out.println(e.getNombre() + " puede votar.");
                return;
            }
        }
    }

    // [BUSCAR: recuento · imprimirResultadosVotacion · imprimirVotosPorPoblacion]
    public static void recuento() {
        imprimirResultadosVotacion();
        imprimirVotosPorPoblacion();
        EjemplosMatriz.imprimirDatosExperiencia();
    }

    // [BUSCAR: imprimirResultadosVotacion · contadores · SI · NO]
    public static void imprimirResultadosVotacion() {
        System.out.println("-----------------------------");
        System.out.println("RECUENTO!");
        System.out.println("Votos SI: " + contadorSI);
        System.out.println("Votos NO: " + contadorNO);
    }

    // [BUSCAR: imprimirVotosPorPoblacion · TreeMap · entrySet · ordenado]
    // TreeMap ya está ordenado alfabéticamente → no hace falta sort
    public static void imprimirVotosPorPoblacion() {
        System.out.println("-----------------------------");
        System.out.println("Datos de voto (por población): ");

        // Contar desde yaHanActuado (incluyendo datos de prueba añadidos)
        // [BUSCAR: yaHanVotado · add · Ana · Luis · datos más realistas]
        // La profe añade votantes extra antes de imprimir para tener datos de varias poblaciones

        for (EntidadBase e : yaHanActuado) {
            String pob = e.getPoblacion();
            if (pob != null) {
                conteoPorPoblacion.put(pob, conteoPorPoblacion.getOrDefault(pob, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : conteoPorPoblacion.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // [BUSCAR: imprimirMenu · Añadir · Eliminar · Pagar · opciones]
    // Menú de opciones (TicketMutxa)
    public static void imprimirMenu(String infoCarrito) {
        System.out.println(infoCarrito);
        System.out.println("Elige una opción...");
        System.out.println("[1]. Añadir más entradas.");
        System.out.println("[2]. Eliminar entradas.");
        System.out.println("[3]. Pagar y finalizar.");
        System.out.println("----------------------------");
    }

    // [BUSCAR: Thread.sleep · cola virtual · posición · 3000]
    // Cola virtual simulada (TicketMutxa)
    public static void colaVirtual(List<EntidadBase> usuarios, EntidadBase comprador) {
        Queue<EntidadBase> cola = new LinkedList<>();

        // Añadir todos EXCEPTO el comprador
        for (EntidadBase u : usuarios) {
            if (!u.equals(comprador)) {
                cola.offer(u);
            }
        }
        // El comprador va al FINAL
        cola.offer(comprador);

        System.out.println("Espera tu turno...");
        int posicion = cola.size();
        while (!cola.isEmpty()) {
            EntidadBase actual = cola.poll();
            if (actual.equals(comprador)) {
                System.out.println("¡Es tu turno!");
                break;
            }
            System.out.println(" -- Estás en la posición " + posicion + " de la cola virtual.");
            posicion--;
            try {
                Thread.sleep(3000); // [BUSCAR: Thread.sleep · 3000 · realismo]
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // [BUSCAR: pagar · MetodoPago · PAYPAL · BIZUM · APPLEPAY · gastos gestión]
    // Método de pago (TicketMutxa)
    public static void seleccionarMetodoPago(double importeBase) {
        Scanner teclado = new Scanner(System.in);
        String metodo = "";
        while (true) {
            System.out.println("Elige un método de pago:");
            // Mostrar opciones del enum con su precio:
            // for (MetodoPago mp : MetodoPago.values()) {
            //     System.out.println(mp + " (gastos de gestión: " + mp.getPrecio() + "€).");
            // }
            System.out.println("Opción:");
            metodo = teclado.nextLine();
            // Comprobar si coincide con algún valor del enum (ignorando mayúsculas)
            boolean encontrado = false;
            // for (MetodoPago mp : MetodoPago.values()) {
            //     if (mp.name().equalsIgnoreCase(metodo)) {
            //         System.out.println("Realizando pago con " + mp + " (+ " + mp.getPrecio() + " € de gastos)");
            //         System.out.println("MUCHAS GRACIAS. DISFRUTA DEL EVENTO!");
            //         encontrado = true;
            //         break;
            //     }
            // }
            if (!encontrado) {
                System.out.println("Método de pago no válido. Vuelve a intentarlo.");
            } else {
                break;
            }
        }
    }
}


