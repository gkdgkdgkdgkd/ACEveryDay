import java.util.List;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.maxLength(List.of("abcdefghijklmnopqrstuvwxyz")));
        System.out.println(SOLUTION.maxLength(List.of("un","iq","ue")));
        System.out.println(SOLUTION.maxLength(List.of("cha","r","act","ers")));
//        System.out.println(SOLUTION.maxLength(List.of("abcdefghijklmnopqrstuvwxyz")));
    }

}