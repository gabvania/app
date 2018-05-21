import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;

public class TopUp extends JFrame {

	private JPanel contentPane;
	int xx, xy;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TopUp frame = new TopUp();
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

	public TopUp() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 330, 467);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				TopUp.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				close();
				Main main = new Main();
				main.setUndecorated(true);
				main.setVisible(true);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(TopUp.class.getResource("/image/back1.png")));
		lblNewLabel.setBounds(0, 11, 46, 40);
		contentPane.add(lblNewLabel);

		JLabel lblTopUp = new JLabel("Top Up");
		lblTopUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTopUp.setBounds(48, 15, 91, 25);
		contentPane.add(lblTopUp);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(36, 48, 238, 366);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 15, 218, 50);
		panel.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(TopUp.class.getResource("/image/alfa.png")));

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 85, 218, 50);
		panel.add(panel_2);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TopUp.class.getResource("/image/bca.png")));
		panel_2.add(lblNewLabel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 155, 218, 50);
		panel.add(panel_3);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TopUp.class.getResource("/image/mandiri.png")));
		panel_3.add(lblNewLabel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 225, 218, 50);
		panel.add(panel_4);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(TopUp.class.getResource("/image/permata.png")));
		panel_4.add(lblNewLabel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 295, 218, 50);
		panel.add(panel_5);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(TopUp.class.getResource("/image/bri.png")));
		panel_5.add(lblNewLabel_5);

		JLabel label_3 = new JLabel("");
		panel_5.add(label_3);
	}

}
