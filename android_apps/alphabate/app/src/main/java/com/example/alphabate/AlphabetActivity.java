package com.example.alphabate;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlphabetActivity extends AppCompatActivity {
    private TextView capitalView,smallView,wordView,meaningView;
    private ImageView imageView;
    private  String[] capital_alphabets,small_alphabets,english_words,meaning_words;
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
        setContentView(R.layout.activity_alphabet);

        int statusBarHeight = getStatusBarHeight();

        // Get the LinearLayout containing your views
        View mainLayout = findViewById(R.id.main);

        // Set the top margin to the status bar height
        if (mainLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mainLayout.getLayoutParams();
            params.setMargins(0, statusBarHeight, 0, 0);
            mainLayout.setLayoutParams(params);
        }

        imageView = (ImageView) findViewById(R.id.image_id);
        capitalView = (TextView) findViewById(R.id.capital_id);
        smallView = (TextView) findViewById(R.id.small_id);
        wordView = (TextView) findViewById(R.id.e_word_id);
        meaningView = (TextView) findViewById(R.id.b_word_id);

        capital_alphabets = getResources().getStringArray(R.array.alphabets_capital);
        small_alphabets = getResources().getStringArray(R.array.alphabets_small);
        english_words = getResources().getStringArray(R.array.alphabets_word);
        meaning_words = getResources().getStringArray(R.array.alphabets_word_meaning);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String value = bundle.getString("key");
            int key = Integer.parseInt(value);
            imageView.setImageResource(images[key]);
            capitalView.setText(capital_alphabets[key]);
            smallView.setText(small_alphabets[key]);
            wordView.setText(english_words[key]);
            meaningView.setText(meaning_words[key]);
        }

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