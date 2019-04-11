package dx.queen.forlizy.reclycler.theme;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import dx.queen.forlizy.R;
import dx.queen.forlizy.RecyclerListener;

public class AdapterFragment  extends RecyclerView.Adapter<ViewHolderFragment>{

    static List<Obidchik> listOFObidchik ;
    private RecyclerListener listener;

    public AdapterFragment( List<Obidchik> listOFObidchik) {
        this.listOFObidchik = listOFObidchik;
    }

    public  static List<Obidchik> getListOFObidchik() {
        return listOFObidchik;
    }



    @NonNull
    @Override
    public ViewHolderFragment onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_view_holder,viewGroup,false);
        return new ViewHolderFragment(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFragment viewHolderFragment, int i ) {
        viewHolderFragment.bind(listOFObidchik.get(i), listener , i);

    }

    @Override
    public int getItemCount() {
        return getListOFObidchik().size();
    }
}
