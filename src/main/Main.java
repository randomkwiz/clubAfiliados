/* Nombre alumna: Angela Vazquez Dominguez:
 * Comentario:
 * Entradas: opciones del usuario
 * Salida: mensajes de ayuda al usuario
 * 
 * */

/* PSEUDOCODIGO
 * inicio
 * 	repetir
 * 		pedirValidarQuedanAfiliados*
 * 		si (respuesta es si)
 * 			procesarAfiliado
 * 			pedirValidarDuracionActividad
 * 			mostrarCaloriasAfiliado
 * 		finSi
 * 	mientras(queden afiliados que procesar)
 * 
 * 	repetir
 * 		pedirValidarOpcionMenu
 * 		si (opcion no es salir)
 * 			segun(opcion)
 * 				caso 1: Listado de todos aquellos que tienen mismo nivel de actividad
 * 				caso 2: Cuantos han realizado una actividad en particular 			//se refiere al nivel de actividad
 * 			finSegun
 * 		finSi
 * 	mientras(opcion no sea salir)
 * fin
 * 
 * 
 * */
package main;
import clases.*;
import enumerados.NivelActividad;
import resguardo.*;
import validacion.*;
import gestion.*;
public class Main {

	public static void main(String[] args) {
		Resguardo resguardo = new Resguardo();
		AfiliadoImpl[] afiliados = new AfiliadoImpl[100];
		Validar validacion = new Validar();
		GestionCalculadora gestion = new GestionCalculadora();
		int respuesta, opcion, duracion;
		
		do {
			//pedirValidarQuedanAfiliados
		respuesta = validacion.quedanAfiliados();
		if (respuesta == 1) {
			//procesarAfiliado
			//afiliados[resguardo.siguientePosicionLibre(afiliados)] = resguardo.procesarAfiliado();
			afiliados[gestion.siguientePosicionLibre(afiliados)] = gestion.procesarAfiliado();
			//pedirValidarDuracionActividad
			duracion = validacion.duracionActividad();
			//mostrarCaloriasAfiliado
			
			//resguardo.calcularCalorias(afiliados[resguardo.ultimaPosicionOcupada(afiliados)], duracion);
			
			System.out.println( "Calorias: "+gestion.calcularCalorias(afiliados[gestion.ultimaPosicionOcupada(afiliados)], duracion) );
			
		}
		}while(respuesta != 0);
		do {
			//pedirValidarOpcionMenu
			opcion = validacion.menu();
			if (opcion !=0 ) {
				switch (opcion) {
				case 1:
					//Listado de todos aquellos que tienen mismo nivel de actividad
				/*
					resguardo.imprimirListadoPorActividad(afiliados, NivelActividad.BAJO);
					resguardo.imprimirListadoPorActividad(afiliados, NivelActividad.MEDIO);
					resguardo.imprimirListadoPorActividad(afiliados, NivelActividad.ALTO);
					*/
					System.out.println("BAJO:" );
					gestion.imprimirListadoPorActividad(afiliados, NivelActividad.BAJO);
					System.out.println("MEDIO:" );
					gestion.imprimirListadoPorActividad(afiliados, NivelActividad.MEDIO);
					System.out.println("ALTO:" );
					gestion.imprimirListadoPorActividad(afiliados, NivelActividad.ALTO);
	
					
					
					break;
				case 2:
					//Cuantos han realizado una actividad en particular 	
					/*
					System.out.println("BAJO " + resguardo.contarAfiliadosNivelActividad(afiliados, NivelActividad.BAJO));
					System.out.println("MEDIO " + resguardo.contarAfiliadosNivelActividad(afiliados, NivelActividad.MEDIO));
					System.out.println("ALTO " + resguardo.contarAfiliadosNivelActividad(afiliados, NivelActividad.ALTO));
					*/
					
					System.out.println("BAJO " + gestion.contarAfiliadosNivelActividad(afiliados, NivelActividad.BAJO));
					System.out.println("MEDIO " + gestion.contarAfiliadosNivelActividad(afiliados, NivelActividad.MEDIO));
					System.out.println("ALTO " + gestion.contarAfiliadosNivelActividad(afiliados, NivelActividad.ALTO));
					
					break;
				}
			}
			
		}while(opcion != 0);

	}

}
