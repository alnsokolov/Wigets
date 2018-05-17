package ru.hawk_inc.compatwidgets.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.hawk_inc.compatwidgets.R;
import ru.hawk_inc.compatwidgets.Widjets.CircleSlider;

/**
 * Created by Admin on 2/22/2018.
 */

public class FragmentCircleSlider extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_circle, container, false);

        final TextView name = (TextView)view.findViewById(R.id.name);
        final TextView value = (TextView)view.findViewById(R.id.value);
        CircleSlider slider = (CircleSlider)view.findViewById(R.id.circleSlider);

        slider.addOnSliderChangeListener(new CircleSlider.OnSliderChangeListener() {
            @Override
            public void OnValueChanged(CircleSlider slider, float newValue, boolean fromUser) {
                value.setText(Math.round(newValue) + "");
            }

            @Override
            public void OnStartTrackingTouch(CircleSlider circleSlider) {

            }

            @Override
            public void OnStopTrackingTouch(CircleSlider circleSlider) {

            }
        });

        return view;
    }
}
