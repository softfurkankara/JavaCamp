
public class LessonManager {

	public void EnterTheProgram(Lesson lesson) {
		System.out.println(lesson.id+" Numarali ders "+lesson.title+"dersidir."
				+lesson.instructor+" hocamiz bu dersi kodlama.io youtube kanalında "+lesson.price+" bir sekilde anlatmaktadır."
				+" Siteye giriş yapmıs bulunmaktasınız...");
	}
	public void QuiteTheProgram(Lesson lesson) {
		System.out.println(lesson.id+" Numarali ders "+lesson.title+"dersidir."
				+lesson.instructor+" hocamiz bu dersi kodlama.io youtube kanalında "+lesson.price+" bir şekilde anlatmaktadır."
				+" Siteden cıkıs yaptınız...");
	}
}
