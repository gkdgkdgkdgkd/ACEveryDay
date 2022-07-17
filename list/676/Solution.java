public class MagicDictionary {
    private String[] dictionary;

    public void buildDict(String[] dictionary) {
        this.dictionary = dictionary;
    }

    public boolean search(String searchWord) {
        int n = searchWord.length();
        for (String str : dictionary) {
            if (str.length() != n) {
                continue;
            }
            boolean diff = false;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) != searchWord.charAt(i)) {
                    if (!diff) {
                        diff = true;
                    } else {
                        diff = false;
                        break;
                    }
                }
            }
            if (diff) {
                return true;
            }
        }
        return false;
    }
}
