import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	Calculator(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField a = new JTextField();
		JTextField b = new JTextField();
		JPanel panel = new JPanel();
		JButton add = new JButton();
		add.setText("add");
		JButton subtract = new JButton();
		subtract.setText("subtract");
		panel.add(a);
		panel.add(b);
		panel.add(add);
		panel.add(subtract);
		frame.add(panel);
		frame.pack();
		
	}
	
	int add(int a, int b) {
		return (a + b);
	}
	
	int subtract(int a, int b) {
		return (a - b);
	}
	
	int multiply(int a, int b) {
		return (a*b);
	}
	
	String divide(int a, int b) {
		return (a/b) + " remainder " + (a%b);
	}
}
