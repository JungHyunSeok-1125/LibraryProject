package kr.ac.kopo.Util;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.UserVo.AdminVo;
import kr.ac.kopo.UserVo.BookVo;
import kr.ac.kopo.UserVo.UserVo;
import kr.ac.kopo.common.GolbalConstants;

public class VoMapper {

	public AdminVo obtainAdminbyKey(int key) {

		List<String> list = new ArrayList<>();
		FileUtils ut = new FileUtils();
		AdminVo adminResult = null;

		List<String> totalList = ut.readFile(GolbalConstants.ADMIN_FILE);

		for (int i = 0; i < totalList.size(); i++) {

			List<String> a = StringUtils.seperateString(totalList.get(i));

			if (Integer.parseInt(a.get(0)) == key) {

				adminResult = new AdminVo(Integer.parseInt(a.get(0)), a.get(1), a.get(2), a.get(3));
				break;
			}
		}

		return adminResult;
	}

	public UserVo obtainUserVoByKey(int key) {

		List<String> list = new ArrayList<>();
		FileUtils ut = new FileUtils();
		UserVo userResult = null;

		List<String> totalList = ut.readFile(GolbalConstants.USER_FILE);

		for (int i = 0; i < totalList.size(); i++) {

			List<String> a = StringUtils.seperateString(totalList.get(i));

			if (Integer.parseInt(a.get(0)) == key) {

				userResult = new UserVo(Integer.parseInt(a.get(0)), a.get(1), a.get(2), a.get(3), list.get(4),
						list.get(5));
				break;
			}
		}

		return userResult;

	}

	public BookVo obtainBookVoByKey(int key) {

		List<String> list = new ArrayList<>();
		FileUtils ut = new FileUtils();
		BookVo bookResult = null;

		List<String> totalList = ut.readFile(GolbalConstants.BOOK_FILE);

		for (int i = 0; i < totalList.size(); i++) {

			List<String> a = StringUtils.seperateString(totalList.get(i));

			if (Integer.parseInt(a.get(0)) == key) {

				bookResult = new BookVo(Integer.parseInt(a.get(0)), a.get(1), a.get(2), a.get(3),
						Integer.parseInt(list.get(4)));
				break;

			}
		}

		return bookResult;
	}

}
