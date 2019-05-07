package com.mikemcgregor.tiledmapgame;

import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Camera cam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.imageView4);
        img.setTranslationX(250.0f);
        //Log.d("bob","" + img.getY());
//        bitmap = Bitmap.createBitmap(mapWidth * tileWidth, mapHeight * tileWidth, Bitmap.Config.ARGB_8888);
//        mapCanvas = new Canvas(bitmap);
    }

    private void setupMap(){
        //numCells = mapWidth * mapHeight;
//        map = new char[mapWidth][mapHeight];
//
//        for(int i=0; i<=mapWidth; i++){
//            for(int j=0; j<=mapHeight; j++){
//                map[i][j] = 'x';
//            }
//        }
    }

}
