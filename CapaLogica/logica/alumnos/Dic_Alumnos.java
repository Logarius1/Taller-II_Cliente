package logica.alumnos;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class Dic_Alumnos implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Dic_Alumnos instancia = null;
	private TreeMap<Integer, Alumno> diccioAlumnos;
	
	// CONSTRUCTORS
	//Crear Diccionario
	private Dic_Alumnos(){
		this.diccioAlumnos = new TreeMap<Integer, Alumno>();
	}

	//Constructor de copia
	private Dic_Alumnos(Dic_Alumnos dic){
		instancia = dic;
	}

	//Creo una instancia del diccionario
	public void cargarDatos(Dic_Alumnos dic) {
		try {
			if (instancia.isEmpty())
				new Dic_Alumnos(dic);
			else throw new Exception("Instancia ya cargada");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// METHODS
	//Consular si es vacia
	public boolean isEmpty() {
		return this.diccioAlumnos.isEmpty();
	}

	//Consultar si existe un alumno segun la clave
	public boolean member(int num) {
		return this.diccioAlumnos.containsKey(num);
	}

	//Devuelve el alumno segun la clave
	public Alumno find(int num) {
		return this.diccioAlumnos.get(num);
	}
	
	//Insertar alumno en el diccionario
	public void insertarAlumno(VOAlumno object){
		if(object instanceof VOBecado){
			VOBecado vBecado = ((VOBecado) object);
			Becado becado = Becado.becadoMapper(vBecado);
			this.diccioAlumnos.put(becado.getCedula(), becado);
		}else {
			Alumno alumno = Alumno.alumnoMapper(object);
			this.diccioAlumnos.put(alumno.getCedula(), alumno);
		}
	}
	
	//Listar a alumnos segun el apellido pasado por parámetro
	public ArrayList<VOAlumno> listadoPorApellido(String apellido, ArrayList<VOAlumno> alumnos) throws RemoteException{
		Iterator <Alumno> iter = diccioAlumnos.values().iterator();
		while (iter.hasNext())
		{
			Alumno elem = iter.next();
			if(elem.getApellido().toLowerCase().startsWith(apellido.toLowerCase()))
				alumnos.add(VOAlumno.alumnoMapper(elem));
		}
		return alumnos;
	}

	//Listar a Egresados
	public ArrayList<VOAlumno> listadoEgresados(char modo) throws RemoteException{
		ArrayList<VOAlumno> lista = new ArrayList<VOAlumno>();
		Iterator<Alumno> iterator = diccioAlumnos.values().iterator(); //Crear iterador
		while (iterator.hasNext()) {
			Alumno elemento = iterator.next();	//Muevo el iterador
			if (elemento.esEgresado()) {
				VOAlumno VOelemento = VOAlumno.alumnoMapper(elemento);
				if(modo == 'C') {
					VOelemento.setPromTotal(VOelemento.getInscripciones().promedioTotal());
					VOelemento.setPromAprobadas(VOelemento.getInscripciones().promedioAprobadas());	
				}
				lista.add(VOelemento);	//Agrego al iterador solo si es egresado
			}
		}
		return lista;
	}

	//Aumentar cantidad de aprobadas
    public void aumentarAprobadas(int cedula) throws RemoteException{
        Alumno alumno = diccioAlumnos.get(cedula);
        alumno.setCantAprobadas(alumno.getCantAprobadas() + 1);
    }
	
    //Devolver al Alumno segun cedula 
	public Alumno listadoDetallado(int cedula) throws RemoteException{
		return diccioAlumnos.get(cedula);
	}
	
	// GETTERS
	//Devolver la instancia
	public static Dic_Alumnos getInstacia(){
		if (instancia == null)
			instancia = new Dic_Alumnos();
		return instancia;
	}
	
	// SETTERS
	
}