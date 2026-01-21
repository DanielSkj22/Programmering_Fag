import java.util.Random;
public class matrise {
    public int b = 4;
    public int mat[][] = new int[b][b];
    public int mat1[][] = new int [b][b];
    public int result[][] = new int [b][b];
    public matrise(){
        Random random = new Random();
        for(int i = 0; i<b; i++){
            for(int j = 0; j<b; j++){
                mat[i][j] = random.nextInt(10);
                mat1[i][j] = random.nextInt(10);
                result[i][j] = mat[i][j]+ mat1[i][j];
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();
            for(int i = 0; i<b; i++){
                for(int j = 0; j<b; j++){
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
                }
            }
        public void pluss(){
        System.out.println();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
            }
        }
        public void tran(){
        System.out.println();
        for(int j = 0; j<b; j++){
            for(int i = 0; i<b; i++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
            }
        }
        public void multi(){
        int result2 = 0;
        System.out.println();
        int resultat[][] = new int [b][b];
        for(int k = 0; k<b; k++){
            for(int i = 0; i<b; i++){
                int result1 = 0;
                for(int j = 0; j<b; j++){
                    result2 = mat[i][j] * mat1[j][k];
                    result1 += result2;
                }
                resultat[i][k] = result1;
            }
        }
        for(int j = 0; j<b; j++){
            for(int i = 0; i<b; i++){
                System.out.print(resultat[j][i] + " ");
            }
            System.out.println();
        }
    }
}

