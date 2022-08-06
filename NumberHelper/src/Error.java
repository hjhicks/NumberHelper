import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Error {

	public Error() {
		
		JFrame f = new JFrame("Error");
		JLabel message = new JLabel("   An error has occured, press \"Okay\" to close program   ");
		JButton okay = new JButton("Okay");
		okay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				System.exit(0);
			}
			
		});
		f.add(message, BorderLayout.NORTH);
		f.add(okay, BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		f.requestFocus();
		f.setAlwaysOnTop(true);
		
	}
}
