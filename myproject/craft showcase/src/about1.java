

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class about1 extends JFrame {

	/**
	 * 
	 *///
	private JPanel contentPane;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void screen6() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about1 frame = new about1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void main(String args[]) {
		about1 a1=new about1();
		a1.screen6();
	}

	/**
	 * Create the frame.
	 */
	public about1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ABOUT US");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(269, 21, 206, 58);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(105, 105, 105));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0, 0, 720, 102);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrVgfgh = new JTextArea();
		txtrVgfgh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtrVgfgh.setForeground(new Color(0, 0, 0));
		txtrVgfgh.setText("   Craft is a special skill made by a process using \r\n   manual skills.\r\n   This site helps you to explore your ideas.\r\n   Use your ideas and skills to make something \r\n   and showcase your bright side of life here.\r\n   we can help you to showcase your products.\r\n   You just register in our site and showcase \r\n   your own product.\r\n   It helps to view other products and so you can \r\n   improve your skills.\r\n   Let's get started here...\r\n\r\n");
		txtrVgfgh.setBounds(310, 164, 319, 212);
		contentPane.add(txtrVgfgh);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(242, 134, 455, 272);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IS PART");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(32, 192, 86, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("CREATIVE");
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_1.setBounds(32, 302, 97, 27);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("CRAFT");
		lblNewLabel_3_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_2.setBounds(99, 140, 86, 27);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("OF THE");
		lblNewLabel_3_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_3.setBounds(99, 243, 86, 27);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("PROCESS");
		lblNewLabel_3_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3_4.setBounds(99, 362, 97, 27);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(new Color(0, 0, 0));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBounds(0, 106, 720, 314);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(313, 431, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
	}
}
