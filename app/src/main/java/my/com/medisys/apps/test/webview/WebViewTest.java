package my.com.medisys.apps.test.webview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import my.com.medisys.apps.test.R;

public class WebViewTest extends AppCompatActivity {
    WebView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String url = "http://176.241.191.36/tas/LogIn.aspx";
        view = (WebView) this.findViewById(R.id.webView);

        view.loadUrl(url);
        view.getSettings().setJavaScriptEnabled(true);
        // unresponsive site fit within screen
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);
        // set forward webpage on same activity
        view.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (view.canGoBack()){
            view.goBack();
        }else {
            super.onBackPressed();
        }
    }

}
