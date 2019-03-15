package tests;
import clases.*;
import enumerados.NivelActividad;
import gestion.GestionCalculadora;
public class TestGestion {

	public static void main(String[] args) {
		GestionCalculadora gestion = new GestionCalculadora();
		AfiliadoImpl af = new AfiliadoImpl("Pepe Luis",new Fecha(2010,15,6), NivelActividad.ALTO,95);
		
		AfiliadoImpl[] array = new AfiliadoImpl[50];
		array[0] = new AfiliadoImpl();
		array[1] = new AfiliadoImpl();
		array[2] = new AfiliadoImpl();
		array[3] = new AfiliadoImpl("Pepa",new Fecha(2010,15,6), NivelActividad.ALTO,95);
		array[4] = new AfiliadoImpl("Pepe Luis",new Fecha(2010,15,6), NivelActividad.ALTO,95);
		
		System.out.println(gestion.calcularCalorias(af, 15));
		System.out.println(gestion.calcularCalorias(af, 10));
		
		System.out.println(gestion.obtenerValorConstante(NivelActividad.BAJO));
		
		System.out.println(gestion.siguientePosicionLibre(array));
		System.out.println(gestion.ultimaPosicionOcupada(array));
		
		//array[3] = gestion.procesarAfiliado();
		
		//gestion.imprimirListado(array);
		gestion.imprimirListadoPorActividad(array, NivelActividad.ALTO);
		
		//System.out.println(gestion.contarAfiliadosNivelActividad(array, NivelActividad.ALTO));


	}

}
