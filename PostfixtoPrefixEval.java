import java.util.Stack;

public class PostfixtoPrefixEval {
    public static void main(String args[]) {
        String post_exp = "ABC/-AK/L-*";
        Stack<String> s = new Stack<String>();

        int length = post_exp.length();
        for (int i = 0; i < length; i++) {
            char c = post_exp.charAt(i);
            if (c == '+' || c == '-' || c == '/' || c == '*') {
                String op1 = s.pop();
                String op2 = s.pop();
                String temp = c + op2 + op1;
                s.push(temp);
            } else {
                s.push(c + "");
            }
        }

        String ans = "";
        while (!s.isEmpty()) {
            ans += s.pop();
        }

        System.out.println("Prefix: " + ans);
    }
}
