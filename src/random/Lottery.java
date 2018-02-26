package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0;
		
		Random gen = new Random ();
		
		String lotto = "";
		
		for(int i=0; i<7; i++ ) {
			int RandomNumber = new Random().nextInt(100);
			lotto = lotto + RandomNumber + " ";  
}
		JOptionPane.showMessageDialog(null, lotto);
	}}
