package Finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Color;
public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1159, 767);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\bikelogo.png"));
		lblNewLabel.setBounds(-61, -24, 346, 216);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome,");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(535, 24, 241, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to \"The Bike\" review");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 196, 181, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Here, you will find");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 214, 123, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bike's information");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 230, 119, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DASHBOARD");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(45, 321, 158, 23);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("ORDER");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order or = new order();
            	or.setVisible(true);
            	dispose();
				
			}
		});
		btnNewButton_2.setBounds(55, 370, 100, 32);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(219, 112, 924, 616);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 170, 160));
		panel_1.setBounds(33, 28, 388, 271);
		panel.add(panel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\homebike.jpeg"));
		lblNewLabel_6.setBounds(19, 5, 350, 191);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pr40 Aero Bike - 10,300 ");
		lblNewLabel_1_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(59, 199, 329, 29);
		panel_1.add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 170, 160));
		panel_2.setBounds(508, 28, 388, 271);
		panel.add(panel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\canyon.jpg"));
		lblNewLabel_3_1.setBounds(19, 5, 350, 191);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Canyon Cf Slx - 10,000");
		lblNewLabel_1_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(59, 199, 329, 29);
		panel_2.add(lblNewLabel_1_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 170, 160));
		panel_1_1.setBounds(33, 334, 388, 271);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\specialized.jpg"));
		lblNewLabel_2_1.setBounds(19, 5, 350, 191);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Specialized E5 - 59,452");
		lblNewLabel_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(59, 199, 329, 29);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 170, 160));
		panel_3.setBounds(508, 334, 388, 271);
		panel.add(panel_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\s-works.jpg"));
		lblNewLabel_4_1.setBounds(19, 5, 350, 191);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("S-Works Talmac SL7 - 504,729");
		lblNewLabel_1_3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(29, 196, 368, 29);
		panel_3.add(lblNewLabel_1_3);
		
		JButton btnNewButton_1 = new JButton("ADMIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<String> adminAccount = new ArrayList<String>();
		        adminAccount.add("adminkai123");
		        
		        String input =  JOptionPane.showInputDialog(null, "Enter Password");
		        
		        
		        for(String account : adminAccount) {
		            if(input.equals(account)) {
		            	JOptionPane.showMessageDialog(null, "Authorized Log-in!", "Administrator", JOptionPane.INFORMATION_MESSAGE);
		            
		            	Login login = new Login();
		            	login.setVisible(true);
		            	dispose();
		            }
		            
		            else {
		            	JOptionPane.showMessageDialog(null, "Unauthorized Log-in!", "Administrator", JOptionPane.WARNING_MESSAGE);
		            }
		        
			}
			}
			
		});
		
		
		btnNewButton_1.setBounds(55, 431, 100, 32);
		contentPane.add(btnNewButton_1);
	}
	}
