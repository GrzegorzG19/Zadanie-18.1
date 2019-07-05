public class Fib {

public static int fibbonachi(int max){
    int n1 = 0;
    int n2 = 1;
    int n3;
    int sum = 0;
        do {
        n3 = n1 + n2;
        if (n3 > max) {
        } else {
            if (n1 % 2 == 0) {
                sum += n1;
            }
            n1 = n2;
            n2 = n3;
        }
    } while ((n1 + n2) < max);
        System.out.println("suma liczb parzystych z fibbonachi to " + sum);
        return sum;
}
}
