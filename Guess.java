package game;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

public class Guess extends JFrame {
public void game(){
	setTitle("Guess");
	JFrame b = new JFrame();
	FileDialog fd=new FileDialog(b,"pick a file:",FileDialog.LOAD);
	fd.setFile("*.txt*");	//get only txt files
	fd.setVisible(true);
	String path=fd.getDirectory();
	String file=fd.getFile();
	try {
		FileReader fr=new FileReader(path+"//"+file);
		try {
			BufferedReader br=new BufferedReader(fr);
			String name=br.readLine();
			while(br.readLine()!=null){
				String score=br.readLine();
				String chance=br.readLine();
				String winMes=br.readLine();
				String loseMes=br.readLine();
				String greatMes=br.readLine();
				String lessMes=br.readLine();
				System.out.println(name+score+chance+winMes);
				System.out.println(loseMes+greatMes+lessMes);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	//System.out.println(fd.getFile());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public void random(){
		
		Random rnd = new Random();
		int attempts = 0;
		int scr = 100;
		int rndNum = rnd.nextInt(100);
		
		while(true && attempts < 10){
			attempts++;
			scr = scr - 10;
			
			String guessNum = JOptionPane.showInputDialog(null, " Guess a number between 1 and 100.");
			
			int guessNum1 = Integer.parseInt(guessNum);
			
			if(){
				// YOOJU'S PART 
			}else{
				JOptionPane.showMessageDialog(null, "CONGRATULATIONS you've won. " + " Your score is: " + scr ); //i know this is wrong but idk how to include the winMes and score
			}
		}
		
	}
}
