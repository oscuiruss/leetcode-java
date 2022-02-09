package Sobes;

import java.util.LinkedList;
import java.util.List;

public class Task22 {
    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        String ans = "";
        gen(ans, 0, 0, n, list);
        return list;
    }

    public static void gen(String ans, int open, int close, int n, List<String> list) {
        if (open + close == 2 * n) {
            list.add(ans);
            return;
        }
        if (open < n) {
            gen(ans + "(", open + 1, close, n, list);
        }
        if (open > close) {
            gen(ans + ")", open, close + 1, n, list);
        }
    }
}
