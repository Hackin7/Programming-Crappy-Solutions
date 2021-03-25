package sg.gov.tech.ctf.mobile;

import a.b.k.c;
import a.b.k.d;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import c.a.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import sg.gov.tech.ctf.mobile.Helpers.Crypto;

public class Rome extends d {
    public static final char[] HEX_ARRAY = a.a(-9056551612344L).toCharArray();
    public final Crypto crypto = Crypto.getInstance(this);
    public TextView romeTextView;
    public EditText userinput;

    public native String encryptUserInput(String str);

    public native byte[] set(byte[] bArr, String str);

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rome_activity);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        this.userinput = (EditText) findViewById(R.id.editText_enteredFlag);
        this.romeTextView = (TextView) findViewById(R.id.rome_text);
        ((ImageButton) findViewById(R.id.button_submit)).setOnClickListener(new View.OnClickListener() {
            /* class sg.gov.tech.ctf.mobile.Rome.AnonymousClass1 */

            public void onClick(View v) {
                int flagStatus;
                Rome rome = Rome.this;
                rome.highlightString(rome.userinput.getText().toString());
                long plaintext = (long) (Math.random() * 1.0E16d);
                long plaintext2 = plaintext;
                String _plaintext = Long.toString(plaintext);
                while (_plaintext.length() < 16) {
                    plaintext2 *= 10;
                    _plaintext = Long.toString(plaintext2);
                }
                MessageDigest digest = null;
                try {
                    digest = MessageDigest.getInstance(a.a(-7583377829816L));
                } catch (NoSuchAlgorithmException e2) {
                    System.out.println(a.a(-7617737568184L));
                }
                byte[] hash = digest.digest(Long.toString(plaintext2).getBytes(StandardCharsets.UTF_8));
                String filePath = a.a(-7703636914104L);
                try {
                    filePath = Rome.this.getApplicationContext().getFilesDir().toString() + a.a(-7707931881400L);
                    File file = new File(filePath);
                    if (!file.exists()) {
                        file.createNewFile();
                    } else {
                        file.delete();
                        file.createNewFile();
                    }
                    FileOutputStream fos = new FileOutputStream(file);
                    fos.write(hash);
                    fos.close();
                } catch (Exception e3) {
                    System.out.println(a.a(-7733701685176L));
                }
                long key = (long) (Math.random() * 1.0E16d);
                String _key = Long.toString(key);
                while (_key.length() < 16) {
                    key *= 10;
                    _key = Long.toString(key);
                }
                System.out.println(a.a(-7793831227320L) + _key);
                Rome.this.crypto.keyGenerate(_key);
                String cipherText = Rome.this.crypto.encrypt(Long.toString(plaintext2));
                System.out.println(a.a(-7853960769464L) + cipherText);
                String encFlg = a.a(-8034349395896L);
                String encUserInput = Rome.this.encryptUserInput(Rome.this.userinput.getText().toString());
                if (encUserInput.length() <= 32 || encUserInput.length() > 64) {
                    flagStatus = -1;
                } else {
                    String str_user = a.a(-8313522270136L);
                    String str_f = a.a(-8317817237432L);
                    while (encUserInput.length() % 32 != 0) {
                        encUserInput = encUserInput.concat(a.a(-8322112204728L));
                        str_user = str_user;
                    }
                    byte[] r_key = Rome.this.select(plaintext2, filePath);
                    int i = 0;
                    String str_f2 = str_f;
                    String encUserInput2 = encUserInput;
                    String encFlg2 = encFlg;
                    String str_user2 = str_user;
                    while (i < 2) {
                        String flagNextChunk = encFlg2.substring(0, 32);
                        byte[] chunkB = Rome.this.set(r_key, encUserInput2.substring(0, 32));
                        byte[] chunkfB = Rome.this.set(r_key, flagNextChunk);
                        str_user2 = str_user2.concat(Rome.bytesToHex(chunkB));
                        str_f2 = str_f2.concat(Rome.bytesToHex(chunkfB));
                        encUserInput2 = encUserInput2.substring(32);
                        encFlg2 = encFlg2.substring(32);
                        i++;
                        cipherText = cipherText;
                        key = key;
                        plaintext2 = plaintext2;
                    }
                    if (!str_user2.matches(str_f2) || str_user2.isEmpty() || str_f2.isEmpty()) {
                        flagStatus = 1;
                    } else {
                        flagStatus = 0;
                    }
                }
                if (flagStatus == 0) {
                    c.a builder = new c.a(Rome.this);
                    View view = LayoutInflater.from(Rome.this).inflate(R.layout.custom_alert, (ViewGroup) null);
                    ((TextView) view.findViewById(R.id.title)).setText(a.a(-8330702139320L));
                    ((TextView) view.findViewById(R.id.alert_detail)).setText(a.a(-8373651812280L));
                    builder.h(a.a(-8420896452536L), new DialogInterface.OnClickListener() {
                        /* class sg.gov.tech.ctf.mobile.Rome.AnonymousClass1.AnonymousClass1 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            Rome.this.startActivity(new Intent(Rome.this, MainActivity.class));
                        }
                    });
                    builder.f(a.a(-8455256190904L), new DialogInterface.OnClickListener() {
                        /* class sg.gov.tech.ctf.mobile.Rome.AnonymousClass1.AnonymousClass2 */

                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(Rome.this, a.a(-7458823778232L), 0).show();
                        }
                    });
                    builder.k(view);
                    builder.l();
                } else if (flagStatus == 1) {
                    Toast.makeText(Rome.this.getApplicationContext(), a.a(-8481025994680L), 0).show();
                } else {
                    Toast.makeText(Rome.this.getApplicationContext(), a.a(-8562630373304L), 0).show();
                }
            }
        });
    }

    public byte[] select(long seed, String filePath) {
        byte[] ret = new byte[32];
        byte[] possiblebytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, Byte.MAX_VALUE, Byte.MIN_VALUE, -127, -126, -125, -124, -123, -122, -121, -120, -119, -118, -117, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -106, -105, -104, -103, -102, -101, -100, -99, -98, -97, -96, -95, -94, -93, -92, -91, -90, -89, -88, -87, -86, -85, -84, -83, -82, -81, -80, -79, -78, -77, -76, -75, -74, -73, -72, -71, -70, -69, -68, -67, -66, -65, -64, -63, -61, -62, -60, -59, -58, -57, -56, -55, -54, -53, -52, -51, -50, -49, -48, -47, -46, -45, -44, -43, -42, -41, -40, -39, -38, -37, -36, -35, -34, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1};
        try {
            try {
                if (bytesToHex(MessageDigest.getInstance(a.a(-8734429065144L)).digest(Long.toString(seed).getBytes(StandardCharsets.UTF_8))).matches(bytesToHex(read(new File(filePath))))) {
                    Random rand = new Random();
                    rand.setSeed(seed);
                    for (int i = 0; i < 32; i++) {
                        ret[i] = possiblebytes[rand.nextInt(256) + 0];
                    }
                }
                return ret;
            } catch (NoSuchAlgorithmException e2) {
                System.out.println(a.a(-8768788803512L));
                return ret;
            }
        } catch (IOException e3) {
            System.out.println(a.a(-8648529719224L));
            return ret;
        }
    }

    static {
        System.loadLibrary(a.a(-9129566056376L));
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[(bytes.length * 2)];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 255;
            char[] cArr = HEX_ARRAY;
            hexChars[j * 2] = cArr[v >>> 4];
            hexChars[(j * 2) + 1] = cArr[v & 15];
        }
        return new String(hexChars);
    }

    public byte[] read(File file) {
        byte[] buffer = new byte[((int) file.length())];
        InputStream ios = null;
        try {
            ios = new FileInputStream(file);
            if (ios.read(buffer) != -1) {
                try {
                    ios.close();
                } catch (IOException e2) {
                }
                return buffer;
            }
            throw new IOException(a.a(-8850393182136L));
        } catch (Throwable th) {
            if (ios != null) {
                try {
                    ios.close();
                } catch (IOException e3) {
                }
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void highlightString(String input) {
        SpannableString spannableString = new SpannableString(this.romeTextView.getText());
        for (BackgroundColorSpan span : (BackgroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), BackgroundColorSpan.class)) {
            spannableString.removeSpan(span);
        }
        int indexOfKeyword = spannableString.toString().indexOf(input);
        while (indexOfKeyword > 0) {
            spannableString.setSpan(new BackgroundColorSpan(-256), indexOfKeyword, input.length() + indexOfKeyword, 33);
            indexOfKeyword = spannableString.toString().indexOf(input, input.length() + indexOfKeyword);
        }
        this.romeTextView.setText(spannableString);
    }
}
