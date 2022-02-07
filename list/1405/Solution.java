public class Solution {
    private final StringBuilder builder = new StringBuilder();
    private char last = ' ';
    private int a;
    private int b;
    private int c;
    private int count;

    public String longestDiverseString(int aNum, int bNum, int cNum) {
        a = aNum;
        b = bNum;
        c = cNum;
        for (int sum = a + b + c; sum > 0; --sum) {
            if (count == 0) {
                ++count;
                if (a > b) {
                    if (a > c) {
                        appendA();
                    } else {
                        appendC();
                    }
                } else if (b > c) {
                    appendB();
                } else {
                    appendC();
                }
            } else if (count == 1) {
                if (a > b) {
                    if (a > c) {
                        checkA();
                        appendA();
                    } else {
                        checkC();
                        appendC();
                    }
                } else if (b > c) {
                    checkB();
                    appendB();
                } else {
                    checkC();
                    appendC();
                }
            } else if (count == 2) {
                if (a > b) {
                    if (a > c) {
                        if (checkAndAppendA()) {
                            break;
                        }
                    } else if (checkAndAppendC()) {
                        break;
                    }
                } else if (b > c) {
                    if (checkAndAppendB()) {
                        break;
                    }
                } else if (checkAndAppendC()) {
                    break;
                }
            }
        }
        return builder.toString();
    }

    private void appendA() {
        builder.append(last = 'a');
        --a;
    }

    private void appendB() {
        builder.append(last = 'b');
        --b;
    }

    private void appendC() {
        builder.append(last = 'c');
        --c;
    }

    private void checkA() {
        if (last == 'a') {
            ++count;
        } else {
            last = 'a';
        }
    }

    private void checkB() {
        if (last == 'b') {
            ++count;
        } else {
            last = 'b';
        }
    }

    private void checkC() {
        if (last == 'c') {
            ++count;
        } else {
            last = 'c';
        }
    }

    private boolean checkAndAppendA() {
        if (last == 'a') {
            if (b > c) {
                appendB();
            } else if (c > 0) {
                appendC();
            } else {
                return true;
            }
        } else {
            appendA();
        }
        --count;
        return false;
    }

    private boolean checkAndAppendB() {
        if (last == 'b') {
            if (a > c) {
                appendA();
            } else if (c > 0) {
                appendC();
            } else {
                return true;
            }
        } else {
            appendB();
        }
        --count;
        return false;
    }

    private boolean checkAndAppendC() {
        if (last == 'c') {
            if (a > b) {
                appendA();
            } else if (b > 0) {
                appendB();
            } else {
                return true;
            }
        } else {
            appendC();
        }
        --count;
        return false;
    }
}