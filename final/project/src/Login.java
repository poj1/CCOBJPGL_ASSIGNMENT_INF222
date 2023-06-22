package Finals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.io.FileWriter;

class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 632);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 170, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(304, 23, 340, 201);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\bikelogo.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Username");
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(323, 269, 321, 44);
		contentPane.add(lblNewLabel_1);
		
		txtuser = new JTextField();
		txtuser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtuser.setBounds(323, 270, 321, 44);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Your Password");
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(323, 371, 321, 44);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(39, 135, 131));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(325, 235, 136, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(323, 331, 204, 29);
		contentPane.add(lblNewLabel_3);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(323, 371, 321, 44);
		contentPane.add(txtpass);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\user.png"));
		lblNewLabel_4.setBounds(240, 256, 90, 69);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\lock.png"));
		lblNewLabel_5.setBounds(250, 346, 80, 80);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filename="Data.txt";
				String email = txtuser.getText().trim();
				String password = String.valueOf(txtpass.getPassword()).trim();
				try{
					
					 FileWriter writer = new FileWriter(filename, true);
			            writer.append("\n"+txtuser.getText()+","+String.valueOf(txtpass.getPassword()));
			            writer.close();
					
					int s=  JOptionPane.showConfirmDialog(null,"Account Successfully Saved! ", "WARNING", JOptionPane.OK_CANCEL_OPTION);
					  
				
				}catch(Exception ex) {
					
				}
				
			}
		});
		btnNewButton.setBounds(325, 461, 113, 29);
		contentPane.add(btnNewButton);
		
		JRadioButton showpass = new JRadioButton("Show Password");
		showpass.setOpaque(false);
		showpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showpass.isSelected()){

                    txtpass.setEchoChar((char)0);

               }

               else {

                   txtpass.setEchoChar('●');
               }
			}
		});
		showpass.setBounds(323, 422, 150, 23);
		contentPane.add(showpass);
		
		JButton btnNewButton_1 = new JButton("Log-in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String UserNameEmail = txtuser.getText().toString();
                String EnterPassword = txtpass.getText();
                
                  	if(UserNameEmail.equals("")&&EnterPassword.equals(""))  {
                  		JOptionPane.showMessageDialog(null, "PLEASE ENTER USERNAME AND PASSWORD","INVALID LOGIN", JOptionPane.ERROR_MESSAGE);                  		
                  	}
                  	else if(!(UserNameEmail.equals(""))&&EnterPassword.equals("")) {
                  		JOptionPane.showMessageDialog(null, "PLEASE ENTER YOUR PASSWORD","INVALID LOGIN", JOptionPane.ERROR_MESSAGE);
                  		txtuser.setText(null);                  		
                  		txtpass.setText(null);                  	
                  	}                        	                 	
                  	try { 
                        BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
                        String line = reader.readLine();
                        boolean loginSuccessful = false;
                        while (line != null){
                        	String[] data = line.split(",");
                        	
                        	if (UserNameEmail.equals(data[0]) && EnterPassword.equals(data[1])) {
                        	
                        	loginSuccessful = true;
                        	break;
                        }
                        	
                        	line = reader.readLine();
                        	
			}
                            reader.close();
                            
                            if (loginSuccessful) {
                                JOptionPane.showMessageDialog(Login.this, "Login successful!");
                                customer cstmr = new customer();
                          		cstmr.setVisible(true);
                          		dispose();
                          		
                            } else {
                                JOptionPane.showMessageDialog(Login.this, "Invalid email or password!");
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(Login.this, "Error reading accounts file!");
                        }
			}
		});
		btnNewButton_1.setBounds(531, 461, 113, 29);
		contentPane.add(btnNewButton_1);
	}
}
