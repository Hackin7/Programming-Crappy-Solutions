package a.b.p;

import a.h.l.h;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public TextView f450a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f451b;

    public x(TextView textView) {
        h.b(textView);
        this.f450a = textView;
    }

    public void b(TextClassifier textClassifier) {
        this.f451b = textClassifier;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f451b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager tcm = (TextClassificationManager) this.f450a.getContext().getSystemService(TextClassificationManager.class);
        if (tcm != null) {
            return tcm.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
