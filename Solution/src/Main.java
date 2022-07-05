import utils.Utils;

public class Main {
    private static final Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        MyCalendar calendar = new MyCalendar();
        Utils.print(calendar.book(10, 20));
        Utils.print(calendar.book(15, 25));
        Utils.print(calendar.book(20, 30));
    }
}