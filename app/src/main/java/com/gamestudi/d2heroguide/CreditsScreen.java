package com.gamestudi.d2heroguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CreditsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits_screen);


        TextView credits_link = (TextView) findViewById(R.id.txtCreditsLink);
        TextView credits_link_2 = (TextView) findViewById(R.id.txtCreditsLink2);

        //When the user clicks on the credits text link take them to his deviantart site
        credits_link.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Uri uri = Uri.parse("https://deviantart.com/doghateburger"); // missing 'http://' will cause crashed
                  Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                  startActivity(intent);
              }
         });

        //When the user clicks on the credits text link take them to his deviantart site
        credits_link_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://deviantart.com/dinhosaur"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }



}
