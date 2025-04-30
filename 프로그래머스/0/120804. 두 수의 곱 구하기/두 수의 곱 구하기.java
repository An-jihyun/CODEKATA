class Solution {
    public int solution(int num1, int num2) {
        if(num1 < 0 || num1 > 100 || num2 <0 || num2 > 100) {
            throw new IllegalArgumentException("입력하는 숫자들의 값은 0이상이면서 100이하여야합니다.");
        }
        int answer = num1 * num2;
        return answer;
    }
}