public class GuessGame {
    int n;

    public int guess(int n) {
        if (this.n == n) {
            return 0;
        }
        return this.n > n ? 1 :-1;
    }
}
