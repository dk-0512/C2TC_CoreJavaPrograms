package oops.inheritance.multilevelinheritance;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Multlevelinheritance {

	public static void main(String[] args) {
		Person p1 = new Person("surya",99025567l,new Date(2005,04,16));
		System.out.println(p1);

		p1 = new Employee("Pranav", 8080807070l, new Date(1995, 05, 07), "Sales", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
				"Signing Authority");
		System.out.println(p1);

	}

}
