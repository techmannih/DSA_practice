package Question.sorting.assign_cookies;
import java.util.Arrays;
public class assignCookies {
    public static int main(String[] args) {
        int []g={1,2,3};
        int []s={1,-1};
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                count++;
                i++;
                j++;
            } else{
                j++;
            }
        }
        return count;
    }
} 
