package utils;

import node.ListNode;
import utils.intarray.IntArrayUtils;
import utils.listnode.ListNodeUtils;
import utils.print.PrintUtils;
import utils.random.RandomUtils;
import utils.str.StrUtils;
import utils.strarray.StrArrayUtils;

public class Utils {
    public static int[] array(int... v) {
        return IntArrayUtils.array(v);
    }

    public static String[] array(String... v) {
        return StrArrayUtils.array(v);
    }

    public static int randomInt() {
        return RandomUtils.randomInt();
    }

    public static int randomInt(int bound) {
        return RandomUtils.randomInt(bound);
    }

    public static int randomInt(int start, int end) {
        return RandomUtils.randomInt(start,end);
    }

    public static int[] randomArray(int len) {
        return IntArrayUtils.randomArray(len);
    }

    public static int[] randomArray(int len, int bound) {
        return IntArrayUtils.randomArray(len,bound);
    }

    public static int[] randomArray(int len, int start, int end) {
        return IntArrayUtils.randomArray(len,start,end);
    }

    public static int[] randomArraySorted(int len) {
        return IntArrayUtils.randomArraySorted(len);
    }

    public static int[] randomArraySorted(int len, int bound) {
        return IntArrayUtils.randomArraySorted(len,bound);
    }

    public static int[] randomArraySorted(int len, int start, int end) {
        return IntArrayUtils.randomArraySorted(len,start,end);
    }

    public static void print(Object data) {
        PrintUtils.print(data);
    }

    public static String[] randomStrArray() {
        return StrArrayUtils.randomStrArray();
    }

    public static String[] randomStrArray(int arrayLen) {
        return StrArrayUtils.randomStrArray(arrayLen);
    }

    public static String[] randomStrArray(int arrayLen, int strLen) {
        return StrArrayUtils.randomStrArray(arrayLen,strLen);
    }

    public static String randomStr(){
        return StrUtils.randomStr();
    }

    public static String randomStr(int len){
        return StrUtils.randomStr(len);
    }

    public static ListNode listnode(int... val) {
        return ListNodeUtils.listnode(val);
    }
}