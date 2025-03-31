package operator.example;

public class Makingstar_example_2 {
    public static void main(String[] args) {

        String a = "*";
        int n = 5;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || i + j == n - 1) {

                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }

                }


            }
        }
    }










