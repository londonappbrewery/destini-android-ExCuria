package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button mAnswerTop; // Top Answer button
    Button mAnswerBottom; // Bottom Answer Button
    int mStoryIndex; // Story Index
    int mAnswerString1; // Store Answer Top Text
    int mAnswerString2; // Store Answer Bottom Text
    int mStoryString; // Store Story
    int mOutputValue; // Outcome value of story decision
    TextView mStoryTextView; // Main Story text
    TextView mAnswerTopTextView; // Answer Top Text
    TextView mAnswerBottomTextView; // Answer Bottom Text


    private StoryString[] mStory = new StoryString[]{
            new StoryString(R.string.T1_Story, R.string.T1_Ans1, 2, R.string.T2_Ans2, 1),
            new StoryString(R.string.T2_Story, R.string.T2_Ans1, 2, R.string.T2_Ans2, 9000),
            new StoryString(R.string.T3_Story, R.string.T3_Ans1, 9002, R.string.T3_Ans2, 9001)
    };

    private EndStory[] endStory = new EndStory[]{
            new EndStory(R.string.T4_End),
            new EndStory(R.string.T5_End),
            new EndStory(R.string.T6_End),

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mAnswerTop = (Button) findViewById(R.id.buttonTop);
        mAnswerBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mAnswerTopTextView = (TextView) findViewById(R.id.buttonTop);
        mAnswerBottomTextView = (TextView) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        mAnswerBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mStoryIndex = mStory[mStoryIndex].getOutcome2();

                checkStory();

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mAnswerTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mStoryIndex = mStory[mStoryIndex].getOutcome1();

                checkStory();

            }
        });

    }

    // TODO: Pass the story returned value from getOutcome query to a holding method. If the value has a specific value will cause the End Story text to load. If the value has a different value it will continue to progress the story.

    private void checkStory() {

        if (mStoryIndex >= 9000) {

            mStoryIndex = mStoryIndex - 9000;
            mStoryString = endStory[mStoryIndex].getEnd();
            mStoryTextView.setText(mStoryString);

            mAnswerBottomTextView.setText(null);
            mAnswerTopTextView.setText(null);
            mAnswerTop.setVisibility(View.GONE);
            mAnswerBottom.setVisibility(View.GONE);

        } else {

            mStoryString = mStory [mStoryIndex].getStory();
            mStoryTextView.setText(mStoryString);

            mAnswerString1 = mStory [mStoryIndex].getAnswer1();
            mAnswerTopTextView.setText(mAnswerString1);

            mAnswerString2 = mStory [mStoryIndex].getAnswer2();
            mAnswerBottomTextView.setText(mAnswerString2);

        }

    }

}
