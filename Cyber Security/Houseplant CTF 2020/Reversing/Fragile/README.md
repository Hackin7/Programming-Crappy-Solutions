# Fragile 
50 Points, 1 day, 7 hours, 48 minutes, 54 seconds remaining

Can you help me move my stuff? This one's fragile!

Dev: Sri
 fragile.java 8a3966a1a07bf03681a4da4deb2d12ca
 
# Solution

You have a java file of this 
```
import java.util.*;

public class fragile
{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter flag: ");
        String userInput = scanner.next();
        String input = userInput.substring("rtcp{".length(),userInput.length()-1);
        if (check(input)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied!");
        }
    }
    
    public static boolean check(String input){
        boolean h = false;
        String flag = "h1_th3r3_1ts_m3";
        String theflag = "";
        if(input.length() != flag.length()){
            return false;
        }
        for(int i = 0; i < flag.length(); i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i)));
        }
        return theflag.equals("ÐdØÓ§åÍaèÒÁ¡");
    }
}
```

Writing code to reverse this (and running on repl.it):
```
import java.util.*;

public class Main
{
    public static void main(String args[]) {
        decode();
    }
    
    public static void decode(){
        boolean h = false;
        String check = "ÐdØÓ§åÍaèÒÁ¡";
        String flag = "h1_th3r3_1ts_m3";

        String theflag="";
        for(int i = 0; i < flag.length(); i++){
            theflag += (char)(
              (int)(check.charAt(i))-
              (int)(flag.charAt(i)) 
            );
        }
        System.out.print("Flag: rtcp{"+theflag+"}");
    }
}
```

```
OpenJDK Runtime Environment (build 11.0.6+10-post-Ubuntu-1ubuntu118.04.1)
 javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d . Main.java
 java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* Mai
Flag: rtcp{h3y_1ts_n0t_b4d}
```

# Flag
`rtcp{h3y_1ts_n0t_b4d}`