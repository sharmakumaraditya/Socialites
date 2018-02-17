package com.example.adityakumarsharma.socialites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.andrognito.patternlockview.PatternLockView;
import com.andrognito.patternlockview.listener.PatternLockViewListener;
import com.andrognito.patternlockview.utils.PatternLockUtils;

import java.util.List;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {
    String save_pattern_key="pattern_code";
    PatternLockView m;
    String final_pattern ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Paper.init(this);
        final String save_pattern = Paper.book().read(save_pattern_key);
        if(save_pattern != null && !save_pattern.equals("null"))
        {
            setContentView(R.layout.pattern_lock);
            m= (PatternLockView)findViewById(R.id.pattern_lock_view);
            m.addPatternLockListener(new PatternLockViewListener() {
                @Override
                public void onStarted() {

                }

                @Override
                public void onProgress(List<PatternLockView.Dot> progressPattern) {

                }

                @Override
                public void onComplete(List<PatternLockView.Dot> pattern) {
                    final_pattern = PatternLockUtils.patternToString(m,pattern);
                    if(final_pattern.equals(save_pattern)) {
                        Toast.makeText(MainActivity.this, "password correct", Toast.LENGTH_SHORT).show();
                        Intent ip = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(ip);
                    }
                    else
                        Toast.makeText(MainActivity.this,"password incorrect",Toast.LENGTH_SHORT).show();

                }

                @Override
                public void onCleared() {

                }
            });
        }

        else
        {
            setContentView(R.layout.activity_main);
            m= (PatternLockView)findViewById(R.id.pattern_lock_view);
            m.addPatternLockListener(new PatternLockViewListener() {
                @Override
                public void onStarted() {

                }

                @Override
                public void onProgress(List<PatternLockView.Dot> progressPattern) {

                }

                @Override
                public void onComplete(List<PatternLockView.Dot> pattern) {
                    final_pattern=PatternLockUtils.patternToString(m,pattern);
                }

                @Override
                public void onCleared() {

                }
            });



            Button bt=(Button)findViewById(R.id.btn);
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Paper.book().write(save_pattern_key,final_pattern);
                    Toast.makeText(MainActivity.this,"The Password Is Set",Toast.LENGTH_SHORT).show();
                    Intent ip = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(ip);
                }
            });
        }

    }
}
