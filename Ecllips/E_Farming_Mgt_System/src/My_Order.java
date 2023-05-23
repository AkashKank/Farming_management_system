import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class My_Order extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_Order frame = new My_Order();
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
	public My_Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(0, 0, 1790, 75);
		contentPane.add(panel);
		
		JLabel lbl_logo = new JLabel("New label");
		lbl_logo.setIcon(new ImageIcon("D:\\Ecllips\\Image\\Efarm.jpg"));
		lbl_logo.setBounds(0, 0, 117, 75);
		panel.add(lbl_logo);
		
		JLabel lblHeader = new JLabel("Farming Management System");
		lblHeader.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblHeader.setBounds(127, 12, 355, 44);
		panel.add(lblHeader);
		
		JLabel lbl_Home = new JLabel("Home");
		lbl_Home.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_Home.setBounds(961, 21, 69, 28);
		panel.add(lbl_Home);
		
		JLabel lbl_AboutUs = new JLabel("About Us");
		lbl_AboutUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_AboutUs.setBounds(1061, 21, 91, 28);
		panel.add(lbl_AboutUs);
		
		JLabel lbl_Register = new JLabel("Register");
		lbl_Register.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_Register.setBounds(1174, 21, 81, 28);
		panel.add(lbl_Register);
		
		JLabel lbl_Login = new JLabel("Login");
		lbl_Login.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_Login.setBounds(1265, 21, 59, 28);
		panel.add(lbl_Login);
		
		JLabel lbl_ContactUs = new JLabel("Contact Us");
		lbl_ContactUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_ContactUs.setBounds(1334, 21, 105, 28);
		panel.add(lbl_ContactUs);
		
		JLabel lbl_OrderReport = new JLabel("|  Order Report");
		lbl_OrderReport.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_OrderReport.setBounds(122, 106, 156, 23);
		contentPane.add(lbl_OrderReport);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(60, 179, 113));
		panel_3.setBounds(0, 815, 1790, 90);
		contentPane.add(panel_3);
		setUndecorated(true);
	}

}
