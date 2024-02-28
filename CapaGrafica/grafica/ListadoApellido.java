package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListadoApellido extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoApellido frame = new ListadoApellido();
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
	public ListadoApellido() {
		getContentPane().setBackground(new Color(210, 180, 140));
		setTitle("Listado Apellido");
		setBounds(100, 100, 354, 274);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Apellido o prefijo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 103, 29);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(123, 16, 192, 23);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 51, 321, 186);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Apellido", "Nombre", "C\u00E9dula", "Tipo Alumno"
			}
		));
		scrollPane.setViewportView(table);

	}
}
