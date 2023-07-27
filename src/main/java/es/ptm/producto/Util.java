package es.ptm.producto;

import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public class Util {

	public static int NumeroEnRango(int pMinimo, int pMaximo) {
		int numero = ThreadLocalRandom.current().nextInt(pMinimo, pMaximo + 1);
		return numero;
	}

	public static Calendar FechaAleatoria(int pMeses) {
		Calendar fecha = Calendar.getInstance();
		int meses = Util.NumeroEnRango(1, pMeses);
		fecha.add(Calendar.MONTH, meses);
		return fecha;
	}

	public static float ObtenerNumeroAleatorio(int pMin, int pMax) {
		float valor = (float) Util.NumeroEnRango(pMin, pMax);
		return valor;
	}

}
