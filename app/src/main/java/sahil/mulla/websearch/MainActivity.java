package sahil.mulla.websearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button go;
WebView web;
EditText url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go=findViewById(R.id.go);
        web=findViewById(R.id.web);
        url=findViewById(R.id.url);
      web.setWebViewClient(new WebViewClient());
     go.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(url.getText().toString().contains("http"))
            {           web.loadUrl(url.getText().toString().trim()); }
            else {
                web.loadUrl("http://" + url.getText().toString().trim());
            }
        }
    });
    }
}