package com.example.alphabate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private SearchView searchView;
    private  String[] capital_alphabets,small_alphabets,english_words;
    private int [] images = {R.drawable.a_apple,R.drawable.b_banana,R.drawable.c_corn,R.drawable.d_date_palm,R.drawable.e_eggplant,
            R.drawable.f_fig,R.drawable.g_guava,R.drawable.h_hibiscus,R.drawable.i_ice_cream,R.drawable.j_jackfruit,
            R.drawable.k_kiwi,R.drawable.l_lychee,R.drawable.m_mango,R.drawable.n_nuts,R.drawable.o_orange,
            R.drawable.p_pineapple,R.drawable.q_quince,R.drawable.r_rose,R.drawable.s_strawberry,R.drawable.t_tomato,
            R.drawable.u_umbrella,R.drawable.v_vanilla,R.drawable.w_watermelon,R.drawable.x_x_ray,R.drawable.y_yolk_egg,
            R.drawable.z_zoo
    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Get the height of the status bar
        int statusBarHeight = getStatusBarHeight();

        // Get the LinearLayout containing your views
        View mainLayout = findViewById(R.id.main);


        // Set the top margin to the status bar height
        if (mainLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mainLayout.getLayoutParams();
            params.setMargins(0, statusBarHeight, 0, 0);
            mainLayout.setLayoutParams(params);
        }


        listView = (ListView) findViewById(R.id.list_view_id);
        searchView = (SearchView) findViewById(R.id.search_id);


        capital_alphabets = getResources().getStringArray(R.array.alphabets_capital);
        small_alphabets = getResources().getStringArray(R.array.alphabets_small);
        english_words = getResources().getStringArray(R.array.alphabets_word);


        CustomAdapter adapter = new CustomAdapter(this,images,capital_alphabets,small_alphabets,english_words);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,AlphabetActivity.class);
                intent.putExtra("key",String.valueOf(position));
                startActivity(intent);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });

    }
    // Method to get the height of the status bar
    private int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

}