package mathdet.mathgadget.com.mathdet.Determinante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import mathdet.mathgadget.com.mathdet.R;

public class Paso2_3x3 extends AppCompatActivity {

    private TextView X5_2,X6_2,X7_2,X8_2,X9_2,X10_2,X5_1,X6_1,X7_1,X8_1,X9_1,X10_1,X11_1,X12_1,X13_1,Principal,Secundaria,ResulPrinci,ResulSecun;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso2_3x3);
        MobileAds.initialize(this, R.string.AdMobId+"");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(R.string.AdMobId_Intertisial+"");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        Intancias();
        Bundle vari = getIntent().getExtras();
        X5_2.setText(String.valueOf(vari.getBundle("var").getDouble("x5")));
        X5_1.setText(String.valueOf(vari.getBundle("var").getDouble("x5")));
        X6_2.setText(String.valueOf(vari.getBundle("var").getDouble("x6")));
        X6_1.setText(String.valueOf(vari.getBundle("var").getDouble("x6")));
        X7_2.setText(String.valueOf(vari.getBundle("var").getDouble("x7")));
        X7_1.setText(String.valueOf(vari.getBundle("var").getDouble("x7")));
        X8_2.setText(String.valueOf(vari.getBundle("var").getDouble("x8")));
        X8_1.setText(String.valueOf(vari.getBundle("var").getDouble("x8")));
        X9_2.setText(String.valueOf(vari.getBundle("var").getDouble("x9")));
        X9_1.setText(String.valueOf(vari.getBundle("var").getDouble("x9")));
        X10_2.setText(String.valueOf(vari.getBundle("var").getDouble("x10")));
        X10_1.setText(String.valueOf(vari.getBundle("var").getDouble("x10")));
        X11_1.setText(String.valueOf(vari.getBundle("var").getDouble("x11")));
        X12_1.setText(String.valueOf(vari.getBundle("var").getDouble("x12")));
        X13_1.setText(String.valueOf(vari.getBundle("var").getDouble("x13")));
        Principal.setText("Principal: " + "( " + vari.getBundle("var").getDouble("x5") + " *" + vari.getBundle("var").getDouble("x9") + " * " + vari.getBundle("var").getDouble("x13") + " )" + " + "
        + "( " + vari.getBundle("var").getDouble("x8") + " *" + vari.getBundle("var").getDouble("x12") + " * " + vari.getBundle("var").getDouble("x7") + " )" + " + "
        + "( " + vari.getBundle("var").getDouble("x11") + " *" + vari.getBundle("var").getDouble("x6") + " * " + vari.getBundle("var").getDouble("x10") + " )");
        ResulPrinci.setText("= " + vari.getDouble("Parte1"));
        Secundaria.setText("Secundaria: " + "( " + vari.getBundle("var").getDouble("x7") + " *" + vari.getBundle("var").getDouble("x9") + " * " + vari.getBundle("var").getDouble("x11") + " )" + " + "
                + "( " + vari.getBundle("var").getDouble("x10") + " *" + vari.getBundle("var").getDouble("x12") + " * " + vari.getBundle("var").getDouble("x5") + " )" + " + "
                + "( " + vari.getBundle("var").getDouble("x13") + " *" + vari.getBundle("var").getDouble("x6") + " * " + vari.getBundle("var").getDouble("x8") + " )");
        ResulSecun.setText("= " + vari.getDouble("Parte2"));
    }
    private void  Intancias(){

        X11_1 =  findViewById(R.id.X11_1);
        X12_1 =  findViewById(R.id.X12_1);
        X13_1 =  findViewById(R.id.X13_1);
        X5_2 =  findViewById(R.id.X5_2);
        X5_1 =  findViewById(R.id.X5_1);
        X6_2 =  findViewById(R.id.X6_2);
        X6_1 =  findViewById(R.id.X6_1);
        X7_2 =  findViewById(R.id.X7_2);
        X7_1 =  findViewById(R.id.X7_1);
        X8_2 =  findViewById(R.id.X8_2);
        X8_1 =  findViewById(R.id.X8_1);
        X9_2 =  findViewById(R.id.X9_2);
        X9_1 =  findViewById(R.id.X9_1);
        X10_2 =  findViewById(R.id.X10_2);
        X10_1 =  findViewById(R.id.X10_1);
        Principal =  findViewById(R.id.Principal);
        ResulPrinci =  findViewById(R.id.ResulPrinci);
        Secundaria =  findViewById(R.id.Secundaria);
        ResulSecun =  findViewById(R.id.ResulSecun);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
