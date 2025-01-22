class MathTextFun {
    public static void main(String[] args) {
        System.out.println("Plus Operator!");
        int result = 5 + 8;

        System.out.println("Result is: " + (result + 10));

        System.out.println("Subtraction Operator!");
        result = 5 - 8;
        System.out.println("Result is: " + result);

        System.out.println("Multiplication Operator!");
        result = 5 * 8;
        System.out.println("Result is: " + result);

        System.out.println("Division Operator!");
        result = 8 / 5;
        System.out.println("Result is: " + result);

        System.out.println("Remainder Operator!");
        result = 8 % 5;
        System.out.println("Result is: " + result);

        System.out.println("double Divison Operator!");
        double number = 8.0/5.0;
        System.out.println("Result is: " + number);

        int i = (int)42.876546538 / (int)5.723782164;
        System.out.println("Result is: " + i);

        String textBlock = """
        Dear CS202,
            Today I decided to write this block of text that will have so many wonderful
            punctuations! Like the \\*
            Now I know it's not going to be that "long" but that's okay as long as we get
            the gist/concept/ideas (things) of what is going on.
            Yours Truely "Magnífico fo'i talavou fie mohea
            faiako"
            Knowlton 'Ita'aehau
        """;
        System.out.println(textBlock);
    }
}