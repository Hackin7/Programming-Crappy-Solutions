package b.d.a.a.k;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f2544a = new Matrix();

    public f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: b */
    public void set(ImageView object, Matrix value) {
        object.setImageMatrix(value);
    }

    /* renamed from: a */
    public Matrix get(ImageView object) {
        this.f2544a.set(object.getImageMatrix());
        return this.f2544a;
    }
}
