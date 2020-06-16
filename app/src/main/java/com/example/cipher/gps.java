package com.example.cipher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import java.util.Locale;

public class gps extends AppCompatActivity {

    TextView locationtxt;
    Button bt;
    Double latitude = 0.0;
    Double longitude = 0.0;
    static String TAG="MainActivity";
    Location gps_loc = null, network_loc=null, final_loc=null;
    private LocationListener locationListener;
    private LocationManager locationManager;
    private final long MIN_TIME = 1000;// 1 second
    private final long MIN_DIST = 0; // meters

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.btn);
        Intent intent = getIntent();

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, PackageManager.PERMISSION_GRANTED);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, PackageManager.PERMISSION_GRANTED);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, PackageManager.PERMISSION_GRANTED);
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.INTERNET},PackageManager.PERMISSION_GRANTED);

        locationtxt=findViewById(R.id.locationtxt);
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this,"not granted",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Granted",Toast.LENGTH_SHORT).show();
        }
        try{
            gps_loc = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            network_loc=locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(gps_loc != null){
            final_loc=gps_loc;
            latitude=final_loc.getLatitude();
            longitude=final_loc.getLongitude();
        }
        else if(network_loc != null){
            final_loc=network_loc;
            latitude=final_loc.getLatitude();
            longitude=final_loc.getLongitude();
        }
        else{
            latitude=0.0;
            longitude=0.0;
        }

        try{
            Geocoder geocoder=new Geocoder(getApplicationContext(), Locale.getDefault());
            List<Address> addresses=geocoder.getFromLocation(latitude,longitude,1);
            if(addresses!=null && addresses.size()>0){
                final String address =addresses.get(0).getAddressLine(0);
                final String city=addresses.get(0).getLocality();
                final String state=addresses.get(0).getAdminArea();
                final String country=addresses.get(0).getCountryName();
                final String postal_code = addresses.get(0).getPostalCode();
                final String Namu=addresses.get(0).getFeatureName();
                final Double la=addresses.get(0).getLatitude();
                final Double lo=addresses.get(0).getLongitude();

                locationtxt.setText("address =" +address+"\n\n" +
                        "city = " +city+"\n\n" +
                        "state =" +state+"\n\n" +
                        "country =" +country+"\n\n" +
                        "postal_code" +postal_code+"\n\n" +
                        "Namu ji" +Namu +
                        "\n\n\n\n" + "longitude = " + lo +
                        "\n" + "latitude = " + la);

                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String p1 = "+8123457";
                        String message = "address =" +address+"\n\n" +
                                "city = " +city+"\n\n" +
                                "state =" +state+"\n\n" +
                                "country =" +country+"\n\n" +
                                "postal_code" +postal_code+"\n\n" +
                                "Namu ji" +Namu +
                                "\n\n\n\n" + "longitude = " + lo +
                                "\n" + "latitude = " + la;

                        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                        sendIntent.putExtra("address", p1);
                        sendIntent.putExtra("sms_body", message );
                        sendIntent.setType("vnd.android-dir/mms-sms");
                        startActivity(sendIntent);
                        finish();
                    }
                });
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
