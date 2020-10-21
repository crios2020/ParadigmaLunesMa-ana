//superclase
class Cliente {
	// Atributos
	String cuit;
	String direccion;
	
	// Constructores
	// Métodos
}

//subclase
class ClientePyme extends Cliente {
	// Atributos -Los atributos heredados no se vuelven a codificar!
	String razonSocial;
	
	// Constructores
	// Métodos
}

class Auto{
	//atributos
	String marca;
	String modelo;
	String color;
	static int velocidad;

	Auto(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
	
	static void acelerar(){
		velocidad=velocidad+10;
	}
	
	static void frenar(){
		velocidad=velocidad-10;
	}
	
	static int getVelocidad(){
		return velocidad;
	}
}

public class Paradigma4{
	public static void main(String[] args){
		Cliente cliente=new Cliente();
		cliente.cuit="1234567";
		cliente.direccion="Lavalle 648";
		//cliente.razonSocial="Hola.srl";	//error razonSocial no es miembro de cliente
		
		ClientePyme cp=new ClientePyme();
		cp.cuit="7654321";
		cp.direccion="Larrea 234";
		cp.razonSocial="Chau.srl";
		
		Auto.acelerar();
		System.out.println("-- auto1 --");
		Auto auto1=new Auto("VW","Gol","Rojo");
		//auto1.acelerar();
		//auto1.acelerar();
		Auto.acelerar();
		Auto.acelerar();
		//System.out.println(auto1.getVelocidad());		//20
		
		System.out.println("-- auto2--");
		Auto auto2=new Auto("Fiat","Idea","Gris");
		//auto2.acelerar();
		//System.out.println(auto2.getVelocidad());		//30
		Auto.acelerar();
		System.out.println(Auto.getVelocidad());
		
		
	}
}
