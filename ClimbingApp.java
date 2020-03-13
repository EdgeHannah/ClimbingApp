

import javax.swing.*;
import java.util.Scanner;

public class ClimbingApp {
	public static void main (String[] args){
		//System.out.println("Hello World!");
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("If you would like to quit, type 'exit'");
	
		JFrame window = new JFrame();
		JButton button1 = new JButton("Click Me!");
		button1.setBounds (10,10,100,130); //X axis, Y axis, Width, Height
		window.add(button1);
	
		window.setLayout(null);
		window.setSize(400,500);
		window.setVisible(true);		
		
		while (true) {
			input = scanner.nextLine();
			if (input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
				System.exit(0);
			}
			else {
				System.out.println("Command '" + input + "' not understood. Please try again.");
			}
		}
	}
}