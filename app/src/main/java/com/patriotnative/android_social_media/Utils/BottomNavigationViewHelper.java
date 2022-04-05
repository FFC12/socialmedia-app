package com.patriotnative.android_social_media.Utils;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.patriotnative.android_social_media.Like.LikeActivity;
import com.patriotnative.android_social_media.Profile.ProfileActivity;
import com.patriotnative.android_social_media.Search.SearchActivity;
import com.patriotnative.android_social_media.Share.ShareActivity;
import com.patriotnative.android_social_media.Home.HomeActivity;
import com.patriotnative.android_social_media.R;


public class BottomNavigationViewHelper extends AppCompatActivity {

    public static void enableNavigation(final Context context, BottomNavigationView bottomNavigationView) {


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, ShareActivity.class);
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, LikeActivity.class);
                        context.startActivity(intent4);
                        break;

                    case R.id.ic_profile:
                        Intent intent5 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;

                }

                return true;
            }
        });


    }
}
