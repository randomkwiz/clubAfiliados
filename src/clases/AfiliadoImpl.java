/* Nombre: Afiliado
 * Propiedades:
 * 		Basicas: 
 * 			private int identificador	consultable
 * 			private String apellidoNombre 	consultable y modificable
 * 			private Fecha fechaAlta		consultable
 * 			private NivelActividad nivel	consultable y modificable
 * 			private double peso	consultable y modificable
 * 			
 * 		Derivadas:
 * 			categoria que deriva de fechaAlta 
 * 		Compartida:
 * 			int contadorIdentificador
 * Restricciones:
 * 		-categoria debe estar entre 1 y 5 inclusive
 * 		-El peso no debe ser negativo ni 0. 
 * 		-identificador debe ser positivo (no hago excepcion para esto ya que como asigno yo los ID, nunca seran negativos)
 * 		
 * Metodos interface:
 * 	//getters
	public int getIdentificador();

	public String getApellidoNombre() ;

	//Patron delegacion
	public int getFechaAltaDia() ;
	public int getFechaAltaMes() ;
	public int getFechaAltaAnio() ;
	//fin patron

	public NivelActividad getNivel() ;

	public double getPeso();
	
	//setters
	public void setApellidoNombre(String apellidoNombre) ;
	public void setNivel(NivelActividad nivel) ;

	public void setPeso(double peso) throws ExcepcionAfiliado;
 * 
 * Metodos:
 * compareTo
 * equals
 * toString
 * hashCode
 * */
package clases;
import interfaces.Afiliado;
import enumerados.*;
import excepcion.*;
public class AfiliadoImpl implements Afiliado,Cloneable,Comparable <AfiliadoImpl> {
	/*Atributos*/
	 	private int identificador	;
	 	private String apellidoNombre 	;
	 	private Fecha fechaAlta		;
	 	private NivelActividad nivel	;
	 	private double peso	;
	 	
	 	private static int contadorID = 1000;
	 	
	 	/*Constructores*/
	 	
	 	public AfiliadoImpl () {
	 		this.identificador = contadorID++;
	 		this.apellidoNombre = "DEFAULT";
	 		this.fechaAlta = new Fecha (1900, 1, 1);
	 		this.nivel = NivelActividad.NULL;
	 		this.peso = 80.0; //pongo 80 porque es el peso medio de un ser humano estándar y poner 0 me parecia mas irreal
	 	}

		public AfiliadoImpl(String apellidoNombre, Fecha fechaAlta, NivelActividad nivel,
				double peso) {
			this.identificador =contadorID++;
			this.apellidoNombre = apellidoNombre;
			this.fechaAlta = fechaAlta;
			this.nivel = nivel;
			this.peso = peso;
		}
		
		public AfiliadoImpl (AfiliadoImpl otro) {
	 		this.identificador = contadorID++;	//considero que no tendran el mismo ID
	 		this.apellidoNombre = otro.apellidoNombre;
	 		this.fechaAlta = otro.fechaAlta;
	 		this.nivel = otro.nivel;
	 		this.peso =otro.peso; //pongo 80 porque es el peso medio de un ser humano estándar y poner 0 me parecia mas irreal

		}
		/*Metodos interface*/

		//getters
		public int getIdentificador() {
			return identificador;
		}

		public String getApellidoNombre() {
			return apellidoNombre;
		}

		//Patron delegacion
		public int getFechaAltaDia() {
			return fechaAlta.getDia();
		}
		public int getFechaAltaMes() {
			return fechaAlta.getMes();
		}
		public int getFechaAltaAnio() {
			return fechaAlta.getAnio();
		}
		//fin patron

		public NivelActividad getNivel() {
			return nivel;
		}

		public double getPeso() {
			return peso;
		}
		
		//setters
		public void setApellidoNombre(String apellidoNombre) {
			this.apellidoNombre = apellidoNombre;
		}

		public void setNivel(NivelActividad nivel) {
			this.nivel = nivel;
		}

		public void setPeso(double peso) throws ExcepcionAfiliado {
			if (peso <= 0) {
				throw new ExcepcionAfiliado("El peso debe ser positivo");
			}else {
				this.peso = peso;
			}
			
			
		}

		//Metodo añadido:
		/*INTERFAZ
		 * Signatura: public int obtenerCategoria(int anioActual)
		 * Comentario: calcula la categoria de un afiliado (empieza siendo 1 y suma uno cada año que pasa hasta un maximo de 5)
		 * Precondiciones: por valor se pasa el año actual
		 * Entradas: entero año actual
		 * Salida: entero que indica la categoria a la que pertenece el afiliado
		 * Postcondiciones: asociado al nombre se devuelve la categoria (int)
		 * */
		public int obtenerCategoria(int anioActual) {
			int cat = 1;
			if (anioActual - this.getFechaAltaAnio() <= 5 && anioActual - this.getFechaAltaAnio() >= 1  ) {
				cat = anioActual - this.getFechaAltaAnio();
			}else if (anioActual - this.getFechaAltaAnio() > 5) {
				cat = 5;
			}
			
			return cat;
		}
		
		
		/*Metodos object*/
		@Override
		public String toString() {
			return "AfiliadoImpl [identificador=" + identificador + ", nivel=" + nivel+ "]";
		}
		
		//Este no es de object pero aun asi lo pongo en esta seccion 
		/*Criterio de comparacion: por el identificador
		+1 si el identificador que viene del parametro de entrada es menor
		0 si el identificador que viene del parametro de entrada es igual
		-1 si el identificador que viene del parametro de entrada es mayor
		*/
		public int compareTo (AfiliadoImpl otro) {
			int comparacion=1;
			
			if (this.getIdentificador()  == otro.getIdentificador()  ) {
				comparacion = 0;
			} else if ( this.getIdentificador()  < otro.getIdentificador()) {
				comparacion = -1;
			}
			
			return comparacion;
		}
		
		@Override
		public boolean equals(Object o) 
		{
			boolean res=false;
			
			if(this==o) 
			{
				res=true;
			}else 
			{
				if(o!=null && o instanceof AfiliadoImpl) 
				{
					AfiliadoImpl f=(AfiliadoImpl) o;
					
					if(this.getIdentificador()==f.getIdentificador()  ) 
					{
						res=true;
					}
				}
			}
			return res;
		}
		
		@Override
		public int hashCode() {
			return this.getIdentificador()*11 - 7 *3 + this.getApellidoNombre().hashCode()*33;
		}
	
		
		
		
		
		
		
		
	 	
	 	
	 	

}
