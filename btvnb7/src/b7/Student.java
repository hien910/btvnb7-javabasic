package b7;
import java.util.Comparator;


public class Student {
    public int id;
    public static int static_id = 10000;
    public String name;
    public String home_town;
    public String gender;
    public double score;
    public String deparment;

    
	public Student(String name,String home_town,String gender,double score,String deparment){
	    this.id = static_id;
	    this.name = name;
	    this.home_town = home_town;
	    this.gender = gender;
	    this.score = score;
	    this.deparment = deparment;
	    static_id ++;
	}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", home_town='" + home_town + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", deparment='" + deparment + '\'' +
                '}';
    }

    public static Comparator<Student> idComparator = new Comparator<Student>() {
 
        // Comparing attributes of students
        public int compare(Student s1, Student s2) {
            return s1.id < s2.id ? 1 : -1;
        }
    };
}
