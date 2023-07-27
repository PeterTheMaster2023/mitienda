package es.ptm.producto;

public interface IProducto {

	public String getCategoria();

	public int getPorcentajeIncremento();

	public TipoIncremento getTipoIncremento();

	public String getDescripcionIncrementoPrecio();

	public float calcularPrecioVenta();

}
