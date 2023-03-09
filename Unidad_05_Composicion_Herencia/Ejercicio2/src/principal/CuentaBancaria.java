package principal;

public class CuentaBancaria {

	private String numeroCuenta;
	private Cliente cliente;
	private double saldo;
	
	public void depositar(double cantidad) {
		this.saldo+=cantidad;		
	}
	
	//otra forma
	//met estatico
	public static boolean transferir(CuentaBancaria origen, CuentaBancaria destino, double cantidad) {
		if (origen.getSaldo()>=cantidad) {
			destino.depositar(cantidad);
			origen.setSaldo(origen.getSaldo()-cantidad);			
			return true;
		} else {
			return false;
		}	
	}
	
	
	
	public boolean transferencia(CuentaBancaria cuentaDestino, double cantidad) {
		if (saldo>=cantidad) {
			cuentaDestino.depositar(cantidad);
			//cuentaDestino.setSaldo(cuentaDestino.getSaldo()+cantidad);
			this.saldo-=cantidad;
			return true;
		} else {
			return false;
		}
	}
	
	public CuentaBancaria(String numeroCuenta, Cliente cliente, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", cliente=" + cliente + ", saldo=" + saldo + "]";
	}
	
	
	
}
