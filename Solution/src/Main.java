import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.countOfAtoms("K4(ON(SO3)2)2"));
        System.out.println(SOLUTION.countOfAtoms("Mg(OH)2"));
        System.out.println(SOLUTION.countOfAtoms("H2O"));
//        String str = "(    (N7Li31C7B10Be37B23H2H11Li40Be15)26    (OBLi48B46N4)25    (O48C22He)2   N10O34N15B33Li39H34H26B15B23C31   (C36N38O33Li38H15H46He21Be38B50)8   )3";
        System.out.println(SOLUTION.countOfAtoms("((N7Li31C7B10Be37B23H2H11Li40Be15)26(OBLi48B46N4)25(O48C22He)2N10O34N15B33Li39H34H26B15B23C31(C36N38O33Li38H15H46He21Be38B50)8)3"));
//        System.out.println(SOLUTION.countOfAtoms("((N42)24(OB40Li30CHe3O48LiNN26)33(C12Li48N30H13HBe31)21(BHN30Li26BCBe47N40)15(H5)16)14"));
    }

}