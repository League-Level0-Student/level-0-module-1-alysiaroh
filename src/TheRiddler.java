import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String inputAnswer= JOptionPane.showInputDialog("Brothers and sisters I have none but this man's father is my father's son. Who is the man?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(inputAnswer.equals("My son")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is my son.");
}
		// 6. Add some more riddles
String inputAnswer2=JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
if(inputAnswer2.equals("Nothing")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is nothing.");
}
String inputAnswer3=JOptionPane.showInputDialog("Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");
if(inputAnswer3.equals("A coffin")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is a coffin.");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

