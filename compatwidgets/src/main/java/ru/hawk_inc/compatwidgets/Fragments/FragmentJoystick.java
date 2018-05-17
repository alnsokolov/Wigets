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
import ru.hawk_inc.compatwidgets.Widjets.Joystick;

/**
 * Created by Admin on 2/22/2018.
 */

public class FragmentJoystick extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joystick, container, false);

        final TextView name = (TextView)view.findViewById(R.id.name);
        final TextView X = (TextView)view.findViewById(R.id.x);
        final TextView Y = (TextView)view.findViewById(R.id.y);
        Joystick joystick = (Joystick)view.findViewById(R.id.joystick);

        joystick.addOnTouchListener(new Joystick.OnJoystickTouchListener() {
            @Override
            public void OnJoystickTouch(float x, float y, boolean in) {
                X.setText(Math.round(x)+""); Y.setText(Math.round(y)+"");
                //TODO:Code for communication with Bluetooth
            }
        });

        return view;
    }
}
