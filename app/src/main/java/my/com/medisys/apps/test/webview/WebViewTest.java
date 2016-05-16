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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String url = "http://176.241.191.36/tas/LogIn.aspx";
        WebView view = (WebView) this.findViewById(R.id.webView);

        view.loadUrl(url);
        view.getSettings().setJavaScriptEnabled(true);
        // unresponsive site fit within screen
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setUseWideViewPort(true);

    }

    private int getScale(){
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();
        Double val = new Double(width)/new Double(width);
        val = val * 100d;
        return val.intValue();
    }
}
