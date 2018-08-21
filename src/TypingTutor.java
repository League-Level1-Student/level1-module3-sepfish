import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
	
	char currentLetter;

	currentLetter = generateRandomLetter();

	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	
	public static void main(String[] args) {
		TypingTutor hmm = new TypingTutor();
		hmm.doWhatever();
	}
	
	public void doWhatever() {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Type or DIE");
		label.setText(currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
	}
}
