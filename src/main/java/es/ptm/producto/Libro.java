package es.ptm.producto;

import java.util.Comparator;

public class Libro extends Producto implements InfoLibro {

	private static final int MIN_NUM_HOJAS = 100;
	private static final int MAX_NUM_HOJAS = 400;

	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Libro(String nombre, float precio, String autor) {
		super(nombre, precio);
		this.autor = autor;
	}

	@Override
	public int NumeroHojas() {
		return Util.NumeroEnRango(MIN_NUM_HOJAS, MAX_NUM_HOJAS);
	}

	@Override
	public String getCategoria() {
		return CategoriaProducto.LIBRO.name();
	}

	@Override
	public int getPorcentajeIncremento() {
		return 10;
	}

	@Override
	public TipoIncremento getTipoIncremento() {
		return TipoIncremento.POSITIVO;
	}

//	public class NombreComparator implements Comparable<Libro> {
//		@Override
//		public int compareTo(Libro o) {
//			return getNombre().compareTo(o.getNombre());
//		}
//	}
//
//	public class NombreInversoComparator implements Comparable<Libro> {
//		@Override
//		public int compareTo(Libro o) {
//			return getNombre().compareTo(o.getNombre()) * (-1);
//		}
//	}
//

	public static Comparator<Libro> COMPARE_BY_NAME = new Comparator<Libro>() {
		public int compare(Libro one, Libro other) {
			return one.getNombre().compareTo(other.getNombre());
		}
	};

	public static Comparator<Libro> COMPARE_BY_NAME_INVERSO = new Comparator<Libro>() {
		public int compare(Libro one, Libro other) {
			return one.getNombre().compareTo(other.getNombre()) * (-1);
		}
	};

}
