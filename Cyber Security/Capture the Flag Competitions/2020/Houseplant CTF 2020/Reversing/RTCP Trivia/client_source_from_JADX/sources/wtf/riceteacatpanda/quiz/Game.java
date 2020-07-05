package wtf.riceteacatpanda.quiz;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class Game extends C0282e {

    /* renamed from: j */
    CountDownTimer f3398j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f3399k = true;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_game);
        final TextView textView = (TextView) findViewById(R.id.countdown);
        final MediaPlayer create = MediaPlayer.create(this, R.raw.correct);
        C08061 r1 = new C0782nv() {
            public final void run() {
                try {
                    if (Game.this.f3399k) {
                        C0783nw.m2599a().mo2404a("{\"method\":\"start\"}");
                        Game.this.f3399k = false;
                    } else {
                        create.start();
                    }
                    Game.this.runOnUiThread(new Runnable() {
                        public final void run() {
                            if (Game.this.f3398j != null) {
                                Game.this.f3398j.cancel();
                                Game.this.f3398j = null;
                            }
                            Game.this.f3398j = new CountDownTimer() {
                                public final void onFinish() {
                                    textView.setText("0");
                                }

                                public final void onTick(long j) {
                                    textView.setText(String.valueOf(Math.round((float) (j / 1000))));
                                }
                            };
                            Game.this.f3398j.start();
                        }
                    });
                    JSONObject jSONObject = new JSONObject(this.f3310d);
                    String a = new C0784nx(Game.this.getIntent().getStringExtra("id"), Game.this.getResources()).mo2708a();
                    String string = jSONObject.getString("id");
                    StringBuilder sb = new StringBuilder();
                    sb.append(a);
                    sb.append(":");
                    sb.append(string);
                    byte[] a2 = C0784nx.m2603a(sb.toString());
                    byte[] b = C0784nx.m2604b(jSONObject.getString("requestIdentifier"));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(a2, "AES");
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(b);
                    Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    instance.init(2, secretKeySpec, ivParameterSpec);
                    byte[] doFinal = instance.doFinal(Base64.decode(jSONObject.getString("questionText"), 0));
                    Game game = Game.this;
                    game.runOnUiThread(new Runnable(new String(doFinal)) {

                        /* renamed from: a */
                        final /* synthetic */ String f3407a;

                        {
                            this.f3407a = r2;
                        }

                        public final void run() {
                            ((TextView) Game.this.findViewById(R.id.question)).setText(this.f3407a);
                        }
                    });
                    int[] iArr = {R.id.opt_0, R.id.opt_1, R.id.opt_2, R.id.opt_3};
                    for (final int i = 0; i < jSONObject.getJSONArray("options").length(); i++) {
                        Button button = (Button) Game.this.findViewById(iArr[i]);
                        button.setText(new String(instance.doFinal(Base64.decode((String) jSONObject.getJSONArray("options").get(i), 0))));
                        button.setOnClickListener(new OnClickListener() {
                            public final void onClick(View view) {
                                C0629kr a = C0783nw.m2599a();
                                StringBuilder sb = new StringBuilder("{\"method\":\"answer\",\"answer\":");
                                sb.append(i);
                                sb.append("}");
                                a.mo2404a(sb.toString());
                            }
                        });
                    }
                } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        if (this.f3399k) {
            C0783nw.m2599a().mo2404a("{\"method\":\"start\"}");
            this.f3399k = false;
        } else {
            create.start();
        }
        C0783nw.m2601a((C0782nv) r1);
        StringBuilder sb = new StringBuilder("isFirst = ");
        sb.append(this.f3399k);
        Log.e("XO", sb.toString());
    }
}
