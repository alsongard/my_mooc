
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sum = new ArrayList<>();
        for (int row = 0; row < this.square.length; row++) {
            int sumPerRow = 0;
            for (int col = 0; col < this.square[row].length; col++) {
                // get value at [row][col]
                sumPerRow += this.square[row][col];
            }
            sum.add(sumPerRow);
        }
        return sum;
    }

    // returns an array which has the sum of columns e.g sum of col[1] in every row
    public ArrayList<Integer> sumsOfColumns() {
         ArrayList<Integer> allSum = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> container =  new HashMap<>();

        for (int row=0; row < this.square.length; row++) {
            container.put(row, new ArrayList<>());
        }
      
        
        int columnNum = 0;
        for (int k : container.keySet()) {
            // row; increases for every row while the column remains the same
            for (int row=0 ; row<this.square.length; row++) {
                container.get(k).add(this.square[row][columnNum]);
            }
            // affer adding each row[] [column 0] we increase columnNum to match the second k 
            columnNum++;
        }
        
    
        for (int k: container.keySet()) { // this returns an array of keys [k1, k2, k3]
            int sum = 0;
            for (int num: container.get(k)) { // key: 0 : get all sum, add sum to allSum and for key 2, (repeat)
                sum += num;
            }
            allSum.add(sum);
        }

        return allSum;
    }

    public  ArrayList<Integer> sumsOfDiagonals() {
        // int rows = this.square.length;
        // int cols = this.square[0].length;

        // System.out.println("Rows length: " + rows);
        // System.out.println("Column length: " + cols);

        // int firstSum = 0;
        // // get Sum of right -> left diagonals
        // int prevRow = 0;
        // for (int range = 0; range < cols; range++) {
        //     for (int i = prevRow; i < rows; i++) {
        //         firstSum += this.square[i][range];
        //         System.out.println("Column Count: " + range + "Row Count: " + i + " firstSum: " + firstSum);
        //         if (prevRow == i) {
        //             prevRow++;
        //             break;
        //         }
        //     }
        // }
        // prevRow = 0; // reassign prevRow to 0 to work below
        // // get Sum of left -> right diagonals
        // int secondSum = 0;
        // for (int range = cols -1; range >= 0; range--) {
        //     for (int i = prevRow; i < rows; i++) {
        //         secondSum += this.square[i][range];
        //         System.out.println("Column Count: " + range + "Row Count: " + i + " secondSum: " + secondSum);
        //         if (prevRow == i) {
        //             prevRow++;
        //             break;
        //         }
        //     }
        // }
        // better solution
        int mainSum = 0;
        int antiSum = 0;
        int columnCount = square[0].length;
        for (int i = 0; i < square.length; i++) {
            mainSum += square[i][i]; 
            antiSum += square[i][columnCount - 1 -i];
        }
        ArrayList<Integer> sumOfDiagonals = new ArrayList<>();
        sumOfDiagonals.add(mainSum);
        sumOfDiagonals.add(antiSum);
        return sumOfDiagonals;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}

