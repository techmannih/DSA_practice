package Question.Array.Easy.kids;

import java.util.ArrayList;
import java.util.List;

public class kids {
    public static void main(String[] args) {
        
        int [] candies={2,4,6,4,1};
        int extraCandies=2;
        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>();
       
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        // return result;
        System.out.println(result);
    }
}

