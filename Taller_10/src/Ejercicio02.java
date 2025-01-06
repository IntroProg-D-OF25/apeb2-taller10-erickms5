public class Ejercicio02 {
    public static void main(String[] args) {
        int m =(int)(Math.random()*3)+2;
        int [][] matriz = new int [m][m];
        int [][] matriz2 = new int [m][m];
        System.out.println("MATRIZ PRINCIPAL: ");
        System.out.println("");        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) { 
                matriz [i][j] = (int) (Math.random()*10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("MATRIZ SECUNDARIA: ");
        System.out.println("");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz2 [i][j] = (int) (Math.random()*10);
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("SUMA: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) { 
                System.out.println(matriz[i][j] + " + " + matriz2[i][j] + " = " + (matriz[i][j] + matriz2[i][j]));
            }
        }
        System.out.println("");
        System.out.println("MULTIPLICACIÓN: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) { 
                System.out.println( matriz[i][j] + " * " + matriz2[i][j] + " = " + (matriz[i][j] * matriz2[i][j]));                
            }
        }
    }
}
/**
 * MATRIZ PRINCIPAL: 

7	9	9	

8	6	7	

7	9	8	


MATRIZ SECUNDARIA: 

7	1	3	

8	0	1	

6	8	8	


SUMA: 
7 + 7 = 14
9 + 1 = 10
9 + 3 = 12
8 + 8 = 16
6 + 0 = 6
7 + 1 = 8
7 + 6 = 13
9 + 8 = 17
8 + 8 = 16

MULTIPLICACI�N: 
7 * 7 = 49
9 * 1 = 9
9 * 3 = 27
8 * 8 = 64
6 * 0 = 0
7 * 1 = 7
7 * 6 = 42
9 * 8 = 72
8 * 8 = 64
 */