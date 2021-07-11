import java.util.Stack;

public class test02 {
	public static void main(String[] args) {
		int[] arr = { 500, 1000, 2000, -1000, -1500, 500 };
		int[] answer = {};
		int size=0;
		Stack<Integer> stack = new Stack<>();

		for (int i : arr) {
			if (i >= 0) {
				stack.push(i);
			} else {
				int j = stack.pop();
				if (j < Math.abs(i)) {
					int k = Math.abs(i) - j;
					int s = stack.pop();
					s -= k;
					stack.push(s);
				} else {
					j -= Math.abs(i);
					if (j != 0) {
						stack.push(j);
					}
				}
			}
		}
		answer = new int[stack.size()];
		
		while (stack.size()!=0) {
			answer[size] = stack.pop();
			size ++;
			
		}
		
		for (int i = answer.length - 1, j = 0; i >= 0; i--, j++) {
			answer[j] = answer[i];
			}

		for(int kk=0; kk<answer.length; kk++){
		System.out.println("answer : " + answer[kk]);
		}
	}
}
