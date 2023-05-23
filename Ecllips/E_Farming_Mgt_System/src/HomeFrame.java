import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class HomeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1550, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(0, 0, 1790, 75);
		contentPane.add(panel);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblHome.setBounds(961, 21, 69, 28);
		panel.add(lblHome);
		lblHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblAboutus = new JLabel("About Us");
		lblAboutus.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblAboutus.setBounds(1061, 21, 91, 28);
		panel.add(lblAboutus);
		lblAboutus.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterFrame rf = new RegisterFrame();
				rf.setVisible(true);
				rf.setLocationRelativeTo(null);
				
				HomeFrame hf = new HomeFrame();
				hf.setVisible(false);
				dispose();
			}
		});
		lblRegister.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblRegister.setBounds(1174, 21, 81, 28);
		panel.add(lblRegister);
		lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblLogin.setBounds(1265, 21, 59, 28);
		panel.add(lblLogin);
		lblLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblContactus = new JLabel("Contact Us");
		lblContactus.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblContactus.setBounds(1334, 21, 105, 28);
		panel.add(lblContactus);
		lblContactus.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel = new JLabel("E-Farming Management System");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel.setBounds(127, 12, 355, 44);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\Efarm.jpg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 117, 75);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 73, 1550, 261);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\fruit.png"));
		lblNewLabel_3_1_1.setBounds(0, 0, 1550, 261);
		panel_1.add(lblNewLabel_3_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 220, 220));
		panel_2.setBounds(257, 398, 324, 206);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 324, 206);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\fruit2.jpg"));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(220, 220, 220));
		panel_2_1.setBounds(666, 398, 324, 206);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 324, 206);
		panel_2_1.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\fruit6.jpg"));
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(220, 220, 220));
		panel_2_2.setBounds(1069, 398, 324, 206);
		contentPane.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\fruit5.jpg"));
		lblNewLabel_6.setBounds(0, 0, 324, 206);
		panel_2_2.add(lblNewLabel_6);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBackground(new Color(220, 220, 220));
		panel_2_2_1.setBounds(1069, 646, 324, 206);
		contentPane.add(panel_2_2_1);
		panel_2_2_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\fruit3.jpg"));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(0, 0, 324, 206);
		panel_2_2_1.add(lblNewLabel_9);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(220, 220, 220));
		panel_2_1_1.setBounds(666, 646, 324, 206);
		contentPane.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\fruit4.jpg"));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(0, 0, 324, 206);
		panel_2_1_1.add(lblNewLabel_8);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(220, 220, 220));
		panel_2_3.setBounds(257, 646, 324, 206);
		contentPane.add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\fruit1.jpg"));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(0, 0, 324, 206);
		panel_2_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("| Our Products");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_5.setBounds(39, 361, 143, 31);
		contentPane.add(lblNewLabel_5);
		setUndecorated(true);
	}
}
