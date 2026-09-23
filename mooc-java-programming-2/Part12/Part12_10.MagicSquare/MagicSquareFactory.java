
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here

        // get first row and get middle column
        int myCol = size/2;
        int myRow = 0;
        
        square.placeValue(myRow, myCol, 1);

        for (int i = 2; i <= size * size; i++) {
           
            // move up(row -1) and righ(col + 1)
            int nextRow = myRow-1;
            int nextCol = myCol+1;
            if (nextRow  < 0 ) {
                // wrap 
                nextRow = size - 1;
            } 
            if (nextCol >= size) {
                nextCol = 0; // reassign to first Column
            } 


            // check if value exist in given [row][col]
            if (square.readValue(nextRow, nextCol) != 0) {
                // value exist, there move vertically down : row + 1, column remains the same
                nextRow = myRow + 1; // takes us back to the previous Cell and move down
                nextCol = myCol;
                square.placeValue(nextRow,nextCol, i);
            } else { // no value exist we can just add the value: using move up , right already done
                square.placeValue(nextRow, nextCol,i);            
            }

            myRow = nextRow;
            myCol = nextCol;
        }

        return square;
    }

}

