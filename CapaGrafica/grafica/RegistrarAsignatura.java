package grafica;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class RegistrarAsignatura {
	private JFrame frmRegistroDeAsignatura;
	private JTextField codigoField;
	private JTextField nombreField;
	private JTextArea descripcionArea;
	private JTextArea textArea;
	
	private void initialize() {
		this.frmRegistroDeAsignatura = new JFrame();
		frmRegistroDeAsignatura.setSize(450, 300);
		frmRegistroDeAsignatura.setResizable(false);
		frmRegistroDeAsignatura.setTitle("Registro de asignatura");
		frmRegistroDeAsignatura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroDeAsignatura.setAlwaysOnTop(true);
		Container panel = frmRegistroDeAsignatura.getContentPane();
		panel.setBackground(new Color(240, 248, 255));
		frmRegistroDeAsignatura.getContentPane().setLayout(null);
		
		JTextPane codigo = new JTextPane();
		codigo.setEditable(false);
		codigo.setText("Código alfanumérico:");
		codigo.setBounds(6, 6, 149, 26);
		frmRegistroDeAsignatura.getContentPane().add(codigo);
		
		codigoField = new JTextField();
		codigoField.setBounds(167, 6, 277, 26);
		frmRegistroDeAsignatura.getContentPane().add(codigoField);
		codigoField.setColumns(10);
		
		JTextArea nombre = new JTextArea();
		nombre.setEditable(false);
		nombre.setText("Nombre:");
		nombre.setBounds(6, 44, 150, 26);
		frmRegistroDeAsignatura.getContentPane().add(nombre);
		
		nombreField = new JTextField();
		nombreField.setColumns(10);
		nombreField.setBounds(167, 44, 277, 26);
		frmRegistroDeAsignatura.getContentPane().add(nombreField);
		
		descripcionArea = new JTextArea();
		descripcionArea.setText("Descripción:");
		descripcionArea.setEditable(false);
		descripcionArea.setBounds(5, 82, 150, 26);
		frmRegistroDeAsignatura.getContentPane().add(descripcionArea);
		
		textArea = new JTextArea();
		textArea.setBounds(167, 82, 277, 184);
		frmRegistroDeAsignatura.getContentPane().add(textArea);
	}
	
	public void setVisible(boolean b) {
		frmRegistroDeAsignatura.setVisible(b);
	}

	public RegistrarAsignatura() {
		this.initialize();
		this.setVisible(true);
	}
}
