import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutUsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUsFrame frame = new AboutUsFrame();
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
	public AboutUsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1600,900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(0, 0, 1790, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomeFrame hf = new HomeFrame();
				hf.setVisible(true);
				hf.setLocationRelativeTo(null);
				
				AboutUsFrame au = new AboutUsFrame();
				au.setVisible(false);
				dispose();
			}
		});
		lblHome.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBounds(961, 21, 69, 28);
		panel.add(lblHome);
		lblHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblAboutUs = new JLabel("About Us");
		lblAboutUs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AboutUsFrame au = new AboutUsFrame();
				au.setVisible(false);
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
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Eclipse\\Image\\Efarm.jpg"));
		lblNewLabel_2.setBounds(0, 0, 117, 75);
		panel.add(lblNewLabel_2);
		
		JLabel lblHeader = new JLabel("Farming Management System");
		lblHeader.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblHeader.setBounds(127, 12, 355, 44);
		panel.add(lblHeader);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterFrame rf = new RegisterFrame();
				rf.setVisible(true);
				rf.setLocationRelativeTo(null);
				
				AboutUsFrame au = new AboutUsFrame();
				au.setVisible(false);
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
		lblContactUs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ContactUSFrame cu = new ContactUSFrame();
				cu.setVisible(true);
				cu.setLocationRelativeTo(null);

				CustomerLoginFrame clf = new CustomerLoginFrame();
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
		panel_1.setBounds(100, 123, 1336, 610);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea taAboutUs = new JTextArea();
		taAboutUs.setText("Farming Store software has the capacity to help plan,organize,and manage resource pools and develop resourse estimates.Depending on the sophistication of the software,it can manage estimation and planning,scheduling,cost control and budget management,resourse allocation,collaboration software,communication,decision-making,quality management and documentation or administration sysytem.Today,numerous PC & browser based project management solution exist and they are finding their way into almost every type of business.\r\n\r\nThe origins of project management software are rooted in the 195os when Dupont Chemical collaborated with mainframe computer maker Remington Rand (Univac) to devise the Critical Path Method of network scheduling (CPM). This method was tested in 1958 with the construction of a major new chemical plant. In parallel, the US NAvy working together with Lockheed Aerospace devised the automated Project Evaluation Review Technique (PERT) for the Polaris Missile program that ran on the IBM mainframe. Mainframe and Mini coputers dominated the project management software arena until the early 198os when PC computers began to proliferate across business and government circles ailke.\r\n\r\nProject planning software cna be expected to provide information to various people or stakeholders, and can be used to measure and justify the level of effort required to complete the project(s).Typical requirements might include: ");
		taAboutUs.setFont(new Font("Century Gothic", Font.BOLD, 16));
		taAboutUs.setEditable(false);
		taAboutUs.setBounds(36, 115, 728, 440);
		panel_1.add(taAboutUs);
		taAboutUs.setLineWrap(true);
		
		JLabel lblNewLabel = new JLabel("|About Us");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(46, 41, 108, 44);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("E:\\Eclipse\\Image\\fruit2.jpg"));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(873, 64, 400, 220);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setIcon(new ImageIcon("E:\\Eclipse\\Image\\fruit4.jpg"));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(873, 330, 400, 220);
		panel_1.add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(0, 815, 1790, 90);
		contentPane.add(panel_2);
		setUndecorated(true);
	}
}
