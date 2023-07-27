package es.ptm.producto;

public abstract class Producto implements IProducto {

	private String nombre;
	private float precio;

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	protected void setPrecio(float precio) {
		this.precio = precio;
	}

	protected Producto(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public abstract String getCategoria();

	public abstract int getPorcentajeIncremento();

	public abstract TipoIncremento getTipoIncremento();

	public String getDescripcionIncrementoPrecio() {
		String signo = (getTipoIncremento().equals(TipoIncremento.POSITIVO)) ? "+" : "-";
		String desc = String.format("%s%s%s", signo, getPorcentajeIncremento(), "%");
		return desc;
	}

	public float calcularPrecioVenta() {
		float porcentaje = 0;
		if (getTipoIncremento().equals(TipoIncremento.POSITIVO)) {
			porcentaje = (float) (100 + getPorcentajeIncremento()) / 100;
		} else if (getTipoIncremento().equals(TipoIncremento.NEGATIVO)) {
			porcentaje = (float) (100 - getPorcentajeIncremento()) / 100;
		}
		return getPrecio() * porcentaje;
	}

}
