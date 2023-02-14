package br.com.etecia.falecomigo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView idItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idItens = findViewById(R.id.idItens);
        MyAdapter adapter = new MyAdapter();
        idItens.setAdapter(adapter);
    }
    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Variaveis de modelo
            ImageView imgPerfil;
            TextView nomePessoa, descricaoPessoa;
            RatingBar rtBar;

            //Adaptador ligando ao modelo
            View v = getLayoutInflater().inflate(R.layout.modelo_card,null);

            //Apresentar as variaveis do java para o modelo xml
            imgPerfil = v.findViewById(R.id.imgPerfil);
            nomePessoa = v.findViewById(R.id.nomePessoa);
            descricaoPessoa = v.findViewById(R.id.descricaoPessoa);
            rtBar = v.findViewById(R.id.rtBar);
            return null;

        }
    }
}