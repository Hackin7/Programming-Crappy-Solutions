package wtf.riceteacatpanda.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LoggedIn extends C0282e {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_login);
        String stringExtra = getIntent().getStringExtra("u");
        TextView textView = (TextView) findViewById(R.id.username_loggedin);
        StringBuilder sb = new StringBuilder("Welcome, ");
        sb.append(stringExtra);
        sb.append("!");
        textView.setText(sb.toString());
        ((Button) findViewById(R.id.play)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                LoggedIn.this.startActivity(new Intent(LoggedIn.this, Game.class).putExtra("id", LoggedIn.this.getIntent().getStringExtra("id")));
            }
        });
    }
}
