package Question.Array.Easy.noOfj;

public class bb {
public static void main(String[] args) {
    

        int [] nums={3,4,5,6};
            int arr[] = new int[nums.length];
           for(int i = 0 ; i< nums.length; i++){
               int count =0 ;
               for(int j = 0;j < nums.length; j++){
                   
                   if(nums[i]>nums[j] && j!=i ){
                       count++;
                   }
                 }
              arr[i]= count;
           }
           System.out.println(arr);
        }
    

    }