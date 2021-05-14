package isi.died.parcial01.ejercicio02.app;

public class InscripcionException extends Exception {
	public InscripcionException () {
		super("El alumno no posee en su lista de examenes, un examen con nota mayor a 6 para las materias correlativas necesarias para rendir");
	}
}
