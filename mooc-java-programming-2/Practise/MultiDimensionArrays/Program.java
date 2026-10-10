import java.util.ArrayList;
import java.util.HashMap;

class Program {
    public static void main (String[] args) {
        int rowLenght=5;
        int colLength=5;

        int[][] twoDimensionalArray = new int[rowLenght][colLength];

        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int col = 0; col < twoDimensionalArray[row].length; col++) {
                System.out.println("Row [" + row + "]" + ", Column [" + col  + "]" +  " : " + twoDimensionalArray[row][col]);
            }   
        }

        System.out.println();
        System.out.println("----------------------------------------------");

        int[][] mySquare = new int[2][2];
        mySquare[0][0] = 1;
        mySquare[0][1] = 2;
        mySquare[1][0] = 3;
        mySquare[1][1] = 4;

        System.out.println("Sum of rows vals in mySquare[2][2]");
        System.out.println(sumsOfRows(mySquare));
        // 1	2	
        // 3	4

        
        System.out.println();
        System.out.println("----------------------------------------------");

        System.out.println("Sum of columns in mySquare[2][2]");
        System.out.println(sumsOfColumns(mySquare));
        // 1	2	
        // 3	4

        System.out.println();
        System.out.println("----------------------------------------------");
        
        System.out.println("Sum of diagonals in mySquare[2][2]");
        System.out.println(sumsOfDiagonals(mySquare));
        // 1	2	
        // 3	4
    }

    // implement these three methods
    public static ArrayList<Integer> sumsOfRows(int[][] square) {
        ArrayList<Integer> sum = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            int sumPerRow = 0;
            for (int col = 0; col < square[row].length; col++) {
                // get value at [row][col]
                sumPerRow += square[row][col];
            }
            sum.add(sumPerRow);
        }
        return sum;
    }

    // returns an array which has the sum of columns e.g sum of col[1] in every row
    public static ArrayList<Integer> sumsOfColumns(int[][] square) {
        ArrayList<Integer> allSum = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> container =  new HashMap<>();

        for (int row =  0 ; row < square.length; row++) {
            container.put(row, new ArrayList<>());
        }
      
        
        int columnNum = 0;
        for (int k : container.keySet()) {
            // row; increases for every row while the column remains the same
            for (int row = 0 ; row < square.length; row++) {
                container.get(k).add(square[row][columnNum]);
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

    public static ArrayList<Integer> sumsOfDiagonals(int[][] square) {
        int rows = square.length;
        int cols = square[0].length;

        System.out.println("Rows length: " + rows);
        System.out.println("Column length: " + cols);

        int firstSum = 0;
        // get Sum of right -> left diagonals
        int prevRow = 0;
        for (int range = 0; range < cols; range++) {
            for (int i = prevRow; i < rows; i++) {
                firstSum += square[i][range];
                System.out.println("Column Count: " + range + "Row Count: " + i + " firstSum: " + firstSum);
                if (prevRow == i) {
                    prevRow++;
                    break;
                }
            }
        }
        prevRow = 0; // reassign prevRow to 0 to work below
        // get Sum of left -> right diagonals
        int secondSum = 0;
        for (int range = cols -1; range >= 0; range--) {
            for (int i = prevRow; i < rows; i++) {
                secondSum += square[i][range];
                System.out.println("Column Count: " + range + "Row Count: " + i + " secondSum: " + secondSum);
                if (prevRow == i) {
                    prevRow++;
                    break;
                }
            }
        }
        ArrayList<Integer> sumOfDiagonals = new ArrayList<>();
        sumOfDiagonals.add(firstSum);
        sumOfDiagonals.add(secondSum);
        // better solution
        int mainSum = 0;
        int antiSum = 0;
        int columnCount = square[0].length;
        for (int i = 0; i < square.length; i++) {
            mainSum += square[i][i]; 
            antiSum += square[i][columnCount - 1 -i];
        }
        return sumOfDiagonals;


    }
}