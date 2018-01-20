package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButtom;
    private Button mButtonBottom;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButtom = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(mStoryIndex == 1 || mStoryIndex == 2) {
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButtom.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    }else if (mStoryIndex == 3){
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButtom.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                    }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButtom.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if (mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButtom.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }else if (mStoryIndex == 3){
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButtom.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
            }
        });

    }



}
