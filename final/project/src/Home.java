package Finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1195, 789);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 170, 160));
		panel.setBounds(141, 49, 388, 271);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(19, 5, 350, 191);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kcsof\\Downloads\\homebike (3).jpeg"));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pr40 Aero Bike - 10,300 ");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(59, 199, 329, 29);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 170, 160));
		panel_1.setBounds(141, 370, 388, 271);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\kcsof\\Downloads\\specialized.jpg"));
		lblNewLabel_2.setBounds(19, 5, 350, 191);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Specialized E5 - 59,452");
		lblNewLabel_1_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(59, 199, 329, 29);
		panel_1.add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 170, 160));
		panel_2.setBounds(655, 49, 388, 271);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\kcsof\\Downloads\\canyon.jpg"));
		lblNewLabel_3.setBounds(19, 5, 350, 191);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Canyon Cf Slx - 10,000");
		lblNewLabel_1_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(59, 199, 329, 29);
		panel_2.add(lblNewLabel_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 170, 160));
		panel_3.setBounds(655, 370, 388, 271);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\kcsof\\Downloads\\s-works.jpg"));
		lblNewLabel_4.setBounds(19, 5, 350, 191);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("S-Works Talmac SL7 - 504,729");
		lblNewLabel_1_3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(29, 196, 368, 29);
		panel_3.add(lblNewLabel_1_3);
	}
}
