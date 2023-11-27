// https://leetcode.com/problems/number-of-good-pairs/
package Question.Array.Easy.noOfGoodPair;

public class goodPair {
    public static void main(String[] args) {
        
        int []nums={1,2,4,2,5};
                int result = 0;
                int[] count = new int[101];
                for (int num = 0; num < nums.length; num++) {
                    result += count[nums[num]]++;
                }
                // return result;
                System.out.println(result);
            }
        }
