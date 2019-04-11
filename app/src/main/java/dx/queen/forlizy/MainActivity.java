package dx.queen.forlizy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dx.queen.forlizy.reclycler.theme.RecyclerFragment;

public class MainActivity extends AppCompatActivity implements RecyclerListener {

     public static final String ARG_KEY = "argument key";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openForLizyFragment( );
    }



    public void openForLizyFragment(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragments_holder , ForLizyFragment.newInstance()) // зачем мы используем ключ и инт и
                .commit();
    }

    @Override
    public void openRecyclerFragment(int i ){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragments_holder , RecyclerFragment.newInstance(i))
                .addToBackStack(null)
                .commit();
    }


}
