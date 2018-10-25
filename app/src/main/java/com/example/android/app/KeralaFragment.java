package com.example.android.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class KeralaFragment extends Fragment {
    public KeralaFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.listitem_list, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getString(R.string.name_alleppey), getContext().getString(R.string.alleppey), getString(R.string.add_alleppey), R.drawable.kerala));
        listItems.add(new ListItem(getString(R.string.name_munnar), getContext().getString(R.string.munnar), getString(R.string.add_gulmarg), R.drawable.ker1));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(), R.layout.list_item, listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.listitem_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
