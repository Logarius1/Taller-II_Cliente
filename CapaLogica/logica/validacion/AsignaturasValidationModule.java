package logica.validacion;

import logica.asignaturas.Asignatura;
import logica.asignaturas.Sec_Asignaturas;
import logica.asignaturas.VOAsignatura;
import logica.exception.SecuenciaAsignaturaLlena;
import logica.exception.SecuenciaAsignaturaVacia;
import logica.exception.SecuenciaAsignaturaYaRegistrada;

public class AsignaturasValidationModule {
	
	public static void validateRegistrarAsignatura(VOAsignatura asignatura) throws SecuenciaAsignaturaLlena, SecuenciaAsignaturaYaRegistrada {
        if(Sec_Asignaturas.getInstancia().getTope() == 10)
            throw new SecuenciaAsignaturaLlena("Secuencia llena");
        else if(Sec_Asignaturas.getInstancia().contains(Asignatura.asignaturaMapper(asignatura)))
            throw new SecuenciaAsignaturaYaRegistrada("Asignatura ya registrada");
    }
	
	public static void validateListadoAsignaturas() throws SecuenciaAsignaturaVacia {
        if(Sec_Asignaturas.getInstancia().esVacia())
            throw new SecuenciaAsignaturaVacia("Secuencia vacia");
    }
}
