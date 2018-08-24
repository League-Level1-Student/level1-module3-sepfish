import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	
	JButton button;
	JPanel panel;
	static WhackAMole hmm = new WhackAMole();
	Random random = new Random();
	int rand;
	JFrame frame;
	int whackCount = 0;
	int nopeCount = 0;
	JButton reload = new JButton();
	Date date = new Date();
	
	public static void main(String[] args) {
		Random random = new Random();
		hmm.drawButtons(random);
	}

	public void drawButtons(Random random) {
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(315, 275);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Button for Fame and Glory");
			
		for (int i = 0; i < 18; i++) {
			button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			rand = random.nextInt(18);
			if (rand == 4) {
				button.setText("mole!");
			}
		}
		
		reload = new JButton();
		reload.setText("reload");
		reload.addActionListener(this);
		panel.add(reload);
		frame.add(panel);
	}
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton whack = (JButton) e.getSource();
		if (whack.getText().equalsIgnoreCase("mole!")){
			whackCount++;
			playSound("ouch.wav");
			frame.dispose();
			hmm.drawButtons(random);
			if(whackCount == 10) {
				System.out.println("the game should be done by now");
				endGame(date, 10);
				System.exit(0);
			}
		} else 
		if (whack == reload) {
			frame.dispose();
			hmm.drawButtons(random);
		} else {
			nopeCount++;
			if (nopeCount == 1) {
				speak("Whoops");
				frame.dispose();
				hmm.drawButtons(random);
			}
			if (nopeCount == 2) {
				speak("You missed");
				frame.dispose();
				hmm.drawButtons(random);
			}
			if (nopeCount == 3) {
				speak("The virtual moles hath eluded you");
				frame.dispose();
				hmm.drawButtons(random);
			}
			if (nopeCount == 4) {
				speak("Try harder");
				frame.dispose();
				hmm.drawButtons(random);
			}
			if (nopeCount == 5) {
				frame.dispose();
				speak("Too bad");
				JOptionPane.showMessageDialog(null, "You lost. :(");
				System.exit(0);
			}
		}
	}
}
