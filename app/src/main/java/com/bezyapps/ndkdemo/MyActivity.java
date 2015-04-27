package com.bezyapps.ndkdemo;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;


public class MyActivity extends ActionBarActivity {

    static {
        System.loadLibrary("opencv_java");
        System.loadLibrary("hello");

    }
    TextView textView;
    Button button_edges,button_gray;
    public native String hello();

    public native String test();
    public native int image();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Log.e("test", Environment.getExternalStorageDirectory().getAbsoluteFile().toString());
        File f = new File(Environment.getExternalStorageDirectory().getAbsoluteFile() + "/other.jpg");
        Log.e("test",String.valueOf(f.exists()));
        Log.e("test",f.getAbsoluteFile().toString());
        Log.e("test",f.getAbsolutePath().toString());
         button_gray= (Button) findViewById(R.id.button_gray);
         button_edges= (Button) findViewById(R.id.button_edges);
         textView = (TextView) findViewById(R.id.textview);
        button_gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  textView.setText(hello());
                textView.setText(String.valueOf(image()));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
