import java.time.LocalDate;

class Solution {
    public int solution(int age) {
        LocalDate datenow = LocalDate.now();
        int year = datenow.getYear();
        return year - age;
    }
}