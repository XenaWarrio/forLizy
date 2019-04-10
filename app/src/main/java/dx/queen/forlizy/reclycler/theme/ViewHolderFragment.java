package dx.queen.forlizy.reclycler.theme;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import dx.queen.forlizy.R;

public class ViewHolderFragment extends RecyclerView.ViewHolder  {

    TextView name;
    TextView reason;


    public ViewHolderFragment(@NonNull View itemView) {
        super(itemView);
          name = itemView.findViewById(R.id.to_whom);
          reason = itemView.findViewById(R.id.for_what);


    }
}
