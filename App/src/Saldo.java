import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextPane;
import javax.swing.JSpinner;

public class Saldo extends JFrame {

	private JPanel contentPane;
	int xx, xy;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saldo frame = new Saldo();
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

	public Saldo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
				Saldo.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSaldo.setBounds(55, 12, 33, 24);
		contentPane.add(lblSaldo);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(100, 14, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("Auto");
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tglbtnNewToggleButton.setBounds(328, 13, 83, 23);
		contentPane.add(tglbtnNewToggleButton);

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
		label.setIcon(new ImageIcon(Saldo.class.getResource("/image/back1.png")));
		label.setBounds(6, 7, 46, 40);
		contentPane.add(label);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Saldo.class.getResource("/image/baju.png")));
		lblNewLabel.setBounds(16, 59, 70, 70);
		contentPane.add(lblNewLabel);

		JLabel lblSavingProgress = new JLabel("Saving Progress");
		lblSavingProgress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSavingProgress.setBounds(100, 51, 118, 24);
		contentPane.add(lblSavingProgress);

		JLabel lblGoals = new JLabel("Goals");
		lblGoals.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGoals.setBounds(100, 73, 33, 24);
		contentPane.add(lblGoals);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane.setText("200.000 / 800.000");
		textPane.setBounds(142, 75, 145, 20);
		contentPane.add(textPane);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Saldo.class.getResource("/image/warning.png")));
		lblNewLabel_1.setBounds(100, 101, 33, 30);
		contentPane.add(lblNewLabel_1);

		JTextPane txtpnMonthsmonth = new JTextPane();
		txtpnMonthsmonth.setText("3 months, 200.000/month");
		txtpnMonthsmonth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnMonthsmonth.setBounds(141, 106, 194, 20);
		contentPane.add(txtpnMonthsmonth);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(339, 77, 51, 20);
		contentPane.add(spinner);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Saldo.class.getResource("/image/bag.png")));
		label_1.setBounds(16, 165, 70, 70);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("Saving Progress");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(100, 157, 118, 24);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("Goals");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(100, 179, 33, 24);
		contentPane.add(label_3);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("200.000 / 800.000");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane_1.setBounds(142, 181, 145, 20);
		contentPane.add(textPane_1);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Saldo.class.getResource("/image/warning.png")));
		label_4.setBounds(100, 207, 33, 30);
		contentPane.add(label_4);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("3 months, 200.000/month");
		textPane_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPane_2.setBounds(141, 212, 194, 20);
		contentPane.add(textPane_2);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(339, 183, 51, 20);
		contentPane.add(spinner_1);
	}
}
