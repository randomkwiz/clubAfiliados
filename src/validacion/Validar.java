package validacion;
import java.util.Scanner;
import clases.*;
import enumerados.NivelActividad;
public class Validar {

	/* INTERFAZ
	 * Signatura: public int quedanAfiliados()
	 * Comentario: pide, lee y valida si quedan afiliados por procesar 
	 * Precondiciones:
	 * Entradas:
	 * Salidas: entero que es 1 si sí quedan y 0 si no quedan
	 * Entradas/Salidas:
	 * Postcondiciones: asociado al nombre se devuelve un entero que es 1 si sí quedan y 0 si no quedan
	 * */
	public int quedanAfiliados() {
		Scanner entrada = new Scanner(System.in);
		int op;
		do {
			System.out.println("¿quedan afiliados? 1 SI 0 NO");
			op = entrada.nextInt();
		}while(op < 0 || op>1);
		return op;
	}
	
	/* INTERFAZ
	 * Signatura: public int duracionActividad()
	 * Comentario: pide lee y valida la duracion de una actividad en minutos
	 * Precondiciones:
	 * Entradas:
	 * Salidas: entero que es la duracion en minutos
	 * Entradas/Salidas:
	 * Postcondiciones: asociado al nombre devuelve duracion en minutos
	 * */
	public int duracionActividad() {
		Scanner entrada = new Scanner(System.in);
		int duracion;
		do {
			System.out.println("Introduce la duracion en minutos. Debe ser superior a 0: ");
			duracion = entrada.nextInt();
		}while(duracion <= 0 );
		return duracion;
	}
	
	
	/* INTERFAZ
	 * Signatura: public int menu()
	 * Comentario: pide lee y valida la opcion del menu 
	 * Precondiciones:
	 * Entradas:
	 * Salidas: entero que es la opcion del menu
	 * Entradas/Salidas:
	 * Postcondiciones: asociado al nombre devuelve opcion del menu
	 * */
	public int menu() {
		Scanner entrada = new Scanner(System.in);
		int op;
		do {
			System.out.println("MENU \n0. Salir");
			System.out.println("1. Listado de todos aquellos que tienen mismo nivel de actividad ");
			System.out.println("2. Cuantos han realizado una actividad en particular (nivel de actividad) ");
			op = entrada.nextInt();
		}while(op < 0 || op > 2 );
		return op;
	}
	
	/* INTERFAZ
	 * Signatura: public String pedirNombre()
	 * Comentario: pide un nombre. No lo valida porque nombres hay de todo tipo.
	 * Precondiciones:
	 * Entradas:
	 * Salidas: nombre que es un String
	 * Entradas/Salidas:
	 * Postcondiciones: asociado al nombre devuelve el nombre
	 * */
	public String pedirNombre() {
		Scanner entrada = new Scanner(System.in);
		String nombre = " ";
		System.out.println("Nombre afiliado: ");
		nombre = entrada.next();
		return nombre;
	}
	
	/* INTERFAZ
	 * Signatura: public Fecha pedirValidarFecha()
	 * Comentario: pide una fecha
	 * Precondiciones:
	 * Entradas:
	 * Salidas: objeto tipo Fecha
	 * Entradas/Salidas:
	 * Postcondiciones: objeto tipo fecha
	 * */
	public Fecha pedirFecha() {
		Scanner entrada = new Scanner(System.in);
		Fecha myFecha;
		int d, m, a;
		
		System.out.println("Dia: ");
		d = entrada.nextInt();
		System.out.println("Mes: ");
		m = entrada.nextInt();
		System.out.println("Anyo: ");
		a = entrada.nextInt();
		
		myFecha = new Fecha(a,m,d);
	
	return myFecha;	
	}
	
	/* INTERFAZ
	 * Signatura: public NivelActividad pideNivelActividad ()
	 * Comentario: pide un nivel actividad
	 * Precondiciones:
	 * Entradas:
	 * Salidas: nivel actividad
	 * Entradas/Salidas:
	 * Postcondiciones: devuelve nivel de actividad
	 * */
	public NivelActividad pideNivelActividad () {
		Scanner entrada = new Scanner(System.in);
		int nivel=0;
		NivelActividad act = NivelActividad.NULL;
		do {
			System.out.println("Introduce un nivel de actividad. 1 - BAJO, 2 - MEDIO , 3 - ALTO");
			nivel = entrada.nextInt();
		}while(nivel < 1 || nivel > 3);
		
		switch(nivel) {
		case 1:
			act = NivelActividad.BAJO;
			break;
		case 2:
			act = NivelActividad.MEDIO;
			break;
		case 3:
			act = NivelActividad.ALTO;
			break;
		}
		return act;
	}
	
	/* INTERFAZ
	 * Signatura: public double pedirPeso ()
	 * Comentario: pide y valida un peso 
	 * Precondiciones:
	 * Entradas:
	 * Salidas: peso (real)
	 * Entradas/Salidas:
	 * Postcondiciones: devuelve asociado al nombre un peso
	 * */
	public double pedirPeso () {
		Scanner entrada = new Scanner(System.in);
		double peso;
		do {
			System.out.println("Peso ");
			peso = entrada.nextDouble();
		}while(peso <= 0);
		
		return peso;
	}
	
	
}
