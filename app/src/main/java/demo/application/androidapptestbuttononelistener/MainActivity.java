package demo.application.androidapptestbuttononelistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btn1 , btn2, btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);

        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                switch (view.getId()){
                    case R.id.button1:
                        textView.setText("Нажата 1");
                        break;
                    case R.id.button2:
                        textView.setText("Нажата 2");
                        break;
                    case R.id.button3:
                        textView.setText("Нажата 3");
                        break;

                }
            }
        };

        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);


    }


}
