package a.b.k;

import a.h.e.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

public class n {

    /* renamed from: d  reason: collision with root package name */
    public static n f71d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f72a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f73b;

    /* renamed from: c  reason: collision with root package name */
    public final a f74c = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f75a;

        /* renamed from: b  reason: collision with root package name */
        public long f76b;
    }

    public static n a(Context context) {
        if (f71d == null) {
            Context context2 = context.getApplicationContext();
            f71d = new n(context2, (LocationManager) context2.getSystemService("location"));
        }
        return f71d;
    }

    public n(Context context, LocationManager locationManager) {
        this.f72a = context;
        this.f73b = locationManager;
    }

    public boolean d() {
        a state = this.f74c;
        if (e()) {
            return state.f75a;
        }
        Location location = b();
        if (location != null) {
            f(location);
            return state.f75a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int hour = Calendar.getInstance().get(11);
        return hour < 6 || hour >= 22;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location coarseLoc = null;
        Location fineLoc = null;
        if (b.b(this.f72a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            coarseLoc = c("network");
        }
        if (b.b(this.f72a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            fineLoc = c("gps");
        }
        return (fineLoc == null || coarseLoc == null) ? fineLoc != null ? fineLoc : coarseLoc : fineLoc.getTime() > coarseLoc.getTime() ? fineLoc : coarseLoc;
    }

    public final Location c(String provider) {
        try {
            if (this.f73b.isProviderEnabled(provider)) {
                return this.f73b.getLastKnownLocation(provider);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    public final boolean e() {
        return this.f74c.f76b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long nextUpdate;
        long nextUpdate2;
        a state = this.f74c;
        long now = System.currentTimeMillis();
        m calculator = m.b();
        calculator.a(now - 86400000, location.getLatitude(), location.getLongitude());
        long j = calculator.f68a;
        calculator.a(now, location.getLatitude(), location.getLongitude());
        boolean isNight = true;
        if (calculator.f70c != 1) {
            isNight = false;
        }
        long todaySunrise = calculator.f69b;
        long todaySunset = calculator.f68a;
        calculator.a(86400000 + now, location.getLatitude(), location.getLongitude());
        long tomorrowSunrise = calculator.f69b;
        if (todaySunrise == -1 || todaySunset == -1) {
            nextUpdate = now + 43200000;
        } else {
            if (now > todaySunset) {
                nextUpdate2 = 0 + tomorrowSunrise;
            } else if (now > todaySunrise) {
                nextUpdate2 = 0 + todaySunset;
            } else {
                nextUpdate2 = 0 + todaySunrise;
            }
            nextUpdate = nextUpdate2 + 60000;
        }
        state.f75a = isNight;
        state.f76b = nextUpdate;
    }
}
