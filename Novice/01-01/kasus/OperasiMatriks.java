public class OperasiMatriks{
    public static void main (String[] args){
     
        int matriks [][] = new int[2][2];
        matriks[0][0] = 5;
        matriks[0][1] = 0;
        matriks[1][0] = 2;
        matriks[1][1] = 6;

        int matriks2 [][] = new int[2][2];
        matriks2[0][0] = 1;
        matriks2[0][1] = 0;
        matriks2[1][0] = 4;
        matriks2[1][1] = 2;

        for(int i=0; i<matriks.length; i++){
            for(int j=0; j<matriks2[0].length; j++){
                int elem = matriks[i][j] + matriks2[i][j];
                System.out.print( elem + " ");
            }
            System.out.println();
        }
    }
}