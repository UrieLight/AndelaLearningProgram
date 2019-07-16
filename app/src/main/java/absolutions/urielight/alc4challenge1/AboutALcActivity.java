package absolutions.urielight.alc4challenge1;

import android.net.http.SslError;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class AboutALcActivity extends AppCompatActivity {

    private WebView wbvw_abt_alc;
    private String alc_url = "https://andela.com/alc/";
    //private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        wbvw_abt_alc = findViewById(R.id.wbvw_abt_alc);

        wbvw_abt_alc.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

        wbvw_abt_alc.loadUrl(alc_url);

    }
}
