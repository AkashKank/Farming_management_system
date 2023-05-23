import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContactUSFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPhoneNo;
	private JTextField tfMessage;

	/**
	 * Launch the application.
	 */
	static int cnt = 1;
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUSFrame frame = new ContactUSFrame();
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
	public ContactUSFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1790, 75);
		panel.setBackground(new Color(60, 179, 113));
		contentPane.add(panel);
		panel.setLayout(null);
		
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
				
				ContactUSFrame cu = new ContactUSFrame();
				cu.setVisible(false);
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
				
				ContactUSFrame cu = new ContactUSFrame();
				cu.setVisible(false);
				dispose();
			}
		});
		lblAboutUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblAboutUs.setBounds(1061, 21, 91, 28);
		panel.add(lblAboutUs);
		lblAboutUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterFrame rf = new RegisterFrame();
				rf.setVisible(true);
				rf.setLocationRelativeTo(null);
				
				ContactUSFrame cu = new ContactUSFrame();
				cu.setVisible(false);
				dispose();
			}
		});
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblRegister.setBounds(1162, 21, 81, 28);
		panel.add(lblRegister);
		lblRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CustomerLoginFrame clf = new CustomerLoginFrame();
				clf.setVisible(true);
				clf.setLocationRelativeTo(null);
				
				ContactUSFrame cu = new ContactUSFrame();
				cu.setVisible(false);
				dispose();
			}
		});
		lblLogin.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblLogin.setBounds(1265, 21, 59, 28);
		panel.add(lblLogin);
		lblLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblContactUs = new JLabel("Contact Us");
		lblContactUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblContactUs.setBounds(1334, 21, 105, 28);
		panel.add(lblContactUs);
		lblContactUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(97, 106, 1357, 684);
		panel_1.setBackground(new Color(245, 255, 250));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("| Contact Us");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(46, 41, 152, 44);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblName.setBounds(58, 122, 74, 28);
		panel_1.add(lblName);
		
		tfName = new JTextField();
		tfName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char c = e.getKeyChar();
				
				if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
				{
					tfName.setEditable(true);
				}
				else
				{
					tfName.setEditable(false);
				}
			}
		});
		tfName.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfName.setBounds(58, 173, 688, 37);
		panel_1.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblEmail.setBounds(58, 237, 74, 28);
		panel_1.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfEmail.setColumns(10);
		tfEmail.setBounds(58, 287, 688, 37);
		panel_1.add(tfEmail);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNo.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblPhoneNo.setBounds(58, 352, 113, 28);
		panel_1.add(lblPhoneNo);
		
		tfPhoneNo = new JTextField();
		tfPhoneNo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String phoneno = tfPhoneNo.getText();
				
				int length = phoneno.length();
				
				char c = e.getKeyChar();
				
				if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9')
				{
					if(length < 10)
					{
						tfPhoneNo.setEditable(true);
					}
					else
					{
						tfPhoneNo.setEditable(false);
					}
				}
				else
				{
					if(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE)
					{
						tfPhoneNo.setEditable(true);
					}
					else
					{
						tfPhoneNo.setEditable(false);
					}
				}
					
			}
		});
		tfPhoneNo.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfPhoneNo.setColumns(10);
		tfPhoneNo.setBounds(58, 402, 688, 37);
		panel_1.add(tfPhoneNo);
		
		JLabel lblMessage = new JLabel("Message");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblMessage.setBounds(58, 463, 113, 28);
		panel_1.add(lblMessage);
		
		tfMessage = new JTextField();
		tfMessage.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char c = e.getKeyChar();
				
				if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
				{
					tfMessage.setEditable(true);
				}
				else
				{
					tfMessage.setEditable(false);
				}
			}
		});
		tfMessage.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfMessage.setColumns(10);
		tfMessage.setBounds(58, 518, 688, 76);
		panel_1.add(tfMessage);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Eclipse\\Image\\fruit3.jpg"));
		lblNewLabel_2.setBounds(885, 81, 407, 243);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\Eclipse\\Image\\fruit5.jpg"));
		lblNewLabel_2_1.setBounds(885, 370, 407, 243);
		panel_1.add(lblNewLabel_2_1);
		
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name = tfName.getText();
				String Email = tfEmail.getText();
				String PhoneNo = tfPhoneNo.getText();
				String Message = tfMessage.getText();
			
				try
				{
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_e_farming_mgt_system", "root", "@Root123");
					String query = "Insert into contact_us values(default,'" + Name + "','" + Email + "','" + PhoneNo + "','" + Message + "')";
					Statement st = con.createStatement();
					int x = st.executeUpdate(query);
					
					if(x==0)
					{
						JOptionPane.showMessageDialog(btnNewButton,"This is already exist");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Thank you for submitting your response","Submit",JOptionPane.INFORMATION_MESSAGE);
		
					}
					con.close();
					tfName.setText(null);
					tfEmail.setText(null);
					tfPhoneNo.setText(null);
					tfMessage.setText(null);
					
				}
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			
			}
		});
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnNewButton.setBounds(288, 623, 127, 37);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(0, 830, 1790, 90);
		contentPane.add(panel_2);
		setUndecorated(true);
	}
}
