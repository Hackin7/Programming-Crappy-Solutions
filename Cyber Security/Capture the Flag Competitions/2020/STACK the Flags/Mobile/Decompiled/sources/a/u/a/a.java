package a.u.a;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    public final DataSetObservable mObservable = new DataSetObservable();
    public DataSetObserver mViewPagerObserver;

    public abstract void destroyItem(ViewGroup viewGroup, int i, Object obj);

    public abstract void finishUpdate(ViewGroup viewGroup);

    public abstract int getCount();

    public abstract Object instantiateItem(ViewGroup viewGroup, int i);

    public abstract boolean isViewFromObject(View view, Object obj);

    public abstract void restoreState(Parcelable parcelable, ClassLoader classLoader);

    public abstract Parcelable saveState();

    public abstract void setPrimaryItem(ViewGroup viewGroup, int i, Object obj);

    public abstract void startUpdate(ViewGroup viewGroup);

    @Deprecated
    public void startUpdate(View container) {
    }

    @Deprecated
    public Object instantiateItem(View container, int position) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void destroyItem(View container, int position, Object object) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    @Deprecated
    public void setPrimaryItem(View container, int position, Object object) {
    }

    @Deprecated
    public void finishUpdate(View container) {
    }

    public int getItemPosition(Object object) {
        return -1;
    }

    public void notifyDataSetChanged() {
        synchronized (this) {
            if (this.mViewPagerObserver != null) {
                this.mViewPagerObserver.onChanged();
            }
        }
        this.mObservable.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver observer) {
        this.mObservable.registerObserver(observer);
    }

    public void unregisterDataSetObserver(DataSetObserver observer) {
        this.mObservable.unregisterObserver(observer);
    }

    public void setViewPagerObserver(DataSetObserver observer) {
        synchronized (this) {
            this.mViewPagerObserver = observer;
        }
    }

    public CharSequence getPageTitle(int position) {
        return null;
    }

    public float getPageWidth(int position) {
        return 1.0f;
    }
}
