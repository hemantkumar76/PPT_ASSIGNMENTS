import java.util.HashSet;
import java.util.Set;

public class qs_2 {
    public int distributeCandies(int[] candyType) {
        int maxAllowed = candyType.length / 2;
        Set<Integer> uniqueCandies = new HashSet<>();

        for (int candy : candyType) {
            uniqueCandies.add(candy);

            if (uniqueCandies.size() == maxAllowed) {
                break;
            }
        }

        return uniqueCandies.size();
    }
}
