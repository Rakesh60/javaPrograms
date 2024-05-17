
public class First {
public static void main(String[] args) {
 //byte a=128;
 short a=32767;
 float b=25.50f;
 char cr='a';
 //*Storing Binary number in byte data type  */
 byte binMin=0b01111111;//127 in birary representation
 byte hexMIn=0x7f;//127 in hexadecimal representation

 
 System.out.println("Binary---->"+binMin);
 System.out.println("Hexadecimal---->"+hexMIn);
 System.out.println(cr);
 System.out.println(a);
 System.out.println(b);
 
  //*Storing Max integer number in Int data type  */
 int INT_max=2147483647;
 System.out.println("The maximum number we can stote in Int Data Type is"+INT_max);

   //*Storing Max integer number in Int data type  */
 long lg=9223372036854775807l;
 ;

 System.out.println("The maximum number we can stote in Long Data Type is"+lg);

}
}