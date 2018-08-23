import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

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
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton whack = (JButton) e.getSource();
		if (whack.getText().equalsIgnoreCase("mole!")){
			whackCount++;
			frame.dispose();
			hmm.drawButtons(random);
			if(whackCount == 10) {
				System.out.println("the game should be done by now");
			}
		} else 
		if (whack == reload) {
			frame.dispose();
			hmm.drawButtons(random);
		} else {
			speak("You missed");
			frame.dispose();
			hmm.drawButtons(random);
			nopeCount++;
			if (nopeCount == 5) {
				System.out.println("too bad you lose lol");
			}
		}
	}
}
