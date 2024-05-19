import java.util.Arrays;
import java.util.Scanner;

class Sorting{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] m = new int[7][5];
        System.out.println("Enter the elements of the 7x5 Matrix :");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 7; i++) {
            Arrays.sort(m[i]);
        }

        // for (int i=0; i<m.length; i++) {
        //     for (int j=i+1; j<m.length ; j++) {
        //         for (int k=0; k<m[i].length-j-1; k++) {
        //             if (m[i][k]>m[i][k+1]) {
        //                 int temp=m[i][k];
        //                 m[i][k]=m[i][k+1];
        //                 m[i][k+1]=temp;
        //             }
        //         }
        //     }
        // }

        System.out.println("Sorted Matrix:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
