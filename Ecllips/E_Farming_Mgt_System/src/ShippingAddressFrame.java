import java.awt.EventQueue;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ShippingAddressFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfStreet;
	private JTextField tfCountry;
	private JTextField tfState;
	private JTextField tfCity;
	private JTextField tfPinCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShippingAddressFrame frame = new ShippingAddressFrame();
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
	public ShippingAddressFrame() {
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
		
		JLabel lblHeader = new JLabel("E-Farming Management System");
		lblHeader.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblHeader.setBounds(127, 12, 355, 44);
		panel.add(lblHeader);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 74, 1600, 67);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setForeground(new Color(46, 139, 87));
		lblHome.setBounds(95, 23, 54, 23);
		panel_1.add(lblHome);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("Century Gothic", Font.BOLD, 18));
	    lblHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblAboutUs = new JLabel("ABOUT US");
		lblAboutUs.setForeground(new Color(46, 139, 87));
		lblAboutUs.setBounds(228, 20, 86, 28);
		panel_1.add(lblAboutUs);
		lblAboutUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblAboutUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblDashboard = new JLabel("DASHBOARD");
		lblDashboard.setForeground(new Color(46, 139, 87));
		lblDashboard.setBounds(380, 20, 120, 28);
		panel_1.add(lblDashboard);
		lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblDashboard.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblShoppingMore = new JLabel("SHOPPING MORE");
		lblShoppingMore.setForeground(new Color(46, 139, 87));
		lblShoppingMore.setBounds(559, 20, 150, 28);
		panel_1.add(lblShoppingMore);
		lblShoppingMore.setFont(new Font("Century Gothic", Font.BOLD, 18));
		 lblShoppingMore.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblMyOrders = new JLabel("MY ORDERS");
		lblMyOrders.setForeground(new Color(46, 139, 87));
		lblMyOrders.setBounds(785, 20, 105, 28);
		panel_1.add(lblMyOrders);
		lblMyOrders.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyOrders.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblMyOrders.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblMyAccount = new JLabel("MY ACCOUNT");
		lblMyAccount.setForeground(new Color(46, 139, 87));
		lblMyAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyAccount.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblMyAccount.setBounds(967, 20, 131, 28);
		panel_1.add(lblMyAccount);
		lblMyAccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblContactUs = new JLabel("CONTACT US");
		lblContactUs.setForeground(new Color(46, 139, 87));
		lblContactUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblContactUs.setBounds(1160, 20, 131, 28);
		panel_1.add(lblContactUs);
		lblContactUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblLogOut = new JLabel("LOGOUT");
		lblLogOut.setForeground(new Color(46, 139, 87));
		lblLogOut.setBackground(new Color(46, 139, 87));
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblLogOut.setBounds(1340, 20, 131, 28);
		panel_1.add(lblLogOut);
		setUndecorated(true);
		lblLogOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 255, 250));
		panel_2.setBounds(0, 153, 1600, 622);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblShippingAddress = new JLabel("Shipping Address");
		lblShippingAddress.setBounds(42, 26, 200, 26);
		lblShippingAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblShippingAddress.setForeground(new Color(46, 139, 87));
		lblShippingAddress.setFont(new Font("Century Gothic", Font.BOLD, 20));
		panel_2.add(lblShippingAddress);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblName.setBounds(58, 100, 67, 28);
		panel_2.add(lblName);
		
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
		tfName.setBounds(58, 138, 634, 41);
		panel_2.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setHorizontalAlignment(SwingConstants.LEFT);
		lblStreet.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblStreet.setBounds(58, 228, 67, 28);
		panel_2.add(lblStreet);
		
		tfStreet = new JTextField();
		tfStreet.addKeyListener(new KeyAdapter() {
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
		tfStreet.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfStreet.setColumns(10);
		tfStreet.setBounds(58, 268, 634, 41);
		panel_2.add(tfStreet);
		
		JLabel lblState = new JLabel("State");
		lblState.setHorizontalAlignment(SwingConstants.LEFT);
		lblState.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblState.setBounds(834, 100, 58, 28);
		panel_2.add(lblState);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setHorizontalAlignment(SwingConstants.LEFT);
		lblCity.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblCity.setBounds(834, 228, 50, 28);
		panel_2.add(lblCity);
		
		tfCountry = new JTextField();
		tfCountry.addKeyListener(new KeyAdapter() {
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
		tfCountry.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfCountry.setColumns(10);
		tfCountry.setBounds(58, 402, 634, 41);
		panel_2.add(tfCountry);
		
		tfState = new JTextField();
		tfState.addKeyListener(new KeyAdapter() {
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
		tfState.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfState.setColumns(10);
		tfState.setBounds(834, 138, 634, 41);
		panel_2.add(tfState);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setHorizontalAlignment(SwingConstants.LEFT);
		lblCountry.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblCountry.setBounds(58, 364, 86, 28);
		panel_2.add(lblCountry);
		
		tfCity = new JTextField();
		tfCity.addKeyListener(new KeyAdapter() {
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
		tfCity.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfCity.setColumns(10);
		tfCity.setBounds(834, 268, 634, 41);
		panel_2.add(tfCity);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setHorizontalAlignment(SwingConstants.LEFT);
		lblPincode.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblPincode.setBounds(834, 364, 86, 28);
		panel_2.add(lblPincode);
		
		tfPinCode = new JTextField();
		tfPinCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String pincode = tfPinCode.getText();
				
				int length = pincode.length();
				
				char c = e.getKeyChar();
				
				if(e.getKeyChar() >= '0' && e.getKeyChar() <= '6')
				{
					if(length < 6)
					{
						tfPinCode.setEditable(true);
					}
					else
					{
						tfPinCode.setEditable(false);
					}
				}
				else
				{
					if(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE)
					{
						tfPinCode.setEditable(true);
					}
					else
					{
						tfPinCode.setEditable(false);
					}
				}
			}
		});
		tfPinCode.setFont(new Font("Century Gothic", Font.BOLD, 16));
		tfPinCode.setColumns(10);
		tfPinCode.setBounds(834, 402, 634, 41);
		panel_2.add(tfPinCode);
		
		JButton btnNewButton = new JButton("Proceed to Payment");
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name = tfName.getText();
				String Street = tfStreet.getText();
				String Country = tfCountry.getText();
				String State = tfState.getText();
				String City = tfCity.getText();
				String Pincode = tfPinCode.getText();
				
				try
				{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_e_farming_mgt_system", "root", "@Root123");
					String query = "Insert into shipping_address values(default, '" + Name + "', '" + Street + "', '" + Country + "', '" + State + "','" + City + "','" + Pincode + "')";		
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
					tfStreet.setText(null);
					tfCountry.setText(null);
					tfState.setText(null);
					tfCity.setText(null);
					tfPinCode.setText(null);
				}
				
				catch(Exception exception)
				{
					exception.printStackTrace();
				}
			
				

				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(661, 524, 208, 34);
		panel_2.add(btnNewButton);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(60, 179, 113));
		panel_2_1.setBounds(0, 821, 1790, 90);
		contentPane.add(panel_2_1);
	}

}
