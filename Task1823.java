import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Task1823 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }

    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> q = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            q.add(i);
        }
        int beg = 0;
        while (q.size() > 1){
            int ind = (beg + k - 1) % q.size();
            q.remove(ind);
            beg = ind % q.size();
        }
        return q.get(0);
    }
}
