package ru.hawk_inc.compatwidgets.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.hawk_inc.compatwidgets.R;
import ru.hawk_inc.compatwidgets.Widjets.CircleSlider;
import ru.hawk_inc.compatwidgets.Widjets.Slider;

/**
 * Created by Admin on 2/22/2018.
 */

public class FragmentSlider extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slider, container, false);

        final TextView name = (TextView)view.findViewById(R.id.name);
        final TextView value = (TextView)view.findViewById(R.id.value);
        Slider slider = (Slider)view.findViewById(R.id.slider);

        slider.addOnSliderChangeListener(new Slider.OnSliderChangeListener() {
            @Override
            public void OnChange(Slider slide, float newValue, boolean fromUser) {
                value.setText(Math.round(newValue) + "");
                //TODO:Code for communication with Bluetooth
            }
        });

        return view;
    }
}
