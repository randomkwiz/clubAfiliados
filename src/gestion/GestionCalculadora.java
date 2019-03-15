package gestion;
import clases.*;
import validacion.*;
import enumerados.NivelActividad;
public class GestionCalculadora {

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
		double calorias;
		calorias = obtenerValorConstante(afiliado.getNivel()) * duracion * afiliado.getPeso();
		return calorias;
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
		double valor=0.0;
		if (nivel == NivelActividad.BAJO) {
			valor = 0.15;
		}else if (nivel == NivelActividad.MEDIO) {
			valor = 0.25;
		}else if (nivel == NivelActividad.ALTO) {
			valor = 0.35;
		}
		
		return valor;
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
		for(int i = 0; i < this.siguientePosicionLibre(afiliados); i++   ) {
			System.out.println(afiliados[i].getIdentificador());
			System.out.println(afiliados[i].getApellidoNombre() );
			System.out.println(afiliados[i].getNivel() );
			System.out.println(afiliados[i].getPeso() );
			System.out.println(afiliados[i].obtenerCategoria(2019) );
		}
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
		for(int i = 0, j =0; i < this.siguientePosicionLibre(afiliados) ; i ++) {
			
			if (afiliados[i].getNivel() == actividad) {
				System.out.println(  afiliados[i].toString() );
			}
		}
	
		
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
		int cantidad = 0;
		for(int i =0; i < this.siguientePosicionLibre(afiliados); i ++) {
			if (afiliados[i].getNivel() == actividad) {
				cantidad++;
			}
		}
		return cantidad;
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
		String nombre=" ";
		Fecha myFecha = null;
		NivelActividad nivel= NivelActividad.NULL;
		int d=0, m=0, a=0;
		double peso = 0.0;
		Validar validar = new Validar();
		AfiliadoImpl afiliado = null;
		
		//pedirNombre 
		nombre = validar.pedirNombre();
		
		//pedirValidarFechaAlta
		myFecha = validar.pedirFecha();
		
		//pedirNivelActividad
		nivel = validar.pideNivelActividad();
		
		//pedirPeso
		peso = validar.pedirPeso();
		
		afiliado = new AfiliadoImpl(nombre, myFecha, nivel, peso);
		return afiliado;
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
		int pos = 0;
		for (int i = arrayAfiliados.length -1; i >= 0; i -- ) {
			if (arrayAfiliados[i] == null ) {	//devuelve el ultimo null empezando a contar por el final. Eso se traduce en que devuelve el siguiente espacio libre del array (empezando por el principio)
				pos = i;
			}
		}
		
		return pos;
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
		int pos = 0;
		for (int i = 0; i < arrayAfiliados.length; i ++ ) {
			if (arrayAfiliados[i] != null ) {	//la ultima posicion que sea diferente de null (empezando a contar por el principio) sera la ultima posicion ocupada del array
				pos = i;
			}
		}
		
		return pos;
	}
	
}
