import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;

public class Ej2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtKilometros;
	private JTextField txtModelo;
	private JSpinner SPlazas;
	private JTextArea txtResultado;
	private ArrayList <Vehiculo>Autocar = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2 frame = new Ej2();
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
	public Ej2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionAutocares = new JLabel("Gestion Autocares");
		lblGestionAutocares.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblGestionAutocares.setBounds(10, 11, 414, 34);
		contentPane.add(lblGestionAutocares);
		
		JLabel lblMatricula = new JLabel("Matricula: ");
		lblMatricula.setBounds(20, 56, 71, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblMarca = new JLabel("Marca: ");
		lblMarca.setBounds(30, 81, 71, 14);
		contentPane.add(lblMarca);
		
		JLabel lblKilometros = new JLabel("Kilometros: ");
		lblKilometros.setBounds(20, 106, 69, 14);
		contentPane.add(lblKilometros);
		
		JLabel lblModelo = new JLabel("Modelo: ");
		lblModelo.setBounds(257, 81, 58, 14);
		contentPane.add(lblModelo);
		
		JLabel lblPlazas = new JLabel("Plazas: ");
		lblPlazas.setBounds(269, 106, 46, 14);
		contentPane.add(lblPlazas);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(84, 53, 165, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(84, 78, 163, 20);
		contentPane.add(txtMarca);
		
		txtKilometros = new JTextField();
		txtKilometros.setColumns(10);
		txtKilometros.setBounds(84, 103, 165, 20);
		contentPane.add(txtKilometros);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(325, 78, 165, 20);
		contentPane.add(txtModelo);
		
		SPlazas = new JSpinner();
		SPlazas.setModel(new SpinnerNumberModel(30, 1, 80, 1));
		SPlazas.setBounds(325, 103, 48, 20);
		contentPane.add(SPlazas);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarDatos();
			}
		});
		btnInsertar.setBounds(160, 134, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnMostrar = new JButton("Mostrar Datos");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDatos();
			}
		});
		btnMostrar.setBounds(269, 134, 105, 23);
		contentPane.add(btnMostrar);
		
		txtResultado = new JTextArea();
		txtResultado.setBounds(10, 177, 480, 118);
		contentPane.add(txtResultado);
		
		JScrollPane scrollPane = new JScrollPane(txtResultado);
		scrollPane.setBounds(10, 177, 480, 118);
		contentPane.add(scrollPane);
	}

	protected void insertarDatos() {
		int kilometros = Integer.parseInt(txtKilometros.getText());
		
		Vehiculo c = new Vehiculo();
		c.setMatrícula( txtMatricula.getText()); 
		c.setMarca(txtMarca.getText());
		c.setKilómetros(kilometros);
		c.setModelo(txtModelo.getText());
		c.setNumPlazas((Integer) SPlazas.getValue());
		
		Autocar.add(c);
	}
	
	protected void mostrarDatos() {
		txtResultado.setText("");
		for (Vehiculo autocar : Autocar) {
		txtResultado.setText(txtResultado.getText()+autocar.toString()+System.lineSeparator());
		}
		}
}
