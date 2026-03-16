CONCATENATION OF ARRAY: 1929 leetcode
import java.util.Arrays;

public class concatenation {
    public static void main(String[] args) {
        int []arr={1,2,1};

       int []result=conArray(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[]conArray(int []arr)
    {
        int ans[] =new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[i];
        }
        for (int i = 0; i <arr.length ; i++) {
            ans[i+arr.length]+=arr[i];
        }
        return ans;
    }

}
