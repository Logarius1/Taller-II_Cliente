package logica.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import logica.alumnos.Dic_Alumnos;
import logica.alumnos.VOAlumno;
import logica.asignaturas.VOAsignatura;
import logica.inscripciones.VOInscripcion;

public interface IFachada extends Remote{
		
	public void registrarAsig (VOAsignatura asignatura) throws RemoteException;

	public ArrayList<VOAsignatura> listadoAsignaturas () throws RemoteException;

	public void inscripcionAlumno(VOAlumno alumno) throws RemoteException;

	public ArrayList<VOAlumno> listarAlumnosApellido(String apellido) throws RemoteException;
	
	public VOAlumno listadoAlumnoDetallado(int cedula) throws RemoteException;

	public void inscripcionAsignatura(VOInscripcion inscripcion) throws RemoteException;

	public void registroResultado(VOInscripcion inscripcion) throws RemoteException;

	public int montoRecauInscrip (int anio, int cedula) throws RemoteException;

	public ArrayList<VOInscripcion> listadoEscolaridad(int cedula, char modo) throws RemoteException;

	public ArrayList<VOAlumno> listadoEgresados(char modalidad) throws RemoteException;
	
	public void respaldoDatos(Dic_Alumnos diccio) throws ClassNotFoundException, RemoteException;
	
	public void recuperarDatos() throws RemoteException;

}
