package kr.ac.kopo.Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils extends FileClose {
	// Object o, int idx, String txtName

	/**
	 * �ش� ������ ���� ��ȯ�Ѵ�.
	 * 
	 * @param idx         ������ ��
	 * @param txtFileName �����̸�
	 * @return
	 */
	public List<String> readFile(String txtFileName, int idx) {

		List<String> list = new ArrayList<>();
		List<String> printList = new ArrayList<String>();

		list = readFile(txtFileName);

		String[] arr = list.get(idx).split("@@");

		for (int i = 0; i < arr.length; i++) {
			printList.add(arr[i]);
		}

		return printList;

	}

	/**
	 * ������ ����Ʈ�� ��ȯ�Ѵ�. (�ٴ��� ���)
	 * 
	 * @param txtFileName
	 * @return
	 */
	public List<String> readFile(String txtFileName) {

		List<String> list = new ArrayList<>();

		try {
			// ���� ��ü ����
			File file = new File(txtFileName);

			if (!file.exists())
				file.createNewFile();

			FileReader fileReader = new FileReader(file);// �Է� ��Ʈ�� ����
			BufferedReader fileBufReader = new BufferedReader(fileReader);// �Է� ���� ����
			String line = "";
			while ((line = fileBufReader.readLine()) != null) {
				list.add(line);
			}
			// .readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.
			close(fileReader, fileBufReader);

		} catch (FileNotFoundException e) {
			System.out.println("���� ã�� ����");
		} catch (IOException e) {
			System.out.println(e);
		}

		return list;
	}

	/**
	 * �ش� ���� �ڿ� ���ο� ���� �߰�
	 */
	public void addNextLine(String txtFileName, String newText) {

		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		List<String> list = new ArrayList<String>();
		list = readFile(txtFileName);
		list.add(newText);

		try {
			File file = new File(txtFileName);

			if (!file.exists())
				file.createNewFile();

			fileWriter = new FileWriter(txtFileName);
			bufferedWriter = new BufferedWriter(fileWriter);

			for (int i = 0; i < list.size(); i++) {
				bufferedWriter.write(list.get(i));
				bufferedWriter.newLine(); // ���ۿ� ���� ����
			}
			bufferedWriter.flush(); // ������ ������ ���Ͽ� ����
		} catch (IOException e) {
			System.out.println(e);
		}

		close(fileWriter, bufferedWriter);

	}

	/**
	 * Ư�� �� ����
	 * 
	 * @param txtFileName
	 * @param delNo
	 */
	public void deleteFile(String txtFileName, int delNo) {

		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		List<String> list = new ArrayList<String>();
		list = readFile(txtFileName);

		try {
			File file = new File(txtFileName);

			if (!file.exists())
				file.createNewFile();

			fileWriter = new FileWriter(txtFileName);
			bufferedWriter = new BufferedWriter(fileWriter);

			for (int i = 0; i < list.size(); i++) {
				if (i != delNo) {
					bufferedWriter.write(list.get(i));
					bufferedWriter.newLine(); // ���ۿ� ���� ����
				}
			}
			bufferedWriter.flush(); // ������ ������ ���Ͽ� ����
		} catch (IOException e) {
			System.out.println(e);
		}

		close(fileWriter, bufferedWriter);

	}

	/**
	 * Ư���� ����
	 * 
	 * @param txtFileName
	 * @param modNo
	 * @param modString   ������ ����
	 */
	public void modifyFile(String txtFileName, int modNo, String modString) {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		List<String> list = new ArrayList<String>();
		list = readFile(txtFileName);

		try {
			File file = new File(txtFileName);

			if (!file.exists())
				file.createNewFile();

			fileWriter = new FileWriter(txtFileName);
			bufferedWriter = new BufferedWriter(fileWriter);

			for (int i = 0; i < list.size(); i++) {
				if (i != modNo) {
					bufferedWriter.write(list.get(i));
					bufferedWriter.newLine(); // ���ۿ� ���� ����
				} else {
					bufferedWriter.write(modString);
					bufferedWriter.newLine(); // ���ۿ� ���� ����
				}
			}
			bufferedWriter.flush(); // ������ ������ ���Ͽ� ����
		} catch (IOException e) {
			System.out.println(e);
		}

		close(fileWriter, bufferedWriter);
	}

}
