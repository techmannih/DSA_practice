package Question.Searching;

public class LinearSearch {
 public static int main(String[] args) {
     int [] nums= {1,22,3,444,5,222222};
 
            int count =0;
            for (int i = 0; i < nums.length; i++) {
              int  count1=0;
                while (nums[i]>0){
                    count1++;
                    nums[i]=nums[i]/10;
                }
                if(count1%2==0){
                    count++;
                }
            }
            return count;
        }
    }

