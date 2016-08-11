package demo.jian.rd.com.jlibbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import demo.jian.rd.com.livebase.Utils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("---",Utils.getInfo("xxxxxx"));

    }
}
