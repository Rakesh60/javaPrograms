
class Complex {
    private double real;
    private double imaginary;
  
    public Complex(double real, double imaginary) {
      this.real = real;
      this.imaginary = imaginary;
    }
  
    public Complex add(Complex other) {
      return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
  
    @Override
    public String toString() {
      return String.format("%.1f + %.1fi", real, imaginary);
    }
  
    public static void main(String[] args) {
      Complex num1 = new Complex(2.5, 3.5);
      Complex num2 = new Complex(1.5, 4.5);
  
      Complex result = num1.add(num2);
  
      System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }
  }
  