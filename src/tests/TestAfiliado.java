package tests;
import clases.*;
import enumerados.NivelActividad;
import excepcion.*;
public class TestAfiliado {
	public static void main(String[] args) {
		
	AfiliadoImpl[] afiliado = new AfiliadoImpl[5];
	afiliado[0] = new AfiliadoImpl();
	 afiliado[1] = new AfiliadoImpl("Pepe Luis",new Fecha(2010,15,6), NivelActividad.ALTO,95);
	 afiliado[2] = new AfiliadoImpl(afiliado[1]);
	 afiliado[3] = new AfiliadoImpl();
	 afiliado[4] = new AfiliadoImpl("Clara",new Fecha(2017,15,6), NivelActividad.BAJO,60);
	
	for(int i =0; i <afiliado.length; i ++ ) {
		System.out.println(afiliado[i].getApellidoNombre());
		System.out.println(afiliado[i].getIdentificador() );
		System.out.println(afiliado[i].getNivel() );
		System.out.println(afiliado[i].obtenerCategoria(2019));
	}
	
	try {
		afiliado[3].setPeso(0);
	}catch (ExcepcionAfiliado e) {
		System.out.println("El peso debe ser positivo");
	}
	
	
	}
}
