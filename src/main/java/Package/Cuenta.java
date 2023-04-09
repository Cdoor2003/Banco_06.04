package Package;

public abstract class Cuenta {
	private int numeroCuenta;
	private int saldo;
	private String fechaApertura;
	private Cliente cliente;

	public Cuenta(int numeroCuenta, int saldo, String fechaApertura) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
	}

	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public abstract String getTipo();

	public void asociarCliente(Cliente cliente1){
		this.cliente = cliente1;
	}

	public String toString(){
		return "N° Cuenta: "+numeroCuenta+"\nCliente dueño: "+cliente.getNombre()+"\nSaldo: "+saldo;
	}
}