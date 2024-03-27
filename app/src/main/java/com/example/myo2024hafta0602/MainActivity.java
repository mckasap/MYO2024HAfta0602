package com.example.myo2024hafta0602;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.AsynchronousChannelGroup;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    String[] strUrl = new String[100];
    String[] strSrc= new String[100];
    public class myDataDownloader extends AsyncTask<Void,Void,Void>{
        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);
            Guncelle();
        }

        @Override
        protected Void doInBackground(Void... voids) {


        }
    }

    ImageView iv;
    Button[] btnGrp= new Button[4];
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            myDataDownloader myDwnd= new myDataDownloader();
            myDwnd.execute();

            iv= (ImageView) findViewById(R.id.imageView2);
            btn1=(Button) findViewById(R.id.button5);
            btnGrp[0]=btn1;
        btn2=(Button) findViewById(R.id.button6);
        btnGrp[1]=btn2;
        btn3=(Button) findViewById(R.id.button7);
        btnGrp[2]=btn3;
        btn4=(Button) findViewById(R.id.button8);
        btnGrp[3]=btn4;

    }

    public class resimIndir extends AsyncTask<String,Void, Bitmap>{


        @Override
        protected Bitmap doInBackground(String... strings) {



        return null;
        }
    }
public void Answer(View v){
    Guncelle();


}
    public void Guncelle(){


    }
}
