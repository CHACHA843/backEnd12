package operator;

public class MakingStar_2 {
    public static void main(String[] args) {

        int n = 5;
        String a = "*";

        for (int i = 0; i < n; i++) {            //행
            for (int j = 0; j < n; j++) {        //열

                if (i == j || i + j == n - 1) {
                    //i == j왼쪽위에서 오른쪽 아래로 대각선

                    //j == n오른쪽위에서 왼쪽 아래로 대각선
                    System.out.print(a);
                } else {

                    System.out.print(" ");
                }
            }

            // (0,0)(0,1)(0,2)(0,3)(0,4)
            // (1,0)(1,1)(1,2)(1,3)(1,4)
            // (2,0)(2,1)(2,2)(2,3)(2,4)
            // (3,0)(3,1)(3,2)(3,3)(3,4)
            // (4,0)(4,1)(4,2)(4,3)(4,4)
            System.out.println();

            // 줄바꿈 처리
        }
    }
}
