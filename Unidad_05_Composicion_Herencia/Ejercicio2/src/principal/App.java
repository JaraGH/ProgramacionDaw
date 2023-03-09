package principal;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli1 = new Cliente("234234F", "Ana Lema", "924556677");
		Cliente cli2 = new Cliente("133334A", "Tomás Alvárez", "924556672");
		Cliente cli3 = new Cliente("234288S", "Carlos Tena", "924556673");
		
		CuentaBancaria cb1 = new CuentaBancaria("111111", cli1, 12000.0);
		CuentaBancaria cb2 = new CuentaBancaria("222222", cli2, 10000.0);
		CuentaBancaria cb3 = new CuentaBancaria("333333", cli3, 6000.0);
		
		System.out.println("Cuentas al empezar");
		System.out.println(cb1.getNumeroCuenta() + "--" + cb1.getSaldo());
		System.out.println(cb2.getNumeroCuenta() + "--" + cb2.getSaldo());
		System.out.println(cb3.getNumeroCuenta() + "--" + cb3.getSaldo());		
		System.out.println("*******************************************");
		
		
		System.out.println("Depositar 1000 € en cb1");
		cb1.depositar(1000);
		
		System.out.println("Transferir 2000 y 3000 de cb1 a cb2 y cb3");
		cb1.transferencia(cb2, 2000);
		cb1.transferencia(cb3, 3000);
		
		
		
		System.out.println("Cuentas al terminar");
		System.out.println(cb1.getNumeroCuenta() + "--" + cb1.getSaldo());
		System.out.println(cb2.getNumeroCuenta() + "--" + cb2.getSaldo());
		System.out.println(cb3.getNumeroCuenta() + "--" + cb3.getSaldo());
		
	}

}
