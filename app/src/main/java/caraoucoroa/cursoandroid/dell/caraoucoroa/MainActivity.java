package caraoucoroa.cursoandroid.dell.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    private ImageView btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = (ImageView) findViewById(R.id.btn_jogar_id);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("sorteio", r.nextInt(2));

                startActivity(intent);
            }
        });
    }
}
