import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	
	Random r = new Random();
	int random;
	char letter = generateRandomLetter();
	String currentLetter = String.valueOf(letter);
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	Color green = new Color(0, 240, 0);
	Color red = new Color(240, 0, 0);
	
	public static void main(String[] args) {
		TypingTutor hmm = new TypingTutor();
		hmm.doWhatever();
	}
	
	char generateRandomLetter() {
		random = r.nextInt(26);
	    return (char) (random + 'a');
	}
	
	public void doWhatever() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Type or DIE");
		frame.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(currentLetter);
		frame.addKeyListener(this);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("you typed " + currentLetter);
		if (e.getKeyChar() == letter) {
			System.out.println("correct");
			frame.setBackground(green);
		} else {
			frame.setBackground(red);
		}
		letter = generateRandomLetter();
		currentLetter = String.valueOf(letter);
		label.setText(currentLetter);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
	