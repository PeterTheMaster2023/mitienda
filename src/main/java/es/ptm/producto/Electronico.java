package es.ptm.producto;

import java.util.Calendar;

public final class Electronico extends Producto {

	private Calendar garantia;

	public Calendar getGarantia() {
		return garantia;
	}

	public void setGarantia(Calendar garantia) {
		this.garantia = garantia;
	}

	public Electronico(String nombre, float precio, Calendar garantia) {
		super(nombre, precio);
		this.garantia = garantia;
	}

	@Override
	public String getCategoria() {
		return CategoriaProducto.ELECTRÓNICO.name();
	}

	@Override
	public int getPorcentajeIncremento() {
		return 15;
	}

	@Override
	public TipoIncremento getTipoIncremento() {
		return TipoIncremento.POSITIVO;
	}

}
