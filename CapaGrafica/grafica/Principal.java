package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 850);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Asignaturas");
		menuBar.add(mnNewMenu);
		
		JMenuItem miRegistroAsignatura = new JMenuItem("Registro de asignatura");
		mnNewMenu.add(miRegistroAsignatura);
		
		JMenuItem miInscripcionAsignatura = new JMenuItem("Inscripción a asignatura");
		mnNewMenu.add(miInscripcionAsignatura);
		
		JMenu mnNewMenu_1 = new JMenu("Alumnos");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem miRegistroAlumno = new JMenuItem("Registro de alumno");
		mnNewMenu_1.add(miRegistroAlumno);
		
		JMenuItem miRegistroResultado = new JMenuItem("Registro de resultado");
		mnNewMenu_1.add(miRegistroResultado);
		
		JMenuItem miRecaudadoInscripciones = new JMenuItem("Recaudado por inscripciones");
		mnNewMenu_1.add(miRecaudadoInscripciones);
		
		JMenu mnNewMenu_2 = new JMenu("Listados");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem miListadoAsignaturas = new JMenuItem("Asignaturas");
		mnNewMenu_2.add(miListadoAsignaturas);
		
		JMenuItem miListadoAlumnos = new JMenuItem("Alumnos");
		mnNewMenu_2.add(miListadoAlumnos);
		
		JMenuItem miDetalleAlumno = new JMenuItem("Detalle alumno");
		mnNewMenu_2.add(miDetalleAlumno);
		
		JMenuItem miListadoEscolaridad = new JMenuItem("Escolaridad");
		mnNewMenu_2.add(miListadoEscolaridad);
		
		JMenuItem miListadoEgresados = new JMenuItem("Egresados");
		mnNewMenu_2.add(miListadoEgresados);
		
		JMenu mnNewMenu_3 = new JMenu("Opciones");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem miRespaldarDatos = new JMenuItem("Respaldar datos");
		mnNewMenu_3.add(miRespaldarDatos);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem miAcercaDe = new JMenuItem("Acerca de Moda fashionista");
		mnNewMenu_4.add(miAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("Recursos/background.jpg"));
		lblNewLabel.setBounds(0, 0, 564, 800);
		panel.add(lblNewLabel);
	}
}
