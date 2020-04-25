import java.util.*;

public class Main
{
    public static void main(String args[]) {
        decode();
    }
    
    public static void decode(){
        String check = "ÒdÝ¾¤¤¾ÙàåÐcÝÆ¥ÌÈáÏÜ¦aã";
        String flag = "k33p_1t_in_pl41n"; //length 16
        String theflag = "";

        //Part 1
        int i = 0;
        for(i = 0; i < flag.length()-2; i++){
            theflag += (char)((int)(check.charAt(i)) - (int)(flag.charAt(i)));
        }
        
        String prefix = "";
        for(i = 2; i < 2+2; i++){
            prefix += (char)(
              (int)(check.charAt(i-2+flag.length()-2))
              - 
              (int)(flag.charAt(i))
              );
        }
        theflag = prefix + theflag;
        //Part 3
        String[] flags = theflag.split("");
        for(; i < (int)((flags.length)/2); i++){
            flags[i] = Character.toString((char)((int)(flags[i].charAt(0)) - 20));
        }
        
        System.out.print("Flag: rtcp{"+theflag+"}");
    }
}
