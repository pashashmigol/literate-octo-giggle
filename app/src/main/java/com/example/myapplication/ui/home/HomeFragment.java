package com.example.myapplication.ui.home;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.ActivityPeriodActv;
import com.example.myapplication.R;
import com.example.myapplication.SleepActv;
import com.example.myapplication.WaterActv;
import com.example.myapplication.WeightActv;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        CardView activityPeriodBt = view.findViewById(R.id.cardActivity);
        activityPeriodBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), ActivityPeriodActv.class);
                startActivity(i);
            }
        });


        CardView weightBt = view.findViewById(R.id.cardWeight);
        weightBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), WeightActv.class);
                startActivity(i);
            }
        });


        CardView sleepBt = view.findViewById(R.id.cardSleep);
        sleepBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), SleepActv.class);
                startActivity(i);
            }
        });

        CardView waterBt = view.findViewById(R.id.cardWater);
        waterBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), WaterActv.class);
                startActivity(i);
            }
        });


    }


}
