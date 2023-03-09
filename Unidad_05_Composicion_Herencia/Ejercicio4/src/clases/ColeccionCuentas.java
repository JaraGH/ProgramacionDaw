package clases;

import java.util.Random;

public class ColeccionCuentas {
	
	private CuentaBancaria [] cuentas = new CuentaBancaria[10];

	
	public ColeccionCuentas() {
		Cliente [] clientes = {new Cliente("1", "Sara Baras", "654456777"), new Cliente("2", "Paloma Alba", "653336777"), 
				new Cliente("3", "Fermín Cacho", "37377377"), new Cliente("4", "Gimena Asa", "388399399")};
		Random rnd = new Random();
		
		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = new CuentaBancaria("1000"+i, clientes[rnd.nextInt(clientes.length)], 2000);
		}
	}
	
	
	public void mostrarCuentas() {
		for (CuentaBancaria cuentaBancaria : cuentas) {
			System.out.println(cuentaBancaria.toString());
		}
	}
	
	//retorna el nº de cuentas actualizadas
	//incrementa en la cantidad pasada las cuentas de ese cliente.
	public int incrementarSaldoCuentasDe (String dniCliente, double cantidad) {
		int contador=0;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i].getCliente().getDni().equalsIgnoreCase(dniCliente)) {
				cuentas[i].depositar(cantidad);
				contador++;
			}
		}
		return contador;
	}
	
	//retorna la cuenta con ese número
	public CuentaBancaria buscarCuenta(String numeroCuenta) {
		for (CuentaBancaria cuentaBancaria : cuentas) {
			if (cuentaBancaria.getNumeroCuenta().equalsIgnoreCase(numeroCuenta))
				return cuentaBancaria;
		}
		return null;
	}
	
	//retorna true si se pudo hacer la transferencia y false en caso contrario
	public boolean transferirCantidad(String cuentaOrigen, String cuentaDestino,
			double cantidad) {
		
		//buscar las cuentas
		CuentaBancaria cOrigen = buscarCuenta(cuentaOrigen);
		CuentaBancaria cDestino = buscarCuenta(cuentaDestino);
		
		//Si existen y son válidas
		if (cOrigen!=null && cDestino!=null && cOrigen!=cDestino)
			return  cOrigen.transferencia(cDestino, cantidad);
		return false;
			
	}
	
	
	
	
}
