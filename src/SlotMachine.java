import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	static SlotMachine slots = new SlotMachine();
	JFrame frame;
	JPanel panel;
	JLabel label1 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel cherry;
	JLabel lime;
	JLabel orange;
	Random rand = new Random();
	int random;
	JButton spin;
	int money;

	public static void main(String[] args) throws MalformedURLException {
		slots.letsGo();
		slots.setTemp();
	}

	public void setTemp() throws MalformedURLException {
		cherry = createLabelImage("cherry.jpg");
		label1 = cherry;
		lime = createLabelImage("lime.jpg");
		label2 = lime;
		orange = createLabelImage("orange.jpg");
		label3 = orange;
	}

	public void letsGo() {
		random = rand.nextInt(27);
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SLOTS SLOTS SLOTS SLOTS SLOTS");
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.add(panel);
		spin = new JButton();
		spin.setText("SPIN");
		spin.addActionListener(this);
		panel.add(spin);
		frame.pack();
	}

	public JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		try {
			//CHERRY
			if (random == 0) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("orange.jpg");
			}
			if (random == 1) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("lime.jpg");
			}
			if (random == 2) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("orange.jpg");
			}
			if (random == 3) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("lime.jpg");
			}
			if (random == 4) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("orange.jpg");
			}
			if (random == 5) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("lime.jpg");
			}
			if (random == 6) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("cherry.jpg");
			}
			if (random == 7) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("cherry.jpg");
			}
			if (random == 8) {
				label1 = createLabelImage("cherry.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("cherry.jpg");
				money += 100;
				System.out.println("money: $" + money);
			}
			//LIME
			if (random == 9) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("orange.jpg");
			}
			if (random == 10) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("lime.jpg");
			}
			if (random == 11) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("orange.jpg");
			}
			if (random == 12) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("lime.jpg");
				money += 100;
				System.out.println("money: $" + money);
			}
			if (random == 13) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("orange.jpg");
			}
			if (random == 14) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("lime.jpg");
			}
			if (random == 15) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("cherry.jpg");
			}
			if (random == 16) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("cherry.jpg");
			}
			if (random == 17) {
				label1 = createLabelImage("lime.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("cherry.jpg");
			}
			//ORANGE
			if (random == 18) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("orange.jpg");
			}
			if (random == 19) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("lime.jpg");
			}
			if (random == 20) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("orange.jpg");
				money += 100;
				System.out.println("money: $" + money);
			}
			if (random == 21) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("lime.jpg");
			}
			if (random == 22) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("orange.jpg");
			}
			if (random == 23) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("lime.jpg");
			}
			if (random == 24) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("lime.jpg");
				label3 = createLabelImage("cherry.jpg");
			}
			if (random == 25) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("orange.jpg");
				label3 = createLabelImage("cherry.jpg");
			}
			if (random == 26) {
				label1 = createLabelImage("orange.jpg");
				label2 = createLabelImage("cherry.jpg");
				label3 = createLabelImage("cherry.jpg");
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		;
		random = rand.nextInt(27);
		slots.letsGo();
	}
}
