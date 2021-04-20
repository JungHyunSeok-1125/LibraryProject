package kr.ac.kopo.Manager;

import kr.ac.kopo.UserVo.AdminVo;

public interface AdminManager {

	public AdminVo AdminLogin();

	public void removeBook();

	public void addUser();

	public void modiftUser();

	public void removeUser();

}
