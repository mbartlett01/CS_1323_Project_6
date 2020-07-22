import java.util.ArrayList;

public class Project_6{

    public static void main(String[] args){

        Teacher teacher_1 = new Teacher(1, "Charles", 7000);
        Teacher teacher_2 = new Teacher(2, "Alex", 8000);
        Teacher teacher_3 = new Teacher(3, "Jack", 10000);

        ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(teacher_1);
        teachersList.add(teacher_2);
        teachersList.add(teacher_3);

        Student student_1 = new Student(6, "Robert", 500);
        Student student_2 = new Student(8, "Snow", 300);
        Student student_3 = new Student(10, "Ramsay", 800);

        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(student_1);
        studentsList.add(student_2);
        studentsList.add(student_3);

        School ouGcoe = new School(teachersList, studentsList);

        Teacher chandler = new Teacher(10, "Chandler", 5000);
        ouGcoe.addTeacher(chandler);

        student_1.payfees(8000);
        student_3.payfees(9000);

        System.out.println("OU GCOE has earned $" + ouGcoe.getTotalMoneyEarned());

        // You may choose to edit main and check all the other methods
        // for all the three classes, I have just started, you may choose to explore.


    }
}
