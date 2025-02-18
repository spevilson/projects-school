class sumNumbers{
    public static void main(String[] args) {
        String[] numbers = {"23", "7", "74", "2", "90", "59", "15", "24", "69", "66"};

        int sum = 0;
        for (String s : numbers) {
            int n = Integer.parseInt(s);
            sum += n;
        }
        System.out.println("The sum of the numbers is: " + sum);

        int sum1 = 0;
        for (int i = 0; i<=9; i++) {
            int n = Integer.parseInt(numbers[i]);
            sum1 += n;
        }
        System.out.println("The sum of the numbers is: " + sum1);

        int sum2 = 0;
        int i = 0;
        while (i != 10) {
            int n = Integer.parseInt(numbers[i]);
            sum2 += n;
            i++;
        }
        System.out.println("The sum of the numbers is: " + sum2);

        int sum3 = 0;
        int j = 0;
        do {
            int n = Integer.parseInt(numbers[j]);
            sum3 += n;
            j++;
        } while(j!=10);
        System.out.println("The sum of the numbers is: " + sum3);
    }
}