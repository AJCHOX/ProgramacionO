import java.util.Collections;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner teclado;
		Boolean control =true;
		Inventario inventario=new Inventario();
		String isnb,titulo;
		double precio;
		int cantidad;
		do {
			System.out.println("\t BIENVENIDOS AL MENU DE INICIO \t");
			System.out.println("");
			System.out.println("<1> Ingresar libro");
			System.out.println("<2> Buscar libro por el isnb");
			System.out.println("<3> venta de libro");
			System.out.println("<4> Mostrar los tres libros mas caros");
			System.out.println("<5> Mostrar todos los libros");
			System.out.println("<0> Salir del programa");
			System.out.println(" ");
			System.out.println("Ingrese opción: ");

			teclado=new Scanner (System.in);		
			int numero = teclado.nextInt(); 
			if (numero == 1) {	
				System.out.println("Ingrese el isnb: ");
				isnb =teclado.next();
				
				System.out.println("Ingrese el titulo del libro: ");
				titulo =teclado.next();
				
				System.out.println("Ingrese el precio: ");
				precio =teclado.nextDouble();
				
				System.out.println("Ingrese la cantidad: ");
				cantidad =teclado.nextInt();
				
				inventario.almacenar(new Libro(isnb, titulo, precio, cantidad));
			}
			
			else if (numero == 2) {
				System.out.println("Introduce el isnb para buscar:");
				String isbn_buscado1 =teclado.next();
				if (inventario.getLibrobyIsbn(isbn_buscado1)==null) {
					System.out.println("Libro no encontrado");
				}
				else{
					System.out.println(inventario.getLibrobyIsbn(isbn_buscado1).toString());
				}
			}
			
			else if (numero == 3) {
				System.out.print("Que libro quieres: ");
				String isbn_buscado =teclado.next();
				if (inventario.getLibrobyIsbn(isbn_buscado)==null) {
					System.out.println("Libro no encontrado");
				}
				else {
					inventario.getLibrobyIsbn(isbn_buscado).setCantidad(inventario.getLibrobyIsbn(isbn_buscado).getCantidad()-1);
					System.out.println("Gracias a su compra nos quedan: " + inventario.getLibrobyIsbn(isbn_buscado).getCantidad() + " libros");
				}
				
			}
			
			else if (numero == 4) {
				Collections.sort(inventario.getLibros());
				
			}
			
			else if (numero == 5) {					
				System.out.println("\t Lista de libros \t");
				for(Libro l: inventario.getLibros()) {
					System.out.println(l.toString());
					System.out.println("");
				}
			}
			
			else if (numero == 0) {
				System.out.println("Hasta la proxima :)");
				control=false;
			}
			else {
				System.out.println("ERROR: Opcion no valida");
			}
		}
		while (control);

		
	}
}