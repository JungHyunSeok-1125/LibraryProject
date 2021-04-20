package kr.ac.kopo.Manager;

import kr.ac.kopo.UserVo.AdminVo;
import kr.ac.kopo.Util.InputUtils;

public class AdminManagerImpl implements AdminManager {

	@Override
	public AdminVo AdminLogin() {

		AdminVo av = new AdminVo();
		
		String id = InputUtils.getString("아이디를 입력하세요 : ");
		String pwd = InputUtils.getString("비밀번호를 입력하세요 : ");

		
		return av;
	}

	@Override
	public void removeBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modiftUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser() {
		// TODO Auto-generated method stub

	}

}
