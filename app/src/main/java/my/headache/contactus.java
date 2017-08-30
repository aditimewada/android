package my.headache;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import my.headache.activities.RegisterActivity;

/**
 * Created by harjis on 22-07-2017.
 */

public class contactus extends Activity {
    Button buttonhome,buttonaboutus,buttoncontactus;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);

        buttonhome = (Button) findViewById(R.id.home);
        buttonaboutus = (Button) findViewById(R.id.aboutus);
        buttoncontactus = (Button) findViewById(R.id.contactus);

        buttonhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchActivity2= new Intent(contactus.this,MainActivity.class);
                startActivity(launchActivity2);
            }
        });

        buttonaboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchActivity1= new Intent(contactus.this,RegisterActivity.aboutus.class);
                startActivity(launchActivity1);
            }
        });

        buttoncontactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(contactus.this, "YOU ARE ON CONTACT US PAGE", Toast.LENGTH_LONG).show();
            }
        });
    }


}
