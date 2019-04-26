package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nour Ahmed on 8/4/2018.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words,int colorResourceId)
    {
        super(context,0,words);
        mColorResourceId=colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word word=getItem(position);

        TextView miwokTranslation =(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(word.getMiwokTranslation());

        TextView defaultTranslation =(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(word.getDefaultTranslation());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image_view);
        if(word.hasImage())
        {
            image.setImageResource(word.getImageResourceId());
        }
        else
        {
            image.setVisibility(View.GONE);
        }

        View textContainer =listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
