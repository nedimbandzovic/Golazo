package com.example.golazo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class jerseypurchase extends AppCompatActivity {

    EditText nameandsurname, address, phone,creditcard,expirationdate,ccv;
    TextView seatnumber, price, zone;
    ImageView rikverc;
    Button button;
    Bitmap bmp, bmp2, scaledbmp, scaledbmp2;
    public void askForPermission(){
        ActivityCompat.requestPermissions(jerseypurchase.this, new String[]{


                Manifest.permission.WRITE_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jerseypurchase);
        Intent intent=getIntent();
        getSupportActionBar().hide();
        nameandsurname=findViewById(R.id.editTextTextPersonName3);
        address=findViewById(R.id.editText);
        phone=findViewById(R.id.editText2);
        creditcard=findViewById(R.id.editText3);
        expirationdate=findViewById(R.id.editText4exp);
        ccv=findViewById(R.id.ccv);
        seatnumber=findViewById(R.id.textView89);
        price=findViewById(R.id.textView91);
        zone=findViewById(R.id.textView90);
        String xy=intent.getStringExtra("price");
        button=findViewById(R.id.button7);
        rikverc=findViewById(R.id.imageView80);
        bmp= BitmapFactory.decodeResource(getResources(), R.drawable.nfsbihlogo);
        bmp2= BitmapFactory.decodeResource(getResources(), R.drawable.qrcode);
        scaledbmp=Bitmap.createScaledBitmap(bmp, 200, 200, false);
        scaledbmp2=Bitmap.createScaledBitmap(bmp2, 400, 400, false);
        price.setText(xy);
        ProgressDialog dialog=new ProgressDialog(jerseypurchase.this);
        Random r = new Random();
        int i1 = r.nextInt(19000000 - 1000000) + 1000000;
        seatnumber.setText("Tracking code: BA" + i1);
        List<String> list = new ArrayList<String>();
        String price=intent.getStringExtra("pricejersey");

        list.add("A");
        list.add("B");
        list.add("C");
        Random rand = new Random();
        String random = list.get(rand.nextInt(list.size()));
        zone.setText(price.toString());
        int rand_int=r.nextInt(100000 - 100) + 100;

        rikverc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jerseypurchase.super.onBackPressed();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (creditcard.getText().length() < 16) {
                    Toast.makeText(getApplicationContext(), "Credit card number must have 16 characters", Toast.LENGTH_SHORT).show();
                } else if (ccv.getText().length() < 4) {
                    Toast.makeText(getApplicationContext(), "CCV number must have 4 characters", Toast.LENGTH_SHORT).show();

                } else {


                    askForPermission();
                    PdfDocument myPdfDocument = new PdfDocument();
                    Paint myPaint = new Paint();
                    Paint titlePaint = new Paint();


                    PdfDocument.PageInfo myPageInfo1 = new PdfDocument.PageInfo.Builder(1200, 2010, 1).create();
                    PdfDocument.Page myPage1 = myPdfDocument.startPage(myPageInfo1);

                    Canvas canvas = myPage1.getCanvas();
                    canvas.drawBitmap(scaledbmp, 40, 50, myPaint);

                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(32);
                    canvas.drawText("GOLAZO", 800, 100, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(32);
                    canvas.drawText("NFSBiH", 800, 150, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(32);
                    canvas.drawText("Official Shop", 800, 200, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(32);
                    canvas.drawText("CONFIRMATION FOR SUCCESSFUL PAYMENT", 600, 350, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(32);
                    canvas.drawText("Name and surname", 600, 500, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.ITALIC));
                    titlePaint.setTextSize(25);
                    canvas.drawText(nameandsurname.getText().toString(), 600, 550, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(25);
                    canvas.drawText("Address", 600, 600, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.ITALIC));
                    titlePaint.setTextSize(25);
                    canvas.drawText(address.getText().toString(), 600, 650, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(25);
                    canvas.drawText("Phone number", 600, 700, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.ITALIC));
                    titlePaint.setTextSize(25);
                    canvas.drawText(phone.getText().toString(), 600, 750, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(25);
                    canvas.drawText("Official tracking code", 600, 800, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.ITALIC));
                    titlePaint.setTextSize(25);
                    canvas.drawText(seatnumber.getText().toString(), 600, 850, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(25);
                    canvas.drawText("Size and price", 600, 900, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.ITALIC));
                    titlePaint.setTextSize(25);
                    canvas.drawText(zone.getText().toString(), 600, 950, titlePaint);
                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(25);

                    canvas.drawBitmap(scaledbmp2, 400, 1000, myPaint);


                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.ITALIC));
                    titlePaint.setTextSize(21);
                    canvas.drawText("You can use the QR code to confirm your payment in case of issues", 600, 1650, titlePaint);


                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(25);
                    canvas.drawText("Certificate ID:" + rand_int, 600, 1850, titlePaint);


                    titlePaint.setTextAlign(Paint.Align.CENTER);
                    titlePaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.BOLD));
                    titlePaint.setTextSize(12);
                    canvas.drawText("© 2022 NFSBiH & Golazo", 600, 1900, titlePaint);


                    myPdfDocument.finishPage(myPage1);

                    File file = new File(Environment.getExternalStorageDirectory(), "/Download/GolazoJerseyPurchase.pdf");


                    try {
                        myPdfDocument.writeTo(new FileOutputStream(file));


                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    myPdfDocument.close();
                    new CountDownTimer(7000, 1000) {

                        public void onTick(long millisUntilFinished) {
                            dialog.setMessage("Finalizing your payment...");
                            dialog.show();                        //here you can have your logic to set text to edittext
                        }

                        public void onFinish() {
                            dialog.dismiss();
                            Intent xst = new Intent(jerseypurchase.this, ResultActivity.class);
                            startActivity(xst);
                            overridePendingTransition(0, 0);
                            Toast.makeText(getApplicationContext(), "Payment successful", Toast.LENGTH_SHORT).show();



                        }

                    }.start();



                }
            }
        });


    }



}