package lab3.exercise3;

public class Exercise3 {

	public static void main(String[] args) {
		
		Book b1 = new Book(101, "React", 15, "Alvin");
		JournalPaper jp1 = new JournalPaper(105, "Java", "Ram", 25, 2020);
		
		System.out.println(b1.toString());
		System.out.println(jp1.toString());
		
		Video v1 = new Video("SpiderMan", "Kelly", "Action", 2003, 127);
		CD cd1 = new CD("SuperMan", "Robert", "Rap", 27);
		
		System.out.println(v1.toString());
		System.out.println(cd1.toString());

	}

}
