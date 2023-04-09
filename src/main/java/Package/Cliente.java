package Package;

import java.util.ArrayList;
import Package.Cuenta;

public class Cliente {
	private String nombre;
	private String rut;
	public ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

	public Cliente(String nombre, String rut, ArrayList<Cuenta> cuentas) {
		this.nombre = nombre;
		this.rut = rut;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public void agregarCuenta(Cuenta cuenta){
		cuentas.add(cuenta);
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
}