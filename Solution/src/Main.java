public class Main {
    private final static Solution SOLUTION = new Solution();

    public static void main(String[] args) {
        System.out.println(SOLUTION.peakIndexInMountainArray(new int[]{0,1,0}));
        System.out.println(SOLUTION.peakIndexInMountainArray(new int[]{0,2,1,0}));
        System.out.println(SOLUTION.peakIndexInMountainArray(new int[]{0,10,5,2}));
        System.out.println(SOLUTION.peakIndexInMountainArray(new int[]{3,4,5,1}));
        System.out.println(SOLUTION.peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
        System.out.println(SOLUTION.peakIndexInMountainArray(new int[]{55,59,63,99,97,94,84,81,79,66,40,38,33,23,22,21,17,9,7}));
    }

}