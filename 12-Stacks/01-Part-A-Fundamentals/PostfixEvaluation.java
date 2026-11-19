// Evaluate integer postfix expressions with whitespace-separated tokens.
// Time: O(tokens); space: O(tokens).
import java.util.ArrayDeque;
public class PostfixEvaluation {
    public static int evaluate(String expression){
        if(expression==null||expression.trim().isEmpty())throw new IllegalArgumentException("Expression required");
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for(String token:expression.trim().split("\\s+")){
            if(token.matches("-?\\d+"))st.push(Integer.parseInt(token));
            else{if(st.size()<2)throw new IllegalArgumentException("Malformed expression");int b=st.pop(),a=st.pop();switch(token){case "+":st.push(a+b);break;case "-":st.push(a-b);break;case "*":st.push(a*b);break;case "/":if(b==0)throw new ArithmeticException("Division by zero");st.push(a/b);break;default:throw new IllegalArgumentException("Unknown token: "+token);}}
        }
        if(st.size()!=1)throw new IllegalArgumentException("Malformed expression");return st.pop();
    }
    public static void main(String[] args){System.out.println(evaluate("12 3 4 * +"));}
}