
public class Main {

	public static void main(String[] args) {
		Lesson lesson1=new Lesson();
		Lesson lesson2=new Lesson(
				1,
				"Yazilim Gelistirici Yetiştirme Kampi(C#+Angular) ",
				"2 ay surecek Yazilim Gelistiric Yetistirme Kampimizin takip,dokuman...",
				"Engin Demiroglu",
				"Ucretsiz"
			
				);
		Lesson lesson3=new Lesson(
				2,
				"Yazilim Gelistirici Yetiştirme Kampi(JAVA+REACT) ",
				"2 ay surecek Yazilim Gelistiric Yetistirme Kampimizin takip,dokuman...",
				"Engin Demiroglu",
				"Ucretsiz"
				
				);
		LessonManager lessonManager=new LessonManager();
		lessonManager.EnterTheProgram(lesson2);
		lessonManager.QuiteTheProgram(lesson3);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		Lesson[] lesson= {
				lesson1,lesson2,lesson3
		};
		for(Lesson lessons:lesson) {
			System.out.println(lessons.id);
			System.out.println(lessons.title);
			System.out.println(lessons.description);
			System.out.println(lessons.instructor);
			System.out.println(lessons.price);
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			
		}

	}

}
