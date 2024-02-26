package logica.asignaturas;

import java.io.Serializable;

public class Asignatura implements Serializable{

	private static final long serialVersionUID = 1L;
	private String codAlfanum;
	private String nombre;
	private String descripcion;
	
	// CONSTRUCTORS
	//Crear Asignatura
	public Asignatura() {}
	
	//Cargo Asignatura
	public Asignatura(String cod, String nom, String desc) {
		this.setCodAlfanum(cod);
		this.setNombre(nom);
		this.setDescripcion(desc);
	}

	// METHODS
	//VOAsignatura a Asignatura
	public static Asignatura asignaturaMapper (VOAsignatura vAsig) {
		Asignatura asigna= new Asignatura(
				vAsig.getCodAlfanum(),
				vAsig.getNombre(),
				vAsig.getDescripcion()
				);
		return asigna;
	}
	
	// GETTERS

	public String getCodAlfanum() {
		return codAlfanum;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	//SETTERS
	
	public void setCodAlfanum(String codAlfanum) {
		this.codAlfanum = codAlfanum;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}

