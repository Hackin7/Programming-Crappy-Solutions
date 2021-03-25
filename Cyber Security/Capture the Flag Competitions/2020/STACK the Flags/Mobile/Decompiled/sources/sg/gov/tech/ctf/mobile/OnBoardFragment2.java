package sg.gov.tech.ctf.mobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class OnBoardFragment2 extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(R.layout.fragment_onboard2, container, false);
    }
}
