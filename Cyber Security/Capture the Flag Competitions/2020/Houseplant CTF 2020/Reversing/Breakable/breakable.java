import java.util.*;

public class breakable
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
        String flag = "k33p_1t_in_pl41n";
        String theflag = "";
        int i = 0;
        if(input.length() != flag.length()){
            return false;
        }
        for(i = 0; i < flag.length()-2; i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i+2)));
        }
        for(i = 2; i < flag.length(); i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i-2)));
        }
        String[] flags = theflag.split("");
        for(; i < (int)((flags.length)/2); i++){
            flags[i] = Character.toString((char)((int)(flags[i].charAt(0)) + 20));
        }
        return theflag.equals("ÒdÝ¾¤¤¾ÙàåÐcÝÆ¥ÌÈáÏÜ¦aã");
    }
}