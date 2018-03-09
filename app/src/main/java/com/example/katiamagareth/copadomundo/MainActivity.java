package com.example.katiamagareth.copadomundo;

// Seleção de grupos da Copa do Mundo: O usuário terá uma lista de Grupos em um Spinner nomeados
// de A até H. Dependendo do grupo selecionado no Spinner, exibir o nome de cada país integrante d
// aquele grupo. Bônus: além de exibir o nome do país, mostrar a bandeira do mesmo. (Dica, usar o
// widget ImageView e salvar as imagens e Drawable).

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selecao = (Spinner)findViewById(R.id.spinnerSelectGroup);
        selecao1 = findViewById(R.id.textSelecao1);
        selecao2 = findViewById(R.id.textSelecao2);
        selecao3 = findViewById(R.id.textSelecao3);
        selecao4 = findViewById(R.id.textSelecao4);
    }

    public void click(View v){

        String opcao = selecao.getSelectedItem().toString();

        switch (opcao){
            case "GRUPO A":
                selecao1.setText("Egito");
                selecao2.setText("Rússia");
                selecao3.setText("Arábia Saudita");
                selecao4.setText("Uruguai");
                breake;
            case "GRUPO B":
                selecao1.setText("Irã");
                selecao2.setText("Marrocos");
                selecao3.setText("Portugal");
                selecao4.setText("Espanha");
                brake
            case "GRUPO C":
                selecao1.setText("Austrália");
                selecao2.setText("Dinamarca");
                selecao3.setText("França");
                selecao4.setText("Peru");
                break;
            case "GRUPO D":
                selecao1.setText("Argentina");
                selecao2.setText("Croácia");
                selecao3.setText("Islândia");
                selecao4.setText("Peru");
                break;
            case "GRUPO E":
                selecao1.setText("Brasil");
                selecao2.setText("Costa Rica");
                selecao3.setText("Suíça");
                selecao4.setText("Sérvia");
                break;
            case "GRUPO F":
                selecao1.setText("Alemanha");
                selecao2.setText("Coréia do Sul");
                selecao3.setText("México");
                selecao4.setText("Suécia");
                break;
            case "GRUPO G":
                selecao1.setText("Bélgica");
                selecao2.setText("Inglaterra");
                selecao3.setText("Panamá");
                selecao4.setText("Tunísia");
                break;
            case "GRUPO H":
                selecao1.setText("Clombia");
                selecao2.setText("Japão");
                selecao3.setText("Polônia");
                selecao4.setText("Senegal");
                break;
        }
    }
}
