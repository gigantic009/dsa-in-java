// Fractional knapsack: items may be split. Greedy by value/weight.
// Time O(n log n); space O(n) for sorting.
import java.util.*;
public class FractionalKnapsack {
 static class Item{double value,weight;Item(double v,double w){value=v;weight=w;}}
 static double maxValue(Item[]items,double capacity){if(capacity<0)throw new IllegalArgumentException();Arrays.sort(items,(a,b)->Double.compare(b.value/b.weight,a.value/a.weight));double total=0;for(Item i:items){if(i.weight<=0||i.value<0)throw new IllegalArgumentException("Invalid item");double take=Math.min(capacity,i.weight);total+=take*(i.value/i.weight);capacity-=take;if(capacity==0)break;}return total;}
 public static void main(String[]args){System.out.println(maxValue(new Item[]{new Item(60,10),new Item(100,20),new Item(120,30)},50));}
}