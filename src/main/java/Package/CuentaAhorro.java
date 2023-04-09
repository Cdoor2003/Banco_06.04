package Package;

public class CuentaAhorro extends Cuenta {
	private double reajusteAnual;

	public CuentaAhorro(int numeroCuenta, int saldo, String fechaApertura) {
		super(numeroCuenta, saldo, fechaApertura);
	}

	@Override
	public String getTipo() {
		return "Cuenta Ahorro";
	}

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}
}