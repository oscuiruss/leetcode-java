public class Task1347 {
    public static void main(String[] args) {
        System.out.println(anagramDiff("aba", "bab"));
    }

    private static int anagramDiff(String str1, String str2) {
        int[] used1 = new int[26];
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            used1[str1.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            used1[str2.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < 26; i++) {
            if (used1[i] > 0) {
                count += used1[i];
            }
        }
        return count;
    }
}
