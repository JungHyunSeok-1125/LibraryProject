package kr.ac.kopo.UserVo;

public class AdminVo {

	private int adminNo;// ������ ��ȣ
	private String adminId;// ������ ���̵�
	private String adminPwd;// ������ ��й�ȣ
	private String adminName;// ������ �̸�

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
