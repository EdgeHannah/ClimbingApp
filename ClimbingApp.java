import javax.swing.*;
import java.awt.event.*;

public class ClimbingApp {
	public static void main (String[] args){

		JFrame window = new JFrame();
		window.setLayout(null);
                window.setSize(400,500); //X axis, Y axis

		JButton button1 = new JButton("Exit");
		button1.setBounds(10,450,50,25); //X axis, Y axis, Width, Height
		
		JTextField welcome = new JTextField();
		welcome.setBounds(10,10,250,20);
		welcome.setText("Welcome to Climb Tracker V0.0.1");

		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				welcome.setText("See you soon!");
				window.dispose();
			}
		});
		window.add(button1);
		window.add(welcome);		
		window.setVisible(true);
	}
}
