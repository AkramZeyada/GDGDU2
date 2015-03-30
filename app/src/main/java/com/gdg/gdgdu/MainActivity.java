package com.gdg.gdgdu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParsePush;
import com.parse.SaveCallback;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Parse.initialize(this, "KdiccP8aB00lEjbgrcmKkKkoBHZhUubmkhoSWkGt", "NX2hLUi5wdU0m7OFJh7D9qumtBMD11W9eFBDXgRw");
        ParsePush.subscribeInBackground("GDGDU", new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                   // Log.d("com.parse.push", "successfully subscribed to the broadcast channel.");
                } else {
                  //  Log.e("com.parse.push", "failed to subscribe for push", e);
                }
            }
        });

        ImageButton yt = (ImageButton)findViewById(R.id.yt);


        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
                //  startActivity(i);
                Toast.makeText(MainActivity.this, "No URL Found", Toast.LENGTH_LONG).show();
            }
        });

        ImageButton rd = (ImageButton)findViewById(R.id.rd);


        rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://gdgdelta.caster.fm/"));
                startActivity(i);



            }
        });

        ImageButton fbs = (ImageButton)findViewById(R.id.fb);



        fbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent i= new Intent(MainActivity.this,web.class);
                // i.putExtra("id", user.getUserAccountId()+"");
                // i.putExtra("name", user.getUserFullName());
                //  context.startActivity(i);
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/GDG.DeltaUniv?ref=bookmarks"));
                startActivity(i);


            }
        });

        ImageButton twa = (ImageButton)findViewById(R.id.twa);
        twa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/GDG_DeltaUniv"));
                startActivity(i);


            }
        });







        ImageButton bg = (ImageButton)findViewById(R.id.blg);

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/GDG_DeltaUniv"));
                //startActivity(i);
                Toast.makeText(MainActivity.this, "No URL Found , GDG DU", Toast.LENGTH_LONG).show();

            }
        });

        ImageButton gp = ( ImageButton)findViewById(R.id.gpo);


        gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/103794441320864829952"));
                startActivity(i);

            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
