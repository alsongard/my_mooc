public class Teacher extends Person {

    private int salary; 

    //constructor
    public Teacher(String teacherName, String teacherAddress, int salary) {
        super(teacherName, teacherAddress);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }

}

