package com.example.app3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class carsActivity extends AppCompatActivity {
    ImageView imageView1;
    TextView honda,toyota,kia,hummer,dodge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
        getSupportActionBar().hide();

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        honda = (TextView)findViewById(R.id.honda);
        honda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

//        toyota = (TextView)findViewById(R.id.toyota);
//        toyota.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder builder1 = new AlertDialog.Builder(carsActivity.this);
//                builder1.setTitle("Toyota ")
//                        .setMessage("Toyota Motor Corporation is a Japanese multinational automotive manufacturer headquartered in Toyota, Aichi, Japan. In 2017, Toyota's corporate structure consisted of 364,445 employees worldwide and, as of December 2019, was the tenth-largest company in the world by revenue.")
//                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                finish();
//                            }
//                        });



        kia = (TextView)findViewById(R.id.kia);
        kia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(carsActivity.this);
                builder.setTitle("Kia")
                        .setMessage("Kia Motors Corporation, commonly known as Kia Motors is a South Korean multinational automotive manufacturer headquartered in Seoul. It is South Korea's ")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                AlertDialog alertDialog1 = builder.create();
                alertDialog1.show();
            }
        });

        hummer = (TextView)findViewById(R.id.hummer);
        hummer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(carsActivity.this);
                builder2.setMessage("Hummer (stylized as HUMMER) was a brand of trucks and SUVs, first marketed in 1992 when AM General began selling a civilian version of the M998 Humvee.")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
//                AlertDialog alertDialog2 = builder2.create();
//                alertDialog2.show();
            }
        });

    }
        public void openDialog() {
            ExampleDialog exampleDialog = new ExampleDialog();
            exampleDialog.show(getSupportFragmentManager(),"Example dialog");
        }


}
