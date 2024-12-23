import java.util.*;
import java.math.BigInteger;  // BigInteger 클래스를 사용하여 큰 숫자를 처리

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // BigInteger로 입력 받기
        BigInteger A = new BigInteger(scanner.nextLine());
        BigInteger B = new BigInteger(scanner.nextLine());

        // A + B, A - B, A * B 연산
        BigInteger sum = A.add(B);
        BigInteger diff = A.subtract(B);
        BigInteger product = A.multiply(B);

        // 출력
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
    }
}
