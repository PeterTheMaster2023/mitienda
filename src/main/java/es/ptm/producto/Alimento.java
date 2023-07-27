package es.ptm.producto;

import java.util.Calendar;

public class Alimento extends Producto {

	private Calendar fechaCaducidad;

	public Calendar getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Calendar fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Alimento(String nombre, float precio, Calendar fechaCaducidad) {
		super(nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String getCategoria() {
		return CategoriaProducto.ALIMENTO.name();
	}

	@Override
	public int getPorcentajeIncremento() {
		return 5;
	}

	@Override
	public TipoIncremento getTipoIncremento() {
		return TipoIncremento.NEGATIVO;
	}

}
