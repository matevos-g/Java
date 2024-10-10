//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //236
        char[] array = {'s', 't', 'k', 'h', 'k', 'd', 'r', 'b', 'c', 'x'};
        boolean t = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]=='r'){
                t=true;

            }
        }
        System.out.println(t);
        //281

        int [] X = {92, -11, 67, -98, 22, 93, 95, -96, 50, 87};

        int max = X[0];
        for (int i = 0; i < X.length; i++) {
            if (X[i]>max){
                max = X[i];
            }
        }

        int index = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i]>0){
                index++;
                int [] Y = new int[index];
                Y[index-1] = X[i] + max;
                System.out.println(Y[index-1]);
            }
        }
        //282
        int[] X = {92, -11, 67, -98, 22, 93, 95, -96, 50, 87};
        int index = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < X.length; i++) {
            if (X[i] < 0) {
                a = X[i] * -1;
            } else {
                a = X[i];
            }
            if (X[i+1] < 0) {
                b = X[i+1] * -1;
            } else {
                b = X[i+1];
            }
            if (a > b) {
                index++;
                int[] Y = new int[index];
                Y[index - 1] = a;
                System.out.println(Y[index - 1]);
            }
            if (a < b) {
                index++;
                int[] Y = new int[index];
                Y[index - 1] = b;
                System.out.println(Y[index - 1]);
            }
        }
        

    }
}
