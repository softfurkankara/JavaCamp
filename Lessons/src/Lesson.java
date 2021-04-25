
public class Lesson {
	int id;
	String title;
	String description;
	String instructor;
	String price;
	

	public Lesson() {
		System.out.println("Anasayfaya Hosgeldiniz...");
	}
	public Lesson(int id,String title,String description,String insructor,String price ) {
		this();
		this.id=id;
		this.title=title;
		this.description=description;
		this.instructor=insructor;
		this.price=price;
		
	}
}
