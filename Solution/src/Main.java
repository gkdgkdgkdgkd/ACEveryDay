import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        ThroneInheritance inheritance = new ThroneInheritance("king");
        inheritance.birth("king","andy");
        inheritance.birth("king","bob");
        inheritance.birth("king","catherine");
        inheritance.birth("andy","mattew");
        inheritance.birth("bob","alex");
        inheritance.birth("bob","asha");
        System.out.println(inheritance.getInheritanceOrder());
        inheritance.death("bob");
        System.out.println(inheritance.getInheritanceOrder());
    }

}