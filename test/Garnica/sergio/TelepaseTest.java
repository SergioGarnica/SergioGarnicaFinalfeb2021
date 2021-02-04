package Garnica.sergio;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import garnica.sergio.AutoBus;
import garnica.sergio.SaldoInsuficienteError;
import garnica.sergio.Tag;
import garnica.sergio.TagNoEncontradoException;
import garnica.sergio.Telepase;
import garnica.sergio.VehiculoNoPermitidoExceptions;

public class TelepaseTest {
	
	
	@Test
	public void queVerificaQueSeEncuentreElTagConIdUno () throws TagNoEncontradoException {
		//Para este test se debeinvocar al metodo public Boolean verifcarExiste(Tag tag)
		//el mismo no se puede modificar
		Telepase tele=new Telepase(1);
		Tag tag=new Tag(1);
		
		assertTrue(tele.verifcarExiste(tag));
	}
	

	@Test(expected=SaldoInsuficienteError.class)
	public void queAlPasarAutobusconSaldoInsuficienteLanceUnaExcepcion () throws TagNoEncontradoException, VehiculoNoPermitidoExceptions, SaldoInsuficienteError {
		Tag tag=new Tag(1) ;
		AutoBus auto=new AutoBus("abc",tag);
		Telepase tele=new Telepase(1);
		tele.pagarAutomatico(auto);
	}
	
	@Test(expected=TagNoEncontradoException.class)
	public void queAlPasarUnAutobusconUnTagInvalidoLanceUnaExcepcion () throws TagNoEncontradoException, VehiculoNoPermitidoExceptions, SaldoInsuficienteError {
		Tag tag=new Tag(1) ;
		AutoBus auto=new AutoBus("abc",tag);
		Telepase tele=new Telepase(1);
		tele.pagarAutomatico(auto);
	}
	
	

}
