package garnica.sergio;

public class AutoBus extends Vehiculo {

	
	
	private Tag tag;
	
	public AutoBus(String patente, Tag tag) {
		super(patente);
		this.tag=tag;
	}

	
	
	@Override
	public String getTipo() {
		
		return "AutoBus";
	}

	
	public void recargarTag(Double montoAAgregar) {
		Double saldo=0.0;
		
		saldo=tag.getSaldo();
		saldo=tag.getSaldo()+montoAAgregar;
	}

	
	
		
	
	

}
