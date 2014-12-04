package net.fadvisor.multitouchseekbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private static TextView tv1;
    private static TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
    }

    public static void UpdateText(View v, String text) {
        if ( v.getId() == R.id.sb1) {
            tv1.setText(text);
        } else if ( v.getId() == R.id.sb2) {
            tv2.setText(text);
        }
    }
}
