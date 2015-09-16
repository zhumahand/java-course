import java.util.Scanner;
public class ArgRunner{
public static void main(String arg[]){
Calculator calc = new Calculator();
Scanner read = new Scanner(System.in);
String exit="no";
String vybor;
try{
System.out.println("Runner: Arg/Interact");
vybor = read.next();
if(vybor.equals("Arg")){
while (!exit.equals("yes")){
calc.add(Integer.valueOf(arg[0]),Integer.valueOf(arg[1]));
System.out.println("Result: "+calc.getResult());
calc.cleanResult();
System.out.println("Exit: yes/no");
exit = read.next();}
}
else {
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
  
}

finally{
read.close();
System.out.println("Программа завершена!");}
}}