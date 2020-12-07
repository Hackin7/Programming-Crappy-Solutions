package com.airbnb.lottie;

import a.b.p.o;
import a.h.m.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import b.a.a.f;
import b.a.a.h;
import b.a.a.j;
import b.a.a.k;
import b.a.a.m;
import b.a.a.n;
import b.a.a.p;
import b.a.a.q;
import b.a.a.r;
import b.a.a.u.e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class LottieAnimationView extends o {
    public static final String v = LottieAnimationView.class.getSimpleName();
    public static final h<Throwable> w = new a();

    /* renamed from: d  reason: collision with root package name */
    public final h<b.a.a.d> f2670d = new b();

    /* renamed from: e  reason: collision with root package name */
    public final h<Throwable> f2671e = new c();

    /* renamed from: f  reason: collision with root package name */
    public h<Throwable> f2672f;

    /* renamed from: g  reason: collision with root package name */
    public int f2673g = 0;
    public final f h = new f();
    public boolean i;
    public String j;
    public int k;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = true;
    public p q = p.AUTOMATIC;
    public Set<j> r = new HashSet();
    public int s = 0;
    public m<b.a.a.d> t;
    public b.a.a.d u;

    public class a implements h<Throwable> {
        /* renamed from: b */
        public void a(Throwable throwable) {
            if (b.a.a.x.h.k(throwable)) {
                b.a.a.x.d.d("Unable to load composition.", throwable);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", throwable);
        }
    }

    public class b implements h<b.a.a.d> {
        public b() {
        }

        /* renamed from: b */
        public void a(b.a.a.d composition) {
            LottieAnimationView.this.setComposition(composition);
        }
    }

    public class c implements h<Throwable> {
        public c() {
        }

        /* renamed from: b */
        public void a(Throwable result) {
            if (LottieAnimationView.this.f2673g != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f2673g);
            }
            (LottieAnimationView.this.f2672f == null ? LottieAnimationView.w : LottieAnimationView.this.f2672f).a(result);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        l(attrs);
    }

    public final void l(AttributeSet attrs) {
        String url;
        TypedArray ta = getContext().obtainStyledAttributes(attrs, b.a.a.o.LottieAnimationView);
        boolean z = false;
        if (!isInEditMode()) {
            this.p = ta.getBoolean(b.a.a.o.LottieAnimationView_lottie_cacheComposition, true);
            boolean hasRawRes = ta.hasValue(b.a.a.o.LottieAnimationView_lottie_rawRes);
            boolean hasFileName = ta.hasValue(b.a.a.o.LottieAnimationView_lottie_fileName);
            boolean hasUrl = ta.hasValue(b.a.a.o.LottieAnimationView_lottie_url);
            if (!hasRawRes || !hasFileName) {
                if (hasRawRes) {
                    int rawResId = ta.getResourceId(b.a.a.o.LottieAnimationView_lottie_rawRes, 0);
                    if (rawResId != 0) {
                        setAnimation(rawResId);
                    }
                } else if (hasFileName) {
                    String fileName = ta.getString(b.a.a.o.LottieAnimationView_lottie_fileName);
                    if (fileName != null) {
                        setAnimation(fileName);
                    }
                } else if (hasUrl && (url = ta.getString(b.a.a.o.LottieAnimationView_lottie_url)) != null) {
                    setAnimationFromUrl(url);
                }
                setFallbackResource(ta.getResourceId(b.a.a.o.LottieAnimationView_lottie_fallbackRes, 0));
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (ta.getBoolean(b.a.a.o.LottieAnimationView_lottie_autoPlay, false)) {
            this.n = true;
            this.o = true;
        }
        if (ta.getBoolean(b.a.a.o.LottieAnimationView_lottie_loop, false)) {
            this.h.a0(-1);
        }
        if (ta.hasValue(b.a.a.o.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(ta.getInt(b.a.a.o.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (ta.hasValue(b.a.a.o.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(ta.getInt(b.a.a.o.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (ta.hasValue(b.a.a.o.LottieAnimationView_lottie_speed)) {
            setSpeed(ta.getFloat(b.a.a.o.LottieAnimationView_lottie_speed, 1.0f));
        }
        setImageAssetsFolder(ta.getString(b.a.a.o.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(ta.getFloat(b.a.a.o.LottieAnimationView_lottie_progress, 0.0f));
        j(ta.getBoolean(b.a.a.o.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (ta.hasValue(b.a.a.o.LottieAnimationView_lottie_colorFilter)) {
            f(new e("**"), k.C, new b.a.a.y.c<>(new q(ta.getColor(b.a.a.o.LottieAnimationView_lottie_colorFilter, 0))));
        }
        if (ta.hasValue(b.a.a.o.LottieAnimationView_lottie_scale)) {
            this.h.d0(ta.getFloat(b.a.a.o.LottieAnimationView_lottie_scale, 1.0f));
        }
        if (ta.hasValue(b.a.a.o.LottieAnimationView_lottie_renderMode)) {
            int i2 = b.a.a.o.LottieAnimationView_lottie_renderMode;
            p pVar = p.AUTOMATIC;
            int renderModeOrdinal = ta.getInt(i2, 0);
            if (renderModeOrdinal >= p.values().length) {
                p pVar2 = p.AUTOMATIC;
                renderModeOrdinal = 0;
            }
            setRenderMode(p.values()[renderModeOrdinal]);
        }
        if (getScaleType() != null) {
            this.h.e0(getScaleType());
        }
        ta.recycle();
        f fVar = this.h;
        if (b.a.a.x.h.f(getContext()) != 0.0f) {
            z = true;
        }
        fVar.g0(Boolean.valueOf(z));
        k();
        this.i = true;
    }

    @Override // a.b.p.o
    public void setImageResource(int resId) {
        h();
        super.setImageResource(resId);
    }

    @Override // a.b.p.o
    public void setImageDrawable(Drawable drawable) {
        h();
        super.setImageDrawable(drawable);
    }

    @Override // a.b.p.o
    public void setImageBitmap(Bitmap bm) {
        h();
        super.setImageBitmap(bm);
    }

    public void invalidateDrawable(Drawable dr) {
        Drawable drawable = getDrawable();
        f fVar = this.h;
        if (drawable == fVar) {
            super.invalidateDrawable(fVar);
        } else {
            super.invalidateDrawable(dr);
        }
    }

    public Parcelable onSaveInstanceState() {
        d ss = new d(super.onSaveInstanceState());
        ss.f2676b = this.j;
        ss.f2677c = this.k;
        ss.f2678d = this.h.x();
        ss.f2679e = this.h.E() || (!s.J(this) && this.n);
        ss.f2680f = this.h.s();
        ss.f2681g = this.h.z();
        ss.h = this.h.y();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof d)) {
            super.onRestoreInstanceState(state);
            return;
        }
        d ss = (d) state;
        super.onRestoreInstanceState(ss.getSuperState());
        String str = ss.f2676b;
        this.j = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.j);
        }
        int i2 = ss.f2677c;
        this.k = i2;
        if (i2 != 0) {
            setAnimation(i2);
        }
        setProgress(ss.f2678d);
        if (ss.f2679e) {
            o();
        }
        this.h.P(ss.f2680f);
        setRepeatMode(ss.f2681g);
        setRepeatCount(ss.h);
    }

    public void onVisibilityChanged(View changedView, int visibility) {
        if (this.i) {
            if (isShown()) {
                if (this.m) {
                    p();
                } else if (this.l) {
                    o();
                }
                this.m = false;
                this.l = false;
            } else if (m()) {
                n();
                this.m = true;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.o || this.n) {
            o();
            this.o = false;
            this.n = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void onDetachedFromWindow() {
        if (m()) {
            g();
            this.n = true;
        }
        super.onDetachedFromWindow();
    }

    public void j(boolean enable) {
        this.h.j(enable);
    }

    public void setCacheComposition(boolean cacheComposition) {
        this.p = cacheComposition;
    }

    public void setAnimation(int rawRes) {
        this.k = rawRes;
        this.j = null;
        setCompositionTask(this.p ? b.a.a.e.l(getContext(), rawRes) : b.a.a.e.m(getContext(), rawRes, null));
    }

    public void setAnimation(String assetName) {
        this.j = assetName;
        this.k = 0;
        setCompositionTask(this.p ? b.a.a.e.d(getContext(), assetName) : b.a.a.e.e(getContext(), assetName, null));
    }

    @Deprecated
    public void setAnimationFromJson(String jsonString) {
        r(jsonString, null);
    }

    public void r(String jsonString, String cacheKey) {
        q(new ByteArrayInputStream(jsonString.getBytes()), cacheKey);
    }

    public void q(InputStream stream, String cacheKey) {
        setCompositionTask(b.a.a.e.g(stream, cacheKey));
    }

    public void setAnimationFromUrl(String url) {
        setCompositionTask(this.p ? b.a.a.e.p(getContext(), url) : b.a.a.e.q(getContext(), url, null));
    }

    public void setFailureListener(h<Throwable> hVar) {
        this.f2672f = hVar;
    }

    public void setFallbackResource(int fallbackResource) {
        this.f2673g = fallbackResource;
    }

    private void setCompositionTask(m<b.a.a.d> mVar) {
        i();
        h();
        mVar.f(this.f2670d);
        mVar.e(this.f2671e);
        this.t = mVar;
    }

    public final void h() {
        m<b.a.a.d> mVar = this.t;
        if (mVar != null) {
            mVar.k(this.f2670d);
            this.t.j(this.f2671e);
        }
    }

    public void setComposition(b.a.a.d composition) {
        this.h.setCallback(this);
        this.u = composition;
        boolean isNewComposition = this.h.L(composition);
        k();
        if (getDrawable() != this.h || isNewComposition) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (j lottieOnCompositionLoadedListener : this.r) {
                lottieOnCompositionLoadedListener.a(composition);
            }
        }
    }

    public b.a.a.d getComposition() {
        return this.u;
    }

    public void o() {
        if (isShown()) {
            this.h.H();
            k();
            return;
        }
        this.l = true;
    }

    public void p() {
        if (isShown()) {
            this.h.J();
            k();
            return;
        }
        this.l = false;
        this.m = true;
    }

    public void setMinFrame(int startFrame) {
        this.h.V(startFrame);
    }

    public float getMinFrame() {
        return this.h.v();
    }

    public void setMinProgress(float startProgress) {
        this.h.X(startProgress);
    }

    public void setMaxFrame(int endFrame) {
        this.h.Q(endFrame);
    }

    public float getMaxFrame() {
        return this.h.t();
    }

    public void setMaxProgress(float endProgress) {
        this.h.S(endProgress);
    }

    public void setMinFrame(String markerName) {
        this.h.W(markerName);
    }

    public void setMaxFrame(String markerName) {
        this.h.R(markerName);
    }

    public void setMinAndMaxFrame(String markerName) {
        this.h.U(markerName);
    }

    public void setSpeed(float speed) {
        this.h.f0(speed);
    }

    public float getSpeed() {
        return this.h.B();
    }

    public void setRepeatMode(int mode) {
        this.h.b0(mode);
    }

    public int getRepeatMode() {
        return this.h.z();
    }

    public void setRepeatCount(int count) {
        this.h.a0(count);
    }

    public int getRepeatCount() {
        return this.h.y();
    }

    public boolean m() {
        return this.h.E();
    }

    public void setImageAssetsFolder(String imageAssetsFolder) {
        this.h.P(imageAssetsFolder);
    }

    public String getImageAssetsFolder() {
        return this.h.s();
    }

    public void setImageAssetDelegate(b.a.a.b assetDelegate) {
        this.h.O(assetDelegate);
    }

    public void setFontAssetDelegate(b.a.a.a assetDelegate) {
        this.h.M(assetDelegate);
    }

    public void setTextDelegate(r textDelegate) {
        this.h.h0(textDelegate);
    }

    public <T> void f(e keyPath, T property, b.a.a.y.c<T> cVar) {
        this.h.c(keyPath, property, cVar);
    }

    public void setScale(float scale) {
        this.h.d0(scale);
        if (getDrawable() == this.h) {
            setImageDrawable(null);
            setImageDrawable(this.h);
        }
    }

    public float getScale() {
        return this.h.A();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        f fVar = this.h;
        if (fVar != null) {
            fVar.e0(scaleType);
        }
    }

    public void g() {
        this.n = false;
        this.m = false;
        this.l = false;
        this.h.e();
        k();
    }

    public void n() {
        this.o = false;
        this.n = false;
        this.m = false;
        this.l = false;
        this.h.G();
        k();
    }

    public void setFrame(int frame) {
        this.h.N(frame);
    }

    public int getFrame() {
        return this.h.p();
    }

    public void setProgress(float progress) {
        this.h.Z(progress);
    }

    public float getProgress() {
        return this.h.x();
    }

    public long getDuration() {
        b.a.a.d dVar = this.u;
        if (dVar != null) {
            return (long) dVar.d();
        }
        return 0;
    }

    public void setPerformanceTrackingEnabled(boolean enabled) {
        this.h.Y(enabled);
    }

    public n getPerformanceTracker() {
        return this.h.w();
    }

    public final void i() {
        this.u = null;
        this.h.f();
    }

    public void setSafeMode(boolean safeMode) {
        this.h.c0(safeMode);
    }

    public void buildDrawingCache(boolean autoScale) {
        b.a.a.c.a("buildDrawingCache");
        this.s++;
        super.buildDrawingCache(autoScale);
        if (this.s == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(autoScale) == null) {
            setRenderMode(p.HARDWARE);
        }
        this.s--;
        b.a.a.c.b("buildDrawingCache");
    }

    public void setRenderMode(p renderMode) {
        this.q = renderMode;
        k();
    }

    public void setApplyingOpacityToLayersEnabled(boolean isApplyingOpacityToLayersEnabled) {
        this.h.K(isApplyingOpacityToLayersEnabled);
    }

    public final void k() {
        int layerType = 1;
        int ordinal = this.q.ordinal();
        int i2 = 2;
        if (ordinal == 0) {
            boolean useHardwareLayer = true;
            b.a.a.d dVar = this.u;
            if (dVar == null || !dVar.p() || Build.VERSION.SDK_INT >= 28) {
                b.a.a.d dVar2 = this.u;
                if (dVar2 != null && dVar2.l() > 4) {
                    useHardwareLayer = false;
                }
            } else {
                useHardwareLayer = false;
            }
            if (!useHardwareLayer) {
                i2 = 1;
            }
            layerType = i2;
        } else if (ordinal == 1) {
            layerType = 2;
        } else if (ordinal == 2) {
            layerType = 1;
        }
        if (layerType != getLayerType()) {
            setLayerType(layerType, null);
        }
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public String f2676b;

        /* renamed from: c  reason: collision with root package name */
        public int f2677c;

        /* renamed from: d  reason: collision with root package name */
        public float f2678d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2679e;

        /* renamed from: f  reason: collision with root package name */
        public String f2680f;

        /* renamed from: g  reason: collision with root package name */
        public int f2681g;
        public int h;

        public /* synthetic */ d(Parcel x0, a x1) {
            this(x0);
        }

        public d(Parcelable superState) {
            super(superState);
        }

        public d(Parcel in) {
            super(in);
            this.f2676b = in.readString();
            this.f2678d = in.readFloat();
            this.f2679e = in.readInt() != 1 ? false : true;
            this.f2680f = in.readString();
            this.f2681g = in.readInt();
            this.h = in.readInt();
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeString(this.f2676b);
            out.writeFloat(this.f2678d);
            out.writeInt(this.f2679e ? 1 : 0);
            out.writeString(this.f2680f);
            out.writeInt(this.f2681g);
            out.writeInt(this.h);
        }

        public class a implements Parcelable.Creator<d> {
            /* renamed from: a */
            public d createFromParcel(Parcel in) {
                return new d(in, null);
            }

            /* renamed from: b */
            public d[] newArray(int size) {
                return new d[size];
            }
        }
    }
}
