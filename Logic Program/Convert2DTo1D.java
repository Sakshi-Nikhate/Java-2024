 
    public class Convert2DTo1D {
        public static void main(String[] args) {
            // Input 2D array
            int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            // Get the total number of elements
            int rows = twoDArray.length;
            int cols = twoDArray[0].length;
            int[] oneDArray = new int[rows * cols];
    
            // Flatten the 2D array into a 1D array
            int index = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    oneDArray[index++] = twoDArray[i][j];
                }
            }
    
            // Display the 1D array
            System.out.println("1D Array:");
            for (int element : oneDArray) {
                System.out.print(element + " ");
            }
        }
    }
    

