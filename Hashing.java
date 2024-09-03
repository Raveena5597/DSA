// Given an array A. You have some integers given in the array B.
// For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.

import java.util.HashMap;

public class Hashing {
    public static int[] solve(int[] A,int[] B){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<A.length;i++){
            if(hm.containsKey(A[i])){
                int val = hm.get(A[i]);
                hm.put(A[i], val+1);
            }
            else{
                hm.put(A[i], 1);
            }
        }
        int ans[] = new int[B.length];
        for(int i =0;i<B.length;i++){
            if(hm.containsKey(B[i])){
                ans[i] = hm.get(B[i]);
            }
            else{
                ans[i]=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       int []A ={1,2,3,1,2,5,1};
       int[] B = {5,3};
       int[] result = solve(A,B);
       for(int i =0;i<result.length;i++){
        System.out.println(result[i]);
       }
        
    }
    
}
