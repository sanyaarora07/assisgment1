
import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
	public static void main(String[] args) {
		int[] aray = { 1, 2, 3, 4, 5 };
		Random rand = new Random();
		for (int i = 0; i < aray.length; i++) {
			int Swap = rand.nextInt(aray.length);
			int a = aray[Swap];
			aray[Swap] = aray[i];
			aray[i] = a;
		}
		System.out.println(Arrays.toString(aray));
	}
}