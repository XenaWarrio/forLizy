package dx.queen.forlizy.reclycler.theme;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import dx.queen.forlizy.R;
import dx.queen.forlizy.RecyclerListener;

public class ViewHolderFragment extends RecyclerView.ViewHolder  {

RecyclerListener listener;

    TextView name;
    TextView reason;


    public ViewHolderFragment(@NonNull View itemView) {
        super(itemView);
          name = itemView.findViewById(R.id.to_whom);
          reason = itemView.findViewById(R.id.for_what);
          }

    public  void bind(Obidchik obidchik , final RecyclerListener listener,  final int i){
        name.setText(obidchik.getNameO());
        reason.setText(obidchik.getReason());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.openRecyclerFragment( i );
            }
        });
    }
}


