import javax.swing.JOptionPane;

class Motor{
	int potencia;
	int peso;
}

// declaración de clases
class Auto{
	
	//atributos
	String marca;
	String modelo;
	String color;
	int velocidad;
	Motor motor;
	
	Auto(){}
	
	Auto(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
	
	//métodos
	void acelerar(){									//acelerar
		//velocidad=velocidad+10;
		//if(velocidad>100){
		//	velocidad=100;
		//}
		acelerar(10);						//llamado a método de la misma clase
	}
	
	//método sobrecargado
	void acelerar(int kilometros){						//acelerarInt
		velocidad=velocidad+kilometros;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	void acelerar(int kms, int r){						//acelerarIntInt
	}
	
	void acelerar(int km, boolean tieneNitro){			//acelerarIntBoolean
		if(tieneNitro == false){
			acelerar(km);				//llamado a método de la misma clase
		} else{
			acelerar(km*2);				//llamado a método de la misma clase
		}
	}
	
	void acelerar(boolean tieneNitro, int kms){			//acelerarBooleanInt
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
	void imprimirVelocidad(){
		System.out.println(velocidad);
	}
	
	int obtenerVelocidad(){			//getVelocidad()
		return velocidad;
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
		
		auto1.imprimirVelocidad();
		System.out.println(auto1.obtenerVelocidad());
		
		JOptionPane.showMessageDialog(null,"Velocidad: "+auto1.obtenerVelocidad());
				
		Auto auto2=new Auto("Renault","Kangoo","Bordo");	
				
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


class Negocio{
	
	void vender(String nombre, String apellido, float dineroEfectivo){
		
		//print(ticket);
	}
	
	void vender(String nombre, String apellido, int telefono, long nroTarjeta){
		
		//print(ticket);
	}
	
}














