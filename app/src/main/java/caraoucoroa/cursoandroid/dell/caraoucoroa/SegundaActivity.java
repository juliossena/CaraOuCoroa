package caraoucoroa.cursoandroid.dell.caraoucoroa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SegundaActivity extends Activity {

    private ImageView imagemResultado;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imagemResultado = (ImageView) findViewById(R.id.img_resultado_id);
        btnVoltar = (ImageView) findViewById(R.id.btn_voltar_id);

        Bundle b = getIntent().getExtras();

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SegundaActivity.this, MainActivity.class));
            }
        });

        if (b != null) {
            int valor = (int) b.get("sorteio");
            if (valor == 1)
                imagemResultado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            else {
                imagemResultado.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }
    }
}
