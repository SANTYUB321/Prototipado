import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.UIManager;

public class Procesos extends JFrame implements MouseListener{


	private JPanel contentPane;
	private JLabel txtNombre;
	private JLabel txtCiudad;
	private JButton btnOcultarNombre;
	private JButton btnNmbreVisible;
	private JButton btnOcultarCiudad;
	private JButton btnCiudadVisible;

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
		setBounds(100, 100, 487, 322);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("actividad 1");
		lblNewLabel.setForeground(UIManager.getColor("CheckBox.foreground"));
		lblNewLabel.setBounds(171, 11, 104, 14);
		contentPane.add(lblNewLabel);
		
		txtNombre = new JLabel("Santiago Uribe");
		txtNombre.setForeground(UIManager.getColor("Button.foreground"));
		txtNombre.setBounds(182, 55, 70, 14);
		contentPane.add(txtNombre);
		
		 txtCiudad = new JLabel("Armenia");
		txtCiudad.setForeground(UIManager.getColor("CheckBox.foreground"));
		txtCiudad.setBounds(193, 94, 46, 14);
		contentPane.add(txtCiudad);
		
		 btnOcultarNombre = new JButton("OcultarNombre");
		btnOcultarNombre.setBounds(10, 169, 106, 23);
		btnOcultarNombre.addMouseListener(this);
		contentPane.add(btnOcultarNombre);
		
	    btnNmbreVisible = new JButton("visibleNombre");
		btnNmbreVisible.setBounds(121, 210, 106, 23);
		btnNmbreVisible.addMouseListener(this);

		contentPane.add(btnNmbreVisible);
		
		btnOcultarCiudad = new JButton("ocultarCiudad");
		btnOcultarCiudad.setBounds(242, 169, 104, 23);
		contentPane.add(btnOcultarCiudad);
		btnOcultarCiudad.addMouseListener(this);
		
		btnCiudadVisible = new JButton("visibleCuidad");
		btnCiudadVisible.setBounds(356, 210, 105, 23);
		contentPane.add(btnCiudadVisible);
		btnCiudadVisible.addMouseListener(this);

	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==btnOcultarNombre) {
			txtNombre.setVisible(false);
		}else if(e.getSource()==btnNmbreVisible) {
			txtNombre.setVisible(true);
		}		else	if (e.getSource()==btnOcultarCiudad) {
			txtCiudad.setVisible(false);
		}else if(e.getSource()==btnCiudadVisible) {
			txtCiudad.setVisible(true);
		}		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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