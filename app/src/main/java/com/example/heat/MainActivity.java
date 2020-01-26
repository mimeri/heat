package com.example.heat;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button leoButton;

    TextView helloWorld;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leoButton = findViewById(R.id.leo);

        helloWorld = findViewById(R.id.textView);

        leoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloWorld.setVisibility(View.VISIBLE);
            }
        });
    }




}
