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

package interfaces;

import enumerados.NivelActividad;
import excepcion.ExcepcionAfiliado;

public interface Afiliado {
	//getters
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
	
}
