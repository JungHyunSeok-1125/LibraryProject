package kr.ac.kopo.UserVo;

public class AdminVo {

	private int adminNo;// 관리자 번호
	private String adminId;// 관리자 아이디
	private String adminPwd;// 관리자 비밀번호
	private String adminName;// 관리자 이름

	public AdminVo() {

	}

	public AdminVo(int adminNo, String adminId, String adminPwd, String adminName) {
		super();
		this.adminNo = adminNo;
		this.adminId = adminId;
		this.adminPwd = adminPwd;
		this.adminName = adminName;
	}

	public int getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String voString() {
		String a = Integer.toString(this.adminNo) + "@@" + this.adminId + "@@" + this.adminPwd + "@@" + this.adminName;
		return a;
	}

}
