import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Ej1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtPrecio;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1 frame = new Ej1();
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
	public Ej1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVentaBilletes = new JLabel("Venta de billetes");
		lblVentaBilletes.setBackground(Color.WHITE);
		lblVentaBilletes.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblVentaBilletes.setBounds(10, 11, 414, 32);
		contentPane.add(lblVentaBilletes);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setBounds(10, 54, 46, 14);
		contentPane.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setBounds(10, 89, 46, 14);
		contentPane.add(lblDestino);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 131, 56, 20);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(201, 134, 56, 17);
		contentPane.add(lblApellidos);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 162, 46, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblBillete = new JLabel("Billete:");
		lblBillete.setBounds(10, 186, 46, 14);
		contentPane.add(lblBillete);
		
		JComboBox cbOrigen = new JComboBox();
		cbOrigen.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "And\u00F9jar", "Cabra", "Carde\u00F1a", "obejo", "Santaella"}));
		cbOrigen.setSelectedIndex(0);
		cbOrigen.setMaximumRowCount(6);
		cbOrigen.setBounds(66, 50, 358, 22);
		contentPane.add(cbOrigen);
		
		JComboBox cbDestino = new JComboBox();
		cbDestino.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "And\u00F9jar", "Cabra", "Carde\u00F1a", "obejo", "Santaella"}));
		cbDestino.setSelectedIndex(1);
		cbDestino.setMaximumRowCount(6);
		cbDestino.setBounds(66, 85, 358, 22);
		contentPane.add(cbDestino);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 131, 125, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(267, 131, 157, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(66, 159, 46, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JRadioButton rbIda = new JRadioButton("Ida");
		rbIda.setSelected(true);
		buttonGroup.add(rbIda);
		rbIda.setBounds(62, 182, 56, 23);
		contentPane.add(rbIda);
		
		JRadioButton rbIdaYVuelta = new JRadioButton("Ida y Vuelta");
		buttonGroup.add(rbIdaYVuelta);
		rbIdaYVuelta.setBounds(148, 182, 109, 23);
		contentPane.add(rbIdaYVuelta);
		
		JRadioButton rbTarjetaDorada = new JRadioButton("Tajeta Dorada");
		buttonGroup.add(rbTarjetaDorada);
		rbTarjetaDorada.setBounds(267, 182, 109, 23);
		contentPane.add(rbTarjetaDorada);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(10, 241, 414, 115);
		contentPane.add(txtResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbOrigen.getSelectedIndex()==cbDestino.getSelectedIndex()) {
					JOptionPane.showMessageDialog(null, e);
					
				}else {
					double precio = Double.parseDouble(txtPrecio.getText());
					txtResultado.setText(txtResultado.getText() + "Trayecto: " + cbOrigen.getSelectedItem() + " a " + cbDestino.getSelectedItem());
					txtResultado.setText(txtResultado.getText() + "\n" + "Viajero: " + txtNombre.getText() + txtApellido.getText());
					
					if(rbIda.isSelected()) {
						txtResultado.setText(txtResultado.getText() + "\n" + "Precio: " + txtPrecio.getText());
					}else if(rbIdaYVuelta.isSelected()) {
						txtResultado.setText(txtResultado.getText() + "\n" + "Precio: " + (precio-(precio*0.20)));
					}else {
						txtResultado.setText(txtResultado.getText() + "\n" + "Precio: " + (precio-(precio*0.30)));
					}
				}
			}
		});
		btnCalcular.setBounds(168, 207, 89, 23);
		contentPane.add(btnCalcular);
	}
}
