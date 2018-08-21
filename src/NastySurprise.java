

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	
	JButton trick = new JButton();
	JButton treat = new JButton();
	
	public static void main(String[] args) {
		NastySurprise uNasty = new NastySurprise();
		uNasty.doWhatever();
	}
	public void doWhatever() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		trick.setText("Trick");
		treat.setText("Treat");
		trick.addActionListener(this);
		treat.addActionListener(this);
		panel.add(trick);
		panel.add(treat);
		frame.add(panel);
		frame.pack();
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton click = (JButton) e.getSource();
		if (click == trick) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/dd/f8/2e/ddf82ea75f87b160cc0ad59dd4546219.jpg");
		} else
		if (click == treat) {
			showPictureFromTheInternet("https://ih1.redbubble.net/image.508908801.5721/flat,550x550,075,f.u4.jpg");
		}
	}
}
