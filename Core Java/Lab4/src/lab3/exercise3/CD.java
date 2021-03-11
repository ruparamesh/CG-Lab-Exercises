package lab3.exercise3;

class CD extends MediaItem {
	private String artist;
	private String genre;
	
	public CD() {
		super();
	}
	
	public CD(String title, String artist, String genre, int runTime) {
		this.setTitle(title);
		this.setRunTime(runTime);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "CD [ Artist = " + getArtist() + ", Genre = " + getGenre() + ", RunTime = " + getRunTime()
				+ ", Title = " + getTitle() + "]";
	}
	
	
}
