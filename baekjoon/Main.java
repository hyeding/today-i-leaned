package baekjoon;
import java.util.*; //Scanner 클래스를 위해 자바 모든 클래스 사용 가능하도록 import 함
                    //또는 import java.util.Scanner;로 Scanner 클래스만 import 가능함

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //사용자로부터 값을 입력받기 위한 Scanner 클래스 생성
        // 빈공간에 sc를 입력하면 import에 Scanner 클래스 자동생성됨


        int A, B; //정수형태의 A와 B 선언

        A = sc.nextInt(); //sc.nextInt() : 자료형에 따라 입력받음. 다음 토큰을 int 타입으로 리턴
        B = sc.nextInt(); //Scanner클래스의 메소드. https://cocoon1787.tistory.com/38 참고
        System.out.println(A+B);
    }
}
