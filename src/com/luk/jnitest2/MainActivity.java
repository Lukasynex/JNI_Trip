package com.luk.jnitest2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
   
  // load the library - name matches jni/Android.mk 
  static {
    System.loadLibrary("JNITest2");
  }
   
  // declare the native code function - must match ndkfoo.c
  private native String stringFromJNI();
   
  @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        // this is where we call the native code
        String hello = stringFromJNI();
        TextView txt = (TextView)findViewById(R.id.textView1);
        txt.setText(hello);
    }
}