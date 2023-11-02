import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class procesos extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAchicar;
	private JButton btnAgrandar;
	private JLabel etiNombre;
	private JPanel panel;

	public procesos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnEsquina.addMouseListener(this);
		btnEsquina.setBounds(23, 183, 100, 28);
	
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnCentro.setBounds(23, 222, 100, 28);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnAchicar.setBounds(151, 222, 100, 28);
		btnAchicar.addMouseListener(this);
		contentPane.add(btnAchicar);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnAgrandar.setBounds(278, 222, 100, 28);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		etiNombre = new JLabel("Nombre");
		etiNombre.setForeground(new Color(255, 255, 255));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 20));
		etiNombre.setBounds(171, 94, 111, 35);
		contentPane.add(etiNombre);
		
		panel = new JPanel();
		panel.setBackground(new Color(63, 92, 160));
		panel.setBounds(171, 94, 111, 35);
		contentPane.add(panel);
	}

	

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource()==btnCentro) {
			etiNombre.setLocation(171,94);
			panel.setLocation(171,94);
			
		} else if (e.getSource()==btnEsquina) {
			etiNombre.setLocation(313,11);
			panel.setLocation(313,11);
			
		} else if (e.getSource()==btnAchicar) {
			panel.setSize(95, 30);
			etiNombre.setSize(95, 30);
			etiNombre.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 15));
	
		} else if (e.getSource()==btnAgrandar) {
			panel.setSize(111, 35);
			etiNombre.setSize(111, 35);
			etiNombre.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 20));
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==btnCentro) {
			btnCentro.setSize(110, 35);
		} else if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(110, 35);
		} else if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(110, 35);
		} else if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(110, 35);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==btnCentro) {
			btnCentro.setSize(100, 28);
		} else if (e.getSource()==btnEsquina) {
			btnEsquina.setSize(100, 28);
		} else if (e.getSource()==btnAchicar) {
			btnAchicar.setSize(100, 28);
		} else if (e.getSource()==btnAgrandar) {
			btnAgrandar.setSize(100, 28);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}