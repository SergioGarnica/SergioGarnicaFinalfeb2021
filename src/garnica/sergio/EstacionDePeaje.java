package garnica.sergio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EstacionDePeaje {

	private List<Cabina> cabinas=new ArrayList<Cabina>();

	

	
	public EstacionDePeaje() {
		

	}

	//Metodo que agrega todas las cabinas (No Obligatorio)
	public void agregarCabinas(Cabina cabina) {
		cabinas.add(cabina);

		

	}

	/*
	 * obtiene todas un listado de cabinas ordenas por importe recaudado en forma descendete
	 */
	public Set<Cabina> otenerCabinasOrdenadaImporteDescendente(Orden orden) {
           Set<Cabina> cabinaOrdenada=new TreeSet<Cabina>(orden);
		
	}

}
