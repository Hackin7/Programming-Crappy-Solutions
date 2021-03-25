package a.h.m;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import d.c.a.a;

public final class v {
    public static /* synthetic */ Bitmap b(View view, Bitmap.Config config, int i) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return a(view, config);
    }

    public static final Bitmap a(View $this$drawToBitmap, Bitmap.Config config) {
        a.b($this$drawToBitmap, "$this$drawToBitmap");
        a.b(config, "config");
        if (s.K($this$drawToBitmap)) {
            Bitmap $this$applyCanvas$iv = Bitmap.createBitmap($this$drawToBitmap.getWidth(), $this$drawToBitmap.getHeight(), config);
            a.a($this$applyCanvas$iv, "Bitmap.createBitmap(width, height, config)");
            Canvas c$iv = new Canvas($this$applyCanvas$iv);
            c$iv.translate(-((float) $this$drawToBitmap.getScrollX()), -((float) $this$drawToBitmap.getScrollY()));
            $this$drawToBitmap.draw(c$iv);
            return $this$applyCanvas$iv;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }
}
