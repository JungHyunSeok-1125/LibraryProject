package kr.ac.kopo.main;

import kr.ac.kopo.Util.InputUtils;
import kr.ac.kopo.View.PrintMenu;

public class LibraryMain {

	public static void main(String[] args) {
	
		PrintMenu pm = new PrintMenu();
		
		pm.welcome();
		int a =  InputUtils.getInt();
		while (a != 3) {
			
			switch (a) {
			
			case 1: 
				break;
			case 2: 
				//»ç¿ëÀÚ
				break;
			case 3: 
				//exit
				break;
				
			default : 
				System.out.println("??");
				break;
			}
		}
		
	}
	
	

}
