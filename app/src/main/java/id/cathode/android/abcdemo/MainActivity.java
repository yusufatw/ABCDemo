package id.cathode.android.abcdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "";

    EditText usernameEditText;
    EditText passwordEditText;
    Button loginButton;
    TextView registerTextView;

    public void loginButton(View view){

        if (usernameEditText.getText().toString().equals("admin") && passwordEditText.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Login Failed",Toast.LENGTH_SHORT).show();
        }
    }

    public void registerLink(View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        /*String user = usernameEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, user);*/
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        registerTextView = findViewById(R.id.registerTextView);
    }
}
