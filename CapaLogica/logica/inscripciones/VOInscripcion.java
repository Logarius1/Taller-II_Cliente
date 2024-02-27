package logica.inscripciones;
import logica.asignaturas.Asignatura;

public class VOInscripcion {

	private int cedula;
	private int monto;
	private int anio_lectivo;
	private int numero;
  	private int calificacion;
  	private Asignatura asig;

  	// CONSTRUCTORS
  	//Crear inscripcion
  	public VOInscripcion() {}

  	//Cargo
  	public VOInscripcion(int monto, int anio_lectivo, int numero,int calif, Asignatura asig) {
  		this.monto = monto;
  		this.anio_lectivo = anio_lectivo;
  		this.numero = numero;
  		this.calificacion = calif;
  		this.asig = asig;
  	}

  	//Cargo
  	public VOInscripcion(int ced, int monto, int anio_lectivo, int numero, int calificacion, Asignatura asig) {
  		this.cedula = ced;
  		this.monto = monto;
  		this.anio_lectivo = anio_lectivo;
  		this.numero = numero;
  		this.calificacion = calificacion;
  		this.asig = asig;
  	}
  
  	//Cargo
  	public VOInscripcion(int ced, int numero, int calificacion) {
  		this.cedula = ced;
  		this.numero = numero;
  		this.calificacion = calificacion;
  	}

  	// METHODS
  	//Inscripcion a VOInscripcion
  	public static VOInscripcion inscripcionMapper(Inscripcion inscripcion) {
  		return new VOInscripcion(
  			inscripcion.getMonto(),
  			inscripcion.getAnio_lectivo(),
  			inscripcion.getNumero(),
  			inscripcion.getCalificacion(),
  			inscripcion.getAsignatura()
  		);
  	}

  	// GETTERS

  	public int getCedula() {
  		return this.cedula;
  	}

  	public int getMonto() {
  		return this.monto;
  	}

  	public int getAnio_lectivo() {
  		return this.anio_lectivo;
  	}

  	public int getNumero() {
  		return this.numero;
  	}

  	public int getCalificacion() {
  		return this.calificacion;
  	}

  	public Asignatura getAsignatura() {
  		return this.asig;
  	}

  	// SETTERS

  	public void setCedula(int cedula) {
  		this.cedula = cedula;
  	}

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
