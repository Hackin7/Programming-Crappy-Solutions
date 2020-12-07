package sg.gov.tech.ctf.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class OnBoardFragment3 extends Fragment {
    public Button activityBtn;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_onboard3, container, false);
        Button button = (Button) root.findViewById(R.id.Stage0Button);
        this.activityBtn = button;
        button.setOnClickListener(new View.OnClickListener() {
            /* class sg.gov.tech.ctf.mobile.OnBoardFragment3.AnonymousClass1 */

            public void onClick(View view) {
                OnBoardFragment3.this.startActivity(new Intent(OnBoardFragment3.this.getContext(), MainActivity.class));
            }
        });
        return root;
    }
}
