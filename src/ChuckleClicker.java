import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton joke = new JButton();
	JButton punchline = new JButton();
	
	public static void main(String[] args) {
		ChuckleClicker hmm = new ChuckleClicker();
		hmm.makeButtons();
	}
	
	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		joke.setText("joke");
		joke.setToolTipText("your life lol just kidding");
		joke.addActionListener(this);
		punchline.setText("punchline");
		punchline.setToolTipText("punch the line yo");
		punchline.addActionListener(this);
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		if (clicked == joke) {
			JOptionPane.showMessageDialog(null, "Why can't you explain puns to kleptomaniacs?");
		}
		if (clicked == punchline) {
			JOptionPane.showMessageDialog(null, "Because they always take things literally.");
		}
	}
}
