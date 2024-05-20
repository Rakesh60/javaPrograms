public class MyOops {
    public static void main(String[] args) {
        System.out.println("hello");

        // Create an instance of ArithmeticOpr
        ArithmeticOpr obj1 = new ArithmeticOpr(5, 6);
        int result = obj1.calculate('+');
        System.out.println("Addition result: " + result);
    }

    // Corrected class name to ArithmeticOpr
    public static class ArithmeticOpr {
        int a;
        int b;

        ArithmeticOpr(int x, int y) {
            this.a = x;
            this.b = y;
        }

        public int calculate(char opr) {
            switch (opr) {
                case '+':
                    return this.a + this.b;
                case '-':
                    return this.a - this.b;
                case '*':
                    return this.a * this.b;
                case '/':
                    if (this.b != 0) {
                        return this.a / this.b;
                    } else {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                default:
                    throw new IllegalArgumentException("Invalid operator: " + opr);
            }
        }
    }
}
