package lab3.exercise3;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(String author) {
		super();
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public WrittenItem() {
		super();
	}
	
	
}
