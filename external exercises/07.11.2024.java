import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mutqagrel Erkarutyun@");
        int m = scanner.nextInt();
        System.out.println("Mutqagrel Laynutyun@");
        int n = scanner.nextInt();
        int [][]array = new int [m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("mutqagrel " + i + " " + j + " tarr@");
                array[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            boolean condition = false;
            for (int j = 0; j < array[i].length; j++) {
                if (array[j][i] < 0) {
                    condition = true;
                    j = array[i].length;
                }

            }
            if (condition == false){
                for (int j = 0; j < array[i].length; j++) {
                    array[j][i] = 0;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
