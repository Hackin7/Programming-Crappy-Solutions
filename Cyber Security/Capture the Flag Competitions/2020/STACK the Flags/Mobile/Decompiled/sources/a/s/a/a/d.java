package a.s.a.a;

import a.h.e.c.g;
import a.h.f.c;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.BuildConfig;
import net.sqlcipher.database.SQLiteDatabase;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
    public static Animator i(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, id);
        }
        return j(context, context.getResources(), context.getTheme(), id);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int id) {
        return k(context, resources, theme, id, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int id, float pathErrorScale) {
        XmlResourceParser parser = null;
        try {
            parser = resources.getAnimation(id);
            Animator animator = a(context, resources, theme, parser, pathErrorScale);
            if (parser != null) {
                parser.close();
            }
            return animator;
        } catch (XmlPullParserException ex) {
            Resources.NotFoundException rnf = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
            rnf.initCause(ex);
            throw rnf;
        } catch (IOException ex2) {
            Resources.NotFoundException rnf2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
            rnf2.initCause(ex2);
            throw rnf2;
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    public static class a implements TypeEvaluator<c.b[]> {

        /* renamed from: a  reason: collision with root package name */
        public c.b[] f1435a;

        /* renamed from: a */
        public c.b[] evaluate(float fraction, c.b[] startPathData, c.b[] endPathData) {
            if (c.b(startPathData, endPathData)) {
                if (!c.b(this.f1435a, startPathData)) {
                    this.f1435a = c.f(startPathData);
                }
                for (int i = 0; i < startPathData.length; i++) {
                    this.f1435a[i].d(startPathData[i], endPathData[i], fraction);
                }
                return this.f1435a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static PropertyValuesHolder e(TypedArray styledAttributes, int valueType, int valueFromId, int valueToId, String propertyName) {
        int valueType2;
        PropertyValuesHolder returnValue;
        int valueTo;
        char c2;
        int valueFrom;
        int valueTo2;
        char c3;
        float valueTo3;
        float valueFrom2;
        float valueTo4;
        int toType;
        PropertyValuesHolder propertyValuesHolder;
        TypedValue tvFrom = styledAttributes.peekValue(valueFromId);
        boolean hasFrom = tvFrom != null;
        int fromType = hasFrom ? tvFrom.type : 0;
        TypedValue tvTo = styledAttributes.peekValue(valueToId);
        boolean hasTo = tvTo != null;
        int toType2 = hasTo ? tvTo.type : 0;
        if (valueType != 4) {
            valueType2 = valueType;
        } else if ((!hasFrom || !h(fromType)) && (!hasTo || !h(toType2))) {
            valueType2 = 0;
        } else {
            valueType2 = 3;
        }
        boolean getFloats = valueType2 == 0;
        if (valueType2 == 2) {
            String fromString = styledAttributes.getString(valueFromId);
            String toString = styledAttributes.getString(valueToId);
            c.b[] nodesFrom = c.d(fromString);
            c.b[] nodesTo = c.d(toString);
            if (nodesFrom == null && nodesTo == null) {
                toType = toType2;
                propertyValuesHolder = null;
            } else if (nodesFrom != null) {
                TypeEvaluator evaluator = new a();
                if (nodesTo == null) {
                    toType = toType2;
                    returnValue = PropertyValuesHolder.ofObject(propertyName, evaluator, nodesFrom);
                } else if (c.b(nodesFrom, nodesTo)) {
                    returnValue = PropertyValuesHolder.ofObject(propertyName, evaluator, nodesFrom, nodesTo);
                    toType = toType2;
                } else {
                    throw new InflateException(" Can't morph from " + fromString + " to " + toString);
                }
            } else {
                toType = toType2;
                propertyValuesHolder = null;
                if (nodesTo != null) {
                    returnValue = PropertyValuesHolder.ofObject(propertyName, new a(), nodesTo);
                }
            }
            returnValue = propertyValuesHolder;
        } else {
            TypeEvaluator evaluator2 = null;
            if (valueType2 == 3) {
                evaluator2 = e.a();
            }
            if (getFloats) {
                if (hasFrom) {
                    if (fromType == 5) {
                        valueFrom2 = styledAttributes.getDimension(valueFromId, 0.0f);
                    } else {
                        valueFrom2 = styledAttributes.getFloat(valueFromId, 0.0f);
                    }
                    if (hasTo) {
                        if (toType2 == 5) {
                            valueTo4 = styledAttributes.getDimension(valueToId, 0.0f);
                        } else {
                            valueTo4 = styledAttributes.getFloat(valueToId, 0.0f);
                        }
                        returnValue = PropertyValuesHolder.ofFloat(propertyName, valueFrom2, valueTo4);
                    } else {
                        returnValue = PropertyValuesHolder.ofFloat(propertyName, valueFrom2);
                    }
                } else {
                    if (toType2 == 5) {
                        valueTo3 = styledAttributes.getDimension(valueToId, 0.0f);
                    } else {
                        valueTo3 = styledAttributes.getFloat(valueToId, 0.0f);
                    }
                    returnValue = PropertyValuesHolder.ofFloat(propertyName, valueTo3);
                }
            } else if (hasFrom) {
                if (fromType == 5) {
                    valueFrom = (int) styledAttributes.getDimension(valueFromId, 0.0f);
                } else if (h(fromType)) {
                    valueFrom = styledAttributes.getColor(valueFromId, 0);
                } else {
                    valueFrom = styledAttributes.getInt(valueFromId, 0);
                }
                if (hasTo) {
                    if (toType2 == 5) {
                        valueTo2 = (int) styledAttributes.getDimension(valueToId, 0.0f);
                        c3 = 0;
                    } else if (h(toType2)) {
                        c3 = 0;
                        valueTo2 = styledAttributes.getColor(valueToId, 0);
                    } else {
                        c3 = 0;
                        valueTo2 = styledAttributes.getInt(valueToId, 0);
                    }
                    int[] iArr = new int[2];
                    iArr[c3] = valueFrom;
                    iArr[1] = valueTo2;
                    returnValue = PropertyValuesHolder.ofInt(propertyName, iArr);
                } else {
                    returnValue = PropertyValuesHolder.ofInt(propertyName, valueFrom);
                }
            } else if (hasTo) {
                if (toType2 == 5) {
                    valueTo = (int) styledAttributes.getDimension(valueToId, 0.0f);
                    c2 = 0;
                } else if (h(toType2)) {
                    c2 = 0;
                    valueTo = styledAttributes.getColor(valueToId, 0);
                } else {
                    c2 = 0;
                    valueTo = styledAttributes.getInt(valueToId, 0);
                }
                int[] iArr2 = new int[1];
                iArr2[c2] = valueTo;
                returnValue = PropertyValuesHolder.ofInt(propertyName, iArr2);
            } else {
                returnValue = null;
            }
            if (!(returnValue == null || evaluator2 == null)) {
                returnValue.setEvaluator(evaluator2);
            }
        }
        return returnValue;
    }

    public static void q(ValueAnimator anim, TypedArray arrayAnimator, TypedArray arrayObjectAnimator, float pixelSize, XmlPullParser parser) {
        long duration = (long) g.g(arrayAnimator, parser, "duration", 1, SQLiteDatabase.LOCK_ACQUIRED_WARNING_TIME_IN_MS);
        long startDelay = (long) g.g(arrayAnimator, parser, "startOffset", 2, 0);
        int valueType = g.g(arrayAnimator, parser, "valueType", 7, 4);
        if (g.j(parser, "valueFrom") && g.j(parser, "valueTo")) {
            if (valueType == 4) {
                valueType = f(arrayAnimator, 5, 6);
            }
            PropertyValuesHolder pvh = e(arrayAnimator, valueType, 5, 6, BuildConfig.FLAVOR);
            if (pvh != null) {
                anim.setValues(pvh);
            }
        }
        anim.setDuration(duration);
        anim.setStartDelay(startDelay);
        anim.setRepeatCount(g.g(arrayAnimator, parser, "repeatCount", 3, 0));
        anim.setRepeatMode(g.g(arrayAnimator, parser, "repeatMode", 4, 1));
        if (arrayObjectAnimator != null) {
            r(anim, arrayObjectAnimator, valueType, pixelSize, parser);
        }
    }

    public static void r(ValueAnimator anim, TypedArray arrayObjectAnimator, int valueType, float pixelSize, XmlPullParser parser) {
        ObjectAnimator oa = (ObjectAnimator) anim;
        String pathData = g.i(arrayObjectAnimator, parser, "pathData", 1);
        if (pathData != null) {
            String propertyXName = g.i(arrayObjectAnimator, parser, "propertyXName", 2);
            String propertyYName = g.i(arrayObjectAnimator, parser, "propertyYName", 3);
            if (valueType == 2 || valueType == 4) {
            }
            if (propertyXName == null && propertyYName == null) {
                throw new InflateException(arrayObjectAnimator.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            s(c.e(pathData), oa, 0.5f * pixelSize, propertyXName, propertyYName);
            return;
        }
        oa.setPropertyName(g.i(arrayObjectAnimator, parser, "propertyName", 0));
    }

    public static void s(Path path, ObjectAnimator oa, float precision, String propertyXName, String propertyYName) {
        Path path2 = path;
        boolean z = false;
        PathMeasure measureForTotalLength = new PathMeasure(path2, false);
        float totalLength = 0.0f;
        ArrayList<Float> contourLengths = new ArrayList<>();
        contourLengths.add(Float.valueOf(0.0f));
        while (true) {
            totalLength += measureForTotalLength.getLength();
            contourLengths.add(Float.valueOf(totalLength));
            if (!measureForTotalLength.nextContour()) {
                break;
            }
            z = false;
            path2 = path;
        }
        PathMeasure pathMeasure = new PathMeasure(path2, z);
        int numPoints = Math.min(100, ((int) (totalLength / precision)) + 1);
        float[] mX = new float[numPoints];
        float[] mY = new float[numPoints];
        float[] position = new float[2];
        int contourIndex = 0;
        float step = totalLength / ((float) (numPoints - 1));
        float currentDistance = 0.0f;
        for (int i = 0; i < numPoints; i++) {
            pathMeasure.getPosTan(currentDistance - contourLengths.get(contourIndex).floatValue(), position, null);
            mX[i] = position[0];
            mY[i] = position[1];
            currentDistance += step;
            if (contourIndex + 1 < contourLengths.size() && currentDistance > contourLengths.get(contourIndex + 1).floatValue()) {
                contourIndex++;
                pathMeasure.nextContour();
            }
        }
        PropertyValuesHolder x = null;
        PropertyValuesHolder y = null;
        if (propertyXName != null) {
            x = PropertyValuesHolder.ofFloat(propertyXName, mX);
        }
        if (propertyYName != null) {
            y = PropertyValuesHolder.ofFloat(propertyYName, mY);
        }
        if (x == null) {
            oa.setValues(y);
        } else if (y == null) {
            oa.setValues(x);
        } else {
            oa.setValues(x, y);
        }
    }

    public static Animator a(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, float pixelSize) {
        return b(context, res, theme, parser, Xml.asAttributeSet(parser), null, 0, pixelSize);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    public static Animator b(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, AttributeSet attrs, AnimatorSet parent, int sequenceOrdering, float pixelSize) {
        int depth = parser.getDepth();
        Animator anim = null;
        ArrayList<Animator> childAnims = null;
        while (true) {
            int type = parser.next();
            if (type != 3 || parser.getDepth() > depth) {
                if (type == 1) {
                    break;
                } else if (type == 2) {
                    String name = parser.getName();
                    boolean gotValues = false;
                    if (name.equals("objectAnimator")) {
                        anim = n(context, res, theme, attrs, pixelSize, parser);
                    } else if (name.equals("animator")) {
                        anim = l(context, res, theme, attrs, null, pixelSize, parser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        TypedArray a2 = g.k(res, theme, attrs, a.h);
                        b(context, res, theme, parser, attrs, animatorSet, g.g(a2, parser, "ordering", 0, 0), pixelSize);
                        a2.recycle();
                        anim = animatorSet;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] values = p(context, res, theme, parser, Xml.asAttributeSet(parser));
                        if (values != null && (anim instanceof ValueAnimator)) {
                            ((ValueAnimator) anim).setValues(values);
                        }
                        gotValues = true;
                        anim = anim;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + parser.getName());
                    }
                    if (parent != null && !gotValues) {
                        if (childAnims == null) {
                            childAnims = new ArrayList<>();
                        }
                        childAnims.add(anim);
                    }
                }
            } else {
                break;
            }
        }
        if (!(parent == null || childAnims == null)) {
            Animator[] animsArray = new Animator[childAnims.size()];
            int index = 0;
            Iterator<Animator> it = childAnims.iterator();
            while (it.hasNext()) {
                animsArray[index] = it.next();
                index++;
            }
            if (sequenceOrdering == 0) {
                parent.playTogether(animsArray);
            } else {
                parent.playSequentially(animsArray);
            }
        }
        return anim;
    }

    public static PropertyValuesHolder[] p(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, AttributeSet attrs) {
        ArrayList<PropertyValuesHolder> values = null;
        while (true) {
            int type = parser.getEventType();
            if (type == 3 || type == 1) {
                PropertyValuesHolder[] valuesArray = null;
            } else if (type != 2) {
                parser.next();
            } else {
                if (parser.getName().equals("propertyValuesHolder")) {
                    TypedArray a2 = g.k(res, theme, attrs, a.i);
                    String propertyName = g.i(a2, parser, "propertyName", 3);
                    int valueType = g.g(a2, parser, "valueType", 2, 4);
                    PropertyValuesHolder pvh = o(context, res, theme, parser, propertyName, valueType);
                    if (pvh == null) {
                        pvh = e(a2, valueType, 0, 1, propertyName);
                    }
                    if (pvh != null) {
                        if (values == null) {
                            values = new ArrayList<>();
                        }
                        values.add(pvh);
                    }
                    a2.recycle();
                }
                parser.next();
            }
        }
        PropertyValuesHolder[] valuesArray2 = null;
        if (values != null) {
            int count = values.size();
            valuesArray2 = new PropertyValuesHolder[count];
            for (int i = 0; i < count; i++) {
                valuesArray2[i] = values.get(i);
            }
        }
        return valuesArray2;
    }

    public static int g(Resources res, Resources.Theme theme, AttributeSet attrs, XmlPullParser parser) {
        int valueType;
        TypedArray a2 = g.k(res, theme, attrs, a.j);
        boolean hasValue = false;
        TypedValue keyframeValue = g.l(a2, parser, "value", 0);
        if (keyframeValue != null) {
            hasValue = true;
        }
        if (!hasValue || !h(keyframeValue.type)) {
            valueType = 0;
        } else {
            valueType = 3;
        }
        a2.recycle();
        return valueType;
    }

    public static int f(TypedArray styledAttributes, int valueFromId, int valueToId) {
        TypedValue tvFrom = styledAttributes.peekValue(valueFromId);
        boolean hasTo = true;
        int toType = 0;
        boolean hasFrom = tvFrom != null;
        int fromType = hasFrom ? tvFrom.type : 0;
        TypedValue tvTo = styledAttributes.peekValue(valueToId);
        if (tvTo == null) {
            hasTo = false;
        }
        if (hasTo) {
            toType = tvTo.type;
        }
        if ((!hasFrom || !h(fromType)) && (!hasTo || !h(toType))) {
            return 0;
        }
        return 3;
    }

    /* JADX INFO: Multiple debug info for r18v6 'type'  int: [D('endIndex' int), D('type' int)] */
    public static PropertyValuesHolder o(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, String propertyName, int valueType) {
        int type;
        PropertyValuesHolder value;
        PropertyValuesHolder value2;
        int type2;
        ArrayList<Keyframe> keyframes;
        PropertyValuesHolder value3 = null;
        ArrayList<Keyframe> keyframes2 = null;
        int valueType2 = valueType;
        while (true) {
            int next = parser.next();
            type = next;
            if (next != 3 && type != 1) {
                if (parser.getName().equals("keyframe")) {
                    if (valueType2 == 4) {
                        valueType2 = g(res, theme, Xml.asAttributeSet(parser), parser);
                    }
                    Keyframe keyframe = m(context, res, theme, Xml.asAttributeSet(parser), valueType2, parser);
                    if (keyframe != null) {
                        if (keyframes2 == null) {
                            keyframes2 = new ArrayList<>();
                        }
                        keyframes2.add(keyframe);
                    }
                    parser.next();
                }
            }
        }
        if (keyframes2 != null) {
            int size = keyframes2.size();
            int count = size;
            if (size > 0) {
                Keyframe firstKeyframe = keyframes2.get(0);
                Keyframe lastKeyframe = keyframes2.get(count - 1);
                float endFraction = lastKeyframe.getFraction();
                float f2 = 0.0f;
                if (endFraction < 1.0f) {
                    if (endFraction < 0.0f) {
                        lastKeyframe.setFraction(1.0f);
                    } else {
                        keyframes2.add(keyframes2.size(), c(lastKeyframe, 1.0f));
                        count++;
                    }
                }
                float startFraction = firstKeyframe.getFraction();
                if (startFraction != 0.0f) {
                    if (startFraction < 0.0f) {
                        firstKeyframe.setFraction(0.0f);
                    } else {
                        keyframes2.add(0, c(firstKeyframe, 0.0f));
                        count++;
                    }
                }
                Keyframe[] keyframeArray = new Keyframe[count];
                keyframes2.toArray(keyframeArray);
                int i = 0;
                while (i < count) {
                    Keyframe keyframe2 = keyframeArray[i];
                    if (keyframe2.getFraction() >= f2) {
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else if (i == 0) {
                        keyframe2.setFraction(f2);
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else if (i == count - 1) {
                        keyframe2.setFraction(1.0f);
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else {
                        value2 = value3;
                        int j = i + 1;
                        keyframes = keyframes2;
                        int endIndex = i;
                        while (true) {
                            type2 = type;
                            if (j >= count - 1) {
                                break;
                            } else if (keyframeArray[j].getFraction() >= 0.0f) {
                                break;
                            } else {
                                endIndex = j;
                                j++;
                                type = type2;
                            }
                        }
                        d(keyframeArray, keyframeArray[endIndex + 1].getFraction() - keyframeArray[i - 1].getFraction(), i, endIndex);
                    }
                    i++;
                    keyframes2 = keyframes;
                    type = type2;
                    value3 = value2;
                    f2 = 0.0f;
                }
                PropertyValuesHolder value4 = PropertyValuesHolder.ofKeyframe(propertyName, keyframeArray);
                if (valueType2 != 3) {
                    return value4;
                }
                value4.setEvaluator(e.a());
                return value4;
            }
            value = null;
        } else {
            value = null;
        }
        return value;
    }

    public static Keyframe c(Keyframe sampleKeyframe, float fraction) {
        if (sampleKeyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(fraction);
        }
        if (sampleKeyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(fraction);
        }
        return Keyframe.ofObject(fraction);
    }

    public static void d(Keyframe[] keyframes, float gap, int startIndex, int endIndex) {
        float increment = gap / ((float) ((endIndex - startIndex) + 2));
        for (int i = startIndex; i <= endIndex; i++) {
            keyframes[i].setFraction(keyframes[i - 1].getFraction() + increment);
        }
    }

    public static Keyframe m(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, int valueType, XmlPullParser parser) {
        Keyframe keyframe;
        TypedArray a2 = g.k(res, theme, attrs, a.j);
        Keyframe keyframe2 = null;
        float fraction = g.f(a2, parser, "fraction", 3, -1.0f);
        TypedValue keyframeValue = g.l(a2, parser, "value", 0);
        boolean hasValue = keyframeValue != null;
        if (valueType == 4) {
            if (!hasValue || !h(keyframeValue.type)) {
                valueType = 0;
            } else {
                valueType = 3;
            }
        }
        if (!hasValue) {
            if (valueType == 0) {
                keyframe = Keyframe.ofFloat(fraction);
            } else {
                keyframe = Keyframe.ofInt(fraction);
            }
            keyframe2 = keyframe;
        } else if (valueType == 0) {
            keyframe2 = Keyframe.ofFloat(fraction, g.f(a2, parser, "value", 0, 0.0f));
        } else if (valueType == 1 || valueType == 3) {
            keyframe2 = Keyframe.ofInt(fraction, g.g(a2, parser, "value", 0, 0));
        }
        int resID = g.h(a2, parser, "interpolator", 1, 0);
        if (resID > 0) {
            keyframe2.setInterpolator(c.a(context, resID));
        }
        a2.recycle();
        return keyframe2;
    }

    public static ObjectAnimator n(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, float pathErrorScale, XmlPullParser parser) {
        ObjectAnimator anim = new ObjectAnimator();
        l(context, res, theme, attrs, anim, pathErrorScale, parser);
        return anim;
    }

    public static ValueAnimator l(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, ValueAnimator anim, float pathErrorScale, XmlPullParser parser) {
        TypedArray arrayAnimator = g.k(res, theme, attrs, a.f1423g);
        TypedArray arrayObjectAnimator = g.k(res, theme, attrs, a.k);
        if (anim == null) {
            anim = new ValueAnimator();
        }
        q(anim, arrayAnimator, arrayObjectAnimator, pathErrorScale, parser);
        int resID = g.h(arrayAnimator, parser, "interpolator", 0, 0);
        if (resID > 0) {
            anim.setInterpolator(c.a(context, resID));
        }
        arrayAnimator.recycle();
        if (arrayObjectAnimator != null) {
            arrayObjectAnimator.recycle();
        }
        return anim;
    }

    public static boolean h(int type) {
        return type >= 28 && type <= 31;
    }
}
