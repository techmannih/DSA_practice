// https://leetcode.com/problems/spiral-matrix/description/

package Question.Array.Hard_and_med.SpiralMatrix;
import java.util.*;


public class SpiralMatrix {
    public static <in> void main(String[] args) {
        int arr [][]={
            {1,2,3,4},
            {3,4,5,6},
            {5,6,7,8},
        };
        

        List<Integer> res = new ArrayList<>();
        int b = arr.length, r = arr[0].length;
        int t = 0, l = 0, size = b*r;
        while(t<=b && l<=r){
            for (int i = l; i < r; i++) {
                res.add(arr[t][i]);
            }
            t++;
            for (int i = t; i < b; i++) {
                res.add(arr[i][r-1]);
            }
            r--;
            if(res.size()>=size){
                break;
            }
            for (int i = r-1; i >= l; i--) {
                res.add(arr[b-1][i]);
            }
            b--;
            if(res.size()>=size)
                break;
            for (int i = b-1; i >= t; i--) {
                res.add(arr[i][l]);
            }
            l++;
            if(res.size()>=size)
                break;

        }
        System.out.println(res);
    }
}
