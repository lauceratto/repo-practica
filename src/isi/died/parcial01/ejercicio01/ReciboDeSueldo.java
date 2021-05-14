package isi.died.parcial01.ejercicio01;

import java.time.Month;

//El recibo de sueldo tiene un numero, un mes al que pertenece, y el total del pago, y un puntero al empleado que lo recibe.

public class ReciboDeSueldo {
	private Integer id;
	private Month mes;
	private Double totalPago;
	private Empleado empleado;
	
	
	public ReciboDeSueldo(Integer id, Month mes, Double totalPago, Empleado empleado) {
		super();
		this.id = id;
		this.mes = mes;
		this.totalPago = totalPago;
		this.empleado = empleado;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Month getMes() {
		return mes;
	}


	public void setMes(Month mes) {
		this.mes = mes;
	}


	public Double getTotalPago() {
		return totalPago;
	}


	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
}
