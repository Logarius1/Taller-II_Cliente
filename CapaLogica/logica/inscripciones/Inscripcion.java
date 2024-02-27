package logica.inscripciones;
import java.io.Serializable;

import logica.asignaturas.*;

public class Inscripcion implements Serializable{

	private static final long serialVersionUID = 1L;
	private int monto;
	private int anio_lectivo;
	private int numero;
	private int calificacion;
	private Asignatura asig;
	
	// CONSTRUCTORS
	//Crear inscripcion
	public Inscripcion() {
		this.asig = new Asignatura();
	}

	//Cargo datos
	public Inscripcion(int monto, int anio_lectivo, int numero, int calificacion, Asignatura asignatura) {
		this.monto = monto;
		this.anio_lectivo = anio_lectivo;
		this.numero = numero;
		this.calificacion = calificacion;
		this.asig = asignatura;
	}
	
	// METHODS
	//VOInscripcion a Inscripcion
	public static Inscripcion inscripcionMapper(VOInscripcion vInscripcion) {
		return new Inscripcion(
			vInscripcion.getMonto(),
			vInscripcion.getAnio_lectivo(),
			vInscripcion.getNumero(),
			vInscripcion.getCalificacion(),
			vInscripcion.getAsignatura()
		);
	}
	
	//Devolver monto
	public int Monto (VOInscripcion vInscripcion) {
		int total=0;
		total= vInscripcion.getMonto()*9;
		return total;
	}

	//Consulto si asignatura aprobada
	public boolean aprobada() {
		return this.calificacion >= 6;
	}
	
	// GETTERS
	
	public int getMonto() {
		return monto;
	}
	
	public int getAnio_lectivo() {
		return anio_lectivo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public Asignatura getAsignatura() {
		return this.asig;
	}
	
	// SETTERS
	
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	public void setAnio_lectivo(int anio_lectivo) {
		this.anio_lectivo = anio_lectivo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public void setAsig(Asignatura asig) {
		this.asig = asig;
	}
}
