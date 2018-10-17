package edu.temple.pallette;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CanvasFragment extends Fragment {

    View view;

    public CanvasFragment(){
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_canvas, container, false);
        return view;
    }


    public void background(int position){
        Resources res = getResources();
        final String[] colors = res.getStringArray(R.array.colorsArray);
        view.setBackgroundColor(Color.parseColor(colors[position]));

    }
}
