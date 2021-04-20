package kr.ac.kopo.Util;

import java.util.*;

public class InputUtils {

	static Scanner sc = new Scanner(System.in);

	/**
	 * ���� �Է¹ޱ�
	 * 
	 * @param str ����
	 * @return �Է¹��� ����
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
	 * ���� �Է� �ޱ�
	 * 
	 * @param str ����
	 * @return �Է¹��� ����
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
	 * ���ڿ� �Է¹ޱ�
	 * 
	 * @param str ����
	 * @return �Է¹��� ���ڿ�
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
	 * double �Է¹ޱ�
	 * 
	 * @param str ����
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
	 * 1 ~ �Է¹��� ������ �������� ���
	 * 
	 * @return 1 ~ num ������ ��������
	 */
	public static int getRandomNum(int num) {

		Random r = new Random();
		int randNum = r.nextInt(num) + 1;
		return randNum;
	}
		

}
