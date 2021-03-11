package lab3.exercise3;

class Book extends WrittenItem {
	
	public Book() {
		super();
	}
	
	public Book(int id, String title, int copiesNo, String author) {
		this.setId(id);
		this.setTitle(title);
		this.setCopiesNo(copiesNo);
		this.setAuthor(author);
	}

	@Override
	public String toString() {
		return "Book [Author = " + getAuthor() + ", Title = " + getTitle() + ", Copies = " + getCopiesNo()
			    + "]";
	}
	
	
}
