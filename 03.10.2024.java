
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int [] array = new int[n];
        array[0] = 12;
        array[1] = -13;
        array[2] = 14;
        array[3] = 15;
        array[4] = 16;
        array[5] = -17;
        array[6] = -18;
        array[7] = 19;
        array[8] = -20;
        array[9] = 21;


        //180
        int countd = 0;
        int countb = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countb++;
            }
            else {
                countd++;
            }
        }

        System.out.println(countd + " " + countb);

        //181
        int a = 13;
        int b = 24;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);

        //182

        int c = 14;
        int d = 45;
        int product = 1;

        for (int i = c; i < d; i++) {
            product = product * i;
        }

        System.out.println(product);

        //183
        int count = 0;
        for (int i = a-1; i < b; i++) {
            count++;
        }

        System.out.println(count);

        //184
        int k = 14;
        sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i]*-1 < k){
                    sum += array[i]*array[i]*array[i];
                }
            }
            else{
                if (array[i] < k){
                    sum += array[i]*array[i]*array[i];
                }
            }
        }

        System.out.println(sum);

        //185
        int t = 15;
        product = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i]*-1 < t){
                   product *= array[i];
                }
            }
            else{
                if (array[i] < t){
                    product *= array[i];
                }
            }
        }

        System.out.println(product);

        //186
        k = 17;
        count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i]*-1 < k){
                    count++;
                }
            }
            else{
                if (array[i] < k){
                    count++;
                }
            }
        }

        System.out.println(sum);
        
        //187
        count = 0;
        sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (i%k == 0) {
                count++;
                sum += array[i];
            }
        }

        System.out.println(sum/count);
        
        //188
        sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i%k == 0) {
                sum += array[i];
            }
        }

        System.out.println(sum);

        //189
        product = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                product *= array[i];
            }
        }

        System.out.println(product);
    }
}
