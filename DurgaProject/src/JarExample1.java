/**
 * this example creates a window frame with awt package
 * also have an example of ANNONYMOUS INNER CLASS
 * 
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JarExample1 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			
			//This method is called automatically
			//as it is a window listener
			public void windowClosing(WindowEvent e){
				for (int i = 0; i < 10; i++) {
					System.out.println("I am closing the window"+i);
				}
				System.exit(0);
			}
		});
		f.add(new Label("I can create an Exceutable Jar"));
		f.setSize(500, 700);
		f.setVisible(true);
	}
}
