package a.b.p;

import a.b.f;
import a.i.a.c;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import net.sqlcipher.BuildConfig;

@SuppressLint({"RestrictedAPI"})
public class q0 extends c implements View.OnClickListener {
    public final SearchView m;
    public final SearchableInfo n;
    public final Context o;
    public final WeakHashMap<String, Drawable.ConstantState> p;
    public final int q;
    public boolean r = false;
    public int s = 1;
    public ColorStateList t;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int z = -1;

    public q0(Context context, SearchView searchView, SearchableInfo searchable, WeakHashMap<String, Drawable.ConstantState> outsideDrawablesCache) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.m = searchView;
        this.n = searchable;
        this.q = searchView.getSuggestionCommitIconResId();
        this.o = context;
        this.p = outsideDrawablesCache;
    }

    public void x(int refineWhat) {
        this.s = refineWhat;
    }

    public boolean hasStableIds() {
        return false;
    }

    public Cursor w(CharSequence constraint) {
        String query = constraint == null ? BuildConfig.FLAVOR : constraint.toString();
        if (this.m.getVisibility() != 0 || this.m.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursor = u(this.n, query, 50);
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
        }
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(d());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(d());
    }

    public final void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    @Override // a.i.a.a
    public void b(Cursor c2) {
        if (this.r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (c2 != null) {
                c2.close();
                return;
            }
            return;
        }
        try {
            super.b(c2);
            if (c2 != null) {
                this.u = c2.getColumnIndex("suggest_text_1");
                this.v = c2.getColumnIndex("suggest_text_2");
                this.w = c2.getColumnIndex("suggest_text_2_url");
                this.x = c2.getColumnIndex("suggest_icon_1");
                this.y = c2.getColumnIndex("suggest_icon_2");
                this.z = c2.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // a.i.a.a, a.i.a.c
    public View g(Context context, Cursor cursor, ViewGroup parent) {
        View v2 = super.g(context, cursor, parent);
        v2.setTag(new a(v2));
        ((ImageView) v2.findViewById(f.edit_query)).setImageResource(this.q);
        return v2;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f400a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f401b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f402c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f403d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f404e;

        public a(View v) {
            this.f400a = (TextView) v.findViewById(16908308);
            this.f401b = (TextView) v.findViewById(16908309);
            this.f402c = (ImageView) v.findViewById(16908295);
            this.f403d = (ImageView) v.findViewById(16908296);
            this.f404e = (ImageView) v.findViewById(f.edit_query);
        }
    }

    @Override // a.i.a.a
    public void a(View view, Context context, Cursor cursor) {
        CharSequence text2;
        a views = (a) view.getTag();
        int flags = 0;
        int i = this.z;
        if (i != -1) {
            flags = cursor.getInt(i);
        }
        if (views.f400a != null) {
            z(views.f400a, v(cursor, this.u));
        }
        if (views.f401b != null) {
            CharSequence text22 = v(cursor, this.w);
            if (text22 != null) {
                text2 = k(text22);
            } else {
                text2 = v(cursor, this.v);
            }
            if (TextUtils.isEmpty(text2)) {
                TextView textView = views.f400a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    views.f400a.setMaxLines(2);
                }
            } else {
                TextView textView2 = views.f400a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    views.f400a.setMaxLines(1);
                }
            }
            z(views.f401b, text2);
        }
        ImageView imageView = views.f402c;
        if (imageView != null) {
            y(imageView, s(cursor), 4);
        }
        ImageView imageView2 = views.f403d;
        if (imageView2 != null) {
            y(imageView2, t(cursor), 8);
        }
        int i2 = this.s;
        if (i2 == 2 || (i2 == 1 && (flags & 1) != 0)) {
            views.f404e.setVisibility(0);
            views.f404e.setTag(views.f400a.getText());
            views.f404e.setOnClickListener(this);
            return;
        }
        views.f404e.setVisibility(8);
    }

    public void onClick(View v2) {
        Object tag = v2.getTag();
        if (tag instanceof CharSequence) {
            this.m.U((CharSequence) tag);
        }
    }

    public final CharSequence k(CharSequence url) {
        if (this.t == null) {
            TypedValue colorValue = new TypedValue();
            this.f1013e.getTheme().resolveAttribute(a.b.a.textColorSearchUrl, colorValue, true);
            this.t = this.f1013e.getResources().getColorStateList(colorValue.resourceId);
        }
        SpannableString text = new SpannableString(url);
        text.setSpan(new TextAppearanceSpan(null, 0, 0, this.t, null), 0, url.length(), 33);
        return text;
    }

    public final void z(TextView v2, CharSequence text) {
        v2.setText(text);
        if (TextUtils.isEmpty(text)) {
            v2.setVisibility(8);
        } else {
            v2.setVisibility(0);
        }
    }

    public final Drawable s(Cursor cursor) {
        int i = this.x;
        if (i == -1) {
            return null;
        }
        Drawable drawable = r(cursor.getString(i));
        if (drawable != null) {
            return drawable;
        }
        return o();
    }

    public final Drawable t(Cursor cursor) {
        int i = this.y;
        if (i == -1) {
            return null;
        }
        return r(cursor.getString(i));
    }

    public final void y(ImageView v2, Drawable drawable, int nullVisibility) {
        v2.setImageDrawable(drawable);
        if (drawable == null) {
            v2.setVisibility(nullVisibility);
            return;
        }
        v2.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // a.i.a.a
    public CharSequence c(Cursor cursor) {
        String text1;
        String data;
        if (cursor == null) {
            return null;
        }
        String query = n(cursor, "suggest_intent_query");
        if (query != null) {
            return query;
        }
        if (this.n.shouldRewriteQueryFromData() && (data = n(cursor, "suggest_intent_data")) != null) {
            return data;
        }
        if (!this.n.shouldRewriteQueryFromText() || (text1 = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return text1;
    }

    @Override // a.i.a.a
    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getView(position, convertView, parent);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View v2 = g(this.f1013e, this.f1012d, parent);
            ((a) v2.getTag()).f400a.setText(e2.toString());
            return v2;
        }
    }

    @Override // a.i.a.a
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getDropDownView(position, convertView, parent);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View v2 = f(this.f1013e, this.f1012d, parent);
            if (v2 != null) {
                ((a) v2.getTag()).f400a.setText(e2.toString());
            }
            return v2;
        }
    }

    public final Drawable r(String drawableId) {
        if (drawableId == null || drawableId.isEmpty() || "0".equals(drawableId)) {
            return null;
        }
        try {
            int resourceId = Integer.parseInt(drawableId);
            String drawableUri = "android.resource://" + this.o.getPackageName() + "/" + resourceId;
            Drawable drawable = j(drawableUri);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = a.h.e.a.c(this.o, resourceId);
            A(drawableUri, drawable2);
            return drawable2;
        } catch (NumberFormatException e2) {
            Drawable drawable3 = j(drawableId);
            if (drawable3 != null) {
                return drawable3;
            }
            Drawable drawable4 = p(Uri.parse(drawableId));
            A(drawableId, drawable4);
            return drawable4;
        } catch (Resources.NotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + drawableId);
            return null;
        }
    }

    public final Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException e2) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream stream = this.o.getContentResolver().openInputStream(uri);
                if (stream != null) {
                    try {
                        return Drawable.createFromStream(stream, null);
                    } finally {
                        try {
                            stream.close();
                        } catch (IOException ex) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, ex);
                        }
                    }
                } else {
                    throw new FileNotFoundException("Failed to open " + uri);
                }
            }
        } catch (FileNotFoundException fnfe) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + fnfe.getMessage());
            return null;
        }
    }

    public final Drawable j(String resourceUri) {
        Drawable.ConstantState cached = this.p.get(resourceUri);
        if (cached == null) {
            return null;
        }
        return cached.newDrawable();
    }

    public final void A(String resourceUri, Drawable drawable) {
        if (drawable != null) {
            this.p.put(resourceUri, drawable.getConstantState());
        }
    }

    public final Drawable o() {
        Drawable drawable = m(this.n.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return this.f1013e.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable m(ComponentName component) {
        String componentIconKey = component.flattenToShortString();
        Drawable.ConstantState toCache = null;
        if (this.p.containsKey(componentIconKey)) {
            Drawable.ConstantState cached = this.p.get(componentIconKey);
            if (cached == null) {
                return null;
            }
            return cached.newDrawable(this.o.getResources());
        }
        Drawable drawable = l(component);
        if (drawable != null) {
            toCache = drawable.getConstantState();
        }
        this.p.put(componentIconKey, toCache);
        return drawable;
    }

    public final Drawable l(ComponentName component) {
        PackageManager pm = this.f1013e.getPackageManager();
        try {
            ActivityInfo activityInfo = pm.getActivityInfo(component, 128);
            int iconId = activityInfo.getIconResource();
            if (iconId == 0) {
                return null;
            }
            Drawable drawable = pm.getDrawable(component.getPackageName(), iconId, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconId + " for " + component.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException ex) {
            Log.w("SuggestionsAdapter", ex.toString());
            return null;
        }
    }

    public static String n(Cursor cursor, String columnName) {
        return v(cursor, cursor.getColumnIndex(columnName));
    }

    public static String v(Cursor cursor, int col) {
        if (col == -1) {
            return null;
        }
        try {
            return cursor.getString(col);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    public Drawable q(Uri uri) {
        int id;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources r2 = this.f1013e.getPackageManager().getResourcesForApplication(authority);
                List<String> path = uri.getPathSegments();
                if (path != null) {
                    int len = path.size();
                    if (len == 1) {
                        try {
                            id = Integer.parseInt(path.get(0));
                        } catch (NumberFormatException e2) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (len == 2) {
                        id = r2.getIdentifier(path.get(1), path.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (id != 0) {
                        return r2.getDrawable(id);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException e3) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public Cursor u(SearchableInfo searchable, String query, int limit) {
        String authority;
        String[] selArgs;
        if (searchable == null || (authority = searchable.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder uriBuilder = new Uri.Builder().scheme("content").authority(authority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String contentPath = searchable.getSuggestPath();
        if (contentPath != null) {
            uriBuilder.appendEncodedPath(contentPath);
        }
        uriBuilder.appendPath("search_suggest_query");
        String selection = searchable.getSuggestSelection();
        if (selection != null) {
            selArgs = new String[]{query};
        } else {
            uriBuilder.appendPath(query);
            selArgs = null;
        }
        if (limit > 0) {
            uriBuilder.appendQueryParameter("limit", String.valueOf(limit));
        }
        return this.f1013e.getContentResolver().query(uriBuilder.build(), null, selection, selArgs, null);
    }
}
