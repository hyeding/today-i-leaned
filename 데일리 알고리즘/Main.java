import java.util.*;

public class Main {
    public static void main(String[] args) {
        public String firstReverse(String str){
            // TODO:
            StringBuilder builder = new StringBuilder(str);
            //String 클래스에서는 reverse()를 제공하지 않아서 변환해서 reverse()를 사용해야함.
            //그예로 StringBuilder, StringBuffer, Collection 클래스에서 reverse() 메서드를 제공함.
            //String 문자열을 반전시키기 위해 먼저 위의 클래스로 반환해서 사용해야함.
            //StringBuilder 클래스 선언
            return builder.reverse().toString();
        }   //결과 반환, toString() 메서드는 문자열로 만들어 리턴시킴


//        문제
//        문자열을 입력받아 순서가 뒤집힌 문자열을 리턴해야 합니다.
//
//                입력
//        인자 1 : str
//        String 타입의 문자열
//                출력
//        String 타입을 리턴해야 합니다.
//        입출력 예시
//        1
//        2
//        3
//        4
//        5
//        String output = firstReverse("codestates");
//        System.out.println(output); // "setatsedoc"
//
//        output = firstReverse('I love codestates');
//        System.out.println(output); // "setatsedoc evol I"
//        힌트
//        문자열은 StringBuilder.reverse()를 통해 쉽게 뒤집을 수 있습니다.
    }
}