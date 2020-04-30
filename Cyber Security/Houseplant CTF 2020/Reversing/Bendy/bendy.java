import java.util.*;

public class bendy
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
        String flag = "r34l_g4m3rs_eXclus1v3";
        String theflag = "";
        int i = 0;
        if(input.length() != flag.length()){
            return false;
        }
        if(!input.substring(0,2).equals("h0")){
            return false;
        }
        if(input.charAt(7) != 'u'){
            return false;
        }
        for(i = 0; i < flag.length()-14; i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i+8)));
        }
        for(i = 10; i < flag.length()-6; i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i-8)));
        }
        for(; i < flag.length(); i++){
            theflag += (char)((int)(flag.charAt(i-3)) + (int)(input.charAt(i)));
        }
        //ÒdÝ¾¤¤¾ÙàåÐcÝÆ¥ÌÈáÏÜ¦aã
        String[] flags = theflag.split("");
        for(i=0; i < (int)((flags.length)/2); i++){
            flags[i] = Character.toString((char)((int)(flags[i].charAt(0)) + 20));
        }
        theflag = theflag.substring(flags.length/2);
        for(int k = 0; k < ((flags.length)/2); k++){
            theflag += flags[k];
        }
        return theflag.equals("ÄÑÓ¿ÂÒêáøz§è§ñy÷¦");
    }
}
 