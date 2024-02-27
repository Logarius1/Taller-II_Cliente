package logica.validacion;

import logica.alumnos.Dic_Alumnos;
import logica.alumnos.VOAlumno;
import logica.asignaturas.Sec_Asignaturas;
import logica.exception.DiccionarioAlumnoNoInscripto;
import logica.exception.DiccionarioAlumnoVacio;
import logica.exception.DiccionarioAlumnoYaExiste;
import logica.exception.SecuenciaAsignaturaVacia;
import logica.exception.SecuenciaInscripcionesVacia;

public class AlumnosValidationModule {
    
    public static void validateInscripcionAlumno(VOAlumno alumno) throws DiccionarioAlumnoYaExiste {
        if(Dic_Alumnos.getInstacia().member(alumno.getCedula()))
            throw new DiccionarioAlumnoYaExiste("Alumno de cedula " + alumno.getCedula() + " ya existe");
    }
    
    public static void validateListadoAlumnoDetallado(int cedula) throws DiccionarioAlumnoVacio, DiccionarioAlumnoNoInscripto {
        if(Dic_Alumnos.getInstacia().isEmpty())
            throw new DiccionarioAlumnoVacio("Diccionario vacio");
        else if (!Dic_Alumnos.getInstacia().member(cedula))
            throw new DiccionarioAlumnoNoInscripto("Alumno de cedula " + cedula + " no existe");
    }
    
    public static void validateMontoRecaudado(int cedula) throws DiccionarioAlumnoVacio, SecuenciaAsignaturaVacia, SecuenciaInscripcionesVacia {
        if(Dic_Alumnos.getInstacia().isEmpty())
            throw new DiccionarioAlumnoVacio("Dicionario vacio");
        else if (Sec_Asignaturas.getInstancia().esVacia())
            throw new SecuenciaAsignaturaVacia("Secuencia vacia");
        else if(Dic_Alumnos.getInstacia().find(cedula).getInscripciones() == null)
            throw new SecuenciaInscripcionesVacia("El alumno no esta inscripto a ninguna asignatura");
    }
    
    public static void validateListadoEgresados() throws DiccionarioAlumnoVacio {
        if(Dic_Alumnos.getInstacia().isEmpty())
            throw new DiccionarioAlumnoVacio("Diccionario vacio");
    }
}
