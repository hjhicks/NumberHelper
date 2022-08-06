import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class History {
	private File history;

	public History(File history) {
		this.history = history;
		JFrame f = new JFrame("History");
		
		f.setSize(500, 250);
		JTextArea hist = new JTextArea(10, 10);
		hist.setEditable(false);
		JButton close = new JButton("Close History");
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		try {
			Scanner input = new Scanner(this.history);
			while (input.hasNextLine()) {
				hist.append(input.nextLine());
				hist.append("\n");
			}
			input.close();
		} catch (FileNotFoundException e1) {
			new Error();
		}
		f.add(hist);
		f.add(close, BorderLayout.SOUTH);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}
