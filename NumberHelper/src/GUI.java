import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
	
	private JFrame f = new JFrame("Number Helper");
	
	public static void main(String[] args) {
		GUI g = new GUI();
	}
	
	public GUI() {
		
		// Create calculation
		Calculation calc = new Calculation();
		
		// Create panels
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(4, 4));
		
		// Create components for the top panel
		JButton buttonClear = new JButton("Clear");
		JTextArea inputArea = new JTextArea(2, 20);
		inputArea.setEditable(false);
		JButton buttonEquals = new JButton("  =  ");
		
		// Create components for the bottom panel
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton buttonPlus = new JButton("+");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton buttonMinus = new JButton("-");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonMultiply = new JButton("*");
		JButton buttonAdvanced = new JButton("Adv.");
		JButton button0 = new JButton("0");
		JButton buttonDecimal = new JButton(".");
		JButton buttonDivide = new JButton("/");
		
		// Create advanced components for the bottom panel
		JButton buttonPi = new JButton("\u03c0");
		JButton buttonSin = new JButton("sin");
		JButton buttonCos = new JButton("cos");
		JButton buttonTan = new JButton("tan");
		JButton buttonE = new JButton("e");
		JButton buttonExp = new JButton("^");
		JButton buttonOpenPar = new JButton("(");
		JButton buttonClosePar = new JButton(")");
		JButton buttonLog = new JButton("log");
		JButton buttonSavX = new JButton("Save x");
		JButton buttonSavY = new JButton("Save y");
		JButton buttonSavZ = new JButton("Save z");
		JButton buttonLn = new JButton("ln");
		JButton buttonX = new JButton("x");
		JButton buttonY = new JButton("y");
		JButton buttonZ = new JButton("z");
		
		
		// Adding functionality to the buttons
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.setText("");
			}
		});
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create calculation
				Calculation calc = new Calculation();
				calc.receive(inputArea.getText());
				inputArea.setText("");
				// TODO Those other classes called above should return the result, which is appended to inputArea here
				inputArea.append(calc.getAnswer());
			}
		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("1");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("2");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("3");
			}
		});
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append(" + ");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("4");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("5");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("6");
			}
		});
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append(" - ");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("7");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("8");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("9");
			}
		});
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append(" * ");
			}
		});
		buttonAdvanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Adding all the advanced buttons to a newly resized window
				bottomPanel.setLayout(new GridLayout(8, 4));
				f.setSize(400, 515);
				bottomPanel.add(buttonPi);
				bottomPanel.add(buttonSin);
				bottomPanel.add(buttonCos);
				bottomPanel.add(buttonTan);
				bottomPanel.add(buttonE);
				bottomPanel.add(buttonExp);
				bottomPanel.add(buttonOpenPar);
				bottomPanel.add(buttonClosePar);
				bottomPanel.add(buttonLog);
				bottomPanel.add(buttonSavX);
				bottomPanel.add(buttonSavY);
				bottomPanel.add(buttonSavZ);
				bottomPanel.add(buttonLn);
				bottomPanel.add(buttonX);
				bottomPanel.add(buttonY);
				bottomPanel.add(buttonZ);
			}
		});
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("0");
			}
		});
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append(".");
			}
		});
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append(" / ");
			}
		});
		
		// Adding functionality to the advanced buttons
		buttonPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("\u03c0");
			}
		});
		buttonSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("sin(");
			}
		});
		buttonCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("cos(");
			}
		});
		buttonTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("tan(");
			}
		});
		buttonE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("e");
			}
		});
		buttonExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("^");
			}
		});
		buttonOpenPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("(");
			}
		});
		buttonClosePar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append(")");
			}
		});
		buttonLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("log(");
			}
		});
		buttonSavX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Zhengye Hua, Iteration 2
			}
		});
		buttonSavY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Zhengye Hua, Iteration 2
			}
		});
		buttonSavZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Zhengye Hua, Iteration 2
			}
		});
		buttonLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputArea.append("ln(");
			}
		});
		buttonX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Zhengye Hua, Iteration 2
			}
		});
		buttonY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Zhengye Hua, Iteration 2
			}
		});
		buttonZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Zhengye Hua, Iteration 2
			}
		});
		
		
		// Add components to the top panel
		topPanel.add(buttonClear);
		topPanel.add(inputArea);
		topPanel.add(buttonEquals);
		
		// Add components to the bottom panel
		bottomPanel.add(button1);
		bottomPanel.add(button2);
		bottomPanel.add(button3);
		bottomPanel.add(buttonPlus);
		bottomPanel.add(button4);
		bottomPanel.add(button5);
		bottomPanel.add(button6);
		bottomPanel.add(buttonMinus);
		bottomPanel.add(button7);
		bottomPanel.add(button8);
		bottomPanel.add(button9);
		bottomPanel.add(buttonMultiply);
		bottomPanel.add(buttonAdvanced);
		bottomPanel.add(button0);
		bottomPanel.add(buttonDecimal);
		bottomPanel.add(buttonDivide);
		
		f.add(topPanel, BorderLayout.NORTH);
		f.add(bottomPanel, BorderLayout.CENTER);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 300);
		f.setVisible(true);
	}

}
