class Cuenta{
	private int nro;
	private String moneda;
	private float saldo;
	
	//método constructor
	Cuenta(int nro,String moneda){
		this.nro=nro;
		this.moneda=moneda;
	}
	
	void depositar(float monto){
		saldo=saldo+monto;
	}
	
	void debitar(float monto){
		if(saldo>=monto){
			saldo-=monto;
		}else{
			System.out.println("No hay saldo suficiente!");
		}
	}
	
	String getEstado(){
		return nro+", "+moneda+", "+saldo;
	}
}

class Cliente{
	int nro;
	String nombre;
	Cuenta cuenta;
	
	Cliente(int nro,String nombre,int nroCuenta){
		this.nro=nro;
		this.nombre=nombre;
		this.cuenta=new Cuenta(nroCuenta,"arg$");
	}
	
	public Cuenta getCuenta(){
		return cuenta;
	}
	
	public String getEstado(){
		return nro+", "+nombre+", "+cuenta.getEstado();
	}
}

public class Paradigma2{
	public static void main(String[] arg$){
		System.out.println("Clase 2");
		
		System.out.println("-- cuenta1 --"); //creamos un objeto de simulación
		Cuenta cuenta1=new Cuenta(1,"arg$");
		cuenta1.depositar(80000);
		cuenta1.depositar(35000);
		cuenta1.debitar(15000);
		System.out.println(cuenta1.getEstado());
		
		System.out.println("-- cliente2 --");
		Cliente cliente1=new Cliente(1,"Juan Perez",2);
		
		Cuenta cuentaDeCliente1=cliente1.getCuenta();
		cuentaDeCliente1.depositar(28000);				//28000
		
		cliente1.getCuenta().depositar(20000);			//48000
		cliente1.getCuenta().debitar(10000);			//38000
		
		System.out.println(cliente1.getEstado());
		
		cuenta1.saldo=10000000;
		System.out.println(cuenta1.saldo);
		
	}
}
