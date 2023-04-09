package Package;

import java.util.ArrayList;
import Package.Cuenta;

public class SucursalBancaria {
	private int codigoPostal;
	private String codigoSucursal;
	private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

	public SucursalBancaria(int codigoPostal, String codigoSucursal, ArrayList<Cuenta> cuentas) {
		this.codigoPostal = codigoPostal;
		this.codigoSucursal = codigoSucursal;
		this.cuentas = cuentas;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
}