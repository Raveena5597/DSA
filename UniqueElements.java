// Given an array A of N integers, return the number of unique elements in the array.

import java.util.HashSet;

public class UniqueElements{
    public static int solve(int[] A){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
        }
        int result = hs.size();
        return result;
    }
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,1,2,3};
        int res = solve(A);
        System.out.println(res);
    }
}