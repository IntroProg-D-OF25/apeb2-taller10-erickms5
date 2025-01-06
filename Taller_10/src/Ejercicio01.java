public class Ejercicio01 {
    public static void main(String[] args) {
        int m =(int)(Math.random()*3)+2;
        int [][] matriz = new int [m][m];
        System.out.println("MATRIZ: " + m + " x " + m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) { 
                matriz [i][j] = (int) (Math.random()*10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("DIAGONAL PRINCIPAL: ");
        System.out.println("");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.println(matriz [i] [i] + "\t");
            System.out.println("");
        } 
        System.out.println("");
        System.out.println("DIAGONAL SECUNDARIA: ");
        System.out.println("");
        for (int i = 0; i < m; i++) {
            for (int j = (m-1); j > i; j--) {
                System.out.print("\t");
            }
            System.out.println(matriz[i][(m-1)-i]  + "\t");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("BAJO LA DIAGONAL PRIMARIA: ");
        System.out.println("");
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if (i > j) {
                    System.out.print(matriz [i] [j] + "\t");
                }
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("SOBRE LA DIAGONAL PRIMARIA: ");
        System.out.println("");
        for (int i = 0; i < (m-1); i++) {
            for (int j = 1 + i; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("BAJO LA DIAGONAL SECUNDARIA: ");
        System.out.println("");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (j > (m - 1 - i)) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("SOBRE LA DIAGONAL SECNDARIA: ");
        System.out.println("");
        for (int i = 0; i < (m-1); i++) {
            for (int j = 0; j < (m-i-1); j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }    
}
/**
 * MATRIZ: 4 x 4
8	7	5	6	

7	1	9	0	

4	1	4	8	

1	1	8	0	


DIAGONAL PRINCIPAL: 

8	

	1	

		4	

			0	


DIAGONAL SECUNDARIA: 

			6	

		9	

	1	

1	


BAJO LA DIAGONAL PRIMARIA: 

7	

4	1	

1	1	8	


SOBRE LA DIAGONAL PRIMARIA: 

7	5	6	9	0	8	
BAJO LA DIAGONAL SECUNDARIA: 

0	4	8	1	8	0	
SOBRE LA DIAGONAL SECNDARIA: 

8	7	5	7	1	4	
 */



















