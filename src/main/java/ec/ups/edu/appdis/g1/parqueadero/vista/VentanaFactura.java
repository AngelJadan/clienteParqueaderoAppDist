package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VentanaFactura extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFactura frame = new VentanaFactura();
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
	public VentanaFactura() {
		setBounds(100, 100, 417, 367);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N. Factura");
		lblNewLabel.setBounds(10, 24, 66, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(94, 21, 59, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha actual");
		lblNewLabel_1.setBounds(176, 24, 66, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(251, 21, 96, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cliente");
		lblNewLabel_2.setBounds(10, 54, 49, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 52, 263, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DNI");
		lblNewLabel_3.setBounds(10, 79, 49, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(94, 76, 96, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo documento");
		lblNewLabel_4.setBounds(10, 104, 79, 14);
		getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cedula", "Pasaporte", "Ruc"}));
		comboBox.setBounds(94, 107, 96, 22);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Correo");
		lblNewLabel_5.setBounds(10, 148, 49, 14);
		getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(94, 145, 137, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono");
		lblNewLabel_6.setBounds(243, 148, 49, 14);
		getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(294, 145, 71, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Direccion");
		lblNewLabel_7.setBounds(10, 183, 49, 14);
		getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(94, 176, 137, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Numero de ticket");
		lblNewLabel_8.setBounds(10, 217, 85, 14);
		getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(94, 214, 79, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Valor total");
		lblNewLabel_9.setBounds(10, 254, 79, 14);
		getContentPane().add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(94, 245, 79, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(52, 294, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(161, 294, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.setBounds(268, 294, 89, 23);
		getContentPane().add(btnNewButton_2);

	}
}
