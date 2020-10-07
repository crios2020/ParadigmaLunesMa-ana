// declaración de clases
class Auto{
	
	//atributos
	String marca;
	String modelo;
	String color;
	int velocidad;
	
	//métodos
	public void acelerar(){
		velocidad=velocidad+10;
	}
	
	public void frenar(){
		velocidad=velocidad-10;
	}
	
}// end class

public class Paradigma{
	public static void main(String[] arg$){
		//punto de entrada del proyecto
		System.out.println("Hola Mundo!");
		
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();
		auto1.marca="Ford";
		auto1.modelo="Ka";
		auto1.color="Rojo";
		
		auto1.acelerar();					// 10
		auto1.acelerar();					// 20
		auto1.acelerar();					// 30
		auto1.frenar();						// 20
		
		System.out.println(auto1.marca+" "+auto1.modelo+" "
							+auto1.color+" "+auto1.velocidad);
	}
}
