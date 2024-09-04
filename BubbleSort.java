// Given an array sort the array in Bubble sort practice(Compare adjacent elements in the array and swap them if needed,
// always remember that the last element will be sorted in every iteration)
public class BubbleSort{
    public static int[] sortBubble(int[] A){
        int n = A.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1;j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }

        }
        return A;
    }

    public static void main(String[] args) {
        int A[] = {1,5,3,4,2};
        int r[] = sortBubble(A);
        for(int i = 0;i<r.length;i++){
            System.out.println(r[i]);
        }

        
    }
}