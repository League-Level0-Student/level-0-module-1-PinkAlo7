package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String lele = ("Oh, Hi Lele, thanks for running my progam, and by the way, you are a great reader!");
	String mrmike = ("You are an awsome teacher!");
	String jasmine = ("You are my favorite princess");
	String mark = ("Oh hey mark! I have absaloutley no idea who you are");
	String Ati = ("Hi my little cutie pie, you are so cute!");
	String Mom = ("You are a great baker");
	String Mana = ("Hi brother! You are so good playing Nintendo Switch!");
	String Charlie = ("Hey Charlie, you are a great typer, and I've seen you before in my makeup class!");
	String Mani = ("Hi Mani, this is Alo here, and you are a great at making pani popo!");
	String pop = ("Hi Pop, this Alo and I progammed this myself at my lessons, and you are great at working outside and fixing things!");
	String Auntie = ("Hi auntite! This is Alo and I progammed this myself at my lessons, and you are a great cook!");
	String Abigal = ("This is Alo here and I just wanted to say that you are a great friend!");
	String Elaina = ("Hi Elaina, this is alo here and I just wanted to say that you are very good at soccer!");
	String Elizabeth = ("Hi Elizabeth, this is alo here and I progammed this code myself, and I just wanted to say you are a great best friend!");
	String Naomi = ("Hi Naomi, this is alo here and I progammed this my self, and I just wanted to you are a great best friend");
	String Eve = ("Hi Eve, this is Alo here and I just wanted to say that you are a great friend to me and Lele");
	// 2. Ask the user to enter a name. Store their answer in a variable.
 
		String name = JOptionPane.showInputDialog("What is your name?"); 
		
		if (name.equalsIgnoreCase("lele")) {
			JOptionPane.showMessageDialog(null,lele);
		}
		if (name.equalsIgnoreCase("mrmike")) {
			JOptionPane.showMessageDialog(null,mrmike);
		}
		if (name.equalsIgnoreCase("jasmine")) {
			JOptionPane.showMessageDialog(null, jasmine);
		}
		if (name.equalsIgnoreCase("mark")) {
			JOptionPane.showMessageDialog(null, mark); 
		}
		if(name.equalsIgnoreCase("Ati")) {
			JOptionPane.showMessageDialog(null, Ati);
		}
		if(name.equalsIgnoreCase("Mom")) {	
			JOptionPane.showMessageDialog(null,Mom);
		}
		if(name.equalsIgnoreCase("Mana")) {
			JOptionPane.showMessageDialog(null, Mana);
		}
	    if(name.equalsIgnoreCase("Charlie")) {
	    	JOptionPane.showMessageDialog(null,Charlie);
	    }
	    if(name.equalsIgnoreCase("Mani")) {
	    	JOptionPane.showMessageDialog(null, Mani);
	    }
	    if(name.equalsIgnoreCase("Pop")) {
	    	JOptionPane.showMessageDialog(null, pop);
	    }
	    if(name.equalsIgnoreCase("Auntie")) {
	    	JOptionPane.showMessageDialog(null, Auntie);
	    }
	    if(name.equalsIgnoreCase(Abigal)) {
	    		JOptionPane.showMessageDialog(null, Abigal); 
	    }
	    if(name.equalsIgnoreCase(Elaina)) {
	    	JOptionPane.showMessageDialog(null,Elaina);
	    }
	    if(name.equalsIgnoreCase("Elizabeth")) {
	    	JOptionPane.showMessageDialog(null, Elizabeth);
	    }
	    if(name.equalsIgnoreCase("Naomi")) {
	    	JOptionPane.showMessageDialog(null, Naomi);
	    if(name.equalsIgnoreCase("Eve")) {
	    	JOptionPane.showMessageDialog(null, Eve);
	    }
	    	
	    	
	    	
	    }
	
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}

}
