package dx.queen.forlizy.reclycler.theme;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dx.queen.forlizy.MainActivity;
import dx.queen.forlizy.R;

public class AdapterFragment  extends RecyclerView.Adapter<ViewHolderFragment>{

    @NonNull
    @Override
    public ViewHolderFragment onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_view_holder,viewGroup,false);
        return new ViewHolderFragment(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFragment viewHolderFragment, int i) {

    }

    @Override
    public int getItemCount() {
        return MainActivity.getListOFObidchik().size();
    }
}
