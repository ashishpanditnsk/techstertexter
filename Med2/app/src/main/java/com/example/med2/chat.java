package com.example.med2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class chat extends AppCompatActivity {
    DatabaseReference myref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        //Toolbar toolber = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(Toolbar);
        //getSupportActionBar().setTitle("App Title");
        //getActionBar().setTitle("Hello world App");

        View mButton = findViewById(R.id.button2);
        EditText mEdit   = findViewById(R.id.chat_text_box);
        Intent i = getIntent();
        Bundle b=i.getExtras();
        ///person dene = (person) i.getSerializableExtra("sampleObject");
        TextView tv = (TextView) mButton.getRootView().findViewById(R.id.chat_user);
        //tv.setText(dene.getFirstname());
        String j =(String) "Chat35"+"/"+b.get("Anyname");
        tv.setText((String) b.get("Anyname"));

        myref = FirebaseDatabase.getInstance().getReference().child(j);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                myref.setValue(mEdit.getText().toString());
            }
        });
    }


}