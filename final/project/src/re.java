package Finals;



import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;

public class re extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					re frame = new re();
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
	public re() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(98, 546, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(98, 512, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(98, 479, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(332, 312, 73, 89);
		contentPane.add(textArea_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(20, 312, 254, 89);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\National University\\Documents\\project\\images\\receipt.png"));
		lblNewLabel.setBounds(94, 27, 222, 116);
		contentPane.add(lblNewLabel);
		
		JTextPane txtre = new JTextPane();
		txtre.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		txtre.setText("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n------------------------------------------------------------------------------------------------\r\n\r\n                                           Company Name: The Bike \r\n                                            Contac No: 09172056538\r\n                                    Email Address: TheBike@gmail.com\r\n\r\n------------------------------------------------------------------------------------------------\r\n    Item Name                                                                                  Price \r\n------------------------------------------------------------------------------------------------\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n------------------------------------------------------------------------------------------------\r\n Total amount:                                                                                          \r\n------------------------------------------------------------------------------------------------\r\n Cash               :\r\n------------------------------------------------------------------------------------------------\r\n Balance          :\r\n\r\n************************************************************************************************\r\n                                           THANK YOU COME AGAIN\r\n************************************************************************************************\r\n                                   SOFTWARE BY : KAIDE AND FRIENDS\r\n                                      CONTACT:  TheBike@gmail.com\r\n");
		txtre.setBounds(10, 11, 395, 629);
		contentPane.add(txtre);
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("reciept.txt"));
			BufferedReader preader = new BufferedReader(new FileReader("payment.txt"));
			int totalamount = 0;
			int payment = 0;
			String line = reader.readLine();
			String pline = preader.readLine();
			while (pline !=null) {
				
				payment = Integer.parseInt(pline);
				
				lblNewLabel_2.setText(pline);
				pline = preader.readLine();
				
				
			}
			
			preader.close();
			
			while (line != null) {
				String[]data=line.split(",");
				
				
				for (int i = 0; i < data.length;i+=2) {
					int price = Integer.parseInt(data[i+1]);
					totalamount+=price;
					textArea.append(data[i]+"\n");
					textArea_1.append(data[i+1]+"\n");
					
				}
				
				
				
				
				
				
				line = reader.readLine();
			}
			
			lblNewLabel_1.setText(Integer.toString(totalamount));
			
			lblNewLabel_2_1.setText(Integer.toString(payment-totalamount));
			
			reader.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}