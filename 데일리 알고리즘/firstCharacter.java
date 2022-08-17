import java.util.*;


public class firstCharacter {
    public String firstCharacter(String str) {

        //빈문자열을 받은 경우 빈문자열을 리턴
        if (str.length() == 0){
            return "";
        }

        //String타입의 변수를 공백으로 쪼갬
        String[] words = str.split(" ");
        //분리시 띄어쓰기의 공백을 없앰
        String result = "";

        // words 문자열에서 대문자만 받아옴
        for(int i = 0; i < words.length; i++) {
            result = result + words[i].charAt(0);
        }

        return result;
    }
}

/*
문제
문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자로 이루어진 문자열을 리턴해야 합니다.

입력
인자 1 : str
String 타입의 공백이 있는 알파벳 문자열
출력
String 타입을 리턴해야 합니다.
주의 사항
단어는 공백 한 칸으로 구분합니다.
연속된 공백은 없다고 가정합니다.
빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
 */