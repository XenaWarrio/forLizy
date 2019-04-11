package dx.queen.forlizy.reclycler.theme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import dx.queen.forlizy.DetailFragment;
import dx.queen.forlizy.MainActivity;
import dx.queen.forlizy.R;
import dx.queen.forlizy.RecyclerListener;

public  class RecyclerFragment extends Fragment {

    List<Obidchik> listOFObidchik  = new ArrayList<>();
    RecyclerListener listener;

    public static RecyclerFragment newInstance( int i ) {

        Bundle args = new Bundle();
        args.putInt(MainActivity.ARG_KEY , i);
        RecyclerFragment fragment = new RecyclerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    RecyclerView rv;
    Button add_k;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler2, container, false);

        listOFObidchik.add(new Obidchik("Папа", "За то что я не Ксюша"));
        listOFObidchik.add(new Obidchik("Солнце" , "За то что светит"));
        listOFObidchik.add(new Obidchik("Этот дурацкий телефон" ,  "За то что глючит"));

        rv = v.findViewById(R.id.rv);

        rv.setAdapter(new AdapterFragment(listOFObidchik));
        rv.setLayoutManager(new LinearLayoutManager(v.getContext()));

        add_k = v.findViewById(R.id.add_kozlina);

        add_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent addKozlina = new Intent(getContext(), DetailFragment.class);
                startActivity(addKozlina);
            }
        });

        return v;
        }

    @Override
    public void onResume() {
        super.onResume();
        RecyclerView.Adapter currentAdapter = rv.getAdapter();
        if (currentAdapter!=null)
            currentAdapter.notifyDataSetChanged();
    }


}