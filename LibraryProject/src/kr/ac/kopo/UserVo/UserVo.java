package kr.ac.kopo.UserVo;

public class UserVo {

	private int userNo; // 회원번호
	private String userName; // 책이름
	private String userPhone; // 회원전화번호
	private String userId; // 회원아이디
	private String userPwd; // 회원아이디
	private String userRegDate;// 가입일

	public UserVo() {

	}

	public UserVo(int userNo, String userName, String userPhone, String userId, String userPwd, String userRegDate) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userRegDate = userRegDate;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserRegDate() {
		return userRegDate;
	}

	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}

	public String voString() {
		String a = Integer.toString(this.userNo) + "@@" + this.userName + "@@" + this.userPhone + "@@" + this.userId
				+ "@@" + this.userPwd + "@@" + this.userRegDate;
		return a;
	}

}
