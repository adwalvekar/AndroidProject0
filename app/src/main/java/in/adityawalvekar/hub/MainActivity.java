package in.adityawalvekar.hub;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void popularMoviesToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "This takes you to the Popular Movies App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void stockHawkToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "This takes you to the Stock Hawk App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void buildItBiggerToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "This takes you to the Build it Bigger App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void makeYourAppMaterialToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "This takes you to the Material App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void goUbiquitousToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "This takes you to the Go Ubiquitous App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void capstoneProjectToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "This takes you to the Capstone App";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
