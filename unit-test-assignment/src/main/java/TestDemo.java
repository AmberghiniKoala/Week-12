import java.util.*;

import com.google.common.annotations.VisibleForTesting;

public class TestDemo {

	@VisibleForTesting
	int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			return a+b;
		} throw new IllegalArgumentException("Both parameters must be positive!");
	}
	
	public int randomNumberSquared() {
		int number = getRandomInt();
		return number*number;
	}
	
	@VisibleForTesting
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
