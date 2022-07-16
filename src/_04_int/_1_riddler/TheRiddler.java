package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
            int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
              String riddle = JOptionPane.showInputDialog("What word starts with E and ends with E but only has one letter in it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
              if (riddle.equalsIgnoreCase("envelope")) {
            	  JOptionPane.showMessageDialog(null,"Correct! Great job!"); 
            	  score++;
              }
		// 5. Otherwise, say "wrong" and tell them the answer
              else {
            			JOptionPane.showMessageDialog(null,"Wrong.  the anwser is envelope");
            		}
		// 6. Add some more riddles
              riddle = JOptionPane.showInputDialog("What is full of holes but still holds a lot of water?");
              if (riddle.equalsIgnoreCase("sponge")) {
            	  JOptionPane.showMessageDialog(null,"Correct! Great job!"); 
            	  score++;
              }
              else {
      			JOptionPane.showMessageDialog(null,"Wrong.  the anwser is a sponge");
      		}
             riddle = JOptionPane.showInputDialog("What word looks the same upside down and backward?");
              if (riddle.equalsIgnoreCase("swims")) {
            	  JOptionPane.showMessageDialog(null,"Correct! Great job!"); 
            	  score++;
              }
              else {
      			JOptionPane.showMessageDialog(null,"Wrong.  the anwser is 'swims' .");
      		}
              riddle = JOptionPane.showInputDialog("Give me food, and I will live. Give me water, and I will die. What am I?");
              if (riddle.equalsIgnoreCase("swims")) {
            	  JOptionPane.showMessageDialog(null,"Correct! Great job!"); 
            	  score++;
              }
              else {
      			JOptionPane.showMessageDialog(null,"Wrong.  the anwser is fire .");
      		}
              
		// 2. Make a pop up to show the score.
              JOptionPane.showMessageDialog(null,"Your score is "+score);
		
	}
}

