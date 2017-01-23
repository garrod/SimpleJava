package com.example.krzysztof.simplejava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView donutsNumber;
    private TextView donutsOrder;
    private TextView donutsPrice;
    private CheckBox takeawayPackage;
    private int donutsOrderValue = 0;
    private final static int TAKEAWAY_PACKAGE_PRICE = 12;

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
        donutsNumber = (TextView) findViewById(R.id.donuts_number);
        donutsOrder = (TextView) findViewById(R.id.text_donuts);
        donutsPrice = (TextView) findViewById(R.id.text_price);
        takeawayPackage = (CheckBox) findViewById(R.id.box);
    }

    private void displayValue(String val) {
        donutsNumber.setText(val);
    }

    public void displayOrder(View view) {
        donutsOrder.setText("Pączki : " + donutsOrderValue);
        int price = donutsOrderValue * 5;

        if(takeawayPackage.isChecked()) {
            price += TAKEAWAY_PACKAGE_PRICE;
        }

        donutsPrice.setText("Cena : " + price + " zł");

        ImageView img = (ImageView) findViewById(R.id.order_image);
        img.setImageResource(R.drawable.donut);
    }

    public void increment(View view) {
        donutsOrderValue = donutsOrderValue +1;
        displayValue(donutsOrderValue +"");
    }

    public void decrement(View view) {
        if(donutsOrderValue >0) {
            donutsOrderValue = donutsOrderValue - 1;
            displayValue(donutsOrderValue + "");
        }
    }
}
