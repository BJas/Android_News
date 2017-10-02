package com.example.gokha.newsapplication;

/**
 * Created by Gokha on 28.09.17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class TabCategory extends Fragment{


    public TabCategory() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.category_tab, container,
                false);
        GridView gridView = (GridView) view.findViewById(R.id.gridView);
        gridView.setAdapter(new MyAdapter1(view.getContext()));

        return view;
    }
}
