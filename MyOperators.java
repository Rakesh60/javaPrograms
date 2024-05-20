public class MyOperators {
    public static void main(String[] args) {
        System.out.println("hello");

        ArithmeticOpr obj1 = new ArithmeticOpr(5, 6);
        int result = obj1.calculate('+');
        System.out.println("Addition result: " + result);
    }

    
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
                    return this.a / this.b;
                
                default:
                    return 0;
            }
        }
    }
}
