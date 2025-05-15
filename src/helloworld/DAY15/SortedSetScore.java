//14-05-2025
package helloworld.DAY15;
import java.util.*;
public class SortedSetScore {

	public static void main(String[] args) {
		

		        SortedSet<Integer> score = new TreeSet<>();

		        // Adding student scores
		        score.add(85);
		        score.add(92);
		        score.add(78);
		        score.add(90);
		        score.add(100);
		        score.add(92);  // Duplicate, will be ignored

		        System.out.println("All Scores (Sorted): " + score);

		        // Get the top score
//		        int topScore = score.last();
		        System.out.println("Top Score: " +score.last());

		        // Get the lowest score
//		        int lowestScore = score.first();
		        System.out.println("Lowest Score: " + score.first());

		        // Get scores less than 90 (students who need improvement)
//		        SortedSet<Integer> below90 = score.headSet(90);
//		        System.out.println("Scores below 90: " + below90);
		        System.out.println("Scores below 90: " + score.headSet(90));

		        // Get scores greater than or equal to 90 (excellent performers)
//		        SortedSet<Integer> aboveOr90 = score.tailSet(90);
		        System.out.println("Scores 90 and above: " + score.tailSet(90));

		        // Get scores between 80 (inclusive) and 95 (exclusive)
//		        SortedSet<Integer> between80And95 = score.subSet(80, 95);
		        System.out.println("Scores between 80 and 95: " + score.subSet(80, 95));
		  

	}

}
