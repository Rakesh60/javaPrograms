public class Main {
    public static void main(String[] args) {
        int a = 2;
        String str = String.valueOf(a);

        System.out.println(a);           // Prints: 2
        System.out.println(str);         // Prints: 2
        System.out.println(a + a);       // Prints: 4 (since a is an int, it's an arithmetic addition)
        System.out.println(str + str);   // Prints: 22 (since str is a String, it's string concatenation)

        // To find the data type of a, we infer it from the declaration (it's an int)
        // For str, we can use getClass().getName()
        System.out.println(((Object) a).getClass().getName()); // This will not work as a is a primitive

        System.out.println(str.getClass().getName());          // Prints: java.lang.String

        // An alternative for int is using wrapper class
        Integer wrapperA = a;
        System.out.println(wrapperA.getClass().getName());     // Prints: java.lang.Integer
    }
}
