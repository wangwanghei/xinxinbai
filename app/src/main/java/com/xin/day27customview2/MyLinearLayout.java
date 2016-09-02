package com.xin.day27customview2;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/8/30.
 */
public class MyLinearLayout extends LinearLayout {

    int[] imgs={R.drawable.images9,R.drawable.images10,R.drawable.images13,R.drawable.images14,R.drawable.inde,R.drawable.index5};
    String [] names={"图片1","图片二","图片三","图片四","图片五","图片六"};
    public MyLinearLayout(Context context) {
        this(context, null);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        View view = LayoutInflater.from(context).inflate(R.layout.linearlayout_my, this);
        ImageView imageView= (ImageView) view.findViewById(R.id.image);
        TextView textView= (TextView) view.findViewById(R.id.text);
        textView.setTextSize(30);
        textView.setTextAlignment(TEXT_ALIGNMENT_CENTER);
        textView.setBackgroundColor(Color.YELLOW);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        textView.setText(names[(int) (Math.random()*names.length)]);
        imageView.setImageResource(imgs[(int) (Math.random()*imgs.length)]);
    }
}
