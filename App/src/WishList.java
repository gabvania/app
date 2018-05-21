import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class WishList extends JFrame {

	private JPanel contentPane;
	int xx, xy;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WishList frame = new WishList();
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

	public WishList() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 454);
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
				WishList.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("WISHLIST");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(171, 11, 101, 30);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				close();
				Main main = new Main();
				main.setUndecorated(true);
				main.setVisible(true);
			}
		});
		label.setIcon(new ImageIcon(WishList.class.getResource("/image/back1.png")));
		label.setBounds(10, 7, 46, 40);
		contentPane.add(label);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				close();
				Main main = new Main();
				main.setUndecorated(true);
				main.setVisible(true);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(WishList.class.getResource("/image/add.png")));
		lblNewLabel_1.setBounds(367, 7, 46, 40);
		contentPane.add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(20, 58, 392, 101);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTasMahalViral = new JLabel("Tas Mahal Viral");
		lblTasMahalViral.setBounds(108, 27, 87, 17);
		panel.add(lblTasMahalViral);
		lblTasMahalViral.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblRp = new JLabel("Rp 3.000.000");
		lblRp.setBounds(108, 55, 85, 17);
		panel.add(lblRp);
		lblRp.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(305, 64, 77, 26);
		panel.add(panel_1);

		JLabel lblSaved = new JLabel("Saved");
		lblSaved.setForeground(Color.WHITE);
		lblSaved.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblSaved);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 11, 80, 70);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(WishList.class.getResource("/image/bag.png")));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(21, 177, 392, 101);
		contentPane.add(panel_2);

		JLabel lblDressMahal = new JLabel("Dress Mahal");
		lblDressMahal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDressMahal.setBounds(108, 27, 87, 17);
		panel_2.add(lblDressMahal);

		JLabel lblRp_1 = new JLabel("Rp 1.000.000");
		lblRp_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRp_1.setBounds(108, 55, 85, 17);
		panel_2.add(lblRp_1);

		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(305, 64, 77, 26);
		panel_2.add(panel_3);

		JLabel label_3 = new JLabel("Saved");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(label_3);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(WishList.class.getResource("/image/baju.png")));
		label_4.setBounds(10, 11, 80, 70);
		panel_2.add(label_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 451, 415);
		contentPane.add(scrollPane);
	}
}
