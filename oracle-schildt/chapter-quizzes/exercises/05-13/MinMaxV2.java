class MinMaxV2 {
    public static void main(String[] args) {
        System.out.println("Reescreva a `class MinMax` mostrada anteriormente para que use um laço `for` de estilo for-each.");

        int[] nums = new int[]{99, -10, 100, 123, 18, -98, 562, 463, -9, 247, 1, 0, -1};
        int min = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        for (int num : nums) {
            System.out.println(num);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Min: " + min + " e Max: " + max + ".");
    }
}