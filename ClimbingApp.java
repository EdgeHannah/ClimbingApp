import javax.swing.*;
import java.awt.event.*;

class route {
	String discipline;
	String grade;
	String color;
	int sessionID;
	int attempts;
	route() {
		discipline = "Boulder";
		grade = "V0";
		color = "Black";
		sessionID = 0;
		attempts = 0;
	}
	void setDiscipline(String type){
		discipline = type;
	}
	void setGrade(String Grade){
		grade = Grade;
	}
	void setColor(String Color){
		color = Color;
	}
	void setSessionID(int SessionID){
		sessionID = SessionID;
	}
	void attempts(int Attempts) {
		attempts = Attempts;
	}
}

public class ClimbingApp {
	public static void main (String[] args){
		
		JMenu home, logSession, history, account;
		JMenuBar menuBar = new JMenuBar();
		home = new JMenu ("Home");
		logSession = new JMenu ("Log Session");
		history = new JMenu ("History");
		account = new JMenu ("Account");
		JSeparator sep = new JSeparator();
		menuBar.add(home);

		menuBar.add(logSession);

		menuBar.add(history);

		menuBar.add(account);
		menuBar.add(sep);
		
		final JFrame window = new JFrame();
		window.setLayout(null);
		int width = 400;
		int length = 500;
                window.setSize(width,length); //X axis, Y axis

		JButton exitButton = new JButton("Exit");

		exitButton.setBounds(175,450,50,25); //X axis, Y axis, Width, Height
		
		JButton startSession = new JButton("Start Session");
		startSession.setBounds(25, 75 ,100 ,20);

		final JTextField welcome = new JTextField();
		welcome.setEditable(false);
		welcome.setBounds(50,20,300,20);
		welcome.setText("Welcome to Climb Tracker V0.0.1");


		exitButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				window.dispose();
			}
		});
		window.setJMenuBar(menuBar);
		window.add(exitButton);
		window.add(welcome);		
		window.add(startSession);
		window.setVisible(true);
	}
}
