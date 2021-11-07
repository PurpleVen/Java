public class Transpose
{
    public static void main(String[] args){
        int row, col;

        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        row = a.length;
        col = a[0].length;

        int t[][] = new int[col][row];

        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                t[i][j] = a[j][i];
            }
        }

        System.out.println("The Transpose Is: ");
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}


