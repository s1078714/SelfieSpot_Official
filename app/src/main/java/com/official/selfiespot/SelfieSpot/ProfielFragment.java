package com.official.selfiespot.SelfieSpot;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfielFragment extends Fragment {
	
	public ProfielFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(com.official.selfiespot.SelfieSpot.R.layout.fragment_profiel, container, false);
         
        return rootView;
    }
}
