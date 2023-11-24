package Question.Array.Easy.RichestCostumerWealth;

public class RichestCostumerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 9 },
                { 2, 3, 4 }, };

        int largeSum = 0;
        for (int i = 0; i < accounts.length; i++) {

            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];

            }

            // System.out.println();
            largeSum = Math.max(largeSum, temp);
        }
        System.out.println(largeSum);
    }
}
