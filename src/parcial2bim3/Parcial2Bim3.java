
package parcial2bim3;

public class Parcial2Bim3 {

    public static void main(String[] args) {
        int num [][] = {{5,7,9},{4,2,1},{1,1,1}};
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][i] = num[j][j] + 1;
                System.out.print(num[j][j] + "|");
            }
 
        }
    }
    
}
