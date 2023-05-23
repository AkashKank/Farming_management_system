import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class AddCard extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCard frame = new AddCard();
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
	public AddCard() {
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
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 74, 1600, 67);
		contentPane.add(panel_1);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setForeground(new Color(46, 139, 87));
		lblHome.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblHome.setBounds(95, 23, 54, 23);
		panel_1.add(lblHome);
	    lblHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblAboutUs = new JLabel("ABOUT US");
		lblAboutUs.setForeground(new Color(46, 139, 87));
		lblAboutUs.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblAboutUs.setBounds(228, 20, 86, 28);
		panel_1.add(lblAboutUs);
		lblAboutUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblDashboard = new JLabel("DASHBOARD");
		lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard.setForeground(new Color(46, 139, 87));
		lblDashboard.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblDashboard.setBounds(380, 20, 120, 28);
		panel_1.add(lblDashboard);
		lblDashboard.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblShoppingMore = new JLabel("SHOPPING MORE");
		lblShoppingMore.setForeground(new Color(46, 139, 87));
		lblShoppingMore.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblShoppingMore.setBounds(559, 20, 150, 28);
		panel_1.add(lblShoppingMore);
		lblShoppingMore.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblMyOrders = new JLabel("MY ORDERS");
		lblMyOrders.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyOrders.setForeground(new Color(46, 139, 87));
		lblMyOrders.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblMyOrders.setBounds(785, 20, 105, 28);
		panel_1.add(lblMyOrders);
		lblMyOrders.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblMyAccount = new JLabel("MY ACCOUNT");
		lblMyAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyAccount.setForeground(new Color(46, 139, 87));
		lblMyAccount.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblMyAccount.setBounds(967, 20, 131, 28);
		panel_1.add(lblMyAccount);
		lblMyAccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblContactUs = new JLabel("CONTACT US");
		lblContactUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactUs.setForeground(new Color(46, 139, 87));
		lblContactUs.setFont(new Font("Century Gothic", Font.BOLD, 18)); 
		lblContactUs.setBounds(1160, 20, 131, 28);
		panel_1.add(lblContactUs);
		lblContactUs.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblLogOut = new JLabel("LOGOUT");
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setForeground(new Color(46, 139, 87));
		lblLogOut.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblLogOut.setBackground(new Color(46, 139, 87));
		lblLogOut.setBounds(1340, 20, 131, 28);
		panel_1.add(lblLogOut);
		lblLogOut.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		table = new JTable();
		table.setBounds(239, 277, 616, -36);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setFont(new Font("Century Gothic", Font.BOLD, 26));
		scrollPane.setBounds(96, 200, 1353, 508);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Sr.No",  "Tital", "Price Per Unit", "No.of Items", "Total", 
			}
		));
		
		JLabel lblAllCartItems = new JLabel("All Cart Items");
		lblAllCartItems.setHorizontalAlignment(SwingConstants.LEFT);
		lblAllCartItems.setForeground(new Color(46, 139, 87));
		lblAllCartItems.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblAllCartItems.setBounds(96, 151, 125, 28);
		contentPane.add(lblAllCartItems);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBounds(96, 711, 1353, 49);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTotalAmount = new JLabel("Total Amount   =");
		lblTotalAmount.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblTotalAmount.setBounds(1002, 10, 160, 29);
		panel_2.add(lblTotalAmount);
		
		JLabel lblNewLabel_1 = new JLabel("RS 0000");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_1.setBounds(1185, 10, 74, 28);
		panel_2.add(lblNewLabel_1);
		
		JButton btnCountinueShopping = new JButton("Countinue Shopping");
		btnCountinueShopping.setBackground(new Color(60, 179, 113));
		btnCountinueShopping.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnCountinueShopping.setBounds(966, 778, 226, 41);
		contentPane.add(btnCountinueShopping);
		
		JButton btnProceedToCheckout = new JButton("Proceed To Checkout");
		btnProceedToCheckout.setBackground(new Color(60, 179, 113));
		btnProceedToCheckout.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnProceedToCheckout.setBounds(1202, 778, 247, 41);
		contentPane.add(btnProceedToCheckout);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(60, 179, 113));
		panel_2_1.setBounds(0, 837, 1790, 90);
		contentPane.add(panel_2_1);
		 JTableHeader Theader = table_1.getTableHeader();
		 Theader.setFont(new Font("Century Gothic",Font.BOLD,16));
		 Theader.setBackground(Color.BLACK);
		 Theader.setForeground(Color.white);
		 
		 
		 
		setUndecorated(true);
	}
}
