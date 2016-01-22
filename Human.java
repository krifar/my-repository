import java.util.ArrayList;
import java.util.Collections;

public class Human {
    private String personalName;
    private String familyName;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public Human(String personalName, String familyName) {
        this.personalName = personalName;
        this.familyName = familyName;
    }

}

class Student extends Human implements Comparable<Student>{
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }


    public Student(String personalName, String familyName, int mark) {
        super(personalName, familyName);
        this.mark = mark;
    }


    public int compareTo(Student compareMarks) {

        int compareMark = ((Student) compareMarks).getMark();

        return this.mark - compareMark;
    }

}

class Worker extends Human  implements Comparable<Worker>{
    private int salary;
    private double workHours;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public Worker(String personalName, String familyName, int salary, double workHours) {
        super(personalName, familyName);
        this.salary = salary;
        this.workHours = workHours;
    }

    public void moneyPerHour() {
        System.out.println("hourly wage: " + this.salary/this.workHours);
    }

    public int compareTo(Worker compareSalaries) {

        int compareSalary = ((Worker) compareSalaries).getSalary();

        return compareSalary - this.salary;
    }

    public static void main(String[] args) {
        //Task 1
        Worker pesho = new Worker("Pesho", "Petrov", 102, 8);
        pesho.moneyPerHour();

        //Task 2
        ArrayList<Student> students = new ArrayList<>(10);
        students.add(0, new Student("Georgi", "Georgiev", 4));
        students.add(1, new Student("Spas", "Krumov", 3));
        students.add(2, new Student("Blagoi", "Krasimirov", 2));
        students.add(3, new Student("Georgi", "Uzunov", 6));
        students.add(4, new Student("Atanas", "Georgiev", 6));
        students.add(5, new Student("Krum", "Hristov", 2));
        students.add(6, new Student("Daniel", "Danielov", 5));
        students.add(7, new Student("Petar", "Georgiev", 3));
        students.add(8, new Student("Ivan", "Dimitrov", 3));
        students.add(9, new Student("Canko", "Lazarov", 4));
        Collections.sort(students);
        for(Student temp: students){
            System.out.println(temp.getFamilyName()+"'s " + "mark: " + temp.getMark());
        }

        //Task 3
        ArrayList<Worker> workers = new ArrayList<>(10);
        workers.add(0, new Worker("Georgi", "Georgiev", 121, 8));
        workers.add(1, new Worker("Spas", "Krumov", 220, 6));
        workers.add(2, new Worker("Blagoi", "Krasimirov", 160, 4));
        workers.add(3, new Worker("Georgi", "Uzunov", 60,2));
        workers.add(4, new Worker("Atanas", "Georgiev", 180, 6));
        workers.add(5, new Worker("Krum", "Hristov", 197, 8));
        workers.add(6, new Worker("Daniel", "Danielov", 400, 12));
        workers.add(7, new Worker("Petar", "Georgiev", 180, 6));
        workers.add(8, new Worker("Ivan", "Dimitrov", 220, 6));
        workers.add(9, new Worker("Canko", "Lazarov", 100, 5));
        Collections.sort(workers);
        for(Worker temp: workers){
            System.out.println(temp.getFamilyName()+"'s " + "salary: " + temp.getSalary());
        }

    }
}
