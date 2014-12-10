package com.official.selfiespot.SelfieSpot;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FeedFragment extends Fragment {
	
	public FeedFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(com.official.selfiespot.SelfieSpot.R.layout.fragment_feed, container, false);
         
        return rootView;
    }
}
