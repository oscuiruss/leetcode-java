public class Task771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        int[] st = new int[100];
        int[] jew = new int[100];
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            st[c - 'A']++;
        }
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            jew[c - 'A']++;
        }

        for (int i = 0; i < 100; i++) {
            if (st[i] > 0 && jew[i] > 0) {
                ans += st[i];
            }
        }
        return ans;
    }
}
