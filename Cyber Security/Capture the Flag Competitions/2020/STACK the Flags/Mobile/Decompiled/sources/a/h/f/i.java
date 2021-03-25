package a.h.f;

import a.h.e.c.c;
import a.h.j.b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public class i extends j {
    @Override // a.h.f.j
    public b.f f(b.f[] fonts, int style) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.h.f.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fonts, int style) {
        int i;
        FontFamily.Builder familyBuilder = null;
        ContentResolver resolver = context.getContentResolver();
        int length = fonts.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            b.f font = fonts[i3];
            try {
                ParcelFileDescriptor pfd = resolver.openFileDescriptor(font.c(), "r", cancellationSignal);
                if (pfd != null) {
                    try {
                        Font.Builder weight = new Font.Builder(pfd).setWeight(font.d());
                        if (!font.e()) {
                            i4 = 0;
                        }
                        Font platformFont = weight.setSlant(i4).setTtcIndex(font.b()).build();
                        if (familyBuilder == null) {
                            familyBuilder = new FontFamily.Builder(platformFont);
                        } else {
                            familyBuilder.addFont(platformFont);
                        }
                        pfd.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else if (pfd != null) {
                    pfd.close();
                }
            } catch (IOException e2) {
            }
            i3++;
        }
        if (familyBuilder == null) {
            return null;
        }
        if ((style & 1) != 0) {
            i = 700;
        } else {
            i = 400;
        }
        if ((style & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(familyBuilder.build()).setStyle(new FontStyle(i, i2)).build();
        throw th;
    }

    @Override // a.h.f.j
    public Typeface a(Context context, c.b familyEntry, Resources resources, int style) {
        int i;
        FontFamily.Builder familyBuilder = null;
        c.C0016c[] a2 = familyEntry.a();
        int length = a2.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            c.C0016c entry = a2[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, entry.b()).setWeight(entry.e());
                if (!entry.f()) {
                    i4 = 0;
                }
                Font platformFont = weight.setSlant(i4).setTtcIndex(entry.c()).setFontVariationSettings(entry.d()).build();
                if (familyBuilder == null) {
                    familyBuilder = new FontFamily.Builder(platformFont);
                } else {
                    familyBuilder.addFont(platformFont);
                }
            } catch (IOException e2) {
            }
            i3++;
        }
        if (familyBuilder == null) {
            return null;
        }
        if ((style & 1) != 0) {
            i = 700;
        } else {
            i = 400;
        }
        if ((style & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(familyBuilder.build()).setStyle(new FontStyle(i, i2)).build();
    }

    @Override // a.h.f.j
    public Typeface d(Context context, Resources resources, int id, String path, int style) {
        try {
            Font font = new Font.Builder(resources, id).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(font).build()).setStyle(font.getStyle()).build();
        } catch (IOException e2) {
            return null;
        }
    }
}
