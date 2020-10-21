public class Paradigma3{
	public static void main(String[] args){
		System.out.println("Longitud vector: "+args.length);
		for(int a=0;a<args.length;a++){
			System.out.println(args[a]);
		}
		
		// parametro1 marca;
		// parametro2 modelo;
		// parametro3 color;
		//Auto auto=new Auto();
		
		//Auto auto=new Auto(args[0],args[1],args[2]);
		
		//Polimorfismo con redefinición
		Vendedor v1=new VendedorA();
		Vendedor v2=new VendedorB();
		
		v1.vender();
		v2.vender();
		
	}
}

class VendedorX{
	private String nombre;
	private char tipo;				// a 5%, b 10%, c 15%
	
	public void vender(float monto){
		//no es orientado a objetos
		if(tipo=='a'){
			//
		}
		if(tipo=='b'){
			//
		}
		if(tipo=='c'){
			//
		}
	}
}

//clase padre o superClase
class Vendedor{
	private String nombre;
	private String cuil;
	private String direccion;
	
	public void saludar(){
		System.out.println("Hola soy un vendedor!");
	}
	
	public void vender(){
			// 2%
			System.out.println("2%");
	}
	
	class Maletin{
		//clase dentro de otra clase
	}
	
}

//clase hija o subclase
class VendedorA extends Vendedor{
	public void vender(){
		// 5%
		System.out.println("5%");
	}
}

class VendedorB extends Vendedor{
	public void vender(){
		// 10%
		System.out.println("10%");
	}
}

class VendedorC extends Vendedor{
	public void vender(){
		// 15%
		System.out.println("15%");
	}
}

class VendedorJunior extends Vendedor{
}

class VendedorPasante extends Vendedor{
}

