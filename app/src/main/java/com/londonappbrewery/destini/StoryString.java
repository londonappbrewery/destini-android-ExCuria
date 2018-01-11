package com.londonappbrewery.destini;

/**
 * Created by timwc on 09/01/2018.
 */

public class StoryString {
    private int mStory;
    private int mAnswer1;
    private int mAnswer2;
    private int mOutcome1;
    private int mOutcome2;

    public StoryString(int storyResourceID, int answer1ResourceID, int outcome1Value, int answer2ResourceID, int outcome2Value) {
        mStory = storyResourceID;
        mAnswer1 = answer1ResourceID;
        mAnswer2 = answer2ResourceID;
        mOutcome1 = outcome1Value;
        mOutcome2 = outcome2Value;

    }

    public int getStory() {
        return mStory;
    }

    public void setStory(int story) {
        mStory = story;
    }

    public int getAnswer1() {
        return mAnswer1;
    }

    public void setAnswer1(int answer1) {
        mAnswer1 = answer1;
    }

    public int getAnswer2() {
        return mAnswer2;
    }

    public void setAnswer2(int answer2) {
        mAnswer2 = answer2;
    }

    public int getOutcome1() {
        return mOutcome1;
    }

    public void setOutcome1(int outcome1) {
        mOutcome1 = outcome1;
    }

    public int getOutcome2() {
        return mOutcome2;
    }

    public void setOutcome2(int outcome2) {
        mOutcome2 = outcome2;
    }
}



