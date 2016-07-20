package com.gcampioto.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        List<String> forecastEntries = new ArrayList<>();
        String[] forecastArray = {
                    "Hoje -- Ensolarado -- 21/28",
                    "Amanhã -- Ensolarado -- 21/28",
                    "Quinta -- Ensolarado -- 21/28",
                    "Sexta -- Ensolarado -- 21/28",
                    "Sábado -- Ensolarado -- 21/28",
                    "Domingo -- Ensolarado -- 21/28"
                };
        forecastEntries = Arrays.asList(forecastArray);

        ArrayAdapter<String> forecastAdapter =
                new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, forecastEntries);
        ListView forecastListView = (ListView) rootView.findViewById(R.id.listview_forecast);
        forecastListView.setAdapter(forecastAdapter);

        return rootView;
    }
}
