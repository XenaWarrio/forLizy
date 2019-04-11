package dx.queen.forlizy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import dx.queen.forlizy.reclycler.theme.AdapterFragment;
import dx.queen.forlizy.reclycler.theme.Obidchik;


public class DetailFragment extends Fragment {

    EditText etNameOf;
    EditText etReason;
    Button btSave;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View v = inflater.inflate(R.layout.fragment_detail, container, false);

       etNameOf = v.findViewById(R.id.name_person);
       etReason = v.findViewById(R.id.reason_of_obidki);
       btSave = v.findViewById(R.id.save);

       btSave.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String name = etNameOf.getText().toString();
               String reason = etReason.getText().toString();
               Obidchik obidchik = new Obidchik(name, reason);
               AdapterFragment.getListOFObidchik().add(obidchik);

           }
       });




       return v;
    }
}
