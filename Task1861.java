import java.util.Arrays;

public class Task1861 {
    public static void main(String[] args) {
        char[][] box = {{'#', '.', '#'}};
//        char[][] box = {{'#','.','*','.'},
//                {'#','#','*','.'}};
//        char[][] box = {{'#', '#', '*', '.', '*', '.'},
//                {'#', '#', '#', '*', '.', '.'},
//                {'#', '#', '#', '.', '#', '.'}};
        char ans[][] = rotateTheBox(box);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;
        char[][] ans = new char[m][n];
        for (int j = 0; j < n; j++) {
            int low = m - 1;
            int cur = m - 1;
//            int high = m - 1;
            while (cur >= 0) {
                if (box[j][cur] == '.') {
                    cur--;
//                    high--;
                } else if (box[j][cur] == '*') {
                    low = cur - 1;
                    box[j][cur] = '*';
                    cur--;
//                    high++;
                } else {
                    box[j][cur] = '.';
                    box[j][low] = '#';
                    cur--;
                    low--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                ans[j][n - i - 1] = box[i][j];
            }
        }
        return ans;

    }
}
