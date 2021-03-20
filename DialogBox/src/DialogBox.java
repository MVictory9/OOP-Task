import javax.swing.JOptionPane;

public class DialogBox {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Please enter your name:");

		JOptionPane.showMessageDialog(null, "Hello: " + input);
	}

}
