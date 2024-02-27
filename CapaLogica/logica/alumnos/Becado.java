package logica.alumnos;

import logica.inscripciones.Sec_Inscripciones;

public class Becado extends Alumno{
	
	private static final long serialVersionUID = 1L;
	private int descuento;
	private String razon;
	
	// CONTRUCTORS
	//Crear Becado
	public Becado(int ced, String nom, String ape, String dom, int tel, int cant, int descu, String raz, Sec_Inscripciones secIns) {
		super(ced, nom, ape, dom, tel, cant, secIns);
		this.descuento = descu;
		this.razon = raz;
	}

	//METHODS
	//VOBecado a Becado
	public static Becado becadoMapper(VOBecado vBecado) {
		Becado becado = new Becado(
				vBecado.getCedula(),
				vBecado.getNombre(),
				vBecado.getApellido(),
				vBecado.getDomicilio(),
				vBecado.getTelefono(),
				vBecado.getcantAprobadas(),
				vBecado.getDescuento(),
				vBecado.getRazon(),
				vBecado.getInscripciones()
				);
		
		return becado;
	}
	
	//Calcular el monto cuando es Becado
	public static int montoBecado (int monto, int descu) {
		return monto - (descu/100);
	}
	
	//GETTERS
	
	public int getDescuento() {
		return descuento;
	}
	
	public String getRazon() {
		return razon;
	}
	
	public char getTipoAlumno() {
		return 'B';
	}
	
	//SETTES

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}
	
}
