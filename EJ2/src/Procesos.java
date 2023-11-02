import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class Procesos extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel txtPannel;
	private JTextField txtTexto;
	private JLabel eti1;
	private JLabel eti2;
	private JButton btnTraspaso1;
	private JButton btnTraspaso2;
	String txt1;
	String txt2;
	

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
		txtPannel = new JPanel();
		txtPannel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(txtPannel);
		txtPannel.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(172, 45, 86, 20);
		txtPannel.add(txtTexto);
		txtTexto.setColumns(10);
		
		eti1 = new JLabel("t1");
		eti1.setBackground(new Color(95, 158, 160));
		eti1.setBounds(74, 89, 98, 14);
		txtPannel.add(eti1);
		
		eti2 = new JLabel("t2");
		eti2.setBackground(new Color(0, 255, 0));
		eti2.setBounds(257, 89, 98, 14);
		txtPannel.add(eti2);
		
		 btnTraspaso1 = new JButton("Traspaso 1");
		btnTraspaso1.setBounds(74, 176, 110, 23);
		txtPannel.add(btnTraspaso1);
		btnTraspaso1.addActionListener(this);
		
		
		 btnTraspaso2 = new JButton("Traspaso 2");
		btnTraspaso2.setBounds(281, 176, 110, 23);
		txtPannel.add(btnTraspaso2);
		btnTraspaso2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnTraspaso1) {
			txt1=txtTexto.getText();
			eti1.setText(txt1);
		}else if(e.getSource()==btnTraspaso2) {
			txt1=txtTexto.getText();
			eti2.setText(txt1);
		}
		
	}
}
