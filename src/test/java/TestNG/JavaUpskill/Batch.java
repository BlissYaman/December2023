package TestNG.JavaUpskill;

import java.util.ArrayList;
import java.util.List;

public class Batch {
    private String batchName;
    List<Student> students;

    public Batch(String batchN){
       this.batchName=batchN;
       students= new ArrayList<>();

    }

    public void addStudent(Student student){
        students.add(student);

    }


}
