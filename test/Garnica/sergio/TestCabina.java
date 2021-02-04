package Garnica.sergio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import garnica.sergio.Cabina;
import garnica.sergio.Moto;
import garnica.sergio.Vehiculo;

public class TestCabina {

	@Test
	public void queVerificaQueCuenteCorrectamenteLaCantidadDeVehiculosQuePaSanPorUnacabina() {
		
	}


	@Test
	public void queVerificaQueSeRecaudeCorrectaMenteElPagoDeUnVehiculo() {
		Cabina cabina=new Cabina(1);
		Vehiculo vehiculo= new Moto("abc");
		cabina.pagar(vehiculo);
		Double valorEsperado=50.0;
		Double valorObtenido=cabina.getRecaudacion();
		assertEquals(valorEsperado, valorObtenido);
	}

	
}
