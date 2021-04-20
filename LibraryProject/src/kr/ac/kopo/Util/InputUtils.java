package kr.ac.kopo.Util;

import java.util.*;

public class InputUtils {

	static Scanner sc = new Scanner(System.in);

	/**
	 * 숫자 입력받기
	 * 
	 * @param str 질문
	 * @return 입력받은 숫자
	 */
	public static int getInt(String str) {
		System.out.print(str);
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
	
	public static int getInt() {
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
	

	/**
	 * 문자 입력 받기
	 * 
	 * @param str 질문
	 * @return 입력받은 문자
	 */
	public static char getChar(String str) {
		System.out.print(str);
		char input = sc.nextLine().charAt(0);
		sc.nextLine();
		return input;
	}
	
	public static char getChar() {
		char input = sc.nextLine().charAt(0);
		sc.nextLine();
		return input;
	}
	

	/**
	 * 문자열 입력받기
	 * 
	 * @param str 질문
	 * @return 입력받은 문자열
	 */
	public static String getString(String str) {
		System.out.print(str);
		String input = sc.nextLine();
		sc.nextLine();
		return input;
	}
	
	public static String getString() {
		String input = sc.nextLine();
		sc.nextLine();
		return input;
	}
	

	/**
	 * double 입력받기
	 * 
	 * @param str 질문
	 * @return
	 */
	public static Double getDouble(String str) {
		System.out.print(str);
		Double input = sc.nextDouble();
		sc.nextLine();
		return input;
	}
	
	public static Double getDouble() {
		Double input = sc.nextDouble();
		sc.nextLine();
		return input;
	}
	

	/**
	 * 1 ~ 입력받은 수까지 랜덤숫자 출력
	 * 
	 * @return 1 ~ num 사이의 랜덤숫자
	 */
	public static int getRandomNum(int num) {

		Random r = new Random();
		int randNum = r.nextInt(num) + 1;
		return randNum;
	}
		

}
