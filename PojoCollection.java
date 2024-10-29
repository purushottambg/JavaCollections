import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PojoCollection {
    public static void main(String[] args) {
        Set<Student> student = new HashSet<>();
        student.add(new Student(2, "Vishal"));
        student.add(new Student(1, "Ram"));
        student.add(new Student(4, "Rajini"));
        student.add(new Student(3, "Sampada"));        
        student.add(new Student(6, "Vishal")); 
        System.out.println(student); 
        System.out.println("Trying to add duplicate with id 2");
        student.add(new Student(2, "Samarth"));
        System.out.println(student);    
    }
}

class Student{
    int id;
    String Name;
    public Student(int id, String name){
        this.Name=name;
        this.id=id;
    }
    @Override
    public String toString(){   //To return the data inreadable format
        return "Student: " +
        "Id: " + id +
        "  name: " + Name +"\t" ;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

}
