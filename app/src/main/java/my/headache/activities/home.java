package my.headache.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import my.headache.R;
import my.headache.contactus;
import my.headache.footlight;
import my.headache.powerstrip;
import my.headache.testers;

/**
 * Created by HP on 8/28/2017.
 */

public class home extends Activity
{
    Button buttonhome,buttonaboutus,buttoncontactus;
    ImageButton buttonbells,buttontesters,buttonbulkheads,buttonfootlight,buttonpowerstrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonhome = (Button) findViewById(R.id.home);
        buttonaboutus = (Button) findViewById(R.id.aboutus);
        buttoncontactus = (Button) findViewById(R.id.contactus);
        buttonbells = (ImageButton)findViewById(R.id.bells);
        buttonbulkheads = (ImageButton)findViewById(R.id.bulkhead);
        buttonfootlight = (ImageButton)findViewById(R.id.footlight);
        buttontesters = (ImageButton)findViewById(R.id.testers);
        buttonpowerstrip = (ImageButton)findViewById(R.id.powerstrips);

        buttonhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "YOU ARE ON HOME PAGE", Toast.LENGTH_LONG).show();
            }
        });

        buttonaboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchActivity1= new Intent(home.this,RegisterActivity.aboutus.class);
                startActivity(launchActivity1);
            }
        });

        buttoncontactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchActivity2= new Intent(home.this,contactus.class);
                startActivity(launchActivity2);
            }
        });
        buttonbells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchActivity2= new Intent(home.this,bells.class);
                startActivity(launchActivity2);
            }
        });
        buttontesters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tester = new Intent(home.this,testers.class);
                startActivity(tester);
            }
        });
        buttonbulkheads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchActivity2= new Intent(home.this,bulkheads.class);
                startActivity(launchActivity2);
            }
        });
        buttonfootlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchActivity2= new Intent(home.this,footlight.class);
                startActivity(launchActivity2);
            }
        });
        buttonpowerstrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchActivity2= new Intent(home.this,powerstrip.class);
                startActivity(launchActivity2);
            }
        });
    }
}
