package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user  = new User("John Smith", "I am a software engineer", 1, false);
        Button followbutton = findViewById(R.id.follow_button);

        // Load name and description from the user object
        String name = user.getName();
        String description = user.getDescription();

        followbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.isFollowed()) {
                    followbutton.setText("Follow");
                    user.setFollowed(false);
                }
                else {
                    followbutton.setText("Unfollow");
                    user.setFollowed(true);
                }

            }
   });
}
}