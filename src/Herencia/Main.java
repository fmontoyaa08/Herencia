package Herencia;
/*
 * EXPLICACIÓN DE LA TAREA:
 * 1. Herencia: Se utilizó la palabra 'extends' para que las clases hijas hereden atributos de los padres.
 * 2. Sobrescritura: Se usó @Override para personalizar métodos como calcularArea o mostrarInfo.
 * 3. Encapsulamiento: Se usaron atributos 'private' y 'protected' para proteger los datos.
 */
public class Main {
    public static void main(String[] args) {
        
        // 1. Prueba de Persona
        Docente miProfe = new Docente("Juan Monrroy", 45, "Programacion");
        miProfe.mostrar();

        // 2. Prueba de Cuenta
        CuentaCorriente corriente = new CuentaCorriente(100, 500);
        System.out.println("\n--- Prueba Cuenta ---");
        corriente.retirar(150);
        corriente.mostrarSaldo();

        // 3. Prueba de Producto
        System.out.println("\n--- Prueba Producto ---");
        ProductoPerecedero yogurt = new ProductoPerecedero("20/05/2026");
        yogurt.mostrar();
        
        yogurt.mostrar();

        // El Bus debe ir ANTES de que se cierre el main
        System.out.println("\n--- Prueba de Transporte ---");
        Bus miBus = new Bus(50, "Ruta 22");
        miBus.descripcion();
        
Perro miPerro = new Perro("Rocky", "Labrador");
        
        // Mostramos sus datos usando los métodos que ya tienes
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        System.out.println("Raza: " + miPerro.getRaza());
        
        // Llamamos al método que sobrescribimos (Override)
        miPerro.hacersonido(); 
        
     // --- PRUEBA DE VEHICULO Y MOTO ---
        System.out.println("\n--- Prueba de Vehiculo ---");
        Moto miMoto = new Moto("Honda", 140, 250);
        miMoto.mostrarInfo();
        
        Circulo miCirculo = new Circulo(5.5);
        miCirculo.calcularArea();
        
     // --- PRUEBA DE LIBROS ---
        System.out.println("\n--- Prueba de Libros ---");
        
        // Creamos un libro normal
        Libro miLibro = new Libro("Cien años de soledad", "Gabriel García Márquez");
        miLibro.mostrarInfo();
        
        // Creamos un libro digital
        LibroDigital miLibroDigital = new LibroDigital("Java para Principiantes", "Deitel", 15.5);
        miLibroDigital.mostrarInfo();
        
     // --- PRUEBA SISTEMA DE FACTURACIÓN ---
        System.out.println("\n********** SISTEMA DE FACTURACIÓN **********");
        Cliente c = new Cliente("Fátima Montoya", "123456-7");

        // Caso 1: Contado con descuento
        FacturaContado fc = new FacturaContado(101, c, 500, 50);
        fc.calcularTotal();

        System.out.println("--------------------------------------------");

        // Caso 2: Crédito con recargo
        FacturaCredito fcr = new FacturaCredito(102, c, 1000, 100, 3);
        fcr.calcularTotal();

    } 


    } 
