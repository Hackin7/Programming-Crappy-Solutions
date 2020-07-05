package p000;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: cm */
public final class C0209cm extends C0449hl implements OnClickListener {

    /* renamed from: a */
    public int f1047a = 1;

    /* renamed from: k */
    private final SearchManager f1048k = ((SearchManager) this.f1896e.getSystemService("search"));

    /* renamed from: l */
    private final SearchView f1049l;

    /* renamed from: m */
    private final SearchableInfo f1050m;

    /* renamed from: n */
    private final Context f1051n;

    /* renamed from: o */
    private final WeakHashMap<String, ConstantState> f1052o;

    /* renamed from: p */
    private final int f1053p;

    /* renamed from: q */
    private boolean f1054q = false;

    /* renamed from: r */
    private ColorStateList f1055r;

    /* renamed from: s */
    private int f1056s = -1;

    /* renamed from: t */
    private int f1057t = -1;

    /* renamed from: u */
    private int f1058u = -1;

    /* renamed from: v */
    private int f1059v = -1;

    /* renamed from: w */
    private int f1060w = -1;

    /* renamed from: x */
    private int f1061x = -1;

    /* renamed from: cm$a */
    static final class C0210a {

        /* renamed from: a */
        public final TextView f1062a;

        /* renamed from: b */
        public final TextView f1063b;

        /* renamed from: c */
        public final ImageView f1064c;

        /* renamed from: d */
        public final ImageView f1065d;

        /* renamed from: e */
        public final ImageView f1066e;

        public C0210a(View view) {
            this.f1062a = (TextView) view.findViewById(16908308);
            this.f1063b = (TextView) view.findViewById(16908309);
            this.f1064c = (ImageView) view.findViewById(16908295);
            this.f1065d = (ImageView) view.findViewById(16908296);
            this.f1066e = (ImageView) view.findViewById(C0122f.edit_query);
        }
    }

    public C0209cm(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1049l = searchView;
        this.f1050m = searchableInfo;
        this.f1053p = searchView.getSuggestionCommitIconResId();
        this.f1051n = context;
        this.f1052o = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m653a(ComponentName componentName) {
        String str;
        String nameNotFoundException;
        PackageManager packageManager = this.f1896e.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            str = "SuggestionsAdapter";
            StringBuilder sb = new StringBuilder("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            nameNotFoundException = sb.toString();
            Log.w(str, nameNotFoundException);
            return null;
        } catch (NameNotFoundException e) {
            str = "SuggestionsAdapter";
            nameNotFoundException = e.toString();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = new java.lang.StringBuilder("Resource does not exist: ");
        r2.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        throw new java.io.FileNotFoundException(r2.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m654a(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x007d }
            if (r1 == 0) goto L_0x0026
            android.graphics.drawable.Drawable r1 = r6.m661b(r7)     // Catch:{ NotFoundException -> 0x0012 }
            return r1
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r3 = "Resource does not exist: "
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x007d }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x007d }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x007d }
            throw r1     // Catch:{ FileNotFoundException -> 0x007d }
        L_0x0026:
            android.content.Context r1 = r6.f1051n     // Catch:{ FileNotFoundException -> 0x007d }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x007d }
            java.io.InputStream r1 = r1.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x007d }
            if (r1 != 0) goto L_0x0046
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r3 = "Failed to open "
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x007d }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x007d }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x007d }
            throw r1     // Catch:{ FileNotFoundException -> 0x007d }
        L_0x0046:
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x0063 }
            r1.close()     // Catch:{ IOException -> 0x004e }
            return r2
        L_0x004e:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r5 = "Error closing icon stream for "
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x007d }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x007d }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x007d }
            return r2
        L_0x0063:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x007c
        L_0x0068:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r5 = "Error closing icon stream for "
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x007d }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x007d }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x007d }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x007d }
        L_0x007c:
            throw r2     // Catch:{ FileNotFoundException -> 0x007d }
        L_0x007d:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Icon not found: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r1.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0209cm.m654a(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private Drawable m655a(String str) {
        Drawable drawable = null;
        if (str != null && !str.isEmpty()) {
            if ("0".equals(str)) {
                return null;
            }
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder("android.resource://");
                sb.append(this.f1051n.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String sb2 = sb.toString();
                Drawable b = m662b(sb2);
                if (b != null) {
                    return b;
                }
                Drawable a = C0313ev.m1047a(this.f1051n, parseInt);
                m660a(sb2, a);
                return a;
            } catch (NumberFormatException unused) {
                Drawable b2 = m662b(str);
                if (b2 != null) {
                    return b2;
                }
                drawable = m654a(Uri.parse(str));
                m660a(str, drawable);
            } catch (NotFoundException unused2) {
                StringBuilder sb3 = new StringBuilder("Icon resource not found: ");
                sb3.append(str);
                Log.w("SuggestionsAdapter", sb3.toString());
                return null;
            }
        }
        return drawable;
    }

    /* renamed from: a */
    private static String m656a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m657a(Cursor cursor, String str) {
        return m656a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static void m658a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private static void m659a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m660a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1052o.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m661b(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            StringBuilder sb = new StringBuilder("No authority: ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
        try {
            Resources resourcesForApplication = this.f1896e.getPackageManager().getResourcesForApplication(authority);
            List pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                StringBuilder sb2 = new StringBuilder("No path: ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    i = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder("Single path segment is not a resource ID: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
            } else if (size == 2) {
                i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                StringBuilder sb4 = new StringBuilder("More than two path segments: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            }
            if (i != 0) {
                return resourcesForApplication.getDrawable(i);
            }
            StringBuilder sb5 = new StringBuilder("No resource found for: ");
            sb5.append(uri);
            throw new FileNotFoundException(sb5.toString());
        } catch (NameNotFoundException unused2) {
            StringBuilder sb6 = new StringBuilder("No package found for authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* renamed from: b */
    private Drawable m662b(String str) {
        ConstantState constantState = (ConstantState) this.f1052o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: c */
    private static void m663c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[Catch:{ RuntimeException -> 0x0080 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor mo1295a(java.lang.CharSequence r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0005
            java.lang.String r11 = ""
            goto L_0x0009
        L_0x0005:
            java.lang.String r11 = r11.toString()
        L_0x0009:
            androidx.appcompat.widget.SearchView r0 = r10.f1049l
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L_0x0088
            androidx.appcompat.widget.SearchView r0 = r10.f1049l
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L_0x001b
            return r1
        L_0x001b:
            android.app.SearchableInfo r0 = r10.f1050m     // Catch:{ RuntimeException -> 0x0080 }
            if (r0 != 0) goto L_0x0021
        L_0x001f:
            r11 = r1
            goto L_0x007a
        L_0x0021:
            java.lang.String r2 = r0.getSuggestAuthority()     // Catch:{ RuntimeException -> 0x0080 }
            if (r2 != 0) goto L_0x0028
            goto L_0x001f
        L_0x0028:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ RuntimeException -> 0x0080 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r4)     // Catch:{ RuntimeException -> 0x0080 }
            android.net.Uri$Builder r2 = r3.authority(r2)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.query(r3)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.fragment(r3)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r3 = r0.getSuggestPath()     // Catch:{ RuntimeException -> 0x0080 }
            if (r3 == 0) goto L_0x004c
            r2.appendEncodedPath(r3)     // Catch:{ RuntimeException -> 0x0080 }
        L_0x004c:
            java.lang.String r3 = "search_suggest_query"
            r2.appendPath(r3)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r7 = r0.getSuggestSelection()     // Catch:{ RuntimeException -> 0x0080 }
            if (r7 == 0) goto L_0x005f
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ RuntimeException -> 0x0080 }
            r3 = 0
            r0[r3] = r11     // Catch:{ RuntimeException -> 0x0080 }
            r8 = r0
            goto L_0x0063
        L_0x005f:
            r2.appendPath(r11)     // Catch:{ RuntimeException -> 0x0080 }
            r8 = r1
        L_0x0063:
            java.lang.String r11 = "limit"
            java.lang.String r0 = "50"
            r2.appendQueryParameter(r11, r0)     // Catch:{ RuntimeException -> 0x0080 }
            android.net.Uri r5 = r2.build()     // Catch:{ RuntimeException -> 0x0080 }
            android.content.Context r11 = r10.f1896e     // Catch:{ RuntimeException -> 0x0080 }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ RuntimeException -> 0x0080 }
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x0080 }
        L_0x007a:
            if (r11 == 0) goto L_0x0088
            r11.getCount()     // Catch:{ RuntimeException -> 0x0080 }
            return r11
        L_0x0080:
            r11 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r11)
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0209cm.mo1295a(java.lang.CharSequence):android.database.Cursor");
    }

    /* renamed from: a */
    public final View mo1296a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo1296a(context, cursor, viewGroup);
        a.setTag(new C0210a(a));
        ((ImageView) a.findViewById(C0122f.edit_query)).setImageResource(this.f1053p);
        return a;
    }

    /* renamed from: a */
    public final void mo1297a(Cursor cursor) {
        if (this.f1054q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo1297a(cursor);
            if (cursor != null) {
                this.f1056s = cursor.getColumnIndex("suggest_text_1");
                this.f1057t = cursor.getColumnIndex("suggest_text_2");
                this.f1058u = cursor.getColumnIndex("suggest_text_2_url");
                this.f1059v = cursor.getColumnIndex("suggest_icon_1");
                this.f1060w = cursor.getColumnIndex("suggest_icon_2");
                this.f1061x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public final void mo1298a(View view, Cursor cursor) {
        Drawable drawable;
        CharSequence charSequence;
        Cursor cursor2 = cursor;
        C0210a aVar = (C0210a) view.getTag();
        int i = this.f1061x != -1 ? cursor2.getInt(this.f1061x) : 0;
        if (aVar.f1062a != null) {
            m659a(aVar.f1062a, (CharSequence) m656a(cursor2, this.f1056s));
        }
        if (aVar.f1063b != null) {
            String a = m656a(cursor2, this.f1058u);
            if (a != null) {
                if (this.f1055r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f1896e.getTheme().resolveAttribute(C0117a.textColorSearchUrl, typedValue, true);
                    this.f1055r = this.f1896e.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(a);
                TextAppearanceSpan textAppearanceSpan = r10;
                TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(null, 0, 0, this.f1055r, null);
                spannableString.setSpan(textAppearanceSpan, 0, a.length(), 33);
                charSequence = spannableString;
            } else {
                charSequence = m656a(cursor2, this.f1057t);
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (aVar.f1062a != null) {
                    aVar.f1062a.setSingleLine(false);
                    aVar.f1062a.setMaxLines(2);
                }
            } else if (aVar.f1062a != null) {
                aVar.f1062a.setSingleLine(true);
                aVar.f1062a.setMaxLines(1);
            }
            m659a(aVar.f1063b, charSequence);
        }
        Drawable drawable2 = null;
        if (aVar.f1064c != null) {
            ImageView imageView = aVar.f1064c;
            if (this.f1059v == -1) {
                drawable = null;
            } else {
                drawable = m655a(cursor2.getString(this.f1059v));
                if (drawable == null) {
                    ComponentName searchActivity = this.f1050m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.f1052o.containsKey(flattenToShortString)) {
                        ConstantState constantState = (ConstantState) this.f1052o.get(flattenToShortString);
                        drawable = constantState == null ? null : constantState.newDrawable(this.f1051n.getResources());
                    } else {
                        drawable = m653a(searchActivity);
                        this.f1052o.put(flattenToShortString, drawable == null ? null : drawable.getConstantState());
                    }
                    if (drawable == null) {
                        drawable = this.f1896e.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            m658a(imageView, drawable, 4);
        }
        if (aVar.f1065d != null) {
            ImageView imageView2 = aVar.f1065d;
            if (this.f1060w != -1) {
                drawable2 = m655a(cursor2.getString(this.f1060w));
            }
            m658a(imageView2, drawable2, 8);
        }
        if (this.f1047a == 2 || (this.f1047a == 1 && (i & 1) != 0)) {
            aVar.f1066e.setVisibility(0);
            aVar.f1066e.setTag(aVar.f1062a.getText());
            aVar.f1066e.setOnClickListener(this);
            return;
        }
        aVar.f1066e.setVisibility(8);
    }

    /* renamed from: b */
    public final CharSequence mo1299b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m657a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f1050m.shouldRewriteQueryFromData()) {
            String a2 = m657a(cursor, "suggest_intent_data");
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f1050m.shouldRewriteQueryFromText()) {
            String a3 = m657a(cursor, "suggest_text_1");
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo1884b(this.f1896e, this.f1895d, viewGroup);
            if (b != null) {
                ((C0210a) b.getTag()).f1062a.setText(e.toString());
            }
            return b;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo1296a(this.f1896e, this.f1895d, viewGroup);
            if (a != null) {
                ((C0210a) a.getTag()).f1062a.setText(e.toString());
            }
            return a;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m663c(mo1883a());
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m663c(mo1883a());
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1049l.setQuery((CharSequence) tag);
        }
    }
}
