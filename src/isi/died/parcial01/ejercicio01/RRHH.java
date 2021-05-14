package isi.died.parcial01.ejercicio01;

import java.util.ArrayList;

public class RRHH {

	public ArrayList<ReciboDeSueldo> generarLista(ArrayList<Empleado> listaDeEmpleados){
		ArrayList<ReciboDeSueldo> recibosDeSueldo = new ArrayList<ReciboDeSueldo>();
		for(Empleado e : listaDeEmpleados) {
			recibosDeSueldo.add(e.generarRecibo());
		}
		return recibosDeSueldo;
	}
}
