
import java.awt.EventQueue;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class admin extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;
	private static admin frame;

	/**
	 * Launch the application.
	 */
	public static void screen1(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void main(String args[]) {
		 admin  a=new admin();
		 a.screen1();
	 }
	
	

	/**
	 * Create the frame.
	 */
	public admin() {
		setBackground(new Color(245, 245, 245));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 484);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(372, 136, 96, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(372, 214, 75, 23);
		contentPane.add(lblNewLabel_1); 
		
		username = new JTextField();
		username.setBounds(506, 139, 147, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(506, 217, 147, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname=username.getText();
				String pswd=passwordField.getText();
				
				if(uname.equals("name")&&pswd.equals("password"))
				{
					JOptionPane.showMessageDialog(frame,"You are sucessfully logined");
					setVisible(false);
					
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"Invalid username or password");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(446, 296, 107, 23);
		contentPane.add(btnNewButton);
		JLabel lblNewLabel_2 = new JLabel(" Login");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(446, 43, 112, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(Color.YELLOW);
		lblNewLabel_3.setBounds(362, 102, 308, 252);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBounds(352, 101, 316, 267);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(new Color(255, 215, 0));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBounds(314, 0, 379, 445);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(54, 81, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(0, 128, 0));
		label.setIcon(new ImageIcon(admin.class.getResource("pro7.jpg")));
		label.setBounds(83, 102, 163, 228);
		contentPane.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(0, 128, 0));
		lblNewLabel_4.setBounds(0, 0, 316, 445);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		
		
	}
}
