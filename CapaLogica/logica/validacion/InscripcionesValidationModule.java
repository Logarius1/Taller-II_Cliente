package logica.validacion;

import java.util.ArrayList;
import java.util.List;

import logica.alumnos.Alumno;
import logica.alumnos.Dic_Alumnos;
import logica.asignaturas.Sec_Asignaturas;
import logica.exception.DiccionarioAlumnoNoInscripto;
import logica.exception.DiccionarioAlumnoVacio;
import logica.exception.SecuenciaAsignaturaNoInscripto;
import logica.exception.SecuenciaAsignaturaVacia;
import logica.exception.SecuenciaInscripcionesCursandoAsignatura;
import logica.exception.SecuenciaInscripcionesExisteNotaFinal;
import logica.exception.SecuenciaInscripcionesFechaAnterior;
import logica.exception.SecuenciaInscripcionesVacia;
import logica.inscripciones.Inscripcion;
import logica.inscripciones.Sec_Inscripciones;
import logica.inscripciones.VOInscripcion;

public class InscripcionesValidationModule {
	
    public static void validateInscripcionAsignatura(VOInscripcion inscripcion) throws DiccionarioAlumnoVacio, SecuenciaAsignaturaVacia, DiccionarioAlumnoNoInscripto, SecuenciaInscripcionesExisteNotaFinal, SecuenciaInscripcionesCursandoAsignatura, SecuenciaInscripcionesFechaAnterior {
        if(Dic_Alumnos.getInstacia().isEmpty())
            throw new DiccionarioAlumnoVacio("Diccionario vacio");
        else if (Sec_Asignaturas.getInstancia().esVacia())
            throw new SecuenciaAsignaturaVacia("Secuencia vacia");
        else {
            Alumno alumno = Dic_Alumnos.getInstacia().find(inscripcion.getCedula());

            if (alumno == null)
                throw new DiccionarioAlumnoNoInscripto("Alumno de cedula " + inscripcion.getCedula() + " no existe");
            else if(alumno.getInscripciones() != null)
                if(alumno.getInscripciones().asignaturaAprobada(inscripcion.getAsignatura()))
                    throw new SecuenciaInscripcionesExisteNotaFinal("Alumno ya aprobo la materia");
            else {
                Sec_Inscripciones secAux = alumno.getInscripciones();

                if(secAux != null){
                    if(alumno.getInscripciones().asignaturaCursando(inscripcion.getAsignatura()))
                        throw new SecuenciaInscripcionesCursandoAsignatura("El alumno esta cursando la asignatura");
                    else if(alumno.getInscripciones().comprobarAnioLectivo(inscripcion.getAnio_lectivo()))
                        throw new SecuenciaInscripcionesFechaAnterior("El año lectivo de la asignatura es menor a la ultima");
                }
            }
        }
    }
    
    public static void validateListadoEscolaridad(int cedula) throws DiccionarioAlumnoVacio, SecuenciaAsignaturaVacia, DiccionarioAlumnoNoInscripto, SecuenciaInscripcionesVacia {
        if(Dic_Alumnos.getInstacia().isEmpty())
            throw new DiccionarioAlumnoVacio("Diccionario vacio");
        else if (Sec_Asignaturas.getInstancia().esVacia())
            throw new SecuenciaAsignaturaVacia("Secuencia vacia");
        else {
            Alumno alumno = Dic_Alumnos.getInstacia().find(cedula);

            if (alumno == null)
                throw new DiccionarioAlumnoNoInscripto("Alumno no existe");
            else if (alumno.getInscripciones() == null) {
                throw new SecuenciaInscripcionesVacia("Alumno inscripto a ninguna materia");
            }
        }
    }
    
	public static void validateResultadoAsignatura(VOInscripcion inscripcion) throws DiccionarioAlumnoVacio, DiccionarioAlumnoNoInscripto, SecuenciaAsignaturaNoInscripto, SecuenciaInscripcionesExisteNotaFinal {
        if(Dic_Alumnos.getInstacia().isEmpty())
            throw new DiccionarioAlumnoVacio("Diccionario vacio");
        else {
            Alumno alumno = Dic_Alumnos.getInstacia().find(inscripcion.getCedula());
            
            if(alumno == null)
                throw new DiccionarioAlumnoNoInscripto("Alumno no existe");
            else {
                Inscripcion inscrip_aux = alumno.getInscripciones().find(inscripcion.getNumero());

                if(inscrip_aux == null)
                    throw new SecuenciaAsignaturaNoInscripto("Alumno no inscripto a la asignatura");
                else if(inscrip_aux.getCalificacion() != 0)
                    throw new SecuenciaInscripcionesExisteNotaFinal("Alumno ya tiene nota final ingresada");
            }
        }
	}
}
