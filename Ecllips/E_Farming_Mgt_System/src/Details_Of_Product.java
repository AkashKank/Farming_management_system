import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Statement;

import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Details_Of_Product extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField txt_Price;
	private JTextField txt_Quantity;
	private JTextField txt_Total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details_Of_Product frame = new Details_Of_Product();
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
	public Details_Of_Product() {
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(60, 179, 113));
		panel_3.setBounds(0, 815, 1790, 90);
		contentPane.add(panel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 255, 250));
		panel_1.setBounds(118, 100, 1326, 67);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_Home_1 = new JLabel("HOME");
		lbl_Home_1.setForeground(new Color(60, 179, 113));
		lbl_Home_1.setBounds(66, 16, 69, 28);
		panel_1.add(lbl_Home_1);
		lbl_Home_1.setFont(new Font("Century Gothic", Font.BOLD, 19));
		
		JLabel lbl_AboutUs_1 = new JLabel("ABOUT US");
		lbl_AboutUs_1.setForeground(new Color(60, 179, 113));
		lbl_AboutUs_1.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lbl_AboutUs_1.setBounds(200, 16, 94, 28);
		panel_1.add(lbl_AboutUs_1);
		
		JLabel lbl_AllProducts_1 = new JLabel("ALL PRODUCTS");
		lbl_AllProducts_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				All_Product dop = new All_Product();
				dop.setVisible(true);
				
				dop.setLocationRelativeTo(null);
				dispose();
			}
		});
		lbl_AllProducts_1.setForeground(new Color(60, 179, 113));
		lbl_AllProducts_1.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lbl_AllProducts_1.setBounds(375, 16, 134, 28);
		panel_1.add(lbl_AllProducts_1);
		
		JLabel lbl_ShopByCategory_1 = new JLabel("SHOP BY CATEGORY");
		lbl_ShopByCategory_1.setForeground(new Color(60, 179, 113));
		lbl_ShopByCategory_1.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lbl_ShopByCategory_1.setBounds(580, 16, 192, 28);
		panel_1.add(lbl_ShopByCategory_1);
		
		JLabel lbl_Register_1 = new JLabel("REGISTER");
		lbl_Register_1.setForeground(new Color(60, 179, 113));
		lbl_Register_1.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lbl_Register_1.setBounds(845, 16, 94, 28);
		panel_1.add(lbl_Register_1);
		
		JLabel lbl_Login_1 = new JLabel("LOGIN");
		lbl_Login_1.setForeground(new Color(60, 179, 113));
		lbl_Login_1.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lbl_Login_1.setBounds(998, 16, 69, 28);
		panel_1.add(lbl_Login_1);
		
		JLabel lbl_ContactUs_1 = new JLabel("CONTACT US");
		lbl_ContactUs_1.setForeground(new Color(60, 179, 113));
		lbl_ContactUs_1.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lbl_ContactUs_1.setBounds(1127, 16, 127, 28);
		panel_1.add(lbl_ContactUs_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(118, 191, 1326, 603);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbl_photo = new JLabel("");
		lbl_photo.setBounds(22, 57, 352, 467);
		lbl_photo.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit.jpg"));
		panel_2.add(lbl_photo);
		
		JLabel lbl_DetailsOfCabbages = new JLabel("|  Details of Cabbages");
		lbl_DetailsOfCabbages.setBounds(10, 15, 225, 23);
		panel_2.add(lbl_DetailsOfCabbages);
		lbl_DetailsOfCabbages.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		JLabel lbl_photo_2 = new JLabel("");
		lbl_photo_2.setBounds(953, 0, 352, 267);
		lbl_photo_2.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit4.jpg"));
		panel_2.add(lbl_photo_2);
		
		JLabel lbl_photo_3 = new JLabel("");
		lbl_photo_3.setBounds(953, 290, 352, 267);
		lbl_photo_3.setIcon(new ImageIcon("D:\\Ecllips\\Image\\fruit6.jpg"));
		panel_2.add(lbl_photo_3);
		
		table = new JTable();
		table.setBounds(429, 537, 484, -513);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(916, 525, -522, -524);
		table_1.setBackground(new Color(0, 206, 209));
		panel_2.add(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"Dratails Of Cabbage"
			}
		));
		table_2.getColumnModel().getColumn(0).setMinWidth(48);
		table_2.setBounds(927, 525, -533, -524);
		panel_2.add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(560, 147, 1, 1);
		panel_2.add(table_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(397, 62, 525, 435);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel pnl1 = new JPanel();
		pnl1.setBackground(new Color(105, 105, 105));
		pnl1.setBounds(0, 0, 525, 54);
		panel_4.add(pnl1);
		pnl1.setLayout(null);
		
		JLabel lbl_DetailsCabbages = new JLabel("Details Of Product");
		lbl_DetailsCabbages.setForeground(new Color(255, 255, 255));
		lbl_DetailsCabbages.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lbl_DetailsCabbages.setBounds(156, 10, 207, 34);
		pnl1.add(lbl_DetailsCabbages);
		
		JPanel pnl1_1 = new JPanel();
		pnl1_1.setBackground(new Color(169, 169, 169));
		pnl1_1.setBounds(0, 52, 525, 54);
		panel_4.add(pnl1_1);
		pnl1_1.setLayout(null);
		
		JLabel lbl_Name = new JLabel("Name");
		lbl_Name.setBounds(20, 21, 100, 23);
		lbl_Name.setFont(new Font("Century Gothic", Font.BOLD, 18));
		pnl1_1.add(lbl_Name);
		
		JComboBox cmb_Name = new JComboBox();
		cmb_Name.setEditable(true);
		cmb_Name.setFont(new Font("Century Gothic", Font.BOLD, 18));
		cmb_Name.setModel(new DefaultComboBoxModel(new String[] {"Tomato", "Poatato", "Cauliflower", "Cabbage", "Carrot"}));
		cmb_Name.setBounds(235, 21, 225, 26);
		pnl1_1.add(cmb_Name);
		
		JPanel pnl1_1_1 = new JPanel();
		pnl1_1_1.setBackground(new Color(169, 169, 169));
		pnl1_1_1.setBounds(0, 152, 525, 54);
		panel_4.add(pnl1_1_1);
		pnl1_1_1.setLayout(null);
		
		JLabel lbl_Type = new JLabel("Type");
		lbl_Type.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_Type.setBounds(23, 13, 62, 23);
		pnl1_1_1.add(lbl_Type);
		
		JComboBox cmb_Type = new JComboBox();
		cmb_Type.setModel(new DefaultComboBoxModel(new String[] {"Big", "Mini", "Medium"}));
		cmb_Type.setFont(new Font("Century Gothic", Font.BOLD, 18));
		cmb_Type.setEditable(true);
		cmb_Type.setBounds(236, 11, 225, 26);
		pnl1_1_1.add(cmb_Type);
		
		JPanel pnl1_1_1_1 = new JPanel();
		pnl1_1_1_1.setBackground(new Color(169, 169, 169));
		pnl1_1_1_1.setBounds(0, 254, 525, 54);
		panel_4.add(pnl1_1_1_1);
		pnl1_1_1_1.setLayout(null);
		
		JLabel lbl_Quantity = new JLabel("Quantity");
		lbl_Quantity.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_Quantity.setBounds(24, 13, 90, 23);
		pnl1_1_1_1.add(lbl_Quantity);
		
		txt_Quantity = new JTextField();
		txt_Quantity.setFont(new Font("Century Gothic", Font.BOLD, 18));
		txt_Quantity.setColumns(10);
		txt_Quantity.setBounds(118, 13, 124, 26);
		pnl1_1_1_1.add(txt_Quantity);
		
		JLabel lbl_Quantity_1 = new JLabel("Toatal");
		lbl_Quantity_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_Quantity_1.setBounds(262, 13, 90, 23);
		pnl1_1_1_1.add(lbl_Quantity_1);
		
		txt_Total = new JTextField();
		txt_Total.setFont(new Font("Century Gothic", Font.BOLD, 18));
		txt_Total.setColumns(10);
		txt_Total.setBounds(333, 13, 124, 26);
		pnl1_1_1_1.add(txt_Total);
		
		JLabel lbl_Company = new JLabel("Company");
		lbl_Company.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_Company.setBounds(21, 119, 100, 23);
		panel_4.add(lbl_Company);
		
		JLabel lbl_price = new JLabel("Price");
		lbl_price.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lbl_price.setBounds(21, 221, 62, 23);
		panel_4.add(lbl_price);
		
		txt_Price = new JTextField();
		txt_Price.setFont(new Font("Century Gothic", Font.BOLD, 18));
		txt_Price.setColumns(10);
		txt_Price.setBounds(235, 216, 229, 26);
		panel_4.add(txt_Price);
		
		JLabel lbl_Name_1 = new JLabel("Description : A supermarket is a self-service shop offering a wide variety of food,beverages and household products,organised into sections and shelves.It is larger and has a wider select");
		lbl_Name_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lbl_Name_1.setBounds(21, 331, 464, 94);
		panel_4.add(lbl_Name_1);
		
		JComboBox cmb_Company = new JComboBox();
		cmb_Company.setModel(new DefaultComboBoxModel(new String[] {"Agrofresh", "Himmam", "Veggiegood", "FreshFarm"}));
		cmb_Company.setFont(new Font("Century Gothic", Font.BOLD, 18));
		cmb_Company.setEditable(true);
		cmb_Company.setBounds(235, 116, 225, 26);
		panel_4.add(cmb_Company);
		
		JButton btn_AddToCart = new JButton("Add To Cart");
		btn_AddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = cmb_Name.getSelectedItem().toString();
                String company = cmb_Company.getSelectedItem().toString();
                String type = cmb_Type.getSelectedItem().toString();
                String price = txt_Price.getText();
                String quantity = txt_Quantity.getText();
                String total = txt_Total.getText();
                
			}       
		});
		btn_AddToCart.setBounds(725, 515, 197, 42);
		btn_AddToCart.setBackground(new Color(60, 179, 113));
		btn_AddToCart.setForeground(new Color(255, 255, 255));
		btn_AddToCart.setFont(new Font("Century Gothic", Font.BOLD, 18));
		panel_2.add(btn_AddToCart);
		
		
		JButton btn_Calculate = new JButton("Calculate");
		btn_Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String a = String.parseString(txt_Name.getText());
				int b=Integer.parseInt(txt_Quantity.getText());
				double c=Double.parseDouble(txt_Price.getText());
				double amt=b*c;
				txt_Total.setText(""+amt);
				
				
			}
		});
		btn_Calculate.setForeground(Color.WHITE);
		btn_Calculate.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btn_Calculate.setBackground(new Color(60, 179, 113));
		btn_Calculate.setBounds(467, 515, 197, 42);
		panel_2.add(btn_Calculate);
		setUndecorated(true);
	}
}
