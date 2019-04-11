package dx.queen.forlizy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import dx.queen.forlizy.reclycler.theme.RecyclerFragment;

public class ForLizyFragment extends Fragment  {

    public static ForLizyFragment newInstance() {
        
        Bundle args = new Bundle();
        ForLizyFragment fragment = new ForLizyFragment();
        fragment.setArguments(args);

        return fragment;

    }


    Button start ;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_for_lizy,container, false );

        start = v.findViewById(R.id.bt_start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startRecycler = new Intent(getContext() , RecyclerFragment.class);
                startActivity(startRecycler);
            }
        });


        return v;
    }


}
