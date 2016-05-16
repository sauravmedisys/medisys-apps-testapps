package my.com.medisys.apps.test.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import my.com.medisys.apps.test.MainActivity;
import my.com.medisys.apps.test.R;

public class ButtonTest extends AppCompatActivity {

    Button goHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_test);
        goHome = (Button)findViewById(R.id.home);
        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ButtonTest.this, MainActivity.class);
                startActivity(intent);
                finish();
//                onDestroy();
            }
        });
    }
}
