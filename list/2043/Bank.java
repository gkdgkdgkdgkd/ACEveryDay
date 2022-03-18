public class Bank {
    private final long[] balance;
    private final int range;

    public Bank(long[] balance) {
        this.range = balance.length;
        this.balance = new long[range + 1];
        System.arraycopy(balance, 0, this.balance, 1, range);
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 > 0 && account1 <= range && account2 > 0 && account2 <= range) {
            if (balance[account1] >= money) {
                balance[account1] -= money;
                balance[account2] += money;
                return true;
            }
        }
        return false;
    }

    public boolean deposit(int account, long money) {
        if (account > 0 && account <= range) {
            balance[account] += money;
            return true;
        }
        return false;
    }

    public boolean withdraw(int account, long money) {
        if (account > 0 && account <= range) {
            if (balance[account] >= money) {
                balance[account] -= money;
                return true;
            }
        }
        return false;
    }
}
