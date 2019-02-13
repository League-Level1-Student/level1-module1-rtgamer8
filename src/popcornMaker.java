import javax.swing.JOptionPane;

public class popcornMaker {
	public static void main(String[] args) {
		/*
		 * Your mission and you have to accept it: Create a PopcornMaker class and add a
		 * main method to it that creates a bag of Popcorn and cooks it in the
		 * microwave. Ask the user for the flavor of the popcorn and the number of
		 * minutes to cook it. Don't change the existing methods.
		 */

		String n = JOptionPane.showInputDialog("Choose a flavor");

		Popcorn pop = new Popcorn(n);

		Microwave m = new Microwave();

		m.putInMicrowave(pop);
		String gi = JOptionPane.showInputDialog("Choose a time to put in the microwave");
		int g = Integer.parseInt(gi);
		m.setTime(g);

		m.startMicrowave();

	}
}
