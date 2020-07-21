package DB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reception extends JFrame {

	private JPanel contentPane;
	private JTextField t0;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel lblChooseAnOption;
	private JLabel l6;
	private JTextField t6;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recp frame = new recp();
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
	public reception() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 449);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnInsert = new JRadioButton("Insert");
		
		rdbtnInsert.setBounds(102, 84, 72, 23);
		contentPane.add(rdbtnInsert);
		
		JRadioButton rdbtnUpdate = new JRadioButton("Update");
		rdbtnUpdate.setBounds(16, 84, 82, 23);
		contentPane.add(rdbtnUpdate);
		
		JRadioButton rdbtnDelete = new JRadioButton("Delete");
		
		rdbtnDelete.setBounds(254, 84, 72, 23);
		contentPane.add(rdbtnDelete);
		
		JRadioButton rdbtnRetrieve = new JRadioButton("Retrieve");
		
		rdbtnRetrieve.setBounds(169, 84, 82, 23);
		contentPane.add(rdbtnRetrieve);
		
		ButtonGroup group = new ButtonGroup() ;
		group.add(rdbtnInsert);
		group.add(rdbtnUpdate);
		group.add(rdbtnDelete);
		group.add(rdbtnRetrieve);
		
		
			
		JComboBox<String> comboBox = new JComboBox<String>();

		comboBox.setBounds(16, 119, 158, 27);
		contentPane.add(comboBox);
		
		t0 = new JTextField();
		t0.setBounds(115, 181, 130, 26);
		contentPane.add(t0);
		t0.setColumns(10);
		t0.setVisible(false);
		
		t1 = new JTextField();
		t1.setBounds(115, 219, 130, 26);
		contentPane.add(t1);
		t1.setColumns(10);
		t1.setVisible(false);
		
		t2 = new JTextField();
		t2.setBounds(115, 257, 130, 26);
		contentPane.add(t2);
		t2.setColumns(10);
		t2.setVisible(false);
		
		t3 = new JTextField();
		t3.setBounds(115, 295, 130, 26);
		contentPane.add(t3);
		t3.setColumns(10);
		t3.setVisible(false);
		
		t4 = new JTextField();
		t4.setBounds(115, 333, 130, 26);
		contentPane.add(t4);
		t4.setColumns(10);
		t4.setVisible(false);
		
		JLabel l0 = new JLabel("");
		l0.setBounds(27, 186, 76, 16);
		contentPane.add(l0);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(27, 224, 82, 16);
		contentPane.add(l1);
		
		l2 = new JLabel("");
		l2.setBounds(27, 262, 76, 16);
		contentPane.add(l2);
		
		l3 = new JLabel("");
		l3.setBounds(27, 300, 82, 16);
		contentPane.add(l3);
		
		l4 = new JLabel("");
		l4.setBounds(27, 338, 82, 16);
		contentPane.add(l4);
		
		lblChooseAnOption = new JLabel("Choose an option:");
		lblChooseAnOption.setBounds(16, 56, 125, 16);
		contentPane.add(lblChooseAnOption);
		
		l6 = new JLabel("WHERE");
		l6.setBounds(265, 250, 61, 16);
		contentPane.add(l6);
		l6.setText("");
		
		t6 = new JTextField();
		t6.setBounds(318, 240, 130, 26);
		contentPane.add(t6);
		t6.setColumns(10);
		t6.setVisible(false);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setLineWrap(true);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(763, 25, -267, 396);
		contentPane.add(textArea);		
		textArea.setEditable(false);
		textArea.setVisible(true);
		
		JScrollPane scrollPane=new JScrollPane(textArea);
		///////////isSelected
		
		
		
		rdbtnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				comboBox.addItem("Guest");
				comboBox.addItem("Service");
				
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					String  str = (String)comboBox.getSelectedItem(); 
					if(str!=null) {
					switch(str) {
					
					case("Guest"): 
						t0.setVisible(true);
					    t1.setVisible(true);
					    t2.setVisible(true);
					    t3.setVisible(true);
					    t4.setVisible(false );
					    t6.setVisible(false);
						l0.setText("ID");
					    l1.setText("Name");
					    l2.setText("Phone Number");
					    l3.setText("Email");
					    l4.setText("");
					    l6.setText("");
					    break;
					    
					
				    
					case("Service"):
						t0.setVisible(true);
				        t1.setVisible(true);
				        t2.setVisible(true);
				        t3.setVisible(true);
				        t4.setVisible(true );
				        t6.setVisible(false);
					    l0.setText("ID");
				        l1.setText("price");
				        l2.setText("Type");
				        l3.setText("State");
				        l4.setText("Reservation ID");
				        l6.setText("");
				        
				        
				        break;
						
					
					
					}
					}}
				});
				///////Guest
				
				
				
				
			}
		});
		
		
		
	rdbtnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				comboBox.addItem("Reservation");
				t0.setVisible(true);
		        t1.setVisible(true);
		        t2.setVisible(true);
		        t3.setVisible(true);
		        t4.setVisible(true );
		        t6.setVisible(true);
		        l6.setText("where");
			    l0.setText("Reservation ID");
		        l1.setText("Check in");
		        l2.setText("Check_out");
		        l3.setText("Duration of stay");
		        l4.setText("Guest ID");
				
			}
		});
		
		
		rdbtnRetrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				comboBox.addItem("Guest");
				comboBox.addItem("Service");
				comboBox.addItem("Room");
				
				t0.setVisible(false);
		        t1.setVisible(false);
		        t2.setVisible(false);
		        t3.setVisible(false);
		        t4.setVisible(false);
		        t6.setVisible(false);
			    l0.setText("");
		        l1.setText("");
		        l2.setText("");
		        l3.setText("");
		        l4.setText("");
		        l6.setText("");
		        
		       
				
			}}
		);
		
		
		rdbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox.removeAllItems();
				comboBox.addItem("Guest");
				comboBox.removeAllItems();
				comboBox.addItem("Guest");
				comboBox.addItem("Service");
				comboBox.addItem("Room");
				t0.setVisible(true);
		        t1.setVisible(false);
		        t2.setVisible(false);
		        t3.setVisible(false);
		        t4.setVisible(false);
		        t6.setVisible(true);
		        l6.setText("where");
			    l0.setText("Guest ID");
		        l1.setText("");
		        l2.setText("");
		        l3.setText("");
		        l4.setText("");
		        
		        
			}
		});
		
		
		///////////Enter
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnInsert.isSelected()) {
					if(comboBox.getSelectedItem().equals("Guest"))
						Receptionnist.insertguest(t0.getText(),t1.getText(), t2.getText() , t3.getText()); 
					if(comboBox.getSelectedItem().equals("Service"))
						Receptionnist.insertservices(t0.getText(),t1.getText(), t2.getText() , t3.getText(), t4.getText()); 		
				}
				else if (rdbtnUpdate.isSelected()) {
				String set = Receptionnist.set(t0.getText(),t1.getText(), t2.getText() , t3.getText(), t4.getText());
				Receptionnist.updateRes(set, t6.getText());
				}
				else if(rdbtnDelete.isSelected()) {
					Receptionnist.deleteG(t0.getText())	; 
				}
				else if (rdbtnRetrieve.isSelected()) {
					
					if(comboBox.getSelectedItem().equals("Guest"))
						textArea.append((Receptionnist.retriveG()));						
			        if(comboBox.getSelectedItem().equals("Service"))
			        	textArea.append(Receptionnist.retriveS());
				    if(comboBox.getSelectedItem().equals("Room"))
				    	textArea.append(Receptionnist.retriveR());
					
				}
				
				t0.setText("");
			    t1.setText("");
			    t2.setText("");
			    t3.setText("");
			    t4.setText("");
			    t6.setText(""); 
				
				
				
				
			}
		});
		btnEnter.setBounds(318, 333, 117, 29);
		contentPane.add(btnEnter);
	}
}
