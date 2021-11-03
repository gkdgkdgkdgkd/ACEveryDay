public class BitMap {
    private final byte[] bitmap;

    public BitMap(int len) {
        bitmap = new byte[len >> 3];
    }

    public boolean get(int number) {
        byte cur = bitmap[number >> 3];
        int index = number & 7;
        return ((cur >> (7 - index)) & 1) != 0;
    }

    private void set(int number, boolean b) {
        int slot = number >> 3;
        byte cur = bitmap[slot];
        int index = number & 7;
        byte comp = (byte) (1 << (7 - index));
        if (b) {
            bitmap[slot] = (byte) (comp | cur);
        } else {
            comp = (byte) ~comp;
            bitmap[slot] = (byte) (comp & cur);
        }
    }

    public void add(int number) {
        set(number, true);
    }

    public void delete(int index) {
        set(index, false);
    }
}
