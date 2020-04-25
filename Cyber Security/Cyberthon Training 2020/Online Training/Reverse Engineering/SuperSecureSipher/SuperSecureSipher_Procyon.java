import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

// 
// Decompiled by Procyon v0.5.36
// 

public class SuperSecureSipher
{
    public static final int IV_ITERATIONS = 256;
    
    public static void main(final String[] array) {
        if (array.length == 0) {
            System.out.println("Usage: SecureEncoder <input filepath>");
            System.exit(0);
        }
        writeToFile(encrypt(readFirstLine(array[0])), invokedynamic(makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;, array[0]));
    }
    
    public static void writeToFile(final String s, final String first) {
        try {
            Files.write(Paths.get(first, new String[0]), s.getBytes(), new OpenOption[0]);
        }
        catch (IOException ex) {
            System.out.println("Failed to write to output file.");
        }
    }
    
    public static String readFirstLine(final String pathname) {
        String nextLine = "";
        try {
            final Scanner scanner = new Scanner(new File(pathname));
            if (scanner.hasNextLine()) {
                nextLine = scanner.nextLine();
            }
            scanner.close();
            return nextLine;
        }
        catch (IOException ex) {
            System.out.println("Failed to read input file.");
            return nextLine;
        }
    }
    
    public static String encrypt(final String s) {
        final String s2 = "";
        final SecureRandom secureRandomGenerator = getSecureRandomGenerator();
        if (secureRandomGenerator == null) {
            System.exit(0);
        }
        int n = 0;
        for (int i = 0; i < 256; ++i) {
            n ^= secureRandomGenerator.nextInt(256);
        }
        int n2 = n;
        for (int j = 0; j < s.length(); ++j) {
            n2 ^= s.charAt(j);
        }
        String s3 = invokedynamic(makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;, s2, (char)n2);
        int n3 = 0;
        for (int k = 0; k < s.length() - 1; ++k) {
            n3 ^= s.charAt(k);
            s3 = invokedynamic(makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;, s3, (char)(n2 ^ n3));
        }
        return s3;
    }
    
    public static SecureRandom getSecureRandomGenerator() {
        try {
            return SecureRandom.getInstance("SHA1PRNG", "SUN");
        }
        catch (NoSuchAlgorithmException | NoSuchProviderException ex) {
            System.out.println("Failed to init Secure RNG");
            return null;
        }
    }
}
