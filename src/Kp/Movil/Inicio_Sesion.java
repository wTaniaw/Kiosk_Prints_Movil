package Kp.Movil;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Inicio_Sesion extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio__sesion);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.inicio__sesion, menu);
        return true;
    }
}
