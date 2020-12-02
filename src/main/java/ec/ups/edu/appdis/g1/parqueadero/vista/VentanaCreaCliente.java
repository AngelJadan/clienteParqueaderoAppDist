package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCreaCliente extends JInternalFrame {
	private JTextField txtdni;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JTextField txtemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCreaCliente frame = new VentanaCreaCliente();
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
	public VentanaCreaCliente() {
		setBounds(100, 100, 377, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(90, 22, 19, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo documento");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(30, 47, 79, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(60, 72, 49, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(60, 108, 49, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefono");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(60, 134, 49, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Direccion");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(60, 159, 49, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(60, 184, 49, 14);
		getContentPane().add(lblNewLabel_6);
		
		txtdni = new JTextField();
		txtdni.setBounds(133, 19, 96, 20);
		getContentPane().add(txtdni);
		txtdni.setColumns(10);
		
		JComboBox cboxtdocumento = new JComboBox();
		cboxtdocumento.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Cedula", "Pasaporte"}));
		cboxtdocumento.setBounds(133, 47, 96, 22);
		getContentPane().add(cboxtdocumento);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(133, 72, 163, 20);
		getContentPane().add(txtnombre);
		txtnombre.setColumns(10);
		
		txtapellido = new JTextField();
		txtapellido.setBounds(133, 105, 163, 20);
		getContentPane().add(txtapellido);
		txtapellido.setColumns(10);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(133, 134, 96, 20);
		getContentPane().add(txttelefono);
		txttelefono.setColumns(10);
		
		txtdireccion = new JTextField();
		txtdireccion.setBounds(133, 156, 191, 20);
		getContentPane().add(txtdireccion);
		txtdireccion.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(133, 181, 163, 20);
		getContentPane().add(txtemail);
		txtemail.setColumns(10);
		
		JButton btnguardar = new JButton("Guardar");
		btnguardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnguardar.setBounds(90, 237, 89, 23);
		getContentPane().add(btnguardar);
		
		JButton btncancelar = new JButton("Cancelar");
		btncancelar.setBounds(207, 237, 89, 23);
		getContentPane().add(btncancelar);

	}
}
