
public class learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String studentName1 = "George";
		String studentName2 = "Paul";
		String studentName3 = "Alice";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		// Array Example
		String[] students = new String[3];
		
		students[0] = "George";
		students[1] = "Paul";
		students[2] = "Alice";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		System.out.println("Loop Example");
		// Array Loop Example 
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("New Loop Test");
		// Array Enhanced Loop Example
		for (String student : students) {
			System.out.println(student);
		}
		
		// Array Examples Cont.
		
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapple";
		products[2] = "Tomatoes";
		products[3] = "Potatos";
		products[4] = "Ceral";
		
		for (String product : products) {
			System.out.println("Products: " + product);
		}
	}

}
