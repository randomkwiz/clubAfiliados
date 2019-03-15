package resguardo;
import clases.*;
import enumerados.*;
public class Resguardo {

	/*Resguardos clase de GestionCalculadora*/
	

	/* INTERFAZ
	 * Signatura: public double calcularCalorias(AfiliadoImpl afiliado, int duracion)
	 * Comentario: calcula las calorias de un afiliado en una duracion determinada de un ejercicio
	 * Precondiciones: por valor se pasa un entero que es la duracion de la actividad en minutos. Por referencia se pasa un objeto tipo AfiliadoImpl
	 * Entradas:objeto afiliado y entero
	 * Salidas: double que son las calorias
	 * Entradas/Salidas:
	 * Postcondiciones: no se modifica el objeto. Asociado al nombre se devuelve un real que son las calorias
	 * */
	public double calcularCalorias(AfiliadoImpl afiliado, int duracion) {
		System.out.println("En resguardo calcular calorias");
		return 0.0;
	}
	
	/* INTERFAZ
	 * Signatura: public double obtenerValorConstante(NivelActividad nivel)
	 * Comentario: devuelve el valor de la constante segun el nivel de actividad
	 * Precondiciones: se pasa el nivel de actividad
	 * Entradas: nivel de actividad
	 * Salidas: double que es el valor de la constante
	 * Entradas/Salidas:
	 * Postcondiciones: asociado al nombre se devuelve el valor que corresponde con el nivel de actividad
	 * */
	public double obtenerValorConstante(NivelActividad nivel) {
		System.out.println("En resguardo obtener valor");
		return 0.0;
	}
	
	/* INTERFAZ
	 * Signatura: public void imprimirListado (AfiliadoImpl[] afiliados)
	 * Comentario: imprime por pantalla un listado de afiliados mostrando el nombre, el ID, el nivel de actividad, el peso y la categoria
	 * Precondiciones: por referencia se pasa un array de afiliados
	 * Entradas: array de afiliados tipo AfiliadoImpl
	 * Salidas: nada, imprime en pantalla
	 * Entradas/Salidas:
	 * Postcondiciones: no modifica el objeto ni devuelve nada
	 * */
	public void imprimirListado (AfiliadoImpl[] afiliados) {
		System.out.println("En resguardo imprimir afiliados");
	}
	
	/* INTERFAZ
	 * Signatura: public void imprimirListadoPorActividad (AfiliadoImpl[] afiliados, NivelActividad actividad)
	 * Comentario: imprime por pantalla un listado de afiliados segun su actividad
	 * Precondiciones: por referencia se pasa un array de afiliados y la actividad
	 * Entradas: array de afiliados tipo AfiliadoImpl y la actividad por la que filtraremos
	 * Salidas: nada, imprime en pantalla
	 * Entradas/Salidas:
	 * Postcondiciones: no modifica el objeto ni devuelve nada solo imprime
	 * */
	public void imprimirListadoPorActividad (AfiliadoImpl[] afiliados, NivelActividad actividad) {
		System.out.println("En resguardo imprimir afiliados por actividad");
	}
	
	
	/* INTERFAZ
	 * Signatura: public int contarAfiliadosNivelActividad (AfiliadoImpl[] afiliados, NivelActividad actividad)
	 * Comentario: devuelve cuantos afiliados tienen el mismo nivel de actividad
	 * Precondiciones:  se pasa un array de afiliados y  el nivel de actividad seleccionado
	 * Entradas: array de afiliados tipo AfiliadoImpl, NivelActividad actividad
	 * Salidas: entero que es la cantidad de afiliados que hay en un determinado nivel
	 * Entradas/Salidas:
	 * Postcondiciones: no modifica el objeto, asociado al nombre devuelve la cantidad
	 * */
	public int contarAfiliadosNivelActividad (AfiliadoImpl[] afiliados, NivelActividad actividad) {
		System.out.println("En resguardo cantidad afiliados por actividad");
		return 0;
	}
	
	/* INTERFAZ
	 * Signatura: public AfiliadoImpl procesarAfiliado()
	 * Comentario: procesa y guarda un afiliado
	 * Precondiciones:
	 * Entradas:
	 * Salidas:
	 * Entradas/Salidas:
	 * Postcondiciones: modifica el objeto
	 * */
	public AfiliadoImpl procesarAfiliado() {
		
		System.out.println("En resguardo procesar afiliado");
		return null;
	}
	
	/* INTERFAZ
	 * Signatura: public int siguientePosicionLibre(AfiliadoImpl[] arrayAfiliados)
	 * Comentario: devuelve la siguiente posicion libre de un array de afiliados
	 * Precondiciones: se pasa un array de afiliados
	 * Entradas: array afiliados tipo AfiliadosImpl
	 * Salidas: entero que es la posicion libre
	 * Entradas/Salidas:
	 * Postcondiciones: asociado al nombre se devuelve la posicon. No modifica el objeto
	 * */
	public int siguientePosicionLibre(AfiliadoImpl[] arrayAfiliados) {
		System.out.println("En resguardo siguiente posicion libre");
		return 0;
	}
	
	/* INTERFAZ
	 * Signatura: public int ultimaPosicionOcupada(AfiliadoImpl[] arrayAfiliados)
	 * Comentario: devuelve la ultima posicion ocupada de un array de afiliados
	 * Precondiciones: se pasa un array de afiliados
	 * Entradas: array afiliados tipo AfiliadosImpl
	 * Salidas: entero que es la posicion ocupada
	 * Entradas/Salidas:
	 * Postcondiciones: asociado al nombre se devuelve la posicon. No modifica el objeto
	 * */
	public int ultimaPosicionOcupada(AfiliadoImpl[] arrayAfiliados) {
		System.out.println("En resguardo siguiente posicion libre");
		return 0;
	}
	
}
