import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.font.TextAttribute;
import java.util.Map;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumber;
	private JTextField tfEmail;
	private JTextField tfPincode;
	private JTextField tfName;
	private JPasswordField pfPass;
	private JPasswordField pfConfirmPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame frame = new RegisterFrame();
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
	public RegisterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1550, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(0, 0, 1790, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E-Farming Management System");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel.setBounds(127, 12, 355, 44);
		panel.add(lblNewLabel);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomeFrame hf = new HomeFrame();
				hf.setVisible(true);
				hf.setLocationRelativeTo(null);
			    RegisterFrame r = new RegisterFrame();	
			    r.setVisible(false);
			    dispose();
			}
		});
		lblHome.setBounds(961, 21, 69, 28);
		panel.add(lblHome);
		lblHome.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblAboutus = new JLabel("About Us");
		lblAboutus.setBounds(1061, 21, 91, 28);
		panel.add(lblAboutus);
		lblAboutus.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblAboutus.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(1174, 21, 81, 28);
		panel.add(lblRegister);
		lblRegister.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(1265, 21, 59, 28);
		panel.add(lblLogin);
		lblLogin.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblContactus = new JLabel("Contact Us");
		lblContactus.setBounds(1334, 21, 105, 28);
		panel.add(lblContactus);
		lblContactus.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblContactus.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\Downloads\\Efarm.jpg"));
		lblNewLabel_1.setBounds(0, 0, 117, 75);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		panel_1.setBounds(388, 99, 690, 684);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeader = new JLabel("Register");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Century Gothic", Font.BOLD, 28));
		lblHeader.setBounds(276, 10, 147, 43);
		panel_1.add(lblHeader);
		
		JLabel lblSubHeader1 = new JLabel("Personal Details");
		lblSubHeader1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubHeader1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblSubHeader1.setBounds(266, 74, 168, 27);
		Font font = lblSubHeader1.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblSubHeader1.setFont(font.deriveFont(attributes));
		panel_1.add(lblSubHeader1);
		
		JLabel lblNumber = new JLabel("Mobile Number");
		lblNumber.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNumber.setBounds(363, 131, 168, 23);
		panel_1.add(lblNumber);
		
		tfNumber = new JTextField();
		tfNumber.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfNumber.setColumns(10);
		tfNumber.setBounds(363, 166, 273, 27);
		panel_1.add(tfNumber);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblPassword.setBounds(26, 214, 125, 27);
		panel_1.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblConfirmPassword.setBounds(363, 216, 184, 23);
		panel_1.add(lblConfirmPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblEmail.setBounds(26, 300, 125, 27);
		panel_1.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfEmail.setColumns(10);
		tfEmail.setBounds(26, 337, 273, 27);
		panel_1.add(tfEmail);
		
		JLabel lblName = new JLabel("Full Name");
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblName.setBounds(28, 129, 125, 27);
		panel_1.add(lblName);
		
		JLabel lblSubHeader2 = new JLabel("Address Details");
		lblSubHeader2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubHeader2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblSubHeader2.setBounds(266, 389, 168, 27);
		Font font1 = lblSubHeader2.getFont();
		Map attributes1 = font1.getAttributes();
		attributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblSubHeader2.setFont(font.deriveFont(attributes1));
		panel_1.add(lblSubHeader2);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblState.setBounds(28, 437, 125, 27);
		panel_1.add(lblState);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblCity.setBounds(363, 439, 168, 23);
		panel_1.add(lblCity);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblPincode.setBounds(26, 524, 125, 27);
		panel_1.add(lblPincode);
		
		JLabel lblAddress = new JLabel("Full Address");
		lblAddress.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblAddress.setBounds(363, 524, 184, 23);
		panel_1.add(lblAddress);
		
		tfPincode = new JTextField();
		tfPincode.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfPincode.setColumns(10);
		tfPincode.setBounds(26, 573, 273, 27);
		panel_1.add(tfPincode);
		
		JButton btnSubmit = new JButton("Submit Registration");
		btnSubmit.setBackground(new Color(102, 205, 170));
		btnSubmit.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnSubmit.setBounds(132, 630, 193, 32);
		panel_1.add(btnSubmit);
		btnSubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btnResetForm = new JButton("Reset Form");
		btnResetForm.setBackground(new Color(102, 205, 170));
		btnResetForm.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnResetForm.setBounds(351, 630, 193, 32);
		panel_1.add(btnResetForm);
		btnResetForm.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		tfName = new JTextField();
		tfName.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfName.setColumns(10);
		tfName.setBounds(26, 166, 273, 27);
		panel_1.add(tfName);
		
		pfPass = new JPasswordField();
		pfPass.setFont(new Font("Century Gothic", Font.BOLD, 12));
		pfPass.setHorizontalAlignment(SwingConstants.LEFT);
		pfPass.setBounds(26, 254, 273, 27);
		panel_1.add(pfPass);
		
		pfConfirmPass = new JPasswordField();
		pfConfirmPass.setHorizontalAlignment(SwingConstants.LEFT);
		pfConfirmPass.setFont(new Font("Century Gothic", Font.BOLD, 12));
		pfConfirmPass.setBounds(363, 254, 273, 27);
		panel_1.add(pfConfirmPass);
		
		JComboBox cmbState = new JComboBox();
		cmbState.setFont(new Font("Century Gothic", Font.BOLD, 13));
		cmbState.setModel(new DefaultComboBoxModel(new String[] {"Maharashtra", "Gujrat", "Andhra Pradesh", "Jammu Kashmir", "Arunachal Pradesh"}));
		cmbState.setBounds(26, 474, 273, 27);
		panel_1.add(cmbState);
		
		JComboBox cmbCity = new JComboBox();
		cmbCity.setModel(new DefaultComboBoxModel(new String[] {"Sangli", "Kolhapur", "Karad", "Pune"}));
		cmbCity.setFont(new Font("Century Gothic", Font.BOLD, 13));
		cmbCity.setBounds(363, 472, 273, 27);
		panel_1.add(cmbCity);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Century Gothic", Font.BOLD, 12));
		textArea.setBounds(363, 559, 245, 43);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(0, 805, 1790, 75);
		contentPane.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 1074, 1607, -1070);
		contentPane.add(scrollPane);
		
		setUndecorated(true);
	}
}
