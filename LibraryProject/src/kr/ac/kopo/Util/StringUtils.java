package kr.ac.kopo.Util;

import java.util.Arrays;
import java.util.List;

public class StringUtils {

	public static List<String> seperateString(String str) {

		List<String> list = Arrays.asList(str.split(","));

		return list;
	}
}
