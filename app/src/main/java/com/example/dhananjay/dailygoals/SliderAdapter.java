package com.example.dhananjay.dailygoals;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Admin on 17-Apr-18.
 */

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context=context;
    }

    // Arrays

    public int[] Slide_images={
            R.drawable.logosecond,
            R.drawable.second_image,
            R.drawable.secondhalfimage,
            R.drawable.third_image
    };
    public String[] slide_headings={
            "Welcome to Daily Goals",
            "Set Your Goals",
            "Achieve Your Goals",
            "Track with Pie Graph"
    };
    public String[] description={

            "Set your goals and achieve at time.",
            "Make your Daily goals and weekly goals.",
            "Achieve your goals and go Ahead.",
            "Keep a track With the help of Pie chart."
    };
    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o){
        return view == (RelativeLayout)o;
    }

    @Override
    public Object instantiateItem(ViewGroup container,int position){
        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView=(ImageView) view.findViewById(R.id.slideimage);
        TextView slideheading=(TextView) view.findViewById(R.id.heading);
        TextView slidedescription=(TextView) view.findViewById(R.id.description);

        slideImageView.setImageResource(Slide_images[position]);
        slideheading.setText(slide_headings[position]);
        slidedescription.setText(description[position]);

        container.addView(view);


        return view;

    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView((RelativeLayout)object);
    }


}
