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
import ru.hawk_inc.compatwidgets.Widjets.CompatGrid;

/**
 * Created by Admin on 2/22/2018.
 */

public class FragmentCompatGrid extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid, container, false);

        final TextView name = (TextView)view.findViewById(R.id.name);
        final TextView columns = (TextView)view.findViewById(R.id.column);
        final TextView rows = (TextView)view.findViewById(R.id.row);
        CompatGrid grid = (CompatGrid) view.findViewById(R.id.compatGrid);

        grid.addOnGridChangeListener(new CompatGrid.OnGridChangeListener() {
            @Override
            public void OnClick(int row, int column, CompatGrid.Tile tile, boolean pressed) {
                columns.setText(column+""); rows.setText(row+"");
                //TODO: Code for communication
            }
        });

        return view;
    }
}
