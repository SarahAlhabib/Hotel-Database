package DB;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class homepage extends JFrame {

	private JPanel contentPane;
	public static homepage frame;
	public static recp frame2;
	public static superFrame frame3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new homepage();
					frame.setVisible(true);
					frame2=new recp();
					frame2.setVisible(false);
					frame3= new superFrame();
					frame3.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 231, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRecep = new JButton("Receptionist view");
		btnRecep.setForeground(new Color(240, 128, 128));
		btnRecep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame2.setVisible(true);
				}
		});
		btnRecep.setBounds(32, 91, 151, 29);
		contentPane.add(btnRecep);
		
		JButton btnSuper = new JButton("Supervisor View");
		btnSuper.setForeground(new Color(240, 128, 128));
		btnSuper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame3.setVisible(true);
			}
		});
		btnSuper.setBounds(32, 132, 151, 29);
		contentPane.add(btnSuper);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		
		/*Image img = new ImageIcon(getClass().getResource("/image/hotel.png/DB/image/kisspng-hotel-euclidean-vector-icon-vector-hotels-5a7c3e0ce378d2.0899997515180917889317.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setBounds(42, 173, 141, 114);
		contentPane.add(lblNewLabel_1);*/
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		panel.setBounds(0, 0, 231, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RETAL HOTEL");
		lblNewLabel.setBounds(37, 5, 151, 39);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
