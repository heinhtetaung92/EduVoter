package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.epicmyanmar.jr.eduvoter.R;

import java.util.Arrays;
import java.util.List;

import adapter.Tab1Adapter;
import adapter.Tab2Adapter;

/**
 * Created by heinhtetaung on 5/29/15.
 */
public class Tab2Fragment extends Fragment{

    View view;
    ListView listview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_tab2, container, false);
        listview = (ListView) view.findViewById(R.id.tab2_listview);

        List<String> dl = Arrays.asList(new String[]{"one", "one", "one", "one", "one", "one", "one", "one", "one"});
        Tab2Adapter adp = new Tab2Adapter(getActivity(), dl);
        listview.setAdapter(adp);

        return view;
    }
}
