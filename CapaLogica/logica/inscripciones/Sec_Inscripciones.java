package logica.inscripciones;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import logica.alumnos.Alumno;
import logica.alumnos.Dic_Alumnos;
import logica.asignaturas.Asignatura;

public class Sec_Inscripciones implements Serializable{

	private static final long serialVersionUID = 1L;
	private LinkedList<Inscripcion> lista;

	// CONSTRUCTORS
	//Crear secuencia inscripciones
	public Sec_Inscripciones() {
		this.lista = new LinkedList<Inscripcion>();
	}

	// METHODS
	//Insertar inscripcion a la secuencia
	public void insertarInscripcion(VOInscripcion nuevo) {
		Inscripcion inscripcion = Inscripcion.inscripcionMapper(nuevo);
		inscripcion.setNumero(lista.size());
		this.lista.add(inscripcion);
	}

	//Devolver el largo de la secuencia
	public int largo() {
		return this.lista.size();
	}
  
	//Insertar adelante de la secuencia
	public void insFront(Inscripcion insc) {
		this.lista.addFirst(insc);
	}
  
	//Consultar si la secuencia es vacia
	public boolean esVacia() {
		return this.lista.isEmpty();
	}
  
	//Devolver el primero de la secuencia
	public Inscripcion primero() {
		return this.lista.getFirst();
	}
	
	//Devolver la secuencia sin el primero
	public void resto() {
		this.lista.pop();
	}
  
	//Devolver la inscripcion que esta en el indice i
	public Inscripcion kEsimo(int i){
		return this.lista.get(i);
	}

	//Consultar si el numero pasado existe en la secuencia
	public boolean member(int num) {
		Iterator<Inscripcion> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Inscripcion elemento = iterator.next();
			if (elemento.getNumero() == num)
				return true;
		}
		return false;
	}
  
	//Devolver la inscripcion segun el numero
	public Inscripcion find(int num) {
		Iterator<Inscripcion> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Inscripcion elemento = iterator.next();
			if (elemento.getNumero() == num)
				return elemento;
		}
		return null;
	}

	//Listar la secuencia
	public ArrayList<VOInscripcion> listado() {
		ArrayList<VOInscripcion> listaVO = new ArrayList<>();
		for (Inscripcion inscripcion : lista)
			listaVO.add(VOInscripcion.inscripcionMapper(inscripcion));
		return listaVO;
	}
  
	//Listar la escolaridad
	public ArrayList<VOInscripcion> listarEscolaridad(char modo) {
		ArrayList<VOInscripcion> listaVO = new ArrayList<>();
		Iterator<Inscripcion> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Inscripcion elemento = iterator.next();
			if(modo == 'C')
				listaVO.add(VOInscripcion.inscripcionMapper(elemento));
			else {
				if(elemento.getCalificacion() != 0)
					listaVO.add(VOInscripcion.inscripcionMapper(elemento));
			}
		}
		return listaVO;
	}

	//Calcular el monto total recaudado
	public int montoTotalRec (Sec_Inscripciones secIns, int anio) {
		Iterator<Inscripcion> iterator = lista.iterator();
		int total = 0;
		while (iterator.hasNext()) {
			Inscripcion elemento = iterator.next();
			if(elemento.getAnio_lectivo() == anio) {
				total = total + elemento.getMonto()*9;
			}
		}
		return total;
	}

	//Consultar si es egresado
	public boolean esEgresado() {
		Iterator<Inscripcion> iterator = lista.iterator();
		int total = 0;
		while (iterator.hasNext()) {
			Inscripcion elemento = iterator.next();
			if (elemento.aprobada())
				total++;
		}
		return total == 1;
	}
	
	//Consulto si la asignatura fue aprobada
	public boolean asignaturaAprobada(Asignatura asig) {
		Iterator<Inscripcion> iterator = lista.iterator();
		while (iterator.hasNext()) {
			Inscripcion elemento = iterator.next();
			if (elemento.getAsignatura() == asig && elemento.aprobada())
				return true;
		}
		return false;
	}
  
	//Consulto si la asignatura sigue siendo cursada
	public boolean asignaturaCursando(Asignatura asig) {
		Iterator<Inscripcion> iterator = lista.iterator();
	    while (iterator.hasNext()) {
	    	Inscripcion elemento = iterator.next();
	    	if (elemento.getAsignatura() == asig && !elemento.aprobada())
	    		return true;
	    	}
	    	return false;
	}
  
	//Compruebo si el anio lectivo del ultimo de la secuencia es menor o igual al ingresado
	public boolean comprobarAnioLectivo(int anio) {
		if(lista.get(lista.size() -1).getAnio_lectivo() >= anio)
			return true;
		else
			return false;  
	}

	//Calcular el promedio total
	public float promedioTotal() {
		Iterator<Inscripcion> iterator = lista.iterator();
		float total = 0;
		while (iterator.hasNext()) {
			Inscripcion elemento = iterator.next();
			total += elemento.getCalificacion();
		}
		return total/lista.size();
	}

	//Calcular promedio de las aprobadas
	public float promedioAprobadas() {
		Iterator<Inscripcion> iterator = lista.iterator();
		int cant = 0;
		float total = 0;
		while (iterator.hasNext()) {
			Inscripcion elemento = iterator.next();
			if (elemento.aprobada()) {
				total += elemento.getCalificacion();
				cant++;
			}
		}
		return total/cant;
	}
  
	//Registro nota en la asignatura
	public void registrarNota(int cedula, int numero, int calificacion) throws RemoteException {
		lista.get(numero).setCalificacion(calificacion);
	}
}
