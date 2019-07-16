package absolutions.urielight.alc4challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    //private Button btn_to_abtAlc;
    //private Button btn_to_myProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btn_to_abtAlc.setOnClickListener();
    }


    public void onClickAboutAlc(View view){
        Intent intent_to_aboutAlc = new Intent(getApplicationContext(), AboutALcActivity.class);
        startActivity(intent_to_aboutAlc);
    }


    public void onClickMyProfile(View view){
        Intent intent_to_myProfile = new Intent(getApplicationContext(), MyProfileActivity.class);
        startActivity(intent_to_myProfile);
    }


}
