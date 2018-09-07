package id.cathode.android.abcdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button checkInButton;
    Button checkOutButton;
    Button reportButton;
    Button aboutButton;

    public void checkInTapped(View view){

    }

    public void checkOutTapped(View view){

    }

    public void reportTapped(View view){

    }

    public void aboutTapped(View view){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        checkInButton = findViewById(R.id.checkInButton);
        checkOutButton = findViewById(R.id.checkOutButton);
        reportButton = findViewById(R.id.reportButton);
        aboutButton = findViewById(R.id.aboutButton);


    }
}
