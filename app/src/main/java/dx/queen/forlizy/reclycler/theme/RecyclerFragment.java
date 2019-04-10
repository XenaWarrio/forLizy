package dx.queen.forlizy.reclycler.theme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import dx.queen.forlizy.R;

public  class RecyclerFragment extends Fragment {

    public static RecyclerFragment newInstance() {

        Bundle args = new Bundle();

        RecyclerFragment fragment = new RecyclerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    RecyclerView rv;
    Button add_k;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler2, container, false);
        rv = v.findViewById(R.id.rv);

        rv.setAdapter(new AdapterFragment());
        rv.setLayoutManager(new LinearLayoutManager(v.getContext()));

        add_k = v.findViewById(R.id.add_kozlina);

        add_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return v;

    }


}