import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro("001", "titulo 1", 10, 3);
		Libro l2 = new Libro("002", "titulo 2", 24, 4);
		Libro l3 = new Libro("003", "titulo 3", 21, 2);
		Libro l4 = new Libro("004", "titulo 4", 4, 1);
		Libro l5 = new Libro("005", "titulo 5", 5, 1);
		
		Inventario inventario = new Inventario();
		
		inventario.almacenar(l1);
		inventario.almacenar(l2);
		inventario.almacenar(l3);
		inventario.almacenar(l4);
		inventario.almacenar(l5);
		
		ArrayList<Libro> libros = inventario.getLibros();
		
		for(Libro l: libros) {
			System.out.println(l);
		}
		
		System.out.println();
		String isbn = "008";
		Libro result = inventario.getLibrobyIsbn(isbn);
		if(result != null) {
			System.out.println(result);
		}else {
			System.out.println("No se encontro el libro con el ISBN "+ isbn);
		}
		
		
//		for (int i = 0; i < libros.size(); i++) {
//			Libro l = libros.get(i);
//			System.out.println(l);
//		}
		
		// foreach
	
	}

}
