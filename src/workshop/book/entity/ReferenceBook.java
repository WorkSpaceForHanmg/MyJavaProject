package workshop.book.entity;

public class ReferenceBook extends Publication {
	private String fielid;
	public ReferenceBook() {
		
	}

	public ReferenceBook(String title, String publishingDate, int page, int price,String fielid) {
		super(title, publishingDate, page, price);
		this.fielid = fielid;
	}

	public String getFielid() {
		return fielid;
	}

	public void setFielid(String fielid) {
		this.fielid = fielid;
	}
	
}
