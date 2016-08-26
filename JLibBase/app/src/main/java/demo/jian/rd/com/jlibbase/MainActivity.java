package demo.jian.rd.com.jlibbase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.rd.lib.utils.CoreUtils;

import demo.jian.rd.com.livebase.LoginActivity;
import demo.jian.rd.com.livebase.Utils;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.e("---",EditUtils.getInfo("xxxxxx"));
//        startActivity(new Intent(this,MapsActivity.class));
        Log.e("---",Utils.getInfo("xxxxxx")+"------"+ CoreUtils.getVersionName(this));
//        startActivity(new Intent(this,LoginActivity.class));

    }
}
