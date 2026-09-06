class MaximumSubarray {
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5};

        int sum = 0, max = a[0];

        for (int x : a) {
            sum = Math.max(x, sum + x);
            max = Math.max(max, sum);
        }

        System.out.println("Maximum subarray sum = " + max);
    }
}