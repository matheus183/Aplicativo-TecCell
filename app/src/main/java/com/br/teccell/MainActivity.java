package com.br.teccell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView);
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://teccell.online/compras/");



     /*   Funcionario funcionario = new Funcionario();
        funcionario.nome = "jamilton";
        funcionario.salario = 800;

        double salarioRecuperado = funcionario.recuperarSalario(150);
        System.out.println(  salarioRecuperado );*/

    /* Animal animal = new Animal();
     animal.Correr();
       */

   /* Cao cao = new Cao();
    cao.dormir();
    cao.latir();



    Passaro passaro = new Passaro();
    passaro.voar();*/


    }

    @Override
    public void onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}