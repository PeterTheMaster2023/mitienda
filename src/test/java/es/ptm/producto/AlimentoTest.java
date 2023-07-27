package es.ptm.producto;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

public class AlimentoTest {

//	@Test
//	public void testCalcularPrecioVenta() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetFechaCaducidad() {

		Calendar fecha = Calendar.getInstance();
		fecha.add(Calendar.MONTH, 2);

		Alimento alimento = new Alimento("Tomate", 2, fecha);

		List<Alimento> alimentos = new ArrayList<Alimento>();
		alimentos.add(alimento);

		assertEquals(alimento.getNombre(), alimentos.get(0).getNombre());

	}

//	@Test
//	public void testSetFechaCaducidad() {
//		fail("Not yet implemented");
//	}

}
