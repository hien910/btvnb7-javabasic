package b8;
import java.util.Comparator;



public class Student
{
    enum Gender {
        MALE, FEMALE, OTHER;
    }
    public static int static_id = 10000;
    public String name;
    public String home_town;
    public Gender gender;
    public double score;
    public String deparment;
    public int id;
    
	public Student(String name,String home_town,int gender,double score,String deparment){
	    this.id = static_id;
	    this.name = name;
	    this.home_town = home_town;
	    if (gender == 1){
	        this.gender =Gender.MALE;
	    }else if (gender == 0){
	        this.gender = Gender.FEMALE;
	    }else{
	        this.gender = Gender.OTHER;
	    }
	    this.score = score;
	    this.deparment = deparment;
	    static_id ++;
	}
	
	@Override
	public String toString(){
        return id + " , " + name + " , " + home_town + " , " + gender + " , " + score + " , " + deparment;
	}
	public static Comparator<Student> idComparator = new Comparator<Student>() {
 
        // Comparing attributes of students
        public int compare(Student s1, Student s2) {
            return s1.id < s2.id ? 1 : -1;
        }
    };
}
