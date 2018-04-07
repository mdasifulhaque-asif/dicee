package asifulhaque.info.dicee;

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
        /**
         * @param
         */


        Button rollButton;
        final ImageView leftDicee, rightDicee;
        //Initiate variable with xml
        rollButton = findViewById(R.id.buttonRoll);
        leftDicee = findViewById(R.id.ivLeftDicee);
        rightDicee = findViewById(R.id.ivRightDicee);

        //Collection of Dice Images which is not changeable
      final  int[] diceeArray = {R.drawable.dice1,
              R.drawable.dice2,
              R.drawable.dice3,
              R.drawable.dice4,
              R.drawable.dice5,
              R.drawable.dice6};


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze Button has pressed");
                Random randomNumberGernerator = new Random();
                int randNo = randomNumberGernerator.nextInt(6);
                Log.d("Dicee", "The Random No is " + randNo);
                leftDicee.setImageResource(diceeArray[randNo]);
                //the new random number for right dice
                randNo=randomNumberGernerator.nextInt(6);
                rightDicee.setImageResource(diceeArray[randNo]);




            }
        });

    }
}
