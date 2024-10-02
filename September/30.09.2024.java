public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        array[5] = 60;
        array[6] = 70;
        array[7] = 80;
        array[8] = 90;
        array[9] = 100;

        //171
        int sum = 0;
        int count =0;

        for(int i=0; i<=array.length; i++){
            if (array[i]>=0){
                sum += array[i];
                count++;
            }
        }

        System.out.println(sum/count);


        //172
        sum = 0;
        count =0;

        for(int i=0; i<=array.length; i++){
            if (array[i]<0){
                sum += array[i];
                count++;
            }
        }

        System.out.println(sum/count);

        //175
        sum = 0;

        for(int i=0; i<=array.length; i++){
            if (i%2 == 0){
                sum += array[i];
            }
        }

        System.out.println(sum);

        //176
        sum = 1;

        for(int i=0; i<=array.length; i++){
            if (i%2 == 0){
                sum = sum*array[i];
            }
        }

        System.out.println(sum);

        //177
        sum = 1;

        for(int i=0; i<=array.length; i++){
            if (i%2 != 0){
                sum = sum*(array[i]*array[i]);
            }
        }

        System.out.println(sum);

        //178

        sum = 0;

        for(int i=0; i<=array.length; i++){
            if (i%2 != 0){
                if (array[i] <0){
                    sum += (array[i]*-1);
                }
                else{
                    sum += array[i];
                }
            }
        }

        System.out.println(sum);

        //179

        count = 0;
        int k = 3;

        for(int i=0; i<=array.length; i++){
            if (i%k == 0){
                count++;
            }
        }

        System.out.println(count);

        //180

        count = 0;
        int countmin = 0;

        for(int i=0; i<=array.length; i++){
            if (i >= 0){
                count++;
            }
            if(i<0){
                countmin++;
            }
        }

        System.out.println(count + " " + countmin);

    }
}
