import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

import logica.alumnos.VOAlumno;
import logica.asignaturas.VOAsignatura;
import logica.servidor.IFachada;

public class Principal {

	public static void main(String[] args) {
		try {
            // Obtener la referencia del registro RMI en el servidor
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Obtener la referencia del objeto remoto desde el registro
            IFachada fachadaRemote = (IFachada) registry.lookup("fachada");
            fachadaRemote.recuperarDatos();
            
            //Pruebo invocar a los métodos del objeto remoto IFachada
            ArrayList<VOAsignatura> listaAsignaturas = fachadaRemote.listadoAsignaturas();
    		
    		for(VOAsignatura asig :listaAsignaturas) {
    			System.out.println(asig.getCodAlfanum() + " - " + asig.getNombre() + ": " + asig.getDescripcion());
    		}
    		
    		ArrayList<VOAlumno> listaAlum = fachadaRemote.listarAlumnosApellido("P");
    		for(VOAlumno alum :listaAlum) {
    			System.out.println(String.format("%s %s %d %s", alum.getApellido(), alum.getNombre(), alum.getCedula(), alum.getTipoAlumno()));

    		}

            System.out.println("Cliente RMI conectado correctamente al servidor.");
        } catch (Exception e) {
            System.err.println("Error al conectarse al servidor RMI:");
            e.printStackTrace();
        }
	}

}
