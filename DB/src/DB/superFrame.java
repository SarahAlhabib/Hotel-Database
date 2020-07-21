package DB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class superFrame extends JFrame {

	private JPanel contentPane;
	private JTextField t0;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
public static superFrame frames;
public static homepage frameh;
private JTextField t8;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frames = new superFrame();
					frames.setVisible(true);
					frameh=new homepage();
					frameh.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public superFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(26, 106, 151, 27);
		contentPane.add(comboBox);
		
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
		group.add(rdbtnDelete);
		group.add(rdbtnUpdate);
		group.add(rdbtnRetrieve);
		
		t0 = new JTextField();
		t0.setBounds(137, 145, 130, 26);
		contentPane.add(t0);
		t0.setColumns(10);
		t0.setVisible(false);
		
		t1 = new JTextField();
		t1.setBounds(137, 183, 130, 26);
		contentPane.add(t1);
		t1.setColumns(10);
		t1.setVisible(false);
		
		t2 = new JTextField();
		t2.setBounds(137, 221, 130, 26);
		contentPane.add(t2);
		t2.setColumns(10);
		t2.setVisible(false);
		
		t3 = new JTextField();
		t3.setBounds(137, 259, 130, 26);
		contentPane.add(t3);
		t3.setColumns(10);
		t3.setVisible(false);
		
		t4 = new JTextField();
		t4.setBounds(137, 298, 130, 26);
		contentPane.add(t4);
		t4.setColumns(10);
		t4.setVisible(false);
		
		JLabel l0 = new JLabel("");
		l0.setBounds(26, 150, 99, 16);
		contentPane.add(l0);
		
		t5 = new JTextField();
		t5.setBounds(137, 336, 130, 26);
		contentPane.add(t5);
		t5.setColumns(10);
		t5.setVisible(false);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(26, 188, 99, 16);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(28, 226, 97, 16);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(26, 264, 99, 16);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(28, 302, 97, 16);
		contentPane.add(l4);
		
		JLabel l5 = new JLabel("");
		l5.setBounds(26, 341, 99, 16);
		contentPane.add(l5);
		
		t6 = new JTextField();
		t6.setBounds(463, 145, 130, 26);
		contentPane.add(t6);
		t6.setColumns(10);
		t6.setVisible(false);
		
		JButton Enter = new JButton("Enter");
		Enter.setForeground(new Color(240, 128, 128));
		Enter.setBackground(Color.PINK);
		
		
		Enter.setBounds(324, 293, 130, 29);
		contentPane.add(Enter);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(605, 79, 382, 349);
		contentPane.add(textArea);
		//JScrollPane scrollPane_1 = new JScrollPane(textArea);
		//scrollPane_1.setViewportView(textArea);
		//JScrollPane pane= new JScrollPane(textArea);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(new Color(240, 128, 128));
		btnHome.setBackground(new Color(240, 128, 128));
		contentPane.add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameh.setVisible(true);
				frames.setVisible(false);
			}
		});
		btnHome.setBounds(324, 333, 130, 29);
		  
		
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
		
		JLabel l6 = new JLabel("Conditions");
		l6.setBounds(355, 110, 79, 16);
		contentPane.add(l6);
		
		JLabel lblChooseOperation = new JLabel("Choose Operation :");
		lblChooseOperation.setBounds(20, 52, 137, 16);
		contentPane.add(lblChooseOperation);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(0, 0, 1003, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Supervisor View");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(160, 5, 536, 35);
		panel.add(lblNewLabel);
		C3.setVisible(false);
	
		
		//////
		rdbtnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				comboBox.addItem("Employee");
				comboBox.addItem("Service");
				
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(comboBox.getSelectedItem()!=null)
						{if(comboBox.getSelectedItem().equals("Employee"))
						{
							t0.setVisible(true);
						    t1.setVisible(true);
						    t2.setVisible(true);
						    t3.setVisible(true);
						    t4.setVisible(true);
						    t5.setVisible(true);
						    t6.setVisible(false);
						   
						    t8.setVisible(false);
							l0.setText("SSN");
						    l1.setText("First name");
						    l2.setText("last name");
						    l3.setText("Salary");
						    l4.setText("Work Hours");
						    l5.setText("Super SSN");
						   
						}
						
						
						else	if(comboBox.getSelectedItem().equals("Service")) {
							t0.setVisible(true);
						    t1.setVisible(true);
						    t2.setVisible(true);
						    t3.setVisible(true);
						    t4.setVisible(true);
						    t5.setVisible(false);
						    t6.setVisible(false);
						 
						    t8.setVisible(false);
							l0.setText("ID");
						    l1.setText("Price");
						    l2.setText("Type");
						    l3.setText("State");
						    l4.setText("Reservation ID");
						    l5.setText("");
						    
						}
						
			
					}}
				});
				
			}
		});
		
		
		rdbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				comboBox.addItem("Employee");
				
				t0.setVisible(true);
			    t1.setVisible(false);
			    t2.setVisible(false);
			    t3.setVisible(false);
			    t4.setVisible(false);
			    t5.setVisible(false);
			    t6.setVisible(false);
			   
			    t8.setVisible(false);
				l0.setText("SSN");
			    l1.setText("");
			    l2.setText("");
			    l3.setText("");
			    l4.setText("");
			    l5.setText("");
			   
				
			}
		});
		
		rdbtnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				comboBox.addItem("service for employee");
				t0.setVisible(true);
			    t1.setVisible(true);
			    t2.setVisible(false);
			    t3.setVisible(false);
			    t4.setVisible(false);
			    t5.setVisible(false);
			    t6.setVisible(true);
			  
			    t8.setVisible(true);
			    C1.setVisible(true);
			    C2.setVisible(true);
			    C3.setVisible(true);
			    C1.addItem("Employee SSN");
			    C1.addItem("Service ID");
			    
			    C2.addItem("AND");
			    C2.addItem("OR");
			    
			    C3.addItem("Employee SSN");
			    C3.addItem("Service ID");
			    
			    
			    
				l0.setText("Employee SSN");
			    l1.setText("Service ID");
			    l2.setText("");
			    l3.setText("");
			    l4.setText("");
			    l5.setText("");
			    
			    
			    
			}
		});
		
		rdbtnRetrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.removeAllItems();
				comboBox.addItem("Employee");
				comboBox.addItem("Service");

				t0.setVisible(false);
			    t1.setVisible(false);
			    t2.setVisible(false);
			    t3.setVisible(false);
			    t4.setVisible(false);
			    t5.setVisible(false);
			    t6.setVisible(false);
			  
			    t8.setVisible(false);
				l0.setText("");
			    l1.setText("");
			    l2.setText("");
			    l3.setText("");
			    l4.setText("");
			    l5.setText("");
			    
				
			}
		});
		
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(rdbtnInsert.isSelected()) {
					if(comboBox.getSelectedItem().equals("Employee"))
						{if(Supervisor.insertEmployee(t0.getText(),t1.getText(), t2.getText() , t3.getText(),t4.getText(),t5.getText()))
							JOptionPane.showMessageDialog(frames, "succesful operation ");
						else JOptionPane.showMessageDialog(frames, "operation wasn't succesful","Error", JOptionPane.ERROR_MESSAGE);
						}
					if(comboBox.getSelectedItem().equals("Service"))
						{if(Receptionnist.insertservices(t0.getText(),t1.getText(), t2.getText() , t3.getText(), t4.getText()))
							JOptionPane.showMessageDialog(frames, "succesful operation ");
						else JOptionPane.showMessageDialog(frames, "operation wasn't succesful","Error", JOptionPane.ERROR_MESSAGE);
						}
				}
				else if (rdbtnUpdate.isSelected()) {
				String set = Supervisor.set(t0.getText(),t1.getText());
				String s1 = null , s2 = null ;
				//s1=t7.getText();
				switch((String)C1.getSelectedItem()) {
				case "Employee SSN" :
					s1=" E_SSN='"+t6.getText()+"' ";
					break;
				case "Service ID" :
					//s1+=(String)C2.getSelectedItem();
					s1=" S_ID='"+t6.getText()+"'";
					break;
				}
				
				if (!t8.getText().equals("")) {
				switch((String)C3.getSelectedItem()) {
				case "Employee SSN" :
					s2=" E_SSN='"+t8.getText()+"'";
					break;
				case "Service ID" :
					s2=" S_ID='"+t8.getText()+"'";
					break;
				}}
				
				String where ;
				if (s2 == null )
				where = s1 ;
				
				else 
					where = s1+(String)C2.getSelectedItem()+s2;
				
				
				if(Supervisor.updateEmpSer(set,where))
					JOptionPane.showMessageDialog(frames, "succesful operation ");
				else JOptionPane.showMessageDialog(frames, "operation wasn't succesful","Error", JOptionPane.ERROR_MESSAGE);
				}
				else if(rdbtnDelete.isSelected()) {
					if(Supervisor.deleteEmp("SSN="+t0.getText())) 
						JOptionPane.showMessageDialog(frames, "succesful operation ");
						else JOptionPane.showMessageDialog(frames, "operation wasn't succesful","Error", JOptionPane.ERROR_MESSAGE);
		        }
				else if (rdbtnRetrieve.isSelected()) {
					
					if(comboBox.getSelectedItem().equals("Employee"))
						textArea.setText((Supervisor.retriveE()));						
			        if(comboBox.getSelectedItem().equals("Service"))
			        	textArea.setText(Supervisor.retriveS());
				   
					
				}
				
				t0.setText("");
			    t1.setText("");
			    t2.setText("");
			    t3.setText("");
			    t4.setText("");
			    t5.setText("");
			    t6.setText(""); 
				
				
				
				
			
			}
		});
	}
}
