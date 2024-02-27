package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class InscripcionAlumno extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InscripcionAlumno frame = new InscripcionAlumno();
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
	public InscripcionAlumno() {
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("Soy un label");
		getContentPane().add(lblNewLabel, BorderLayout.WEST);

	}

}
