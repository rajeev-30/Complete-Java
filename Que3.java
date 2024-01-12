import javax.sql.rowset.spi.SyncResolver;

// package EVALUATION02;

class Addition {
    int s = 0;

    void sum() {
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println("sum " + s);
    }

}

class Solution extends Addition {

}

public class Que3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.sum();
    }

}
