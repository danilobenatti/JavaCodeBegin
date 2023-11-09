package main;

import javax.swing.*;
import java.util.logging.Logger;

public class HelloWord {
	static Logger logger = Logger.getLogger(HelloWord.class.getName());
	
	public static void main(String[] args) {
		logger.info(HelloWord::getName);
	}
	
	private static String getName() {
		return "Hello World! I'm %s".formatted(JOptionPane.showInputDialog("Info your name"));
	}
}
