package logica.alumnos;
import java.io.Serializable;
import logica.inscripciones.Sec_Inscripciones;
import logica.inscripciones.VOInscripcion;

public class Alumno  implements Serializable{

	private static final long serialVersionUID = 1L;
	private int cedula;
	private String nombre;
	private String apellido;
	private String domicilio;
	private int telefono;
	private int cantAprobadas;
	private Sec_Inscripciones inscripciones;
	
	// CONSTRUCTORS
	//Cargo Alumno
	public Alumno(int ced, String nom, String ape, String dom, int tel, int aprob, Sec_Inscripciones insc) {
		this.cedula = ced;
		this.nombre = nom;
		this.apellido = ape;
		this.domicilio = dom;
		this.telefono = tel;
		this.cantAprobadas = aprob;
		this.inscripciones = insc;
	}
	
	// METHODS
	
	//Crear secuencia de inscripcion en alumno
	public Alumno() {
		this.inscripciones = new Sec_Inscripciones();
	}

	//VOAlumno a Alumno
	public static Alumno alumnoMapper(VOAlumno vAlumno) {
		
		Alumno alumno = new Alumno(
				vAlumno.getCedula(),
				vAlumno.getNombre(),
				vAlumno.getApellido(),
				vAlumno.getDomicilio(),
				vAlumno.getTelefono(),
				vAlumno.getcantAprobadas(),
				vAlumno.getInscripciones()
				);
		
		return alumno;
	}

	//Consultar si es Egresado
	public boolean esEgresado() {
		if(inscripciones != null) {
			return inscripciones.esEgresado();
		}else
			return false;
	}
	
	//Insertar asignatura en el Alumno
	public void inscribirAsignatura(VOInscripcion inscripcion) {
        if (inscripciones == null) {
            inscripciones = new Sec_Inscripciones();
        }
        inscripciones.insertarInscripcion(inscripcion);
    }
	
	//Calcular monto total recaudado segun tipo de alumno
	public int calculoMonto (Alumno alu, int anio) {
		Sec_Inscripciones inscrip = alu.getInscripciones();
		int monto = inscrip.montoTotalRec(inscrip, anio);
		if(alu.getTipoAlumno() == 'B'){
			Becado alumnoB = (Becado) alu;
			monto = Becado.montoBecado(monto, alumnoB.getDescuento());
		}
		return monto;
	}
	
	// GETTERS
	
	public int getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public int getCantAprobadas() {
		return cantAprobadas;
	}
	
	public char getTipoAlumno() {
		return 'A';
	}

	public Sec_Inscripciones getInscripciones() {
		return inscripciones;
	}

	//SETTERS
	
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	
	public void setApellido(String ape) {
		this.apellido = ape;
	}
	
	public void setDomicilio(String dom) {
		this.domicilio = dom;
	}
	
	public void setTelefono(int tel) {
		this.telefono = tel;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public void setCantAprobadas(int cantAprobadas) {
		this.cantAprobadas = cantAprobadas;
	}

	public void setInscripciones(Sec_Inscripciones inscripciones) {
		this.inscripciones = inscripciones;
	}

}
