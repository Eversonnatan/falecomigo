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
    String descricaoPessoa [] = {"Sou psicologa","Sou designer","Sou advogado","Sou Coach de combate Sambo","Sou nutricionista"};
    String nomePessoa []  = {"Sharon","kelly","Lucas","Khabib","Karen"};
    int imgPerfil [] = {R.drawable.image, R.drawable.imageum,R.drawable.imagedois,R.drawable.imagetres,R.drawable.imagequatro,R.drawable.imagecinco};


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
            ImageView gImgPerfil;
            TextView gNomePessoa, gDescricaoPessoa;
            RatingBar rtBar;

            //Adaptador ligando ao modelo
            View v = getLayoutInflater().inflate(R.layout.modelo_card,null);

            //Apresentar as variaveis do java para o modelo xml
            gImgPerfil = v.findViewById(R.id.imgPerfil);
            gNomePessoa = v.findViewById(R.id.nomePessoa);
            gDescricaoPessoa = v.findViewById(R.id.descricaoPessoa);


            //inserindo os valores nas variaveis do java
            gDescricaoPessoa.setText(descricaoPessoa[i]);
            gNomePessoa.setText(nomePessoa[i]);
            gImgPerfil.setImageResource(imgPerfil[i]);


            return v;

        }
    }
}