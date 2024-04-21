package com.example.menudemon;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.whatsapp);
        actionBar.setTitle("Whatsapp");

//        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("Whatsapp");
//        toolbar.setTitleMarginStart(10);
//        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id== R.id.search){
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        } else if (id== R.id.camera) {
            Toast.makeText(this, "Camera", Toast.LENGTH_SHORT).show();
        } else if (id== R.id.new_group) {
            Toast.makeText(this, "New group", Toast.LENGTH_SHORT).show();
        } else if (id== R.id.new_broadcast) {
            Toast.makeText(this, "New Broadcast", Toast.LENGTH_SHORT).show();
        } else if (id== R.id.linked_device) {
            Toast.makeText(this, "Linked Device", Toast.LENGTH_SHORT).show();
        } else if (id== R.id.setting) {
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}