import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
public class product extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea_2;
	private static product frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_13;
	private JTextField textField;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void screen5() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new product();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void main(String args[]) {
		 product p=new product();
		 p.screen5();
	 }
	

	/**
	 * Create the frame.
	 */
	public product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"You are sucessfully submitted");
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(333, 411, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("SHOWCASE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(290, 11, 197, 39);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(product.class.getResource("cra.jpg")));
		lblNewLabel_5.setBounds(20, 229, 241, 193);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Showcase your ");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setBounds(20, 86, 186, 39);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Bright side of life");
		lblNewLabel_7.setForeground(new Color(0, 0, 128));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_7.setBounds(82, 151, 186, 39);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBackground(new Color(233, 150, 122));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBounds(0, 55, 279, 402);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBackground(new Color(255, 99, 71));
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBounds(0, 0, 711, 55);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("SHOWCASE");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_10.setBounds(346, 28, 177, 31);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_12 = new JLabel("Product Name");
		lblNewLabel_12.setForeground(new Color(0, 0, 0));
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(333, 73, 101, 14);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_11 = new JLabel("Materials Used");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(333, 136, 101, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_13 = new JLabel("How to Make");
		lblNewLabel_13.setForeground(Color.BLACK);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(333, 239, 101, 14);
		contentPane.add(lblNewLabel_13);
		
		textField = new JTextField();
		textField.setBounds(332, 96, 321, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(333, 163, 320, 65);
		contentPane.add(textArea_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(333, 264, 321, 123);
		contentPane.add(textArea_1);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(569, 411, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBackground(new Color(255, 228, 196));
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setBounds(280, 55, 431, 402);
		contentPane.add(lblNewLabel_14);	
	}
}
