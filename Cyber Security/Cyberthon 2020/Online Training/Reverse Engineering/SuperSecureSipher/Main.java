/*
 * Decompiled with CFR 0.145.
 */
//Run in repl.it
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static final int IV_ITERATIONS = 256;

    public static void main(String[] arrstring) {
        /*
        if (arrstring.length == 0) {
            System.out.println("Usage: SecureEncoder <input filepath>");
            System.exit(0);
        }
        */
        System.out.println("Running");
        
        String string = "CTFSG{test}";
        SuperSecureSipher.writeToFile(encrypt(string), "flag.txt");

        String filename="flag.txt.out";
        string = SuperSecureSipher.readFirstLine(filename);
        SuperSecureSipher.writeToFile(decrypt(string), "flag.txt");
        
    }

    public static void writeToFile(String string, String string2) {
        try {
            byte[] arrby = string.getBytes();
            Files.write(Paths.get(string2, new String[0]), arrby, new OpenOption[0]);
        }
        catch (IOException iOException) {
            System.out.println("Failed to write to output file.");
        }
    }

    public static String readFirstLine(String string) {
        String string2 = "";
        try {
            File file = new File(string);
            Scanner scanner = new Scanner(file);
            if (scanner.hasNextLine()) {
                string2 = scanner.nextLine();
            }
            scanner.close();
            return string2;
        }
        catch (IOException iOException) {
            System.out.println("Failed to read input file.");
            return string2;
        }
    }

    public static String encrypt(String string) {
        int n;
        int n2;
        Object object = "";
        SecureRandom secureRandom = SuperSecureSipher.getSecureRandomGenerator();
        if (secureRandom == null) {
            System.exit(0);
        }
        int n3 = 0;
        for (n2 = 0; n2 < 256; ++n2) {
            n3 ^= secureRandom.nextInt(256);
            //System.out.print("n3: ");
            //System.out.println(String.valueOf(n3));
        }
        n2 = n3;
        System.out.print("n2: ");
        System.out.println(String.valueOf(n2));

        int n4 = string.length();
        for (n = 0; n < n4; ++n) {
            n2 ^= string.charAt(n);
        }
        System.out.print("n2: ");
        System.out.print(String.valueOf(n2));
        System.out.println(" "+(char)n2);

        object = (String)object + (char)n2;
        n = 0;
        int n5 = string.length();// - 1;
        for (n4 = 0; n4 < n5; ++n4) {
            object = (String)object + (char)(n2 ^ (n ^= string.charAt(n4)));
            System.out.println("n:"+String.valueOf(n)+" n2:"+String.valueOf(n2^n));
        }
        return (String)object;
    }

    public static String decrypt(String string) {
        int n;
        int n2;
        Object object = "";
        SecureRandom secureRandom = SuperSecureSipher.getSecureRandomGenerator();
        if (secureRandom == null) {
            System.exit(0);
        }
        /////////////////////////////////
        
        int n3 = 0;
        for (n2 = 0; n2 < 256; ++n2) {
            n3 ^= secureRandom.nextInt(256);
        }
        n2 = n3;
        ////////////////////////// Irrelevant
        int n4 = string.length();
        for (n = 0; n < n4; ++n) {
            n2 ^= string.charAt(n);
        }
        ////////////////////////
        
        n2 = (int)string.charAt(0);
        System.out.print("n2: ");
        System.out.print(String.valueOf(n2));
        System.out.println(" "+(char)n2);

        //object = (String)object + (char)n2;
        n = 0;
        int n5 = string.length();
        for (n4 = 1; n4 < n5; ++n4) {
            //object = (String)object + (char)(n2 ^ (n ^= string.charAt(n4)));
            //n = n^char
            int ch = (int)string.charAt(n4); //current char
            int chx=ch^n2;
            int og = chx^n;
            n = chx;
            object = (String)object + (char)og;
            
            System.out.println("n:"+String.valueOf(n)+" n2:"+String.valueOf(ch)+" "+(char)og);
        }
        return (String)object;
    }

    public static SecureRandom getSecureRandomGenerator() {
        try {
            return SecureRandom.getInstance("SHA1PRNG", "SUN");
        }
        catch (NoSuchAlgorithmException | NoSuchProviderException generalSecurityException) {
            System.out.println("Failed to init Secure RNG");
            return null;
        }
    }
}
