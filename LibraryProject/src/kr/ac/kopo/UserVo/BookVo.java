package kr.ac.kopo.UserVo;

public class BookVo {

	private int bookNo; // 책번호
	private String bookName; // 책이름
	private String bookWriter; // 책저자
	private String bookPublish; // 출판사
	private int bookPrice; // 책가격

	public BookVo() {

	}

	public BookVo(int bookNo, String bookName, String bookWriter, String bookPublish, int bookPrice) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookPublish = bookPublish;
		this.bookPrice = bookPrice;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getBookPublish() {
		return bookPublish;
	}

	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String voString() {
		String a = Integer.toString(this.bookNo) + "@@" + this.bookName + "@@" + this.bookWriter + "@@"
				+ this.bookPublish + "@@" + this.bookPrice;
		return a;
	}

}
