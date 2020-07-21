package DB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class recp extends JFrame {

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
	private JTextField t8;
	
	public static recp framer;
	public static homepage frameh2;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framer = new recp();
					framer.setVisible(true);
					frameh2 = new homepage();
					frameh2.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public recp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 449);
		//contentPane = new JPanel();
		//contentPane.setToolTipText("");
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		setBounds(100, 100, 993, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(250, 250, 210));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnInsert = new JRadioButton("insert");
		rdbtnInsert.setBounds(6, 71, 70, 23);
		contentPane.add(rdbtnInsert);
		
		JRadioButton rdbtnDelete = new JRadioButton("Delete");
		rdbtnDelete.setBounds(88, 71, 76, 23);
		contentPane.add(rdbtnDelete);
		
		JRadioButton rdbtnUpdate = new JRadioButton("Update ");
		rdbtnUpdate.setBounds(169, 71, 86, 23);
		contentPane.add(rdbtnUpdate);
		
		JRadioButton rdbtnRetrieve = new JRadioButton("Retrieve");
		rdbtnRetrieve.setBounds(257, 71, 86, 23);
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
		
		lblChooseAnOption = new JLabel("Choose an operation:");
		lblChooseAnOption.setBounds(20, 52, 137, 16);
		contentPane.add(lblChooseAnOption);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(0, 0, 1003, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Receptionist View");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(160, 5, 536, 35);
		panel.add(lblNewLabel);
		
		JLabel l6 = new JLabel("Conditions");
		l6.setBounds(355, 110, 79, 16);
		contentPane.add(l6);
		l6.setVisible(false);
		
		t6 = new JTextField();
		t6.setBounds(463, 145, 130, 26);
		contentPane.add(t6);
		t6.setColumns(10);
		t6.setVisible(false);
		
		t8 = new JTextField();
		t8.setBounds(463, 221, 130, 26);
		contentPane.add(t8);
		t8.setColumns(10);
		t8.setVisible(false);
		
		JComboBox C1 = new JComboBox();
		C1.setBounds(355, 146, 96, 27);
		contentPane.add(C1);
		C1.setVisible(false);
		
		JComboBox C2 = new JComboBox();
		C2.setBounds(417, 184, 99, 27);
		contentPane.add(C2);
		C2.setVisible(false);
		
		JComboBox C3 = new JComboBox();
		C3.setBounds(355, 222, 99, 27);
		contentPane.add(C3);
		C3.setVisible(false);
		
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(605, 79, 382, 349);
		contentPane.add(textArea);
		//JScrollPane pane= new JScrollPane(textArea);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		//JTextArea textArea = new JTextArea();
		//textArea.setBounds(466, 6, 521, 378);
		//contentPane.add(textArea);
		//JScrollPane pane= new JScrollPane(textArea);
		//textArea.setEditable(false);
		//textArea.setLineWrap(true);
		textArea.setAutoscrolls(true);
		textArea.add(new JScrollPane());
		
		JButton btnHome = new JButton("Home");
		contentPane.add(btnHome);
		btnHome.setBounds(320, 360, 130, 29);
		btnHome.setSize(116, 30);
		
		btnHome.setForeground(new Color(240, 128, 128));
		btnHome.setBackground(new Color(240, 128, 128));
		contentPane.add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameh2.setVisible(true);
				framer.setVisible(false);
			}
		});
		
		
		
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
					    t8.setVisible(false);
					    C1.setVisible(false);
					    C2.setVisible(false);
					    C3.setVisible(false);
					    
						l0.setText("ID");
					    l1.setText("Name");
					    l2.setText("Phone Number");
					    l3.setText("Email");
					    l4.setText("");
					    l6.setVisible(false);
					    break;
					    
					
				    
					case("Service"):
						t0.setVisible(true);
				        t1.setVisible(true);
				        t2.setVisible(true);
				        t3.setVisible(true);
				        t4.setVisible(true );
				        t6.setVisible(false);
				        t8.setVisible(false);
					    C1.setVisible(false);
					    C2.setVisible(false);
					    C3.setVisible(false);
					    
					    l0.setText("ID");
				        l1.setText("price");
				        l2.setText("Type");
				        l3.setText("State");
				        l4.setText("Reservation ID");
				        l6.setVisible(false);;
				        
				        
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
		        t8.setVisible(true);
			    C1.setVisible(true);
			    C2.setVisible(true);
			    C3.setVisible(true);
			    l6.setVisible(true);
			    
			    C1.addItem("Reservation ID");
			    C1.addItem("Check in");
			    C1.addItem("Check_out");
			    C1.addItem("Duration of stay");
			    C1.addItem("Guest ID");
			    
			    
			    C2.addItem("AND");
			    C2.addItem("OR");
			  
			    C3.addItem("Reservation ID");
			    C3.addItem("Check in");
			    C3.addItem("Check_out");
			    C3.addItem("Duration of stay");
			    C3.addItem("Guest ID");
			    
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
		        t8.setVisible(false);
			    C1.setVisible(false);
			    C2.setVisible(false);
			    C3.setVisible(false);
			    l0.setText("");
		        l1.setText("");
		        l2.setText("");
		        l3.setText("");
		        l4.setText("");
		        l6.setVisible(false);
		        
		       
				
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
		        t6.setVisible(false);
		        t8.setVisible(false);
			    C1.setVisible(false);
			    C2.setVisible(false);
			    C3.setVisible(false);
			    l6.setVisible(false);
			    l0.setText("Guest ID");
		        l1.setText("");
		        l2.setText("");
		        l3.setText("");
		        l4.setText("");
		        
		        
			}
		});
		
		
		///////////Enter
		//JButton btnEnter = new JButton("Enter");
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(324, 250, 130, 29);
		btnEnter.setForeground(new Color(240, 128, 128));
		btnEnter.setBackground(Color.PINK);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{if(rdbtnInsert.isSelected()) {
					if(comboBox.getSelectedItem().equals("Guest"))
						{if(Receptionnist.insertguest(t0.getText(),t2.getText(), t3.getText() , t1.getText()))
							JOptionPane.showMessageDialog(framer, "succesful operation ");
						else JOptionPane.showMessageDialog(framer, "operation wasn't succesful","Error", JOptionPane.ERROR_MESSAGE);}
				
					if(comboBox.getSelectedItem().equals("Service")) {
						if(Receptionnist.insertservices(t0.getText(),t1.getText(), t2.getText() , t3.getText(), t4.getText()))		
						JOptionPane.showMessageDialog(framer, "succesful operation ");
						else JOptionPane.showMessageDialog(framer, "operation wasn't succesful","Error", JOptionPane.ERROR_MESSAGE);
				    }}	
						
				else if (rdbtnUpdate.isSelected()) {
					
					
				String set = Receptionnist.set(t0.getText(),t1.getText(), t2.getText() , t3.getText(), t4.getText());
				
				String s1 = null , s2 = null ;
				//s1=t7.getText();
				 
				switch((String)C1.getSelectedItem()) {
				case "Reservation ID" :
					s1=" R_ID='"+t6.getText()+"' ";
					break;
				case "Check in" :
					//s1+=(String)C2.getSelectedItem();
					s1=" Check_in='"+t6.getText()+"'";
					break;
				case "Check_out" :
					s1=" Check_out='"+t6.getText()+"' ";
					break ;
				case "Duration of stay" :
					s1=" Duration_of_Stay='"+t6.getText()+"' ";
					break ;
				case "Guest ID" :
					s1=" G_ID='"+t6.getText()+"' ";
					break;
				}
				
				if (!t8.getText().equals("")) {
				switch((String)C3.getSelectedItem()) {
				case "Reservation ID" :
					s2=" R_ID='"+t6.getText()+"' ";
					break;
				case "Check in" :
					//s1+=(String)C2.getSelectedItem();
					s2=" Check_in='"+t6.getText()+"'";
					break;
				case "Check_out" :
					s2=" Check_out='"+t6.getText()+"' ";
					break ;
				case "Duration of stay" :
					s2=" Duration_of_Stay='"+t6.getText()+"' ";
					break ;
				case "Guest ID" :
					s2=" G_ID='"+t6.getText()+"' ";
					break;
				}}
				
				String where ;
				if (s2 == null)
				where = s1 ;
				
				else 
				where = s1+(String)C2.getSelectedItem()+s2;
				
				if(Receptionnist.updateRes(set, where ))
						JOptionPane.showMessageDialog(framer, "succesful operation ");
				else JOptionPane.showMessageDialog(framer, "operation wasn't succesful","Error", JOptionPane.ERROR_MESSAGE);
						
						
				}
				else if(rdbtnDelete.isSelected()) {
					if(Receptionnist.deleteG(t0.getText()))	
					JOptionPane.showMessageDialog(framer, "succesful operation ");
					else JOptionPane.showMessageDialog(framer, "operation wasn't succesful","Error", JOptionPane.ERROR_MESSAGE);
					
				}
				else if (rdbtnRetrieve.isSelected()) {
					textArea.setText("");
					if(comboBox.getSelectedItem().equals("Guest"))
						textArea.append((Receptionnist.retriveG()));						
			        if(comboBox.getSelectedItem().equals("Service"))
			        	textArea.append(Receptionnist.retriveS());
				    if(comboBox.getSelectedItem().equals("Room"))
				    	textArea.append(Receptionnist.retriveR());
					
				}}catch(Exception exc) {};
				
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
