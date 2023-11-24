package register;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_username;
	private JPasswordField passwordField_1;
	private JTextField textField_email;
	private JTextField textField_phone;
	private JTextField textField_address;
	private JTextField textpassword;
	
	private void resetform() {
		textField_name.setText("");
		textField_username.setText("");
		textpassword.setText("");
		passwordField_1.setText("");
		textField_email.setText("");
		textField_phone.setText("");
		textField_address.setText("");
	}

	private void closeForm() {
		System.exit(0);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Form");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 135, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(80, 45, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblUserName = new JLabel("Username: ");
		lblUserName.setBounds(59, 86, 67, 14);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(59, 129, 67, 14);
		contentPane.add(lblPassword);
		
		JLabel lblConfirm = new JLabel("Confirm Password:");
		lblConfirm.setBounds(10, 166, 116, 14);
		contentPane.add(lblConfirm);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(80, 205, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(80, 245, 46, 14);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(65, 283, 53, 14);
		contentPane.add(lblAddress);
		
		textField_name = new JTextField();
		textField_name.setBounds(136, 42, 316, 20);
		contentPane.add(textField_name);
		textField_name.setColumns(10);
		
		textField_username = new JTextField();
		textField_username.setBounds(136, 86, 316, 20);
		contentPane.add(textField_username);
		textField_username.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(136, 163, 316, 20);
		contentPane.add(passwordField_1);
		
		textField_email = new JTextField();
		textField_email.setBounds(136, 202, 316, 20);
		contentPane.add(textField_email);
		textField_email.setColumns(10);
		
		textField_phone = new JTextField();
		textField_phone.setBounds(136, 242, 316, 20);
		contentPane.add(textField_phone);
		textField_phone.setColumns(10);
		
		textField_address = new JTextField();
		textField_address.setBounds(136, 280, 316, 20);
		contentPane.add(textField_address);
		textField_address.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cat","root","220404");
					
					String sql="INSERT INTO REGISTRATION(name,Username,password, email, phone, Address ) VALUES(?,?,?,?,?,? )";
					
					PreparedStatement pr=con.prepareStatement(sql);
					pr.setString(1,  textField_name.getText());
					pr.setString(2, textField_username.getText());
					pr.setString(3,  textpassword.getText());
					pr.setString(4,  textField_email.getText());
					pr.setString(5,  textField_phone.getText());
					pr.setString(6,  textField_address.getText());
					int count=pr.executeUpdate();
					if(count==1)
					{
						JOptionPane.showMessageDialog(null, "Record added successfuly");
						textField_name.setText("");
						textField_username.setText("");
						textpassword.setText("");
						textField_email.setText("");
						textField_phone.setText("");
						textField_address.setText("");
						con.close();
					}
					else {
						JOptionPane.showMessageDialog(null, "No record added ");
						con.close();
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		btnSubmit.setBounds(125, 330, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				resetform();
			}
		});
		btnReset.setBounds(242, 330, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				closeForm();
			}
		});
		btnClose.setBounds(363, 330, 89, 23);
		contentPane.add(btnClose);
		
		textpassword = new JTextField();
		textpassword.setBounds(136, 126, 316, 20);
		contentPane.add(textpassword);
		textpassword.setColumns(10);
	}
}
