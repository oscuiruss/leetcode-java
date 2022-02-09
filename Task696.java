public class Task696 {
    // "00110011"
    public static void main(String[] args) {
        String str = "000011";
        System.out.println(countBinarySubstrings(str));
    }

    public static int countBinarySubstrings(String s) {
        int countBegin = 0;
        int countEnd = 1;
        int ans = 0;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                countEnd++;
            } else {
                countBegin = countEnd;
                countEnd = 1;
                c = s.charAt(i);
            }
            if (countBegin >= countEnd) {
                ans++;
            }
        }
        return ans;
    }
}
