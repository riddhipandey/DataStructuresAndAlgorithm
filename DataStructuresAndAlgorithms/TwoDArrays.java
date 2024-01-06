public class TwoDArrays{
    public static void main(String args[]){
        System.out.println("Hello 2D Arrays!");
        // int myArray[] = {2,4,6,8,10}; 
        // int myArrayTemp[] = {1,-2,6,-1,3}; 
        // int matrix[][] = new int[3][3];
        // matrix[0]={1,2,3};
        int matrix[][] = {
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        int matrix1[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        int matrix2[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};

                stairCaseSearch(matrix2,33);
    }

    public static boolean stairCaseSearch(int[][] a, int key){
        int n = a.length;
        int m = a[0].length;
        int startRow =0, endRow=n-1, startCol=0, endCol = m-1 , counter=0;

        while(startRow<=endRow && endCol>=startCol){
            counter++;
            if(key == a[startRow][endCol]){
                System.out.println("Key found at index (" + startRow +","+endCol+")" + counter);
                return true;
            }else if(key<a[startRow][endCol]){
                endCol--;
            }else{
                startRow++;
            }
        }
        System.out.println("Key not found" + counter);
        return false;
    }

    public static void matrixDiagonalSum(int[][] a){
        int n = a.length;
        int m = a[0].length;
        int primaryDSum = 0, secondaryDSum=0;
        //Time complexity O(n^2)
        for(int i=0; i<n;i++){
            primaryDSum += a[i][i];
            if(i!=(n-i-1)){
                secondaryDSum += a[i][n-i-1]; 
            }
        }

        // for(int i=0; i<n;i++){
        //     for(int j=0; j<m;j++){
        //         if(i==j){
        //             primaryDSum += a[i][j];
        //         }
        //         if((i+j) == n-1 && i!=j){
        //             secondaryDSum += a[i][j];
        //         }
        //     }
        // }
        System.out.println("Primary Diagonal sum = "+primaryDSum);
        System.out.println("Secondary Diagonal sum = "+secondaryDSum);
        System.out.println("Total Diagonal sum = "+(primaryDSum+secondaryDSum));
    }

    public static void spiralMatrix(int[][] a){
        int n = a.length;
        int m = a[0].length;
        int startRow=0, startCol=0, endRow=n-1, endCol=m-1;
        System.out.println(n + " "+m);

        while(startRow<endRow && startCol<endCol){
            //Top boundary
            for(int i=startCol; i<= endCol; i++){
                System.out.print(a[startRow][i] + "  "); 
            }
            startRow++;
            //Right boundary
            for(int i=startRow; i<= endRow; i++){
                System.out.print(a[i][endCol] + "  "); 
            }
            endCol--;
            //Bottom boundary
            for(int i=endCol; i>= startCol; i--){
                System.out.print(a[endRow][i] + "  "); 
            }
            endRow--;
            //Left boundary
            for(int i=endRow; i>= startRow; i--){
                System.out.print(a[i][startCol] + "  "); 
            }
            startCol++;
        }

        if(startRow==endRow && startCol == endCol){
            System.out.print(a[startRow][startCol] + "  "); 
        }
    }


    public static void print2DArray(int[][] a){
        int n = a.length;
        int m = a[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}