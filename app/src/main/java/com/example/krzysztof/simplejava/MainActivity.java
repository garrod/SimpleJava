package com.example.krzysztof.simplejava;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int startValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView textView = new TextView(this);
//        textView.setWidth(200);
//        textView.setTextColor(Color.parseColor("#FF0000"));
//        textView.setTextSize(20);
//        textView.setPadding(20,20,20,20);
//        textView.setGravity(0x11);
//        textView.setText("Lorem Ipsum jest tekstem stosowanym jako przykładowy wypełniacz w przemyśle poligraficznym. Został po raz pierwszy użyty w XV w. przez nieznanego drukarza do wypełnienia tekstem próbnej książki. Pięć wieków później zaczął być używany przemyśle elektronicznym, pozostając praktycznie niezmienionym. Spopularyzował się w latach 60. XX w. wraz z publikacją arkuszy Letrasetu, zawierających fragmenty Lorem Ipsum, a ostatnio z zawierającym różne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druków na komputerach osobistych, jak Aldus PageMaker ! ");
//        textView.setMaxLines(10);
//        setContentView(textView);

        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.coffie_number);
    }

    private void displayValue(String val) {
        textView.setText(val);
    }

    public void increment(View view) {
        startValue = startValue+1;
        displayValue(startValue+"");
    }

    public void decrement(View view) {
        startValue = startValue-1;
        displayValue(startValue+"");
    }
}
