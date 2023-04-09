package Package;

import java.util.ArrayList;
import Package.SucursalBancaria;

public class GestionBanco {
	private ArrayList<SucursalBancaria> sucursalesBancarias = new ArrayList<SucursalBancaria>();
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Cuenta> cuentas = new ArrayList<>();

	public void agregarCliente(Cliente cliente) {
		Cliente cliente1 = buscarCliente(cliente.getRut());
		if(cliente == null){
			clientes.add(cliente);
		}
		else{
			System.out.println("El cliente ya existe.");
		}
	}

	public Cliente buscarCliente(String rut){
		for (Cliente cliente: clientes){
			if(cliente.getRut().equals(rut)){
				return cliente;
			}
		}
		return null;
	}

	public void agregarCuenta(Cuenta cuenta) {
		Cuenta cuenta1 = buscarCuenta(cuenta.getNumeroCuenta());
		if(cuenta == null){
			cuentas.add(cuenta);
		}
		else{
			System.out.println("La cuenta ya existe.");
		}
	}

	public Cuenta buscarCuenta(int numeroCuenta){
		for(Cuenta cuenta: cuentas){
			if(cuenta.getNumeroCuenta() == numeroCuenta){
				return cuenta;
			}
		}
		return null;
	}

	public void asociarCuentaCliente(Cliente cliente, Cuenta cuenta) {
		cliente.agregarCuenta(cuenta);
		cuenta.asociarCliente(cliente);
	}

	public void agregarSucursalBancaria(SucursalBancaria sucursalBancaria) {
		SucursalBancaria sucursalBancaria1 = buscarSucursalBancaria(sucursalBancaria.getCodigoSucursal());
		if(sucursalBancaria == null){
			sucursalesBancarias.add(sucursalBancaria);
		}
		else{
			System.out.println("Esta sucursal bancaria ya existe.");
		}
	}

	public SucursalBancaria buscarSucursalBancaria(String codigoSucursal){
		for (SucursalBancaria sucursalBancaria: sucursalesBancarias){
			if(sucursalBancaria.getCodigoSucursal().equals(codigoSucursal)){
				return sucursalBancaria;
			}
		}
		return null;
	}

	public void verTodasLasCuentasPorCliente(String rut) {
		Cliente cliente = buscarCliente(rut);
		for(Cuenta cuenta : cliente.cuentas){
			System.out.println(cuenta.toString());
		}
	}

	public void obtenerTodasCuentasAhorro(String codigoSucursal) {
		SucursalBancaria sucursalBancaria = buscarSucursalBancaria(codigoSucursal);
		for(Cuenta cuenta : sucursalBancaria.getCuentas()){
			if(cuenta.getTipo().equals("Cuenta Ahorro")){
				System.out.println(cuenta.getTipo()+"\n"+cuenta.toString());
			}
		}
	}

	public void obtenerTodasCuentasCorriente(String codigoSucursal) {
		SucursalBancaria sucursalBancaria = buscarSucursalBancaria(codigoSucursal);
		for(Cuenta cuenta : sucursalBancaria.getCuentas()){
			if(cuenta.getTipo().equals("Cuenta Corriente")){
				System.out.println(cuenta.getTipo()+"\n"+cuenta.toString());
			}
		}
	}
}