public class TwoDArrays {

    public static void main(String[] args) {
    // int[] arr=new int[size];  for creating array
        int row=2;
        int col=3;

        int[][] mat= new int[row][col]; // creating matrix;

       int val=0;

        for (int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.println(mat[i][j]=val);
                val++;
            }
        }
        System.out.println(mat[0].length);
    }
}



