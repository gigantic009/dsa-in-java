// Group words sharing the same character-frequency signature.
import java.util.*;
public class GroupAnagrams {
 public static List<List<String>>group(String[]words){Map<String,List<String>>map=new HashMap<>();for(String word:words){int[]f=new int[26];for(char c:word.toCharArray())f[c-'a']++;String key=Arrays.toString(f);map.computeIfAbsent(key,k->new ArrayList<>()).add(word);}return new ArrayList<>(map.values());}
}