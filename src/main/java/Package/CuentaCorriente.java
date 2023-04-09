package Package;

public class CuentaCorriente extends Cuenta {
	private int lineaSobregiro;

	public CuentaCorriente(int numeroCuenta, int saldo, String fechaApertura) {
		super(numeroCuenta, saldo, fechaApertura);
	}

	@Override
	public String getTipo() {
		return "Cuenta Corriente";
	}

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}
}