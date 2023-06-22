package Finals;



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.sound.sampled.Line;
import javax.swing.DefaultComboBoxModel;
import java.io.BufferedWriter;
public class order extends JFrame {

	private JPanel contentPane;
	private JTextField txtbN;
	private JTextField txtN;
	private JTextField Price;
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order frame = new order();
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
	public order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 731);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 170, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, " Bike Information ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 37, 278, 644);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Bike Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setBounds(46, 139, 150, 23);
		panel.add(lblNewLabel);
		
		txtbN = new JTextField();
		txtbN.setBounds(36, 139, 184, 23);
		panel.add(txtbN);
		txtbN.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                String name= txtbN.getText();
				//String Cname = textField_1.getText();
				String filename = "bikes.txt"; // data file 
				

				try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
					BufferedWriter writer = new BufferedWriter(new FileWriter("reciept.txt", true));
					String line = reader.readLine();
					while (line != null) {
						String[] data = line.split(","); // split data for row
						
						
						if(data[0].equals(name)) {
							
							//String Cname = textField_1.getText();
							txtN.setText(data[0]);
							Price.setText(data[1]);
							//textField_1.setText(data[2]);
							writer.append(data[0]+","+data[1]);
							writer.close();
							break;
						}
						line = reader.readLine();
					}
					reader.close();
					
					} catch (IOException ex) {
					ex.printStackTrace();
				}
					
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(36, 179, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Bike Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(36, 114, 89, 14);
		panel.add(lblNewLabel_1);
		
		txtN = new JTextField();
		txtN.setBounds(36, 327, 184, 23);
		panel.add(txtN);
		txtN.setColumns(10);
		
		Price = new JTextField();
		Price.setBounds(36, 398, 184, 23);
		panel.add(Price);
		Price.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bike Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(36, 302, 89, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(36, 373, 89, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Cname = textField_1.getText();
				String payment = textField.getText();
				String Name= txtbN.getText();
				
				 try {
					
					BufferedWriter writer = new BufferedWriter(new FileWriter("payment.txt"));
					writer.write(payment);
					writer.close();
					
					BufferedWriter Nwriter = new BufferedWriter(new FileWriter("Name.txt"));
					
					
					

                    Nwriter.write(Cname);
                    Nwriter.close();
					
					
							
				
				}catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				re re = new re();
            	re.setVisible(true);
            	dispose();
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(36, 574, 89, 23);
		panel.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(192, 192, 192));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash on Delivery", "Credit Card"}));
		comboBox.setBounds(36, 468, 150, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Mode of Payment");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(36, 443, 150, 14);
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(36, 540, 184, 23);
		panel.add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cash Payment");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(36, 515, 89, 14);
		panel.add(lblNewLabel_2_1);
		
		JButton btnNewButton_2 = new JButton("Home Page");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp = new HomePage();
            	hp.setVisible(true);
            	dispose();
				
			}
		});
		btnNewButton_2.setBounds(162, 21, 106, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Customer Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(36, 223, 112, 14);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(36, 248, 184, 23);
		panel.add(textField_1);
		
		
	}
}