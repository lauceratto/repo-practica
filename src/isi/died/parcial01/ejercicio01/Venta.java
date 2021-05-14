package isi.died.parcial01.ejercicio01;

import java.time.Instant;


public class Venta {
	private Integer idVenta;
	private Instant fecha;
	private Double montoTotal;
	private Empleado empleado;

	public Venta(Integer idVenta, Instant fecha, Double montoTotal) {
		super();
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.montoTotal = montoTotal;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}
	public Instant getFecha() {
		return fecha;
	}
	public void setFecha(Instant fecha) {
		this.fecha = fecha;
	}
	public Double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	
	
}
