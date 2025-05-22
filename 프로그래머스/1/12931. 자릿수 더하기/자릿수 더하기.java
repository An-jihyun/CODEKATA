import java.util.*;

public class Solution {
    public int solution(int n) {
        return String.valueOf(n).chars().map(c->c-'0').sum();
        //String.valueOf(n) -> 숫자를 문자열로
        //chars() -> 각 자릿수의 문자 코드값 스트림으로
        //map(c->c-'0') -> 문자'1' -> 숫자 1로 바꿔줌
        //sum -> 다 더함
    }
}