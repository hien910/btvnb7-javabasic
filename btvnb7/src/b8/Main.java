package b8;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
	    System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        ArrayList<Student> student= new ArrayList<Student>();
        for (int i =0; i < n; i++){
            Student s = Input();
            student.add(s);
             Collections.sort(student,
                         Student.idComparator);
        }
        for (Student str : student) {
            System.out.println(str.toString());
        }
	
	}
	
	public static Student Input(){
        System.out.println("---------- ");
        System.out.println("Name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Home town: ");
        String hometown = new Scanner(System.in).nextLine();
        System.out.println("Gender: ");
        int gender = new Scanner(System.in).nextInt();
        System.out.println("Score: ");
        double score = new Scanner(System.in).nextDouble();
        System.out.println("Department: ");
        String deparment = new Scanner(System.in).nextLine();
        System.out.println("---------- ");
        return new Student(name, hometown, gender, score, deparment );
	}
}
