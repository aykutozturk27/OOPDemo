package oopDemo;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.name = "Engin Demiroð";
		
		Instructor instructor2 = new Instructor();
		instructor2.name =" Aykut Öztürk";
		
		Instructor[] instructors = {instructor1, instructor2};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);	
		}
		
		Category category = new Category();
		category.name = "Programlama";
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(category);
	}

}
