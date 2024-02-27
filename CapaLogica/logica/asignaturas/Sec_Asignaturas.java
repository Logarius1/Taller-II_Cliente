package logica.asignaturas;

import java.io.Serializable;
import java.util.ArrayList;

import logica.alumnos.Dic_Alumnos;

public class Sec_Asignaturas implements Serializable{

	private static final long serialVersionUID = 1L;
	private static Sec_Asignaturas instancia = null;
	private ArrayList<Asignatura> secAsignaturas;
	private int tope=0;

	// CONSTRUCTORS
	//Crear Secuencia de asignaturas
	private Sec_Asignaturas() {
		this.secAsignaturas = new ArrayList<Asignatura>();
	}
	
	//Crear constructor de copia
	private Sec_Asignaturas(Sec_Asignaturas sec) {
		instancia = sec;
	}

	//Crear una instancia de la secuencia
	public void cargarDatos(Sec_Asignaturas sec) {
		try {
			if (instancia.esVacia())
				new Sec_Asignaturas(sec);
			else throw new Exception("Instancia ya cargada");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// METHODS
	//Consultar si la secuencia es vacia
	public boolean esVacia() {
		return this.secAsignaturas.isEmpty();
	}

	//Consultar si la asignatura esta en la secuencia
	public boolean contains(Asignatura asig) {
		for(Asignatura asignatura :instancia.secAsignaturas) {
			if(asignatura.getCodAlfanum() == asig.getCodAlfanum())
				return true;
		}
		return false;
	}

	//Agregar al principio de la secuencia
	public void insFront(Asignatura asig) {
		this.secAsignaturas.add(0, asig);
	}
	
	//Mostrar el primero de la secuencia
	public Asignatura primero() {
		return this.secAsignaturas.get(0);
	}

	//Eliminar el primer elemento de la secuencia
	public void resto() {
		this.secAsignaturas.remove(0);
	}
	
	//Devolver el largo de la secuencia
	public int largo() {
		return this.getTope();
	}
	
	//Devolver la asignatura que se encuentra en el indice i
	public Asignatura kEsimo(int i) {
		return this.secAsignaturas.get(i);
	}
	
	//Insertar la asignatura
	public void insertarAsignatura(VOAsignatura asig) {
		Asignatura asignatura= Asignatura.asignaturaMapper(asig);
		this.secAsignaturas.add(asignatura);
		this.tope++;
	}
	
	//Listar todas las asignaturas de la secuencia
	public ArrayList<VOAsignatura> listadoAsig(ArrayList<VOAsignatura> lista) {
		for(int i=0; i<this.tope; i++) {
			VOAsignatura vAsig = new VOAsignatura();
			vAsig = VOAsignatura.asignaturaMapper(this.secAsignaturas.get(i));
			lista.add(vAsig);
		}
		return lista;
	}
		
	//GETTERS

	public static Sec_Asignaturas getInstancia() {
		if (instancia == null)
			instancia = new Sec_Asignaturas();
		return instancia;
	}

	public int getTope() {
		return tope;
	}

	//SETTERS

	public void setTope(int tope) {
		this.tope = tope;
	}

}
