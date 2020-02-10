/*
Array Partitioning

Divide a given array of numbers into two subarrays such 
that the absolute difference between their sums is the 
smallest possible. For example, the array [2, 5, 4, 7, 15, 20] 
can be divided into subarrays [15, 7, 4] and [20, 5, 2]. 
The difference between the sums of those arrays is 1, 
and it is the smallest.

Input: N - the length of array then integer separated by space 
*/

import java.util.*;

public class ArrayPartitioning
{
    public static void main(String[] args) {
        final var in = new Scanner(System.in);
        final var len = in.nextInt();
        final var source = in.tokens().mapToInt(Integer::parseInt).toArray();
        final var a = new Cart();
        final var b = new Cart();
        
        System.out.println(Arrays.toString(source));
        Arrays.sort(source);
        System.out.println();
        
        for (int i = len; i --> 0; ) {
            if (a.getWeight() < b.getWeight()) {
                a.put(source[i]);
            } else {
                b.put(source[i]);
            }
        }
        a.print();
        b.print();
        System.out.printf("%nThe difference is %d%n"
            , Math.abs(a.getWeight() - b.getWeight()));
    }
}

class Cart 
{
    private long weight = 0;
    private ArrayList<Integer> list = new ArrayList<>();
    
    long getWeight() {
        return weight;
    }
    
    void put(int n) {
        list.add(n);
        weight += n;
    }
    
    void print() {
        System.out.print(list);
        System.out.printf(" = %d%n", weight);
    }
    
}
