package my.com.medisys.apps.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import my.com.medisys.apps.test.activity.ButtonTest;
import my.com.medisys.apps.test.fragment.FragmentTest;
import my.com.medisys.apps.test.webview.WebViewTest;

public class MainActivity extends Activity implements View.OnClickListener {

    Button cameraButton;
    int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cameraButton = (Button) this.findViewById(R.id.camera);
        cameraButton.setOnClickListener(this);
    }

    public void activity(View v){

        Intent intent = new Intent(this, ButtonTest.class);
        startActivity(intent);
    }

    public void fragmentTest(View v){
//        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, FragmentTest.class);
        startActivity(intent);
    }
    public void webViewTest(View v){
//        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, WebViewTest.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivityForResult(intent,REQUEST_CODE);
        }
    }
}
