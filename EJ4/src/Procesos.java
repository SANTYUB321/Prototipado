import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Procesos extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JLabel txtFrase;
	private JButton btnAceptar;
	private JButton btnDesactivar;
	private JButton btnActivar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Procesos frame = new Procesos();
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
	public Procesos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(174, 10, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(174, 41, 86, 20);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		 txtFrase = new JLabel("Frase");
		txtFrase.setBounds(99, 94, 261, 14);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(33, 152, 89, 23);
		contentPane.add(btnAceptar);
		btnAceptar.addMouseListener(this);
		
	     btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(171, 194, 89, 23);
		contentPane.add(btnDesactivar);
		btnDesactivar.addMouseListener(this);
		
	     btnActivar = new JButton("Activar");
		btnActivar.setBounds(307, 152, 89, 23);
		contentPane.add(btnActivar);
		btnActivar.addMouseListener(this);
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == btnAceptar) {
			String nombre = txtNombre.getText();
			String ciudad = txtCiudad.getText();
			txtFrase.setText("Usted se llama "+ nombre +" y vive en " + ciudad);
;		} else if (e.getSource() == btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}	else if (e.getSource() == btnDesactivar) {
			txtNombre.setEnabled(false);
		
			txtCiudad.setEnabled(false);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
