package com.pedroteixeira.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cria o objeto do tipo do layout
        Button rollButton;

        //Insere o conteúdo do layout com id android:id="@+id/rollButton", é necessário fazer um cast quando se está usando SDK menor que o 26
        rollButton =  findViewById(R.id.rollButton);

        final ImageView leftDice =  findViewById(R.id.image_leftDice);

        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenerator = new Random();
                //Gera um número randomicamente de 0 a 5
                int number = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);
            }
        });


    }
}
