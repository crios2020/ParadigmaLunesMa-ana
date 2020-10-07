// declaración de clases
class Auto{
	
	//atributos
	String marca;
	String modelo;
	String color;
	int velocidad;
	
	//métodos
	void acelerar(){
		velocidad=velocidad+10;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	void acelerar(int kilometros){
		velocidad=velocidad+kilometros;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	
	void frenar(){
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
		auto1.acelerar(15);					// 35
		
		System.out.println(auto1.marca+" "+auto1.modelo+" "
							+auto1.color+" "+auto1.velocidad);
	}
}


class Cuenta{
	int nro;
	float saldo;
	void depositar(){}
	void debitar() {}
}

class Cliente{
	int nro;					// 1
	String nombre;				// Juan Perez
	int edad;					// 38
	Cuenta cuenta;					
}

class ProductoHelado{
	Cucurucho cucurucho;
	Gusto gusto1;
	Gusto gusto2;
	Cuchara cucharita;
	float precio;
}

class Cucurucho{}
class Gusto{}
class Cuchara{}


