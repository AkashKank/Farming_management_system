import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerLoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsername;
	private JTextField tfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLoginFrame frame = new CustomerLoginFrame();
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
	public CustomerLoginFrame() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\Eclipse\\Image\\Efarm.jpg"));
		lblNewLabel.setBounds(0, 0, 117, 75);
		panel.add(lblNewLabel);
		
		JLabel lblHeader = new JLabel("Farming Management System");
		lblHeader.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblHeader.setBounds(127, 12, 355, 44);
		panel.add(lblHeader);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomeFrame hf = new HomeFrame();
				hf.setVisible(true);
				hf.setLocationRelativeTo(null);
				
				CustomerLoginFrame clf = new CustomerLoginFrame();
				clf.setVisible(false);
				dispose();
			}
		});
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblHome.setBounds(961, 21, 69, 28);
		panel.add(lblHome);
		lblHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblAboutUs = new JLabel("About Us");
		lblAboutUs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUsFrame au = new AboutUsFrame();
				au.setVisible(true);
				au.setLocationRelativeTo(null);
				
				CustomerLoginFrame clf = new CustomerLoginFrame();
				clf.setVisible(false);
				dispose();
			}
		});
		lblAboutUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblAboutUs.setBounds(1061, 21, 91, 28);
		panel.add(lblAboutUs);
		lblAboutUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblRegister.setBounds(1174, 21, 81, 28);
		panel.add(lblRegister);
		lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblLogin.setBounds(1265, 21, 59, 28);
		panel.add(lblLogin);
		lblLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblContactUs = new JLabel("Contact Us");
		lblContactUs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactUSFrame cu = new ContactUSFrame();
				cu.setVisible(true);
				cu.setLocationRelativeTo(null);
				
				CustomerLoginFrame  clf = new CustomerLoginFrame();
				clf.setVisible(false);
				dispose();
			}
		});
		lblContactUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblContactUs.setBounds(1334, 21, 105, 28);
		panel.add(lblContactUs);
		lblContactUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 255, 250));
		panel_1.setBounds(288, 137, 959, 604);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCustomerLogin = new JLabel("Customer Login");
		lblCustomerLogin.setBounds(382, 10, 185, 26);
		lblCustomerLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerLogin.setFont(new Font("Century Gothic", Font.BOLD, 22));
		panel_1.add(lblCustomerLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblUsername.setBounds(240, 184, 134, 28);
		panel_1.add(lblUsername);
		
		tfUsername = new JTextField();
		tfUsername.setFont(new Font("Century Gothic", Font.BOLD, 18));
		tfUsername.addKeyListener(new KeyAdapter() {
			
		});
		tfUsername.setBounds(264, 235, 441, 34);
		panel_1.add(tfUsername);
		tfUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblPassword.setBounds(240, 318, 134, 28);
		panel_1.add(lblPassword);
		
		tfPassword = new JTextField();
		tfPassword.setFont(new Font("Century Gothic", Font.BOLD, 18));
		tfPassword.setColumns(10);
		tfPassword.setBounds(264, 370, 441, 34);
		panel_1.add(tfPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(60, 179, 113));
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_e_farming_mgt_system", "root", "@Root123");
					Statement stmt=con.createStatement();
					String sql="Select * from customer_login where Username='"+tfUsername.getText()+"' and Password='"+tfPassword.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
						JOptionPane.showMessageDialog(null, "Login Suessfully...");
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username and Password...");
					con.close();
					tfUsername.setText(null);
					tfPassword.setText(null);
				}catch(Exception ex) {System.out.print(ex);} 
			}
		});
		btnLogin.setFont(new Font("Cambria", Font.BOLD, 18));
		btnLogin.setBounds(418, 482, 164, 34);
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Priyanka\\Downloads\\Everaldo-Crystal-Clear-App-login-manager.128.png"));
		lblNewLabel_1.setBounds(413, 56, 119, 115);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Don't have an account? Register Now");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterFrame rf = new RegisterFrame();
				rf.setVisible(true);
				rf.setLocationRelativeTo(null);
				dispose();
			}
		});
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 14));
		lblNewLabel_2.setBounds(388, 535, 246, 26);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(0, 810, 1790, 90);
		contentPane.add(panel_2);
		setUndecorated(true);
	}
}
