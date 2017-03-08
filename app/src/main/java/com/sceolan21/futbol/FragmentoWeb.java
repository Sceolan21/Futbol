package com.sceolan21.futbol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class FragmentoWeb extends Fragment {

   private Contenido.Lista_entrada2 mItem;

    public FragmentoWeb() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey("identificador")) {

            mItem = Contenido.ENTRADAS_LISTA_HASHMAP2.get(getArguments().getString("identificador"));
       }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_web, container, false);

        if (mItem != null) {
            WebView web= (WebView)rootView.findViewById(R.id.web);
            web.setWebViewClient(new myWebClient());
            web.loadUrl(mItem.getWeb());
            web.getSettings().setJavaScriptEnabled(true);
        }

        return rootView;
    }
    private class myWebClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String
                url) {
            view.loadUrl(url);
            return true;
        }
    }

}
