package variable;

public class Ex1_1 {
    public static void main(String[] args) {

//        System.out.println(10 / 3);
//        //정수나누기 정수라서 정수로 나옴
//        System.out.println(10.0 / 3);
//        //println 는 10진수로 변환되서 출력

        //printf() 출력형식 지정가능
        System.out.printf("%.2f", 10.0/3);
        System.out.println();
        System.out.printf("%d", 15);
        System.out.println();
        System.out.printf("%o", 15);
        System.out.println();
        System.out.printf("%x", 15);
        System.out.println();
        System.out.printf("%s", Integer.toBinaryString(15));

        System.out.println();
        double f = 123.456789;

        System.out.printf("%f%n",f);




    }
}
