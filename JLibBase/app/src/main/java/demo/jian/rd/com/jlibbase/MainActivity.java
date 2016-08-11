package demo.jian.rd.com.jlibbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import demo.jian.rd.com.livebase.Utils;
import demo.jian.rd.com.livebase.LoginActivity;
import android.content.Intent;
import demo.jian.rd.com.editbase.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("---",EditUtils.getInfo("xxxxxx"));
        startActivity(new Intent(this,MapsActivity.class));
//        Log.e("---",Utils.getInfo("xxxxxx"));
//        startActivity(new Intent(this,LoginActivity.class));

    }
}
