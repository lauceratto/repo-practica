package isi.died.parcial01.ejercicio01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public abstract class Empleado {
	private String cuil;
	private String nombre;
	private LocalDateTime fechaNacimiento;
	private String correo;
	public List<Venta> listaVenta = new ArrayList<Venta>();
	public List<Empleado> listaEmpleado = new ArrayList<Empleado>();
	
	
	public abstract Double sueldo();
	public abstract void agregarVenta(Venta venta);
	public abstract void agregarEmpleado(Empleado empleado);
	public abstract Double ventaEnLaQueParticipo();
	public abstract ReciboDeSueldo generarRecibo();
	

	public Empleado() {
		super();
	}
	public Empleado(String cuil, String nombre, LocalDateTime fechaNacimiento, String correo, List<Venta> listaVenta, List<Empleado> listaEmpleado) {
		super();
		this.cuil = cuil;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.listaVenta = listaVenta;
		this.listaEmpleado = listaEmpleado;
	}
	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Venta> getListaVenta() {
		return listaVenta;
	}

	public void setListaVenta(List<Venta> listaVenta) {
		this.listaVenta = listaVenta;
	}
	
}
