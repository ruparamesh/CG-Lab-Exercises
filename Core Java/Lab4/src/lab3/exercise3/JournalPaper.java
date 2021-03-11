package lab3.exercise3;

class JournalPaper extends WrittenItem {
	
	private int year;
	
	public JournalPaper() {
		super();
	}

	public JournalPaper(int id, String title, String author, int copiesNo, int year) {
		this.setId(id);
		this.setTitle(title);
		this.setCopiesNo(copiesNo);
		this.setAuthor(author);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "JournalPaper [ Year = " + getYear() + ", Author = " + getAuthor() + ", Id = " + getId()
				+ ", Title = " + getTitle() + ", Copies = " + getCopiesNo() + "]";
	}
	
	
	
}
