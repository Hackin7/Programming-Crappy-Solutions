package wtf.riceteacatpanda.quiz;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends C0282e {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m2685a(wtf.riceteacatpanda.quiz.MainActivity r11, final java.lang.String r12) {
        /*
            ki r0 = new ki
            r0.<init>()
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
        L_0x000f:
            int r3 = r2.length()
            r4 = 64
            if (r3 >= r4) goto L_0x0023
            int r3 = r1.nextInt()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            goto L_0x000f
        L_0x0023:
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r4)
            kl$a r2 = new kl$a
            r2.<init>()
            android.content.res.Resources r3 = r11.getResources()
            r4 = 2131492918(0x7f0c0036, float:1.8609301E38)
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L_0x0046
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "url == null"
            r11.<init>(r12)
            throw r11
        L_0x0046:
            r6 = 1
            r7 = 0
            java.lang.String r8 = "ws:"
            r9 = 0
            r10 = 3
            r5 = r3
            boolean r4 = r5.regionMatches(r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0067
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "http:"
            r4.<init>(r5)
            r5 = 3
        L_0x005b:
            java.lang.String r3 = r3.substring(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x007d
        L_0x0067:
            r6 = 1
            r7 = 0
            java.lang.String r8 = "wss:"
            r9 = 0
            r10 = 4
            r5 = r3
            boolean r4 = r5.regionMatches(r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x007d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "https:"
            r4.<init>(r5)
            r5 = 4
            goto L_0x005b
        L_0x007d:
            kf r4 = p000.C0607kf.m1863d(r3)
            if (r4 != 0) goto L_0x0097
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected url: "
            r12.<init>(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0097:
            kl$a r2 = r2.mo2382a(r4)
            kl r4 = r2.mo2383a()
            wtf.riceteacatpanda.quiz.MainActivity$2 r5 = new wtf.riceteacatpanda.quiz.MainActivity$2
            r5.<init>(r1, r12)
            mw r11 = new mw
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            int r12 = r0.f2610C
            long r7 = (long) r12
            r3 = r11
            r3.<init>(r4, r5, r6, r7)
            ki$a r12 = new ki$a
            r12.<init>(r0)
            kc r0 = p000.C0600kc.f2571a
            if (r0 != 0) goto L_0x00c3
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "eventListener == null"
            r11.<init>(r12)
            throw r11
        L_0x00c3:
            kc$a r0 = p000.C0600kc.m1821a(r0)
            r12.f2642g = r0
            java.util.List<kj> r0 = p000.C0735mw.f3136a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            kj r0 = p000.C0616kj.HTTP_1_1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "protocols doesn't contain http/1.1: "
            r12.<init>(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00ec:
            kj r0 = p000.C0616kj.HTTP_1_0
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0108
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "protocols must not contain http/1.0: "
            r12.<init>(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0108:
            r0 = 0
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0117
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "protocols must not contain null"
            r11.<init>(r12)
            throw r11
        L_0x0117:
            kj r0 = p000.C0616kj.SPDY_3
            r1.remove(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r12.f2638c = r0
            ki r0 = new ki
            r0.<init>(r12)
            kl r12 = r11.f3138b
            kl$a r12 = r12.mo2376a()
            java.lang.String r1 = "Upgrade"
            java.lang.String r2 = "websocket"
            kl$a r12 = r12.mo2380a(r1, r2)
            java.lang.String r1 = "Connection"
            java.lang.String r2 = "Upgrade"
            kl$a r12 = r12.mo2380a(r1, r2)
            java.lang.String r1 = "Sec-WebSocket-Key"
            java.lang.String r2 = r11.f3142f
            kl$a r12 = r12.mo2380a(r1, r2)
            java.lang.String r1 = "Sec-WebSocket-Version"
            java.lang.String r2 = "13"
            kl$a r12 = r12.mo2380a(r1, r2)
            kl r12 = r12.mo2383a()
            kt r1 = p000.C0631kt.f2730a
            js r0 = r1.mo2360a(r0, r12)
            r11.f3143g = r0
            js r0 = r11.f3143g
            mw$2 r1 = new mw$2
            r1.<init>(r12)
            r0.mo2289a(r1)
            p000.C0783nw.m2600a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wtf.riceteacatpanda.quiz.MainActivity.m2685a(wtf.riceteacatpanda.quiz.MainActivity, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.username);
        ((Button) findViewById(R.id.login_btn)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String obj = editText.getText().toString();
                if (obj.length() <= 0) {
                    Toast.makeText(MainActivity.this.getBaseContext(), "Enter your username!", 1).show();
                } else {
                    MainActivity.m2685a(MainActivity.this, obj);
                }
            }
        });
    }
}
