package app.yjkm.com.day_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mMainEt;
    private TranficCalculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new TranficCalculator(new SubwayStrategy());


        mMainEt = findViewById(R.id.main_et);
        findViewById(R.id.main_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String trim = mMainEt.getText().toString().trim();
                int i = Integer.parseInt(trim);
                int price = calculator.getPrice(i);
                Log.e("text123", "onCreate: price = " + price);
            }
        });


    }
}
