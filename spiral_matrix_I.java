import java.util.Scanner;
class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int n = sc.nextInt();
        //result matrix
        int[][] matrix = new int[m][n];
        
        int total = m * n;
        int count = 0;
        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;
        int num = 1;
        
        while(count<total){
            //top row -> left to right
            for(int i=startCol; count<total && i<=endCol; i++){
                //take the col ele
                matrix[startRow][i] = num++;
                count++;
            }
            startRow++;
            //right most col -> top to bottom
            for(int i=startRow; count<total && i<=endRow; i++){
                //take the row ele
                matrix[i][endCol] = num++;
                count++;
            }
            endCol--;
            //bottom row -> left to right
            for(int i=endCol; count<total && i>=startCol; i--){
                //take the col ele
                matrix[endRow][i] = num++;
                count++;
            }
            endRow--;
            //left most col -> bottom to top
            for(int i=endRow; count<total && i>=startRow; i--){
                //take row ele
                matrix[i][startCol] = num++;
                count++;
            }
            startCol++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
