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
	 * 해당 파일의 줄을 반환한다.
	 * 
	 * @param idx         가져올 줄
	 * @param txtFileName 파일이름
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
	 * 파일의 리스트를 반환한다. (줄단위 출력)
	 * 
	 * @param txtFileName
	 * @return
	 */
	public List<String> readFile(String txtFileName) {

		List<String> list = new ArrayList<>();

		try {
			// 파일 객체 생성
			File file = new File(txtFileName);

			if (!file.exists())
				file.createNewFile();

			FileReader fileReader = new FileReader(file);// 입력 스트림 생성
			BufferedReader fileBufReader = new BufferedReader(fileReader);// 입력 버퍼 생성
			String line = "";
			while ((line = fileBufReader.readLine()) != null) {
				list.add(line);
			}
			// .readLine()은 끝에 개행문자를 읽지 않는다.
			close(fileReader, fileBufReader);

		} catch (FileNotFoundException e) {
			System.out.println("파일 찾기 실패");
		} catch (IOException e) {
			System.out.println(e);
		}

		return list;
	}

	/**
	 * 해당 파일 뒤에 새로운 내용 추가
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
				bufferedWriter.newLine(); // 버퍼에 개행 삽입
			}
			bufferedWriter.flush(); // 버퍼의 내용을 파일에 쓰기
		} catch (IOException e) {
			System.out.println(e);
		}

		close(fileWriter, bufferedWriter);

	}

	/**
	 * 특정 행 삭제
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
					bufferedWriter.newLine(); // 버퍼에 개행 삽입
				}
			}
			bufferedWriter.flush(); // 버퍼의 내용을 파일에 쓰기
		} catch (IOException e) {
			System.out.println(e);
		}

		close(fileWriter, bufferedWriter);

	}

	/**
	 * 특정행 수정
	 * 
	 * @param txtFileName
	 * @param modNo
	 * @param modString   변경할 내용
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
					bufferedWriter.newLine(); // 버퍼에 개행 삽입
				} else {
					bufferedWriter.write(modString);
					bufferedWriter.newLine(); // 버퍼에 개행 삽입
				}
			}
			bufferedWriter.flush(); // 버퍼의 내용을 파일에 쓰기
		} catch (IOException e) {
			System.out.println(e);
		}

		close(fileWriter, bufferedWriter);
	}

}
