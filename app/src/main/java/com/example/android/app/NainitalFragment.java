package com.example.android.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NainitalFragment extends Fragment {

    public NainitalFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.name_nainitallake), getContext().getString(R.string.nainitallake), getString(R.string.add_nainipeak), R.drawable.naini));
        listItems.add(new ListItem(getString(R.string.name_nainipeak), getContext().getString(R.string.name_nainipeak), getString(R.string.add_nainitallake), R.drawable.tal));


        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
