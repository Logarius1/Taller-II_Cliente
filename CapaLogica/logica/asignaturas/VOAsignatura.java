package logica.asignaturas;

import java.io.Serializable;

public class VOAsignatura implements Serializable{

	private static final long serialVersionUID = 1L;
	private String codAlfanum;
	private String nombre;
	private String descripcion;
	
	
	//CONSTRUCTORS
	//Creo una asignatura
	public VOAsignatura() {}
	
	//Creo una asignatura
	public VOAsignatura(String cod, String nom, String desc) {
		this.codAlfanum=cod;
		this.nombre= nom;
		this.descripcion= desc;	
	}
	
	//METHODS
	//Asignatura a VOAsignatura
	public static VOAsignatura asignaturaMapper (Asignatura asig) {
		VOAsignatura vAsigna= new VOAsignatura(
				asig.getCodAlfanum(),
				asig.getNombre(),
				asig.getDescripcion()
				);
		return vAsigna;
	}
	
	//GETTERS
	public String getCodAlfanum() {
		return codAlfanum;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

}
