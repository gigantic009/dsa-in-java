// Trie supports efficient prefix-based word storage and lookup.
public class Trie {
 private static class Node{Node[]children=new Node[26];boolean word;}
 private final Node root=new Node();
 public void insert(String s){Node n=root;for(char ch:s.toCharArray()){int i=ch-'a';if(n.children[i]==null)n.children[i]=new Node();n=n.children[i];}n.word=true;}
 public boolean search(String s){Node n=find(s);return n!=null&&n.word;}
 public boolean startsWith(String p){return find(p)!=null;}
 private Node find(String s){Node n=root;for(char ch:s.toCharArray()){n=n.children[ch-'a'];if(n==null)return null;}return n;}
}