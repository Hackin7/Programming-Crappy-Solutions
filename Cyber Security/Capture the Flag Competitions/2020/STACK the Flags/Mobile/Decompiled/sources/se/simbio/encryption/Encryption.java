package se.simbio.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class Encryption {
    public final c mBuilder;

    public interface d {
        void a(Exception exc);

        void b(String str);
    }

    public /* synthetic */ Encryption(c x0, a x1) {
        this(x0);
    }

    public Encryption(c builder) {
        this.mBuilder = builder;
    }

    public static Encryption getDefault(String key, String salt, byte[] iv) {
        try {
            return c.q(key, salt, iv).m();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String encrypt(String data) {
        if (data == null) {
            return null;
        }
        SecretKey secretKey = getSecretKey(hashTheKey(this.mBuilder.v()));
        byte[] dataBytes = data.getBytes(this.mBuilder.p());
        Cipher cipher = Cipher.getInstance(this.mBuilder.n());
        cipher.init(1, secretKey, this.mBuilder.u(), this.mBuilder.A());
        return g.a.a.a.a.f(cipher.doFinal(dataBytes), this.mBuilder.o());
    }

    public String encryptOrNull(String data) {
        try {
            return encrypt(data);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f2910b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f2911c;

        public a(String str, d dVar) {
            this.f2910b = str;
            this.f2911c = dVar;
        }

        public void run() {
            try {
                String encrypt = Encryption.this.encrypt(this.f2910b);
                if (encrypt == null) {
                    this.f2911c.a(new Exception("Encrypt return null, it normally occurs when you send a null data"));
                }
                this.f2911c.b(encrypt);
            } catch (Exception e2) {
                this.f2911c.a(e2);
            }
        }
    }

    public void encryptAsync(String data, d callback) {
        if (callback != null) {
            new Thread(new a(data, callback)).start();
        }
    }

    public String decrypt(String data) {
        if (data == null) {
            return null;
        }
        byte[] dataBytes = g.a.a.a.a.a(data, this.mBuilder.o());
        SecretKey secretKey = getSecretKey(hashTheKey(this.mBuilder.v()));
        Cipher cipher = Cipher.getInstance(this.mBuilder.n());
        cipher.init(2, secretKey, this.mBuilder.u(), this.mBuilder.A());
        return new String(cipher.doFinal(dataBytes));
    }

    public String decryptOrNull(String data) {
        try {
            return decrypt(data);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f2913b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f2914c;

        public b(String str, d dVar) {
            this.f2913b = str;
            this.f2914c = dVar;
        }

        public void run() {
            try {
                String decrypt = Encryption.this.decrypt(this.f2913b);
                if (decrypt == null) {
                    this.f2914c.a(new Exception("Decrypt return null, it normally occurs when you send a null data"));
                }
                this.f2914c.b(decrypt);
            } catch (Exception e2) {
                this.f2914c.a(e2);
            }
        }
    }

    public void decryptAsync(String data, d callback) {
        if (callback != null) {
            new Thread(new b(data, callback)).start();
        }
    }

    private SecretKey getSecretKey(char[] key) {
        return new SecretKeySpec(SecretKeyFactory.getInstance(this.mBuilder.z()).generateSecret(new PBEKeySpec(key, this.mBuilder.y().getBytes(this.mBuilder.p()), this.mBuilder.s(), this.mBuilder.x())).getEncoded(), this.mBuilder.w());
    }

    private char[] hashTheKey(String key) {
        MessageDigest messageDigest = MessageDigest.getInstance(this.mBuilder.r());
        messageDigest.update(key.getBytes(this.mBuilder.p()));
        return g.a.a.a.a.f(messageDigest.digest(), 1).toCharArray();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f2916a;

        /* renamed from: b  reason: collision with root package name */
        public int f2917b;

        /* renamed from: c  reason: collision with root package name */
        public int f2918c;

        /* renamed from: d  reason: collision with root package name */
        public int f2919d;

        /* renamed from: e  reason: collision with root package name */
        public String f2920e;

        /* renamed from: f  reason: collision with root package name */
        public String f2921f;

        /* renamed from: g  reason: collision with root package name */
        public String f2922g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public SecureRandom m;
        public IvParameterSpec n;

        public static c q(String key, String salt, byte[] iv) {
            c cVar = new c();
            cVar.H(iv);
            cVar.J(key);
            cVar.M(salt);
            cVar.L(128);
            cVar.K("AES");
            cVar.E("UTF8");
            cVar.G(1);
            cVar.F("SHA1");
            cVar.D(0);
            cVar.C("AES/CBC/PKCS5Padding");
            cVar.P("SHA1PRNG");
            cVar.N("PBKDF2WithHmacSHA1");
            return cVar;
        }

        public Encryption m() {
            O(SecureRandom.getInstance(B()));
            I(new IvParameterSpec(t()));
            return new Encryption(this, null);
        }

        public final String p() {
            return this.i;
        }

        public c E(String charsetName) {
            this.i = charsetName;
            return this;
        }

        public final String n() {
            return this.f2922g;
        }

        public c C(String algorithm) {
            this.f2922g = algorithm;
            return this;
        }

        public final String w() {
            return this.h;
        }

        public c K(String keyAlgorithm) {
            this.h = keyAlgorithm;
            return this;
        }

        public final int o() {
            return this.f2918c;
        }

        public c D(int base64Mode) {
            this.f2918c = base64Mode;
            return this;
        }

        public final String z() {
            return this.j;
        }

        public c N(String secretKeyType) {
            this.j = secretKeyType;
            return this;
        }

        public final String y() {
            return this.f2920e;
        }

        public c M(String salt) {
            this.f2920e = salt;
            return this;
        }

        public final String v() {
            return this.f2921f;
        }

        public c J(String key) {
            this.f2921f = key;
            return this;
        }

        public final int x() {
            return this.f2917b;
        }

        public c L(int keyLength) {
            this.f2917b = keyLength;
            return this;
        }

        public final int s() {
            return this.f2919d;
        }

        public c G(int iterationCount) {
            this.f2919d = iterationCount;
            return this;
        }

        public final String B() {
            return this.l;
        }

        public c P(String secureRandomAlgorithm) {
            this.l = secureRandomAlgorithm;
            return this;
        }

        public final byte[] t() {
            return this.f2916a;
        }

        public c H(byte[] iv) {
            this.f2916a = iv;
            return this;
        }

        public final SecureRandom A() {
            return this.m;
        }

        public c O(SecureRandom secureRandom) {
            this.m = secureRandom;
            return this;
        }

        public final IvParameterSpec u() {
            return this.n;
        }

        public c I(IvParameterSpec ivParameterSpec) {
            this.n = ivParameterSpec;
            return this;
        }

        public final String r() {
            return this.k;
        }

        public c F(String digestAlgorithm) {
            this.k = digestAlgorithm;
            return this;
        }
    }
}
