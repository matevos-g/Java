public class Main {
    static int [] bubblesort(int [] a){
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }
    public static void main(String[] args) {
        int [] array = {4,5,2,3,1,6,8,7};
        int [] arraysorted = bubblesort(array);
        for (int i = 0; i < arraysorted.length; i++) {
            System.out.println(arraysorted[i]);
        }
    }
}
