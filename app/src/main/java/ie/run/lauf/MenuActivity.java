package ie.run.lauf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onclickRun(View view){
        Intent intent = new Intent(this, RunActivity.class);
        startActivity(intent);
    }
    public void onclickGym(View view){
        Intent intent = new Intent(this, GymActivity.class);
        startActivity(intent);
    }
    public void onclickFeed(View view){
        Intent intent = new Intent(this, FeedActivity.class);
        startActivity(intent);
    }
    public void onclickProfile(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
