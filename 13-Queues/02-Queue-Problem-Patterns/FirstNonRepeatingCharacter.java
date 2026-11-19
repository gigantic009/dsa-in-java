// Stream characters and report first non-repeating character after each step.
import java.util.*;
public class FirstNonRepeatingCharacter {
 public static String process(String s){int[]freq=new int[26];Queue<Character>q=new ArrayDeque<>();StringBuilder out=new StringBuilder();for(char ch:s.toCharArray()){freq[ch-'a']++;q.add(ch);while(!q.isEmpty()&&freq[q.peek()-'a']>1)q.remove();out.append(q.isEmpty()?'#':q.peek());}return out.toString();}
}