package isi.died.parcial01.ejercicio01;

import java.time.LocalDateTime;
import java.time.Month;

public class EnConvenio extends Empleado {
	private Integer antiguedad;
	private Double sueldo = 60000.00;
	
	public EnConvenio(Integer antiguedad, Double sueldo) {
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
	}
	
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double saldo) {
		this.sueldo = saldo;
	}

	@Override
	public Double sueldo() {
		
		Double sueldoTotal = (sueldo - (sueldo*0.11) - (sueldo*0.03) + (0.3*this.ventaEnLaQueParticipo()));
		if(LocalDateTime.now().getMonth()==this.getFechaNacimiento().getMonth()) {
			sueldoTotal = sueldoTotal*(1.5);
		}
		return sueldoTotal;
	}

	@Override
	public ReciboDeSueldo generarRecibo() {
		ReciboDeSueldo reciboDeSueldo = new ReciboDeSueldo(1,LocalDateTime.now().getMonth(),sueldo(),this);
		return reciboDeSueldo;
	}
	
	

	@Override
	public Double ventaEnLaQueParticipo() {
		Double costo = 0.0;
		for(Venta v: this.listaVenta) {
			if(v.getEmpleado() == this) {
				costo = costo + v.getMontoTotal();
			}
		}
		return costo;
	}

	@Override
	public void agregarVenta(Venta venta) {
		this.listaVenta.add(venta);
	}

	@Override
	public void agregarEmpleado(Empleado empleado) {
		this.listaEmpleado.add(empleado);
		
	}
	
}
