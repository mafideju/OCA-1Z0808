class Bubble {
	public static <T extends Comparable<T>> void printArray(T[] array) {
		java.util.Arrays.sort(array);
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static void main(String... args) {
		Integer nums[] = { 99, -10, 100, 123, 18, -98, 562, 463, -9, 247, 1, 0, -1 };
		Character chars[] = { 'a', 'j', 'k', 'w', 'u', 'p', 'h', 'f' };

		for(int a = 1; a < nums.length; a++) {
			for(int b = nums.length - 1; b >= a; b--) {
				if(nums[b-1] > nums[b]) {
					int t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}

		for(int i = 0; i < chars.length; i++) {
			for (int j = chars.length - 1; j > i; j--) {
				if (chars[j-1] > chars[j]) {
					char t = chars[j-1];
					chars[j-1] = chars[j];
					chars[j] = t;
				}
			}
		}

		printArray(chars);
		printArray(nums);
	}
}
