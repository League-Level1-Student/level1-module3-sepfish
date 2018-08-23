import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
		
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JTextField a = new JTextField(10);
	JTextField b = new JTextField(10);
	JLabel label = new JLabel();
	
	Calculator(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 115);
		JPanel panel = new JPanel();
		add.setText("add");
		add.addActionListener(this);
		subtract.setText("subtract");
		subtract.addActionListener(this);
		multiply.setText("multiply");
		multiply.addActionListener(this);
		divide.setText("divide");
		divide.addActionListener(this);
		panel.add(a);
		panel.add(b);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(label);
		frame.add(panel);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if (source == add) {
			int aInt = Integer.parseInt(a.getText().toString());
			int bInt = Integer.parseInt(b.getText().toString());
			label.setText("");
			label.setText(add(aInt, bInt) + "                ");
		}
		if (source == subtract) {
			int aInt = Integer.parseInt(a.getText().toString());
			int bInt = Integer.parseInt(b.getText().toString());
			label.setText("");
			label.setText(subtract(aInt, bInt) + "                ");
		}
		if (source == multiply) {
			int aInt = Integer.parseInt(a.getText().toString());
			int bInt = Integer.parseInt(b.getText().toString());
			label.setText("");
			label.setText(multiply(aInt, bInt) + "            ");
		}
		if (source == divide) {
			int aInt = Integer.parseInt(a.getText().toString());
			int bInt = Integer.parseInt(b.getText().toString());
			label.setText("");
			label.setText(divide(aInt, bInt) + "");
		}
	}
	
	
}
