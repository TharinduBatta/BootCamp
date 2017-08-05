import java.util.Stack;
public class StackSorted {

    public static void main(String[] args) {
        int val = 0;
        Stack<Integer> in = new Stack<Integer>();
        Stack<Integer> in1 = new Stack<Integer>();

        in.push(3);
        in.push(10);
        in.push(1);
        in.push(6);
        in.push(2);
        in.push(12);
        in.push(5);
        in.push(4);
        // int si=in.size();
//       for(int i=0;i<si;i++){
//           System.out.println(in.pop());
//       }
        while (!in.isEmpty()) {
            //   System.out.println(in.pop()); 
            val = in.pop();

            while (!in1.isEmpty() && val > in1.peek()) {

                in.push(in1.pop());
            }
            in1.push(val);

        }

        while (!in1.isEmpty()) {
            System.out.println(in1.pop());
        }
    }

}