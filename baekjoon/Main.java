import java.util.*;

public class Main {
    public static void main(String[] args) {
        //정수표현이 가능한 Scanner 클래스의 Scanner 객체 생성. Scanner클래스에는 정수,실수,문자열을 읽어올 수 있음
        Scanner sc = new Scanner(System.in);
        //Scanner클래스의 메소드 중 .next를 사용할 수 있음. 정수형태로 나타내야하므로 Int 사용
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A - B);
    }
}