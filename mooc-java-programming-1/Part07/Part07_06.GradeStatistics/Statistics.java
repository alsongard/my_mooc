import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Statistics {

    private ArrayList<Integer> pointList;
    private ArrayList<Integer> gradeList;

    // Constructor
    public Statistics() {
        this.pointList = new ArrayList<>();
        this.gradeList = new ArrayList<>();
    }

    public double returnAverage() {
        double sum = 0.0;
        for (int value: this.pointList){
            sum +=value;
        } 

        double average = sum / this.pointList.size();
        return average;
    }


    public void addValue(int userValue) {

        if (userValue >= 0 && userValue <= 100) {
            this.pointList.add(userValue);
        }
    }

    public double getPassingGradeAverage() {
        double count = 0.0;
        double sum = 0.0;
        for (int value : this.pointList) {
            if (value > 50) {
                count++;
                sum +=value;
            }
        }

        if (count == 0) {
            return -0.0;
        }
        double average = sum / count;
        return average;
    }

    public double getPassPercentage() {
        double count = 0.0; 
        for (int value: this.pointList) {
            if (value >= 50) {
                count++;
            }
        }

        double passPercentage = 100 * (count/ this.pointList.size());
        return passPercentage;
    }


    public void getGrades() {
        for (int value: this.pointList){
            if (value >= 90) {
                this.gradeList.add(5);
            } else if (value >= 80 && value < 90) {
                this.gradeList.add(4);
            } else if (value >= 70 && value < 80) {
                this.gradeList.add(3);
            } else if (value >= 60 && value < 70) {
                this.gradeList.add(2);
            } else if (value >= 50 && value < 60) {
                this.gradeList.add(1);
            } else {
                this.gradeList.add(0);
            }
        }

        Collections.sort(this.gradeList, Collections.reverseOrder());
    }
    public void printStars() {
        getGrades();
        // lowest grade = 0
        // highest grade = 5

        // int a = 0;
        // while (a < this.gradeList.size()) {
        //     int intHolder = this.gradeList.get(a);

        //     System.out.print(this.gradeList.get(a) + ": ");
        //     for (int value: this.gradeList) {
        //         if (value == intHolder) {
        //             System.out.print("*");
        //         }

        //     }
        //     System.out.println();
        //     a++;
        // }

        for (int grade = 5; grade >= 0; grade--) {
            int count = 0;
            for (int g : this.gradeList) {
                if (g == grade) {
                    count++;
                }
            }

            // print grade
            System.out.print(grade + ": ");

            for (int i = 0; i< count; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

