package isi.died.parcial01.ejercicio01;

import java.time.LocalDateTime;

public class Contratado extends Empleado {
	private Double horasTrabajadas = 8.0;
	private Double costoPorHora = 570.0;
	
	public Double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(Double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public Double getCostoPorHora() {
		return costoPorHora;
	}
	public void setCostoPorHora(Double costoPorHora) {
		this.costoPorHora = costoPorHora;
	}
	
	@Override
	public Double sueldo() {
		Double costo = horasTrabajadas*costoPorHora;
		if(LocalDateTime.now().getMonth()==this.getFechaNacimiento().getMonth()) {
			costo = costo*(1.5);
		}
		return costo;
	}

	@Override
	public ReciboDeSueldo generarRecibo() {
		ReciboDeSueldo reciboDeSueldo = new ReciboDeSueldo(1,LocalDateTime.now().getMonth(),sueldo(),this);
		return reciboDeSueldo;
	}
	@Override
	public Double ventaEnLaQueParticipo() {
		return null;
		
	}
	@Override
	public void agregarVenta(Venta venta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregarEmpleado(Empleado empleado) {
		this.listaEmpleado.add(empleado);
		
	}
	
}
