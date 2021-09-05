public class Solution extends SolBase {
    public int rand10() {
        int num = (rand7() - 1) * 7 + rand7();
        while (num > 40) {
            num = (rand7() - 1) * 7 + rand7();
        }
        return num % 10 + 1;
    }
}