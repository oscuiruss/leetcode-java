public class Task14 {
    public static void main(String[] args) {
        String[] a = new String[]{"f","l"};
        System.out.println(longestCommonPrefix(a));
    }

    public static String longestCommonPrefix(String[] strs) {
        String minWord = strs[0];
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength){
                minLength = strs[i].length();
                minWord = strs[i];
            }
        }
        for (int i = 0; i < minLength; i++){
            for (int j = 1; j < strs.length; j++){
                if (strs[0].charAt(i) != strs[j].charAt(i)){
                  return strs[0].substring(0, i);
                }
            }
        }
        return minWord;

    }
}
