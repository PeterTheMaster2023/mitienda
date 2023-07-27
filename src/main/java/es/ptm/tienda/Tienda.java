package es.ptm.tienda;

import es.ptm.producto.Producto;

public class Tienda {

	public static void venderProducto(Producto producto) {

		System.out.println();
		System.out.println("Datos del producto");
		System.out.println("-----------------");
		System.out.println(String.format("   - Nombre: %s", producto.getNombre()));
		System.out.println(String.format("   - Precio: %5.2f", producto.getPrecio()));
		System.out.println(String.format("   - Precio Venta (%s): %5.2f", producto.getDescripcionIncrementoPrecio(),
				producto.calcularPrecioVenta()));

	}

}
