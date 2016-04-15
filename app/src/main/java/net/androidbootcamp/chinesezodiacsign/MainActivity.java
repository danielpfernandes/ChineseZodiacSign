package net.androidbootcamp.chinesezodiacsign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    int yearEntered;
    int remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText year = (EditText) findViewById(R.id.txtYear);
        Button convert = (Button) findViewById(R.id.btnSubmit);
        final TextView result = (TextView) findViewById(R.id.txtResult);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yearEntered = Integer.parseInt(year.getText().toString());
                remainder = yearEntered % 12;

                ImageView img = (ImageView) findViewById(R.id.imgAnimal);

                switch (remainder) {
                    case 0:
                        result.setText("You Chinese zodiac sign is monkey");
                        img.setImageResource(R.drawable.monkey);
                        break;
                    case 1:
                        result.setText("You Chinese zodiac sign is rooster");
                        img.setImageResource(R.drawable.rooster);
                        break;
                    case 2:
                        result.setText("You Chinese zodiac sign is dog");
                        img.setImageResource(R.drawable.dog);
                        break;
                    case 3:
                        result.setText("You Chinese zodiac sign is pig");
                        img.setImageResource(R.drawable.pig);
                        break;
                    case 4:
                        result.setText("You Chinese zodiac sign is rat");
                        img.setImageResource(R.drawable.rat);
                        break;
                    case 5:
                        result.setText("You Chinese zodiac sign is ox");
                        img.setImageResource(R.drawable.ox);
                        break;
                    case 6:
                        result.setText("You Chinese zodiac sign is tiger");
                        img.setImageResource(R.drawable.tiger);
                        break;
                    case 7:
                        result.setText("You Chinese zodiac sign is rabbit");
                        img.setImageResource(R.drawable.rabbit);
                        break;
                    case 8:
                        result.setText("You Chinese zodiac sign is dragon");
                        img.setImageResource(R.drawable.dragon);
                        break;
                    case 9:
                        result.setText("You Chinese zodiac sign is snake");
                        img.setImageResource(R.drawable.snake);
                        break;
                    case 10:
                        result.setText("You Chinese zodiac sign is horse");
                        img.setImageResource(R.drawable.horse);
                        break;
                    case 11:
                        result.setText("You Chinese zodiac sign is goat");
                        img.setImageResource(R.drawable.goat);
                        break;
                }


            }
        });


    }
}
