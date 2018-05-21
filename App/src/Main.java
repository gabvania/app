import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {
	
	private JPanel contentPane;
	int xx, xy;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setUndecorated(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void close() {

		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

	}

	public Main() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 535, 500);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				Main.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 150, 534);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 175, 134);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/image/profile1.png")));
		lblNewLabel.setBounds(0, 52, 46, 41);
		panel_1.add(lblNewLabel);

		JLabel lblProfile = new JLabel("Welcome,");
		lblProfile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProfile.setBounds(52, 45, 99, 25);
		panel_1.add(lblProfile);

		JLabel lblName = new JLabel(".......................");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(52, 79, 64, 14);
		panel_1.add(lblName);

		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setForeground(Color.WHITE);
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSaldo.setBounds(21, 160, 46, 14);
		panel.add(lblSaldo);

		JLabel lblTopUp = new JLabel("Top Up");
		lblTopUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				close();
				TopUp tu = new TopUp();
				tu.setUndecorated(true);
				tu.setVisible(true);
			}
		});
		lblTopUp.setForeground(Color.WHITE);
		lblTopUp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTopUp.setBounds(21, 190, 46, 24);
		panel.add(lblTopUp);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 225, 130, 14);
		panel.add(separator);

		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHome.setBounds(21, 250, 46, 14);
		panel.add(lblHome);

		JLabel lblWallet = new JLabel("Wallet");
		lblWallet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				close();
				Saldo saldo = new Saldo();
				saldo.setUndecorated(true);
				saldo.setVisible(true);
			}
		});
		lblWallet.setForeground(Color.WHITE);
		lblWallet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWallet.setBounds(21, 290, 46, 14);
		panel.add(lblWallet);

		JLabel lblWishlist = new JLabel("Wishlist");
		lblWishlist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				close();
				WishList wl = new WishList();
				wl.setUndecorated(true);
				wl.setVisible(true);
			}
		});
		lblWishlist.setForeground(Color.WHITE);
		lblWishlist.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWishlist.setBounds(21, 330, 46, 14);
		panel.add(lblWishlist);

		JFormattedTextField frmtdtxtfldSearch = new JFormattedTextField();
		frmtdtxtfldSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmtdtxtfldSearch.setHorizontalAlignment(SwingConstants.RIGHT);
		frmtdtxtfldSearch.setForeground(Color.BLACK);
		frmtdtxtfldSearch.setText("Search");
		frmtdtxtfldSearch.setBounds(177, 23, 227, 20);
		contentPane.add(frmtdtxtfldSearch);

		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				close();
				Home home = new Home();
				home.setUndecorated(true);
				home.setVisible(true);
			}
		});

		btnSignOut.setForeground(Color.BLACK);
		btnSignOut.setBackground(Color.WHITE);
		btnSignOut.setBounds(412, 70, 92, 20);
		contentPane.add(btnSignOut);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/image/Logo3.png")));
		lblNewLabel_1.setBounds(433, 11, 50, 59);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/image/bag.png")));
		lblNewLabel_2.setBounds(190, 130, 70, 70);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/image/baju.png")));
		lblNewLabel_3.setBounds(300, 130, 70, 70);
		contentPane.add(lblNewLabel_3);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/image/camera.png")));
		label.setBounds(410, 130, 70, 70);
		contentPane.add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Main.class.getResource("/image/phone.png")));
		label_1.setBounds(190, 250, 70, 70);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Main.class.getResource("/image/ball.png")));
		label_2.setBounds(300, 250, 70, 70);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Main.class.getResource("/image/electronic.png")));
		label_3.setBounds(410, 250, 70, 70);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Main.class.getResource("/image/car.png")));
		label_4.setBounds(190, 370, 70, 70);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Main.class.getResource("/image/shoe.png")));
		label_5.setBounds(300, 370, 70, 70);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Main.class.getResource("/image/home.png")));
		label_6.setBounds(410, 370, 70, 70);
		contentPane.add(label_6);
	}
}
