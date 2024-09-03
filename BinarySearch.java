// You are given a sorted array A of size N and a target value B.
// Your task is to find the index (0-based indexing) of the target value in the array.
public class BinarySearch{
    public static int searchInSortedArray(int[] A,int B){
        int lengthOfArray = A.length;
        int start=0;
        int end = lengthOfArray-1;
        while(start<=end){
        int mid = start+(end-start)/2;
        if(A[mid]==B){
            return mid;
        }
        if(A[mid]>B){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
        }

        return -1;
    }
    public static void main(String[] args) {
        int A[] ={1,2,3,4,5,6,7,8};
        int B = 5;
        int result = searchInSortedArray(A, B);
        System.out.println(result);
    }
}