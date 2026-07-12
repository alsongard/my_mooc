public class Student extends Person{
    private int credit;

    // constuctor
    public Student(String studentName, String studentAddress){
        super(studentName, studentAddress);
        this.credit = 0;
    }

    public void study() {
        this.credit++;
    }

    public int credits() {
        return this.credit;
    }

    public String toString(){
        return super.toString() + "\n  Study credits " + this.credit;
    }
}

