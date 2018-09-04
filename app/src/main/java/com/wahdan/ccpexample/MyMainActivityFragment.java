package com.wahdan.ccpexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mukesh.countrypicker.CountryPicker;

/**
 * A placeholder fragment containing a simple view.
 */
public class MyMainActivityFragment extends Fragment {

    private CountryPicker countryPicker;

    public MyMainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_my_main, container, false);
        countryPicker =
                new CountryPicker.Builder().with(getActivity()).sortBy(CountryPicker.SORT_BY_NAME)
                        .build();

        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countryPicker.showDialog(getActivity());

            }
        });
        return view;
    }
}
