package Finals;



import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.awt.event.ActionEvent;

public class customer extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNc;
	private JTextField txtP;
	private JTextField txtPr;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer frame = new customer();
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
	public customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 971, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 170, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(348, 37, 597, 448);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Product", "Price",
				}) {
			Class[] columnTypes = new Class[] { String.class, String.class, };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, " Register Student ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 37, 317, 448);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("customer name");
		lblNewLabel.setBounds(30, 72, 112, 20);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setBounds(30, 114, 84, 20);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setBounds(30, 157, 84, 20);
		panel.add(lblNewLabel_2);
		
		txtNc = new JTextField();
		txtNc.setBounds(125, 72, 174, 20);
		panel.add(txtNc);
		txtNc.setColumns(10);

		txtP = new JTextField();
		txtP.setColumns(10);
		txtP.setBounds(125, 114, 174, 20);
		panel.add(txtP);

		txtPr = new JTextField();
		txtPr.setColumns(10);
		txtPr.setBounds(125, 157, 174, 20);
		panel.add(txtPr);
		
		btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String P = txtP.getText();
				String Pr = txtPr.getText();
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {  P, Pr, });

				// Save the data to a text file
				String filename = "customer.txt";
				File file = new File(filename);

				try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
					if (!file.exists()) {
						file.createNewFile();
					}
					// save all data input in textfield
					writer.write("\n" +  "," + P + "," + Pr);
					writer.newLine();
				} catch (IOException ex) {
					ex.printStackTrace();
				}

				// Clear the input fields after adding the data
				
				txtP.setText(P);
				txtPr.setText(Pr);
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(30, 225, 89, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("LoadData");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0); // Clear the table

				String filename = "reciept.txt"; // data file 
				String Filename = "Name.txt";
				File file = new File(filename);
				File name = new File(Filename);

				try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
					BufferedReader namerd = new BufferedReader(new FileReader(name));
					
					String line;
					
					while ((line = reader.readLine()) != null) {
						String[] data = line.split(","); // split data for row
						model.addRow(data);
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(181, 225, 89, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel d1 = (DefaultTableModel) table.getModel();
				int selectIndex = table.getSelectedRow();

				int del = JOptionPane.showConfirmDialog(null, "Do you want to delete this item?", "WARNING",
						JOptionPane.YES_NO_OPTION);

				if (del == JOptionPane.YES_OPTION) {

					d1.removeRow(selectIndex);

				} else {

					JOptionPane.showMessageDialog(null, "Deletion canceled", "WARNING", JOptionPane.CLOSED_OPTION);
				}
				 try {
			            File file = new File("customer.txt");
			            BufferedReader reader = new BufferedReader(new FileReader(file));
			            StringBuilder content = new StringBuilder();

			            // Read the file and exclude the data you want to delete
			            String line;
			            while ((line = reader.readLine()) != null) {
			                if (!line.equals("data to be deleted")) {
			                    content.append(line).append(System.lineSeparator());
			                }
			            }
			            reader.close();

			            // Write the modified content back to the file
			            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			            writer.write(content.toString());
			            writer.close();

			            JOptionPane.showMessageDialog(contentPane, this, "Data deleted successfully!", del, null);

			        } catch (IOException ex) {
			            ex.printStackTrace();
			        }
			    }
				
			}
		);
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setBounds(30, 278, 89, 23);
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login login = new Login();
            	login.setVisible(true);
            	dispose();
			}
		});
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setBounds(181, 278, 89, 23);
		panel.add(btnNewButton_3);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\the bike.png"));
		lblNewLabel_3.setBounds(-46, 308, 221, 108);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\kcsof\\Downloads\\bikelogo.png"));
		lblNewLabel_4.setBounds(10, 312, 297, 125);
		panel.add(lblNewLabel_4);
		
		
		
	}

}
