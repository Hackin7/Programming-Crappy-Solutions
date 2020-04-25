package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: hq */
public class C0464hq extends C0308er implements C0543jb {

    /* renamed from: a */
    final Handler f2021a = new Handler() {
        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            C0464hq.this.mo1970d();
            C0464hq.this.f2022b.mo2000b();
        }
    };

    /* renamed from: b */
    final C0469hs f2022b = new C0469hs(new C0466a());

    /* renamed from: c */
    boolean f2023c;

    /* renamed from: d */
    boolean f2024d;

    /* renamed from: e */
    boolean f2025e = true;

    /* renamed from: f */
    boolean f2026f;

    /* renamed from: g */
    boolean f2027g;

    /* renamed from: h */
    int f2028h;

    /* renamed from: i */
    C0257dl<String> f2029i;

    /* renamed from: j */
    private C0542ja f2030j;

    /* renamed from: hq$a */
    class C0466a extends C0470ht<C0464hq> {
        public C0466a() {
            super(C0464hq.this);
        }

        /* renamed from: a */
        public final View mo1965a(int i) {
            return C0464hq.this.findViewById(i);
        }

        /* renamed from: a */
        public final void mo1992a(String str, PrintWriter printWriter, String[] strArr) {
            C0464hq.this.dump(str, null, printWriter, strArr);
        }

        /* renamed from: a */
        public final boolean mo1967a() {
            Window window = C0464hq.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: b */
        public final boolean mo1993b() {
            return !C0464hq.this.isFinishing();
        }

        /* renamed from: c */
        public final LayoutInflater mo1994c() {
            return C0464hq.this.getLayoutInflater().cloneInContext(C0464hq.this);
        }

        /* renamed from: d */
        public final void mo1995d() {
            C0464hq.this.mo1602a_();
        }

        /* renamed from: e */
        public final boolean mo1996e() {
            return C0464hq.this.getWindow() != null;
        }

        /* renamed from: f */
        public final int mo1997f() {
            Window window = C0464hq.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }
    }

    /* renamed from: hq$b */
    static final class C0467b {

        /* renamed from: a */
        Object f2033a;

        /* renamed from: b */
        C0542ja f2034b;

        /* renamed from: c */
        C0487hw f2035c;

        C0467b() {
        }
    }

    /* renamed from: a */
    private View m1483a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2022b.f2036a.f2041e.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    private static void m1484a(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: a */
    private static boolean m1485a(C0471hu huVar, C0524b bVar) {
        boolean z = false;
        for (C0457hp hpVar : huVar.mo2003b()) {
            if (hpVar != null) {
                if (hpVar.mo1688c().mo2120a().mo2123a(C0524b.STARTED)) {
                    hpVar.f1970T.mo2125a(bVar);
                    z = true;
                }
                C0472hv hvVar = hpVar.f1993u;
                if (hvVar != null) {
                    z |= m1485a(hvVar, bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private void mo1604b() {
        do {
        } while (m1485a(this.f2022b.f2036a.f2041e, C0524b.CREATED));
    }

    /* renamed from: a */
    public final C0542ja mo1930a() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2030j == null) {
            this.f2030j = new C0542ja();
        }
        return this.f2030j;
    }

    @Deprecated
    /* renamed from: a_ */
    public void mo1602a_() {
        invalidateOptionsMenu();
    }

    /* renamed from: c */
    public final C0522in mo1688c() {
        return super.mo1688c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo1970d() {
        this.f2022b.f2036a.f2041e.mo2033j();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2023c);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2024d);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2025e);
        if (getApplication() != null) {
            C0544jc.m1713a(this).mo2140a(sb2, printWriter);
        }
        this.f2022b.f2036a.f2041e.mo2001a(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2022b.mo1999a();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f2029i.mo1489a(i4, null);
            this.f2029i.mo1490a(i4);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.f2022b.mo1998a(str) == null) {
                StringBuilder sb = new StringBuilder("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w("FragmentActivity", sb.toString());
            } else {
                C0457hp.m1430g();
            }
        } else {
            C0307a a = C0306eq.m1035a();
            if (a == null || !a.mo1686a()) {
                super.onActivityResult(i, i2, intent);
            }
        }
    }

    public void onBackPressed() {
        C0472hv hvVar = this.f2022b.f2036a.f2041e;
        boolean c = hvVar.mo2004c();
        if (!c || VERSION.SDK_INT > 25) {
            if (c || !hvVar.mo2002a()) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2022b.mo1999a();
        this.f2022b.f2036a.f2041e.mo2008a(configuration);
    }

    public void onCreate(Bundle bundle) {
        C0469hs hsVar = this.f2022b;
        C0487hw hwVar = null;
        hsVar.f2036a.f2041e.mo2014a((C0470ht) hsVar.f2036a, (C0468hr) hsVar.f2036a, (C0457hp) null);
        super.onCreate(bundle);
        C0467b bVar = (C0467b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.f2030j = bVar.f2034b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0469hs hsVar2 = this.f2022b;
            if (bVar != null) {
                hwVar = bVar.f2035c;
            }
            hsVar2.f2036a.f2041e.mo2009a(parcelable, hwVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2028h = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f2029i = new C0257dl<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f2029i.mo1493b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f2029i == null) {
            this.f2029i = new C0257dl<>();
            this.f2028h = 0;
        }
        this.f2022b.f2036a.f2041e.mo2028g();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0469hs hsVar = this.f2022b;
        return onCreatePanelMenu | hsVar.f2036a.f2041e.mo2017a(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = m1483a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = m1483a(null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f2030j != null && !isChangingConfigurations()) {
            this.f2030j.mo2138a();
        }
        this.f2022b.f2036a.f2041e.mo2035l();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2022b.f2036a.f2041e.mo2036m();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2022b.f2036a.f2041e.mo2018a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2022b.f2036a.f2041e.mo2022b(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f2022b.f2036a.f2041e.mo2015a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f2022b.mo1999a();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2022b.f2036a.f2041e.mo2019b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f2024d = false;
        if (this.f2021a.hasMessages(2)) {
            this.f2021a.removeMessages(2);
            mo1970d();
        }
        this.f2022b.f2036a.f2041e.mo2006a(3);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f2022b.f2036a.f2041e.mo2021b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f2021a.removeMessages(2);
        mo1970d();
        this.f2022b.mo2000b();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : super.onPreparePanel(0, view, menu) | this.f2022b.f2036a.f2041e.mo2016a(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str;
        String sb;
        this.f2022b.mo1999a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str2 = (String) this.f2029i.mo1489a(i3, null);
            this.f2029i.mo1490a(i3);
            if (str2 == null) {
                str = "FragmentActivity";
                sb = "Activity result delivered for unknown Fragment.";
            } else if (this.f2022b.mo1998a(str2) == null) {
                str = "FragmentActivity";
                StringBuilder sb2 = new StringBuilder("Activity result no fragment exists for who: ");
                sb2.append(str2);
                sb = sb2.toString();
            } else {
                C0457hp.m1431h();
            }
            Log.w(str, sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f2021a.sendEmptyMessage(2);
        this.f2024d = true;
        this.f2022b.mo2000b();
    }

    public final Object onRetainNonConfigurationInstance() {
        C0472hv hvVar = this.f2022b.f2036a.f2041e;
        C0472hv.m1529a(hvVar.f2051D);
        C0487hw hwVar = hvVar.f2051D;
        if (hwVar == null && this.f2030j == null) {
            return null;
        }
        C0467b bVar = new C0467b();
        bVar.f2033a = null;
        bVar.f2034b = this.f2030j;
        bVar.f2035c = hwVar;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo1604b();
        Parcelable e = this.f2022b.f2036a.f2041e.mo2025e();
        if (e != null) {
            bundle.putParcelable("android:support:fragments", e);
        }
        if (this.f2029i.mo1491b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2028h);
            int[] iArr = new int[this.f2029i.mo1491b()];
            String[] strArr = new String[this.f2029i.mo1491b()];
            for (int i = 0; i < this.f2029i.mo1491b(); i++) {
                iArr[i] = this.f2029i.mo1492b(i);
                strArr[i] = (String) this.f2029i.mo1494c(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f2025e = false;
        if (!this.f2023c) {
            this.f2023c = true;
            this.f2022b.f2036a.f2041e.mo2030h();
        }
        this.f2022b.mo1999a();
        this.f2022b.mo2000b();
        this.f2022b.f2036a.f2041e.mo2032i();
    }

    public void onStateNotSaved() {
        this.f2022b.mo1999a();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f2025e = true;
        mo1604b();
        this.f2022b.f2036a.f2041e.mo2034k();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f2027g && i != -1) {
            m1484a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f2027g && i != -1) {
            m1484a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f2026f && i != -1) {
            m1484a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f2026f && i != -1) {
            m1484a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
