class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));


    }

    public static String arrayAsString(int[][] array) {
        String outPut = "";
        for (int row = 0; row <  array.length; row++) {
            for (int col = 0 ; col < array[row].length; col++) {
                int value = array[row][col];
                outPut += value;
            }
            outPut += "\n";
        }
        return outPut;
    }

}

