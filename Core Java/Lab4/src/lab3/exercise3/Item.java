package lab3.exercise3;

public abstract class Item {
	private int id;
	private String title;
	private int copiesNo;
	
	public Item() {
		super();
	}

	public Item(int id, String title, int copiesNo) {
		super();
		this.id = id;
		this.title = title;
		this.copiesNo = copiesNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopiesNo() {
		return copiesNo;
	}

	public void setCopiesNo(int copiesNo) {
		this.copiesNo = copiesNo;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", copiesNo=" + copiesNo + "]";
	}
	
	
	
}
