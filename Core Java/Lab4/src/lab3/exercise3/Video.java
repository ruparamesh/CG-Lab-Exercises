package lab3.exercise3;

class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;
	
	public Video() {
		super();
	}

	public Video(String title,String director, String genre, int year, int runTime) {
		this.setTitle(title);
		this.setRunTime(runTime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Video [ Director = " + getDirector() + ", Genre = " + getGenre() + ", Year = " + getYear()
				+ ", RunTime = " + getRunTime() + "]";
	}
	
	
}
