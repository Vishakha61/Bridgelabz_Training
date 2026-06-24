// Earlier I Implemented this code with the help of HashMap using two loops in O(n^2) time complexity 
// but now I have implemented this code in O(n) time complexity using HashMap and Queue.

import java.util.*;
class Main {
    public static String firstUnique(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            q.offer(ch);

            while (!q.isEmpty() && map.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(firstUnique(s));
    }
}

