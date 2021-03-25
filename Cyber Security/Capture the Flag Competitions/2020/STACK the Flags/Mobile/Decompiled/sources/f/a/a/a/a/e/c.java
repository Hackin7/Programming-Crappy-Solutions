package f.a.a.a.a.e;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import sg.gov.tech.ctf.mobile.R;

public class c extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.sign_up_tab_fragment, container, false);
        EditText editText = (EditText) root.findViewById(R.id.user_input);
        EditText editText2 = (EditText) root.findViewById(R.id.password_input);
        Button button = (Button) root.findViewById(R.id.login_button);
        return root;
    }
}
