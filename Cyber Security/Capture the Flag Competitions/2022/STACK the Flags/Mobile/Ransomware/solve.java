import java.io.File;                                                        import java.io.FileInputStream;                                             import java.io.FileOutputStream;
import java.io.IOException;                                                 import java.security.InvalidKeyException;                                   import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;                                    import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;                                 import javax.crypto.spec.SecretKeySpec; 

class CryptoException extends Exception {                                public CryptoException() {                                                  }                                                                                                                                                       public CryptoException(String str, Throwable th) {
        super(str, th);                                                         }
}
                                                                                                                class Deeecrypt {                                                        public static void doCryptoInAES(int i, String str, File file, File file2) throws CryptoException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");                                                                                 Cipher instance = Cipher.getInstance("AES");                                instance.init(i, secretKeySpec);
            FileInputStream fileInputStream = new FileInputStream(file);                byte[] bArr = new byte[((int) file.length())];
            fileInputStream.read(bArr);                                                 byte[] doFinal = instance.doFinal(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(doFinal);
            fileInputStream.close();                                                    fileOutputStream.close();                                               } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {                                                                                   throw new CryptoException("Error encrypting/decrypting file", e);                                                                                   }                                                                       }                                                                       }

public class solve
{
    public static void main(String[] args) {
        try{                                                                           
        Deeecrypt.doCryptoInAES(2, "alberticipher123", new File("flag.txt"), new File("flag_decrypt.txt"));        
        } catch (CryptoException unused) {
            System.out.println("failed");                                  
        }
    }
}
