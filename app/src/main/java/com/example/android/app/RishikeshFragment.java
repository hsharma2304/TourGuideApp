package com.example.android.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RishikeshFragment extends Fragment {
    public RishikeshFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.name_gangapuja), getContext().getString(R.string.gangapuja), getString(R.string.add_gangapuja), R.drawable.puja));
        listItems.add(new ListItem(getString(R.string.name_riverrafting), getContext().getString(R.string.riverrafting), getString(R.string.add_rafting), R.drawable.rishi));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}