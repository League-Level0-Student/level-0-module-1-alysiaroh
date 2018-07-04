import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String inputDate = JOptionPane.showInputDialog("When is your birthday?");
	if(inputDate.equals("July 3")) {
	JOptionPane.showMessageDialog(null, "Happy birthday!");
	}
	else {
	JOptionPane.showMessageDialog(null, "Merry UNbirthday");
	}
	}
}

