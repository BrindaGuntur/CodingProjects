public class EgyptianPyramid {
//have only one sub left and see what happened. 
    public static void main(String[] args) {
        // Parsing the command line arguments for pyramid size and number of bricks
        int pyramidSize = Integer.parseInt(args[0]);
        //java EgyptianPyramid 5 9 
        //no bricks remaining 
        //array [5][5] and nine x's 
        // =====
        // =====
        // ==X==
        // =XXX=
        // XXXXX

        //somthing like tha t
        int totalBricks = Integer.parseInt(args[1]);
        
        // Initializing the 2D array to represent the pyramid
        char[][] pyramidArray = new char[pyramidSize][pyramidSize];
        
        // Variables to control brick placement
        int bricksUsed = 0;
        int firstColumn = 0;
        int currentRow = pyramidSize - 1;

        for (int row = currentRow; row >= 0; row--) {
            for (int col = firstColumn; col <= row; col++) 
            {
//if the bricksused is less than the total Bricks then print X in the pyramid arrya 
//if added to the the pryamid then add to count 
                if (bricksUsed < totalBricks) {
                    pyramidArray[row][col] = 'X';
                    bricksUsed++;
                }
            }
           //continue to the next col 
           //bruh aint no way i go this wrong 
            firstColumn = pyramidSize - row;
        }
        //going through the row again and if there is no X then add to the equal sign becuase that's what the assignment reuires
        for (int row = 0; row < pyramidSize; row++) 
        {

            for (int col = 0; col < pyramidSize; col++) 
            {

//MAKE  SURE TO GO THROUHG THE DAMN ARRAY 
                if (pyramidArray[row][col] != 'X') 
                {
                    pyramidArray[row][col] = '=';
                }
            }
        }
//slay I got this right 
//Go through the array
//and keep printing to the array , this is to actualy print out the arrray this is because the assignment asks us fo rht at
//u got this homie 
//go throught the row, and go thru the col theb keep going thru the actual array

        for (int row = 0; row < pyramidSize; row++) 
        
        {
            for (int col = 0; col < pyramidSize; col++) 
            
            {
                System.out.print(pyramidArray[row][col]);
            }
            //DONT USE PRINT this is becasue it would prnt oyt the wrong output 
            System.out.println();
        }

//the reamingin bricks bs BRUH 
//result = totialBricks -bricks Usesed + Bricks Remainin 
        System.out.println((totalBricks - bricksUsed) + " Bricks Remaining");
    }
}
//bruh i should be a cs geniys, i got this this shit 

