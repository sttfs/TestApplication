package com.test.acl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by acl on 2017/7/20.
 */

public class TestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(this.getClass().getName()+"12:39");
    }
}
