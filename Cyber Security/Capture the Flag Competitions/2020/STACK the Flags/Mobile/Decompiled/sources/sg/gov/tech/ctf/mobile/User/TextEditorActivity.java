package sg.gov.tech.ctf.mobile.User;

import a.b.k.d;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageButton;
import sg.gov.tech.ctf.mobile.R;

public class TextEditorActivity extends d {

    /* renamed from: b  reason: collision with root package name */
    public EditText f2985b;

    /* renamed from: c  reason: collision with root package name */
    public ImageButton f2986c;

    /* renamed from: d  reason: collision with root package name */
    public WebView f2987d;

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(8192, 8192);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.text_editor_activity);
        this.f2985b = (EditText) findViewById(R.id.text_editor);
        this.f2986c = (ImageButton) findViewById(R.id.button_submit);
        this.f2987d = (WebView) findViewById(R.id.webView);
        this.f2986c.setOnClickListener(new a());
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View v) {
            TextEditorActivity.this.f2987d.loadDataWithBaseURL(null, TextEditorActivity.this.f2985b.getText().toString(), "text/html", "utf-8", null);
        }
    }
}
