import java.util.Arrays;
import java.util.Scanner;

class ArrayOperation {
    static Scanner sc = new Scanner(System.in); // global variable

    static void starLine(int n, char ch) {
        for (int i = 1; i <= n; i++) 
            System.out.print(ch);
        System.out.println();
    }

    static void menu() {
        starLine(30, '-');
        System.out.println("\t Array Data Processing");
        starLine(30, '-');
        System.out.println(" 1. Sum ");
        System.out.println(" 2. Min ");
        System.out.println(" 3. Max ");
        System.out.println(" 4. Average ");
        System.out.println(" 5. Sort ");
        System.out.println(" 6. Search ");
        System.out.println(" 7. Show Data ");
        System.out.println(" 8. Exit ");
        starLine(30, '-');
        System.out.println(" Choose (1-8) : ");
    }

    static void showData(int n[]) {
        System.out.print("Original Array Data : ");
        for (int i = 0; i < n.length; i++) 
            System.out.print(n[i] + " ");
        System.out.println();
    }

    static void sum(int n[]) {
        showData(n);
        int sum = 0;
        for (int i = 0; i < n.length; i++) 
            sum += n[i];
        System.out.println("Sum of Array Data : " + sum);
    }

    static void avg(int n[]) {
        showData(n);
        int sum = 0;
        for (int i = 0; i < n.length; i++) 
            sum += n[i];
        System.out.println("Average value of Array Data : " + (sum / (double)n.length));
    }

    static void search(int n[]) {
        int foundIndex = -1;
        int searchValue;
        System.out.print("Enter searchValue : ");
        searchValue = sc.nextInt();
        showData(n);
        for (int i = 0; i < n.length ; i++) {//array.length <- no. of elements in array
            if (searchValue == n[i]) {
                foundIndex = i;
                break;  
            }
        }
        if (foundIndex > -1) {
            System.out.println("Found " + searchValue + " at " + (foundIndex + 1) + " position in array");
        } else {
            System.out.println("Not Found " + searchValue + " in array");
        }
    }

    static void sort(int n[]) {
        Arrays.sort(n);
    }

    static void max(int n[]) {
    int max = n[0];
    for (int i = 1; i < n.length; i++) {
        if (n[i] > max) 
            max = n[i];
    }
    System.out.println("Maximum number is : " + max);
    }

    static void min(int n[]) {
        int min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] < min) 
                min = n[i];
        }
        System.out.println("Minimum number is : " + min);
    }

    public static void main(String[] args) {    
    int opt;
    char ch;
    int num[] = {2,3,4,5,44,56,1,2,5,42,23,89,90,78,96};
    do {
        menu();
        opt = sc.nextInt();
        switch(opt) {
            case 1:
                sum(num);
                break;
            case 2:
                min(num);
                break;
            case 3:
                max(num);
                break;
            case 4:
                avg(num);
                break;
            case 5:
                sort(num);
                break;
            case 6:
                search(num);
                break;
            case 7:
                showData(num);
                break;
            case 8:
                return; // Exit the program
        }
        System.out.print("Continue or not (y|n) ? ");
        ch = sc.next().charAt(0);
    } while (ch == 'y' || ch == 'Y');

    starLine(40, '=');
    System.out.println("\t End of the Program");
    starLine(40, '=');

    sc.close(); // Close the scanner
    }

}
