package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("Juan José");
        persona.setEdad(13);
        persona.setEmail("jjose@gmail.com");
        persona.setTelefono("693823813");
        System.out.println(persona.toString());

        Libro libro=new Libro();
        libro.setAutor("Marco Arias");
        libro.setTitulo("La noche de los Cuchillos largos, ¿Que sucedio exactamente?");
        libro.setAnhoPublicacion("20/05/2018");
        System.out.println(libro.toString());

        Circulo circulo=new Circulo();
        circulo.setRadio(7);
        System.out.println(circulo.toString());
        System.out.println("El area es: "+circulo.calcularArea()+" y el perimetro es: "+circulo.calcularPerimetro());

        Estudiante estudiante=new Estudiante();
        estudiante.setPromedio(6);
        estudiante.setEdad(19);
        estudiante.setCarrera("Fisica");
        estudiante.setNombe("Lester");
        System.out.println(estudiante.toString());
        if (estudiante.estaAprobado()){
            System.out.println(estudiante.getNombe()+" esta aprobado");
        }else{
            System.out.println(estudiante.getNombe()+" no esta aprobado");
        }

        Banco banco=new Banco();
        banco.setSaldo(1000.98);
        banco.setNombreTitular("Roman");
        banco.setNumeroCuenta("7893-932-108-938");
        System.out.println(banco.substracSaldo(500));
        System.out.println(banco.toString());

        Rectangulo rectangulo=new Rectangulo();
        rectangulo.setAncho(8);
        rectangulo.setLargo(5);
        System.out.println("El area es: "+rectangulo.calcularArea()+" y el perimetro es: "+rectangulo.calcularPerimetro());
        System.out.println(rectangulo.toString());

        Tienda tienda=new Tienda();
        Producto producto1=new Producto("Galleta",3.5,22);
        Producto producto2=new Producto("Agua",1.5,23);
        Producto producto3=new Producto("Leche",2.5,26);
        tienda.addProducto(producto1);
        tienda.addProducto(producto2);
        tienda.addProducto(producto3);
        System.out.println("El precio total es: "+tienda.precioTotal());
        tienda.subscratProducto(producto2,7);
        System.out.println(tienda.toString());
    }
}