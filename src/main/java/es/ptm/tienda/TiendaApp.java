package es.ptm.tienda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import es.ptm.producto.Alimento;
import es.ptm.producto.Electronico;
import es.ptm.producto.Libro;
import es.ptm.producto.Producto;
import es.ptm.producto.Util;

/**
 * Hello world!
 *
 */
public class TiendaApp {

	private static List<Producto> productosList = new ArrayList<Producto>();

	public static void main(String[] args) {

//		inicio();
//		cargaProductos();
//		mostrarProductos();
		pruebaSoloLibros();

	}

	private static void mostrarProductos() {
		for (Producto myProducto : productosList) {
			Tienda.venderProducto(myProducto);
		}
	}

	private static void cargaProductos() {

		CreaAlimento("Tomate");
		CreaAlimento("Pepino");
		CreaAlimento("Cebolla");
		CreaAlimento("Calabaza");
		CreaAlimento("Melón");

		CreaLibro("La tormenta", "Pepe Sanz");
		CreaLibro("Paisajes", "Pepe Sanz");
		CreaLibro("Ana es un desastre", "Juan Bautista");
		CreaLibro("Vivencias", "María Gutiérrez");
		CreaLibro("Decálogo del profesor", "María Gutiérrez");

		CreaElectronico("Ordenador", 400, 2000);
		CreaElectronico("Monitor", 50, 500);
		CreaElectronico("Cable", 1, 25);
		CreaElectronico("Switch", 50, 300);
		CreaElectronico("Memoria", 50, 300);

	}

	private static void pruebaSoloLibros() {

		productosList.clear();
		CreaLibro("La tormenta", "Pepe Sanz");
		CreaLibro("Paisajes", "Pepe Sanz");
		CreaLibro("Ana es un desastre", "Juan Bautista");
		CreaLibro("Vivencias", "María Gutiérrez");
		CreaLibro("Decálogo del profesor", "María Gutiérrez");

		inicio2();
		titulo2("Lista recién insertada");
		List<Libro> librosList = obtenerListaLibros();
		imprimirListaLibros(librosList);

		titulo2("Lista ordenada");
		Collections.sort(librosList, Libro.COMPARE_BY_NAME);
		imprimirListaLibros(librosList);

		titulo2("Lista ordenada al revés");
		Collections.sort(librosList, Libro.COMPARE_BY_NAME_INVERSO);
		imprimirListaLibros(librosList);

	}

	private static void imprimirListaLibros(List<Libro> pLibros) {

		for (Libro miLibro : pLibros) {
			System.out.println(String.format("Título: %s", miLibro.getNombre()));
		}

	}

	private static void CreaAlimento(String pNombre) {

		Calendar fechaCaduca = Calendar.getInstance();
		int meses = Util.NumeroEnRango(1, 24);
		fechaCaduca.add(Calendar.MONTH, meses);
		float precio = (float) Util.NumeroEnRango(1, 20);

		Producto producto = new Alimento(pNombre, precio, fechaCaduca);
		productosList.add(producto);
	}

	private static void CreaElectronico(String pNombre, int pMin, int pMax) {
		Calendar fecha = Util.FechaAleatoria(24);
		float precio = Util.NumeroEnRango(pMin, pMax);
		Producto producto = new Electronico(pNombre, precio, fecha);
		productosList.add(producto);
	}

	private static void CreaLibro(String pNombre, String pAutor) {
		float precio = Util.NumeroEnRango(1, 100);
		Producto producto = new Libro(pNombre, precio, pAutor);
		productosList.add(producto);
	}

	private static List<Libro> obtenerListaLibros() {
		List<Libro> res = new ArrayList<Libro>();
		Libro miLibro;
		for (Producto tmpProducto : productosList) {
			if (tmpProducto instanceof Libro) {
				miLibro = (Libro) tmpProducto;
				res.add(miLibro);
			}
		}
		return res;
	}

	private static void inicio() {
		System.out.println("");
		System.out.println("");
		System.out.println("|------------------------|");
		System.out.println("| Bienvenido a la Tienda |");
		System.out.println("|------------------------|");
	}

	private static void inicio2() {
		System.out.println("");
		System.out.println("");
		System.out.println("|-----------------------|");
		System.out.println("| Prueba lista ordenada |");
		System.out.println("|-----------------------|");
	}

	private static void titulo2(String pTitulo) {
		System.out.println("");
		System.out.println("");
		System.out.println(String.format(" %s: ", pTitulo));
		System.out.println("-----------------------------");
	}

}
