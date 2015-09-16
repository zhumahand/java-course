import java.util.Scanner;
public class InteractRunner{
public static void main(String arg[]){
Scanner read = new Scanner(System.in);
Calculator calc = new Calculator();
String exit="no";
try{
while (!exit.equals("yes")){
System.out.println("arg: ");
String first = read.next();
System.out.println("arg: ");
String second = read.next();
calc.add(Integer.valueOf(first),Integer.valueOf(second));
System.out.println("Result: "+calc.getResult());
calc.cleanResult();
System.out.println("Exit: yes/no");
exit = read.next();}
}
finally{
read.close();}
}}