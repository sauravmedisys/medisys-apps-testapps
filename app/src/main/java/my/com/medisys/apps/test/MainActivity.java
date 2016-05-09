package my.com.medisys.apps.test;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import my.com.medisys.apps.test.activity.ButtonTest;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity(View v){

        Intent intent = new Intent(this, ButtonTest.class);
        startActivity(intent);
    }

    public void fragmentTest(View v){
        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
    }
}
