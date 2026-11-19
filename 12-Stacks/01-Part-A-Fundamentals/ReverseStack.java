// Reverse a stack recursively without using another stack.
import java.util.*;
public class ReverseStack {
 private static void insertBottom(Stack<Integer> s,int value){
  if(s.empty()){s.push(value);return;} // Base case: value reaches the bottom.
  int top=s.pop();insertBottom(s,value);s.push(top); // Restore items above the inserted value.
 }
 public static void reverse(Stack<Integer> s){
  if(s.empty())return;
  int top=s.pop();reverse(s);insertBottom(s,top); // Place each removed item at the bottom.
 }
}