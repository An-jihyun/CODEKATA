class Solution {
    public int solution(int age) {
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("나이는 0살보다 크고 120살 이하여야 합니다.");
        }
        
        int answer = 2022 - age + 1;
        return answer;
    }
}