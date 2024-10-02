
public class Main {
    public static void main(String[] args) {

        //161
            for (int i = 1000; i <= 9999; i++) {
                for (int j = 1; j <= 9999; j++) {
                    if (i*26 == j*j) {
                        System.out.println(i);
                        i = 10000;
                    }
                }
            }
        
        //162
            for (int i = 9999; i >= 1000; i--) {
                for (int j = 1; j <= 9999; j++) {
                     if (i*14 == j*j) {
                        System.out.println(i);
                        i = 999;
                    }
                }
            }
        
        //163
            for (int i = 1000; i <= 9999; i++) {
                for (int j = 1; j <= 9999; j++) {
                    if (i*18 == j*j) {
                        System.out.println(i);
                         i = 10000;
                    }
                }
            }
        
        //164
            int n = 10;
            for (int i = 999; i >= 100; i--) {
                if (Math.sqrt(i) > n) {
                    System.out.println(i);
                    i = 99;
                }
            }
        
        //165
            boolean t;
            int tiv = 27;
            if(Math.pow(Math.pow(tiv, 1.0 /3), 3.0 ) == tiv){
                  t = true;
            }
            else{
                t = false;
            }
            System.out.println(t);
        
        //166
            int y;
            int f = 12;
            if(Math.pow(Math.pow(f, 1.0 /4), 4.0 ) == f){
                y = 0;
            }
            else{
                y = 1;
            }
            System.out.println(y);

    }
}
