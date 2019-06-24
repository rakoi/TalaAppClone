package bpskenya.ke.co.talaclone;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import com.poovam.pinedittextfield.LinePinField;

public class SignIn extends AppCompatActivity {

    Toolbar signIntoolbar;
     public ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        signIntoolbar=(Toolbar)findViewById(R.id.signinToolbar);
        signIntoolbar.setTitle("SIGN IN");

        setSupportActionBar(signIntoolbar);
         LinePinField linePinField = findViewById(R.id.lineField);
    }

    public void Login(View view){

        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Loading ...");
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.show();
//        startActivity(new Intent(this,MainActivity.class));
//        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.signin_menu,menu);

        return true;
    }
}
