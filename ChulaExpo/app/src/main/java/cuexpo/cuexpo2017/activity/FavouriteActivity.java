package cuexpo.cuexpo2017.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cuexpo.cuexpo2017.R;
import cuexpo.cuexpo2017.fragment.FavouriteFragment;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class FavouriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        if(savedInstanceState == null){

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.favourite_acitivity_content_container, new FavouriteFragment()).commit();

        }

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}
