class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int n = 5;

        int sum = n * (n + 1) / 2;

        for (int x : a)
            sum -= x;

        System.out.println("Missing number = " + sum);
    }
}