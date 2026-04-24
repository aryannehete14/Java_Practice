public class RatingAnalyzer {
    public static void main(String[] args) {
        int[] ratings = { 5, 4, 3, 5, 4 };
        int sum = 0;

        for (int i = 0; i < ratings.length; i++) {
            sum += ratings[i];
        }
        float average_rating = (float) sum / ratings.length;
        float highest_rating = ratings[0];
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > highest_rating) {
                highest_rating = ratings[i];
            }
        }
        System.out.println("Average rating: " + average_rating);
        System.out.println("Highest rating: " + highest_rating);
    }
}
