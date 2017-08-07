import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class Parentheses {

    public static boolean CheckParentheses(String txt) {
        boolean result = false;
        Map<Character, Character> t = new HashMap<Character, Character>();
        Stack<Character> s = new Stack<>();

        t.put('{', '}');
        t.put('[', ']');
        t.put('(', ')');
        // t.put('{', '}');
        for (char ch : txt.toCharArray()) {
            // System.out.println(ch);
            System.out.println(ch + "xx");
//            for (Entry<Character, Character> entry : t.entrySet()) {
            if (t.keySet().contains(ch)) {
                s.push(ch);
            } else if (t.values().contains(ch)) {
                if (!s.isEmpty() && t.get(s.peek()) == ch) {
                    s.pop();
                } else {
                    result = false;
                }
            }

//           else if(!s.isEmpty() ){
//               //s.pop();
//                result=false;
//               // System.out.println(s.pop());
//                System.out.println(t.get(ch));
//                if(s.pop() != t.get(ch)){
//                   result=false; 
//                }
//           }
        }

        // System.out.println(s.isEmpty());
        return s.isEmpty();

    }

    public static void main(String[] args) {

        String s = "{(})";
        //  CheckParentheses(s);
        System.out.println("Out Put is ="+CheckParentheses(s));
    }

}
