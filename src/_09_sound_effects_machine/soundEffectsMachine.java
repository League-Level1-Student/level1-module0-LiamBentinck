package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public void run() {
	frame.add(panel);
	frame.setVisible(true);
	button1.setText("sound1");
	button2.setText("sound2");
	button1.addActionListener(this);
	button2.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	
	
	
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
