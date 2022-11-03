package com.example.childmonitoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentHomepage extends AppCompatActivity {
    private Button btnAddChild,btnEditChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_homepage);

        btnAddChild = (Button) findViewById(R.id.btnAddChild);

        btnAddChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intLogin=new Intent(ParentHomepage.this,AddChild.class);
                startActivity(intLogin);
            }
        });

        btnEditChild = (Button) findViewById(R.id.btnEditChild);

        btnEditChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intLogin=new Intent(ParentHomepage.this,EditChild.class);
                startActivity(intLogin);
            }
        });
    }
}