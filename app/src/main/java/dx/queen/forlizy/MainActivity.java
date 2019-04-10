package dx.queen.forlizy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import dx.queen.forlizy.reclycler.theme.Obidchik;
import dx.queen.forlizy.reclycler.theme.RecyclerFragment;

public class MainActivity extends AppCompatActivity {

    private static List<Obidchik> listOFObidchik = new ArrayList<>();

    public static List<Obidchik> getListOFObidchik() {
        return listOFObidchik;
    }

  public static void initObidchikList() {
      listOFObidchik.add(new Obidchik("Папа", "За то что я не Ксюша"));
      listOFObidchik.add(new Obidchik("Солнце" , "За то что светит"));
      listOFObidchik.add(new Obidchik("Этот дурацкий телефон" ,  "За то что глючит"));
  }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initObidchikList();
        openForLizyFragment();
        openRecyclerFragment();
    }



    public void openForLizyFragment(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragments_holder , ForLizyFragment.newInstance())
                .commit();
    }

    public void openRecyclerFragment(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragments_holder , RecyclerFragment.newInstance())
                .addToBackStack(null)
                .commit();
    }
}
