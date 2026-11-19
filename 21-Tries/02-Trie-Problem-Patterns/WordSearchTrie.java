// Trie-based word search is a pattern foundation; this file provides trie node setup.
public class WordSearchTrie {
 static class Node{Node[]children=new Node[26];String word;}
 public static Node build(String[]words){Node root=new Node();for(String w:words){Node n=root;for(char c:w.toCharArray()){int i=c-'a';if(n.children[i]==null)n.children[i]=new Node();n=n.children[i];}n.word=w;}return root;}
}