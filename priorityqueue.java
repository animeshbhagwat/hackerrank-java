import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
    private int id;
    private String name;
    private double cgpa;
    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return (this.id);
    }
    public String getName() {
        return (this.name);
    }
    public double getCGPA() {
        return (this.cgpa);
    }
}

class Priorities{
        public List < Student > getStudents(List < String > events) {
        PriorityQueue<Student> student_queue = new PriorityQueue(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName.thenComparing(Student::getId)));
            List < Student > students = new ArrayList < Student > ();
            for (String e: events) {
                Scanner in =new Scanner(e);
                String event = in.next();
                if (event.equals("ENTER")) {
                    String name = in.next();
                    float cgpa = in.nextFloat();
                    int token = in.nextInt();
    
                    Student student = new Student(token, name, cgpa);
                    student_queue.add(student);
                } else if (event.equals("SERVED")) {
                    Student first = student_queue.poll();
                } in .close();
            }
            Student first = student_queue.poll();
            if (first == null) {
                return students;
            } else {
                while (first != null) {
    
                    students.add(first);
                    first = student_queue.poll();
    
                }
                return students;
            }
    
        }
    }

