package logica.alumnos;

import java.io.Serializable;

import logica.inscripciones.Sec_Inscripciones;

public class VOAlumno implements Serializable{

	private static final long serialVersionUID = 1L;
	private int cedula;
	private String nombre;
	private String apellido;
	private String domicilio;
	private int telefono;
	private int cantAprobadas;
	private Sec_Inscripciones inscripciones;
	private float promTotal;
	private float promAprob;
	private String tipoAlumno;
	
	// CONSTRUCTORS;
	//Crear VOAlumno
	public VOAlumno() {}

	public VOAlumno(int ced, String nom, String ape, String dom, int tel, int cantApro, Sec_Inscripciones insc) {
		this.cedula = ced;
		this.nombre = nom;
		this.apellido = ape;
		this.domicilio = dom;
		this.telefono = tel;
		this.cantAprobadas = cantApro;
		this.inscripciones = insc;
	}
	
	public VOAlumno(int ced, String nom, String ape, String dom, int tel) {
		this.cedula = ced;
		this.nombre = nom;
		this.apellido = ape;
		this.domicilio = dom;
		this.telefono = tel;
	}
	
	// METHODS
	//Alumno a VOAlumno
	public static VOAlumno alumnoMapper(Alumno alumno) {
		
		VOAlumno vAlumno = new VOAlumno(
				alumno.getCedula(),
				alumno.getNombre(),
				alumno.getApellido(),
				alumno.getDomicilio(),
				alumno.getTelefono(),
				alumno.getCantAprobadas(),
				alumno.getInscripciones()
				);
		
		if(alumno instanceof Becado)
			vAlumno.setTipoAlumno("Becado");
		else
			vAlumno.setTipoAlumno("Alumno");
		
		return vAlumno;
	}

	public void listadoParcial() {
		System.out.println(getApellido());
		System.out.println(getNombre());
		System.out.println(getCedula());
	}
	
	// GETTERS
	
	public int getCedula() {
		return cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public int getcantAprobadas() {
		return cantAprobadas;
	}
	
	public float getPromTotal() {
		return promTotal;
	}
	
	public float getPromAprob() {
		return promAprob;
	}

	public Sec_Inscripciones getInscripciones() {
		return inscripciones;
	}

	// SETTERS

	public void setPromTotal(float num) {
		this.promTotal = num;
	}

	public void setPromAprobadas(float num) {
		this.promAprob = num;
	}

	public void setInscripciones(Sec_Inscripciones inscripciones) {
		this.inscripciones = inscripciones;
	}

	public String getTipoAlumno() {
		return tipoAlumno;
	}

	public void setTipoAlumno(String tipoAlumno) {
		this.tipoAlumno = tipoAlumno;
	}
	
}
