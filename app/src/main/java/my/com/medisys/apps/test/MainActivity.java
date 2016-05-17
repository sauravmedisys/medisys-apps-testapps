package my.com.medisys.apps.test;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import my.com.medisys.apps.test.activity.ButtonTest;
import my.com.medisys.apps.test.fragment.FragmentTest;
import my.com.medisys.apps.test.webview.WebViewTest;

public class MainActivity extends Activity implements View.OnClickListener {

    Button cameraButton;
    ImageView imageView;
    int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cameraButton = (Button) this.findViewById(R.id.camera);
        imageView    = (ImageView) this.findViewById(R.id.gallary);
        cameraButton.setOnClickListener(this);
    }

    public void activity(View v){
        Intent intent = new Intent(this, ButtonTest.class);
        startActivity(intent);
    }

    public void fragmentTest(View v){
        Intent intent = new Intent(this, FragmentTest.class);
        startActivity(intent);
    }
    public void webViewTest(View v){
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE){
            if (resultCode == RESULT_OK){
                Bundle bundle = new Bundle();
                bundle = data.getExtras();
                Bitmap BMP = (Bitmap) bundle.get("data");
                imageView.setImageBitmap(BMP);
            }
        }
    }
}
