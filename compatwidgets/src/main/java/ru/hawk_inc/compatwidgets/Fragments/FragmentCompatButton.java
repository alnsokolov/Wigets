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
import ru.hawk_inc.compatwidgets.Widjets.CompatButton;

/**
 * Created by Admin on 2/22/2018.
 */

public class FragmentCompatButton extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button, container, false);

        //TODO:Code for color changing and communication with Bluetooth
        final TextView name = (TextView)view.findViewById(R.id.name);
        CompatButton button = (CompatButton)view.findViewById(R.id.compatButton);

        button.addOnClickListener(new CompatButton.OnCompatButtonClickListener() {
            @Override
            public void OnClick(CompatButton button, boolean isOn) {
                //TODO:Code for communication with bluetooth
            }
        });

        return view;
    }
}
