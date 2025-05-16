class Solution {
    // public static void markRow(int i, int[][] matrix){
    //     for(int j=0; j<matrix[0].length; j++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    // public static void markCol(int j, int[][] matrix){
    //     for(int i=0; i<matrix.length; i++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    public void setZeroes(int[][] matrix) {

        // O(n^3)

        // int n = matrix.length;
        // int m = matrix[0].length;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == 0){
        //             markRow(i,matrix);
        //             markCol(j,matrix);
        //         }
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == -1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }


        int n = matrix.length;
        int m = matrix[0].length;
        int row [] = new int[n];
        int col [] = new int[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] == 1|| col[j] == 1){
                    matrix[i][j] = 0;

                }
            }
        }

    }
}