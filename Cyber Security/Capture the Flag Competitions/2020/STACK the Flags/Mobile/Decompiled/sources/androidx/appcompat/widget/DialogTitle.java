package androidx.appcompat.widget;

import a.b.j;
import a.b.p.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;

public class DialogTitle extends z {
    public DialogTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // a.b.p.z
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int lineCount;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray a2 = getContext().obtainStyledAttributes(null, j.TextAppearance, 16842817, 16973892);
            int textSize = a2.getDimensionPixelSize(j.TextAppearance_android_textSize, 0);
            if (textSize != 0) {
                setTextSize(0, (float) textSize);
            }
            a2.recycle();
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
