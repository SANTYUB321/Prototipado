import java.awt.EventQueue;

import javax.swing.JFrame;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class procesos extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	
	private JButton btnCalcular;
	
	private JLabel etiResultado;
	private JLabel etiNotaFinal;
	
	public procesos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblT1 = new JLabel("Primer Trimestre");
		lblT1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblT1.setBounds(182, 11, 122, 25);
		contentPane.add(lblT1);
		
		JLabel lblT2 = new JLabel("Segundo Trimestre");
		lblT2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblT2.setBounds(168, 49, 136, 25);
		contentPane.add(lblT2);
		
		JLabel lblT3 = new JLabel("Tercer Trimestre");
		lblT3.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblT3.setBounds(178, 83, 122, 25);
		contentPane.add(lblT3);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(314, 13, 86, 25);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.setBounds(314, 49, 86, 25);
		contentPane.add(txtSegundoTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(314, 85, 86, 25);
		contentPane.add(txtTercerTrimestre);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnCalcular.setBounds(10, 23, 136, 25);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
		etiResultado = new JLabel("Resultado");
		etiResultado.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		etiResultado.setBounds(10, 132, 390, 25);
		contentPane.add(etiResultado);
		
		etiNotaFinal = new JLabel("Nota Final");
		etiNotaFinal.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		etiNotaFinal.setBounds(10, 168, 390, 25);
		contentPane.add(etiNotaFinal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnCalcular) {
			Calcular();
		}
		
	}

	private void Calcular() {
		double not1 = 0, not2 = 0, not3 = 0;
		int bandera = 0;
		try {
			not1 = Integer.parseInt(txtPrimerTrimestre.getText());
			not2 = Integer.parseInt(txtSegundoTrimestre.getText());
			not3 = Integer.parseInt(txtTercerTrimestre.getText());
			bandera = 1;
			
		} catch (Exception e2) {
			etiResultado.setText("Se registro un error vuelva a intentar");
			etiNotaFinal.setText("No se pudo calcular el promedio");
			etiNotaFinal.setForeground(Color.RED);
			etiResultado.setForeground(Color.RED);
		}
		
		if (bandera == 1) {
			double notFinal = (not1+not2+not3)/3;
			validarProm(notFinal);
		}
	}

	private void validarProm(double notFinal) {
			if (notFinal < 5) {
				etiNotaFinal.setText("Nota Final " + notFinal);
				etiNotaFinal.setForeground(Color.RED);
				etiResultado.setText("SUSPENSO");
				etiResultado.setForeground(Color.RED);
			} else {
				etiNotaFinal.setText("Nota Final " + notFinal);
				etiNotaFinal.setForeground(Color.BLACK);
				etiResultado.setText("APROBO");
				etiResultado.setForeground(Color.BLACK);
			}	
	}



	
}