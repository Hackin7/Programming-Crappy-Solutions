package sg.gov.tech.ctf.mobile;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class OnBoardFragment1 extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_onboard1, container, false);
        SharedPreferences.Editor editor = getContext().getSharedPreferences("MyPref", 0).edit();
        editor.putString("contact", "b7c1020edc5d4ab5ce059909f0a7bd73b3de005b");
        editor.putString("protecting_yourself", "jeldexs+ktquD8iQ1CAEnHIc+SSPc5TcyirRSIYxA/g=");
        editor.putString("stats", "33273326202a3b782d2122281909370b3c2d741e78352b0b0b1c24743a1e2138");
        editor.commit();
        return root;
    }
}
