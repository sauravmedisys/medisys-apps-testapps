package my.com.medisys.apps.test.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import my.com.medisys.apps.test.R;

public class WebViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String url = "https://www.google.com";
        WebView view = (WebView) this.findViewById(R.id.webView);

        view.loadUrl(url);
    }
}
