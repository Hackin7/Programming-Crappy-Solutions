/*
 * Decompiled with CFR 0.145.
 */
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

public class SuperSecureSipher {
    public static final int IV_ITERATIONS = 256;

    public static void main(String[] arrstring) {
        if (arrstring.length == 0) {
            System.out.println("Usage: SecureEncoder <input filepath>");
            System.exit(0);
        }
        String string = SuperSecureSipher.readFirstLine(arrstring[0]);
        SuperSecureSipher.writeToFile(SuperSecureSipher.encrypt(string), arrstring[0] + ".out");
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
        }
        n2 = n3;
        int n4 = string.length();
        for (n = 0; n < n4; ++n) {
            n2 ^= string.charAt(n);
        }
        object = (String)object + (char)n2;
        n = 0;
        int n5 = string.length() - 1;
        for (n4 = 0; n4 < n5; ++n4) {
            object = (String)object + (char)(n2 ^ (n ^= string.charAt(n4)));
        }
        return object;
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
