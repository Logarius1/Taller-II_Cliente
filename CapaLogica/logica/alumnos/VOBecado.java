package logica.alumnos;

public class VOBecado extends VOAlumno {

	private static final long serialVersionUID = 1L;
	private int descuento;
	private String razon;
	
	// CONSTRUCTORS
	//Crear VOBecado
	public VOBecado(int ced, String nom, String ape, String dom, int tel, int des, String raz) {
		super(ced, nom, ape, dom, tel);
		this.descuento = des;
		this.razon = raz;
	}
	
	// METHODS

	//Becado a VOBecado
	public static VOBecado becadoMapper(Becado becado) {
		VOBecado vBecado = new VOBecado(
				becado.getCedula(),
				becado.getNombre(),
				becado.getApellido(),
				becado.getDomicilio(),
				becado.getTelefono(),
				becado.getDescuento(),
				becado.getRazon()
				);
		
		return vBecado;
	}

	// GETTERS
	
	public int getDescuento() {
		return descuento;
	}
	
	public String getRazon() {
		return razon;
	}

}
