package utils;

import node.ListNode;
import node.TreeNode;
import utils.chararray.CharArrayUtils;
import utils.check.CheckUtils;
import utils.intarray.IntArrayUtils;
import utils.list.ListUtils;
import utils.listnode.ListNodeUtils;
import utils.print.PrintUtils;
import utils.random.RandomUtils;
import utils.str.StrUtils;
import utils.strarray.StrArrayUtils;
import utils.treenode.TreeNodeUtils;

import java.util.List;

public class Utils {
    public static int[] array(int... v) {
        return IntArrayUtils.array(v);
    }

    public static int[][] array(int[]... v) {
        return IntArrayUtils.array(v);
    }

    public static int[][] array2(int k, int... v) {
        return IntArrayUtils.array2(k, v);
    }

    public static char[] array(char... v) {
        return CharArrayUtils.array(v);
    }

    public static char[][] array(char[]... v) {
        return CharArrayUtils.array(v);
    }

    public static char[][] array2(int k, char... v) {
        return CharArrayUtils.array2(k, v);
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
        return RandomUtils.randomInt(start, end);
    }

    public static int[] randomArray(int len) {
        return IntArrayUtils.randomArray(len);
    }

    public static int[] randomArray(int len, int bound) {
        return IntArrayUtils.randomArray(len, bound);
    }

    public static int[] randomArray(int len, int start, int end) {
        return IntArrayUtils.randomArray(len, start, end);
    }

    public static int[] randomArraySorted(int len) {
        return IntArrayUtils.randomArraySorted(len);
    }

    public static int[] randomArraySorted(int len, int bound) {
        return IntArrayUtils.randomArraySorted(len, bound);
    }

    public static int[] randomArraySorted(int len, int start, int end) {
        return IntArrayUtils.randomArraySorted(len, start, end);
    }

    public static int[] randomArrayNoRepeated(int len) {
        return IntArrayUtils.randomArrayNoRepeated(len);
    }

    public static int[] randomArrayNoRepeated(int len, int bound) {
        return IntArrayUtils.randomArrayNoRepeated(len, bound);
    }

    public static int[] randomArrayNoRepeated(int len, int start, int end) {
        return IntArrayUtils.randomArrayNoRepeated(len, start, end);
    }

    public static int[] randomArraySortedNoRepeated(int len) {
        return IntArrayUtils.randomArraySortedNoRepeated(len);
    }

    public static int[] randomArraySortedNoRepeated(int len, int bound) {
        return IntArrayUtils.randomArraySortedNoRepeated(len, bound);
    }

    public static int[] randomArraySortedNoRepeated(int len, int start, int end) {
        return IntArrayUtils.randomArraySortedNoRepeated(len, start, end);
    }

    public static int[] randomArray01(int len) {
        return IntArrayUtils.randomArray01(len);
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
        return StrArrayUtils.randomStrArray(arrayLen, strLen);
    }

    public static String randomStr() {
        return StrUtils.randomStr();
    }

    public static String randomStr(int len) {
        return StrUtils.randomStr(len);
    }

    public static String randomStr(char ... ch){
        return StrUtils.randomStr(ch);
    }

    public static String randomStr(int len,char ... ch){
        return StrUtils.randomStr(len,ch);
    }

    public static String randomDigitStr() {
        return StrUtils.randomDigitStr();
    }

    public static String randomDigitStr(int len) {
        return StrUtils.randomDigitStr(len);
    }

    public static String randomDigitStrWithout0() {
        return StrUtils.randomDigitStrWithout0();
    }

    public static String randomDigitStrWithout0(int len) {
        return StrUtils.randomDigitStrWithout0(len);
    }

    public static String randomDigitStr01() {
        return StrUtils.randomDigitStr01();
    }

    public static String randomDigitStr01(int len) {
        return StrUtils.randomDigitStr01(len);
    }

    public static ListNode listnode(int... val) {
        return ListNodeUtils.listnode(val);
    }

    public static List<Integer> listOf(int... val) {
        return ListUtils.listOf(val);
    }

    public static List<String> listOf(String... val) {
        return ListUtils.listOf(val);
    }

    public static boolean checkSorted(int[] v) {
        return CheckUtils.checkSorted(v);
    }

    public static TreeNode treeNode(int... v) {
        return TreeNodeUtils.deserialize(v);
    }
}