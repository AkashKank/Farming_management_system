import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class All_Product extends JFrame {
	
	private int id;
	private int name;
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					All_Product frame = new All_Product();
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
	public All_Product() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(60, 179, 113));
		panel.setBounds(0, 0, 1790, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Logo = new JLabel("New label");
		lbl_Logo.setIcon(new ImageIcon("D:\\Ecllips\\Image\\Efarm.jpg"));
		lbl_Logo.setBounds(0, 0, 117, 75);
		panel.add(lbl_Logo);
		
		JLabel lblHeader = new JLabel("Farming Management System");
		lblHeader.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblHeader.setBounds(127, 12, 355, 44);
		panel.add(lblHeader);
		
		JLabel lbl_Home = new JLabel("Home");
		lbl_Home.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_Home.setBounds(961, 21, 69, 28);
		panel.add(lbl_Home);
		
		JLabel lbl_AboutUs = new JLabel("About Us");
		lbl_AboutUs.setBounds(1061, 21, 91, 28);
		panel.add(lbl_AboutUs);
		lbl_AboutUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(122, 163, 1320, 650);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(77, 39, 309, 264);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel photo1 = new JLabel("");
		photo1.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit1.jpg"));
		photo1.setBounds(10, 10, 289, 160);
		panel_2.add(photo1);
		
		JLabel lbl_Cabbages = new JLabel("Cabbages    Rs 1100.00/-");
		lbl_Cabbages.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lbl_Cabbages.setBounds(52, 180, 201, 31);
		panel_2.add(lbl_Cabbages);
		
		JButton btn_Cabbage_Buy = new JButton("Buy Product");
		btn_Cabbage_Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Cabbage_Buy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Details_Of_Product dop = new Details_Of_Product();
				dop.setVisible(true);
				
				dop.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		btn_Cabbage_Buy.setForeground(new Color(240, 248, 255));
		btn_Cabbage_Buy.setBackground(new Color(60, 179, 113));
		btn_Cabbage_Buy.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btn_Cabbage_Buy.setBounds(72, 213, 155, 28);
		panel_2.add(btn_Cabbage_Buy);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(506, 39, 309, 264);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel photo2 = new JLabel("");
		photo2.setVerticalAlignment(SwingConstants.BOTTOM);
		photo2.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit2.jpg"));
		photo2.setBounds(10, 10, 289, 160);
		panel_2_1.add(photo2);
		
		JLabel lbl_Tomato = new JLabel("Tomato    Rs 1100.00/-");
		lbl_Tomato.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lbl_Tomato.setBounds(68, 180, 170, 31);
		panel_2_1.add(lbl_Tomato);
		
		JButton btn_Tomato_Buy = new JButton("Buy Product");
		btn_Tomato_Buy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Details_Of_Product dop = new Details_Of_Product();
				dop.setVisible(true);
				
				dop.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_Tomato_Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Details_Of_Product j=new Details_Of_Product();
					j.setVisible(true);
			}
		});
		btn_Tomato_Buy.setForeground(new Color(240, 248, 255));
		btn_Tomato_Buy.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btn_Tomato_Buy.setBackground(new Color(60, 179, 113));
		btn_Tomato_Buy.setBounds(72, 213, 155, 28);
		panel_2_1.add(btn_Tomato_Buy);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(932, 39, 309, 264);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel photo3 = new JLabel("");
		photo3.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit4.jpg"));
		photo3.setBounds(10, 10, 289, 160);
		panel_2_2.add(photo3);
		
		JLabel lbl_Carrot = new JLabel("Carrot    Rs 1100.00/-");
		lbl_Carrot.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lbl_Carrot.setBounds(75, 180, 170, 31);
		panel_2_2.add(lbl_Carrot);
		
		JButton btn_Carrot_Buy = new JButton("Buy Product");
		btn_Carrot_Buy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Details_Of_Product dop = new Details_Of_Product();
				dop.setVisible(true);
				
				dop.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_Carrot_Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Details_Of_Product j=new Details_Of_Product();
				j.setVisible(true);
			}
		});
		btn_Carrot_Buy.setForeground(new Color(240, 248, 255));
		btn_Carrot_Buy.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btn_Carrot_Buy.setBackground(new Color(60, 179, 113));
		btn_Carrot_Buy.setBounds(72, 213, 155, 28);
		panel_2_2.add(btn_Carrot_Buy);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBounds(77, 347, 309, 264);
		panel_1.add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JLabel photo4 = new JLabel("");
		photo4.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit6.jpg"));
		photo4.setBounds(10, 10, 289, 160);
		panel_2_3.add(photo4);
		
		JLabel lbl_Potato = new JLabel("Potato    Rs 1100.00/-");
		lbl_Potato.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lbl_Potato.setBounds(75, 180, 162, 31);
		panel_2_3.add(lbl_Potato);
		
		JButton btn_Potato_Buy = new JButton("Buy Product");
		btn_Potato_Buy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Details_Of_Product dop = new Details_Of_Product();
				dop.setVisible(true);
				
				dop.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_Potato_Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Details_Of_Product j=new Details_Of_Product();
				j.setVisible(true);
			}
		});
		btn_Potato_Buy.setForeground(new Color(240, 248, 255));
		btn_Potato_Buy.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btn_Potato_Buy.setBackground(new Color(60, 179, 113));
		btn_Potato_Buy.setBounds(72, 213, 155, 28);
		panel_2_3.add(btn_Potato_Buy);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBounds(506, 347, 309, 264);
		panel_1.add(panel_2_4);
		panel_2_4.setLayout(null);
		
		JLabel photo5 = new JLabel("");
		photo5.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit5.jpg"));
		photo5.setBounds(10, 10, 289, 160);
		panel_2_4.add(photo5);
		
		JLabel lbl_Cauliflower = new JLabel("Cauliflower    Rs 1100.00/-");
		lbl_Cauliflower.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lbl_Cauliflower.setBounds(60, 180, 200, 31);
		panel_2_4.add(lbl_Cauliflower);
		
		JButton btn_Potato_Buy_1 = new JButton("Buy Product");
		btn_Potato_Buy_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Details_Of_Product dop = new Details_Of_Product();
				dop.setVisible(true);
				
				dop.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_Potato_Buy_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Details_Of_Product j=new Details_Of_Product();
				j.setVisible(true);
			}
		});
		btn_Potato_Buy_1.setForeground(new Color(240, 248, 255));
		btn_Potato_Buy_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btn_Potato_Buy_1.setBackground(new Color(60, 179, 113));
		btn_Potato_Buy_1.setBounds(72, 213, 155, 28);
		panel_2_4.add(btn_Potato_Buy_1);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBounds(932, 347, 309, 264);
		panel_1.add(panel_2_5);
		panel_2_5.setLayout(null);
		
		JLabel photo6 = new JLabel("");
		photo6.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit3.jpg"));
		photo6.setBounds(10, 10, 289, 160);
		panel_2_5.add(photo6);
		
		JLabel lbl_MixVegetables = new JLabel("Mix Vegetables    Rs 1100.00/-");
		lbl_MixVegetables.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lbl_MixVegetables.setBounds(41, 180, 234, 31);
		panel_2_5.add(lbl_MixVegetables);
		
		JButton btn_MixVegetables_Buy = new JButton("Buy Product");
		btn_MixVegetables_Buy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Details_Of_Product dop = new Details_Of_Product();
				dop.setVisible(true);
				
				dop.setLocationRelativeTo(null);
				dispose();
			}
		});
		btn_MixVegetables_Buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Details_Of_Product j=new Details_Of_Product();
				j.setVisible(true);
			}
		});
		btn_MixVegetables_Buy.setForeground(new Color(240, 248, 255));
		btn_MixVegetables_Buy.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btn_MixVegetables_Buy.setBackground(new Color(60, 179, 113));
		btn_MixVegetables_Buy.setBounds(72, 213, 155, 28);
		panel_2_5.add(btn_MixVegetables_Buy);
		
		JLabel lblNewLabel_1 = new JLabel("| All Products");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_1.setBounds(122, 106, 128, 23);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(60, 179, 113));
		panel_3.setBounds(0, 815, 1790, 90);
		contentPane.add(panel_3);
		setUndecorated(true);
	}
}
