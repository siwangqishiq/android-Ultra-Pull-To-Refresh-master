package com.xinlan.view.MyPullLayout;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by panyi on 2015/7/7.
 */
public class MyPullLayout extends ViewGroup {
    private View headView;
    private View contentView;

    public MyPullLayout(Context context) {
        super(context);
    }

    public MyPullLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyPullLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyPullLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        final int childCount = getChildCount();
        System.out.println("count-->"+childCount);
        for (int i = 0; i < childCount && i < 2; i++) {
            if (i == 0) {
                headView = getChildAt(i);
                System.out.println("get head view");
            } else if (i == 1) {
                contentView = getChildAt(i);
                System.out.println("get content view");
            }
        }//end for i
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //headView

        //ContentView
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        //headView

        //ContentView
    }
}//end class
