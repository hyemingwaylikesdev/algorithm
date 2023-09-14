package algorithm;

import java.util.*;

//a#b!GE*T@S  -> S#T!EG*b@a

public class 특정문자뒤집기 {
	public String solution(String input) {

		char[] test = input.toCharArray();
		int lt = 0;
		int rt = input.length() - 1;

		String map = "";
		while (lt < rt) {

			if (!Character.isAlphabetic(test[lt]))
				lt++;
			else if (!Character.isAlphabetic(test[rt]))
				rt--;
			else {
				char temp = test[lt];
				test[lt] = test[rt];
				test[rt] = temp;
				lt++;
				rt--;
			}

			map = String.valueOf(test);
		}

		return map;
	}

	public static void main(String args[]) {
		특정문자뒤집기 T = new 특정문자뒤집기();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		System.out.println(T.solution(input));

	}

}
