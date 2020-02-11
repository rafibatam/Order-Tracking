package id.challenge.dreamspace.activitydayplans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import id.challenge.dreamspace.activitydayplans.AdapterGambar.AdapterImageCityCenterHighlights;
import id.challenge.dreamspace.activitydayplans.AdapterGambar.AdapterImageMainSights;
import id.challenge.dreamspace.activitydayplans.AdapterGambar.AdapterImageThreeDaysInParis;
import id.challenge.dreamspace.activitydayplans.Model.ImageCityCenterHighlights;
import id.challenge.dreamspace.activitydayplans.Model.ImageMainSightsPojo;
import id.challenge.dreamspace.activitydayplans.Model.ImageThreeDaysInParisPojo;

public class ActivityDayPlans extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView dropDownThreeDaysInParis, dropUpThreeDaysInParis, dropDownMainSights, dropUpMainSights, dropDownCityCenterHighlights, dropUpCityCenterHighlights;
    private RelativeLayout eiffelTowerRelative, theArcDeTriompheRelative, louvreRelative, versaillesRelative, orsayRelative, saintMaloRelative, disneyLandRelative, sieneRiverRelative, montmartreRelative;
    private RecyclerView recyclerViewThreeDaysInParis, recyclerViewMainSights, recyclerViewCityCenterHighlights;
    private ArrayList<ImageThreeDaysInParisPojo> imageThreeDaysInParisPojoArrayList;
    private ArrayList<ImageMainSightsPojo> imageMainSightsPojoArrayList;
    private ArrayList<ImageCityCenterHighlights> imageCityCenterHighlightsArrayList;
    private AdapterImageThreeDaysInParis adapterImageThreeDaysInParis;
    private AdapterImageMainSights adapterImageMainSights;
    private AdapterImageCityCenterHighlights adapterImageCityCenterHighlights;
    private TextView infoThreeDaysInParis, infoMainSights, infoCityCenterHighlights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_plans);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Day plans");

        // Initialize TextView Info
        infoThreeDaysInParis = findViewById(R.id.infoTextThreeDaysInParis);
        infoMainSights = findViewById(R.id.infoTextMainSights);
        infoCityCenterHighlights = findViewById(R.id.infoTextCityCenterHighlights);

        // Initialize ArrayList GambarPOJO
        imageThreeDaysInParisPojoArrayList = new ArrayList<>();
        imageMainSightsPojoArrayList = new ArrayList<>();
        imageCityCenterHighlightsArrayList = new ArrayList<>();

        // Initialize Adapter
        adapterImageThreeDaysInParis = new AdapterImageThreeDaysInParis(ActivityDayPlans.this, imageThreeDaysInParisPojoArrayList);
        adapterImageMainSights = new AdapterImageMainSights(ActivityDayPlans.this, imageMainSightsPojoArrayList);
        adapterImageCityCenterHighlights = new AdapterImageCityCenterHighlights(ActivityDayPlans.this, imageCityCenterHighlightsArrayList);

        // Relative Find Id
        disneyLandRelative = findViewById(R.id.parisDisneyLandRelative);
        sieneRiverRelative = findViewById(R.id.sieneRiverRelative);
        montmartreRelative = findViewById(R.id.montmartreRelativve);
        eiffelTowerRelative = findViewById(R.id.eiffelTowerRelative);
        theArcDeTriompheRelative = findViewById(R.id.ArcDeTriompheRelative);
        louvreRelative = findViewById(R.id.louvreRelative);
        versaillesRelative = findViewById(R.id.castleVersaillesRelative);
        orsayRelative = findViewById(R.id.orsayMuseumRelative);
        saintMaloRelative = findViewById(R.id.saintMaloRelative);

        // Arrow Drop Down and Drop Up Find Id
        dropDownThreeDaysInParis = findViewById(R.id.dropDownArrowThreeDaysInParis);
        dropUpThreeDaysInParis = findViewById(R.id.dropUpArrowThreeDaysInParis);
        dropDownMainSights = findViewById(R.id.dropDownArrowMainSights);
        dropUpMainSights = findViewById(R.id.dropUpArrowMainSights);
        dropDownCityCenterHighlights = findViewById(R.id.dropDownArrowCityCenterHighlights);
        dropUpCityCenterHighlights = findViewById(R.id.dropUpArrowCityCenterHighlights);

        // RecyclerView Find Id
        recyclerViewThreeDaysInParis = findViewById(R.id.recyclerViewThreeDaysInParis);
        recyclerViewMainSights = findViewById(R.id.recyclerViewMainSights);
        recyclerViewCityCenterHighlights = findViewById(R.id.recyclerViewCityCenterHighlights);

        // Drop Down Three Days In Paris onClick
        dropDownThreeDaysInParis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) infoThreeDaysInParis.getLayoutParams();
                layoutParams.addRule(RelativeLayout.START_OF, R.id.dropUpArrowThreeDaysInParis);
                dropDownThreeDaysInParis.setVisibility(View.GONE);
                disneyLandRelative.setVisibility(View.VISIBLE);
                sieneRiverRelative.setVisibility(View.VISIBLE);
                montmartreRelative.setVisibility(View.VISIBLE);
                dropUpThreeDaysInParis.setVisibility(View.VISIBLE);
            }
        });

        // Drop Down Main Sights onClick
        dropDownMainSights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) infoMainSights.getLayoutParams();
                layoutParams.addRule(RelativeLayout.START_OF, R.id.dropUpArrowMainSights);
                dropDownMainSights.setVisibility(View.GONE);
                eiffelTowerRelative.setVisibility(View.VISIBLE);
                theArcDeTriompheRelative.setVisibility(View.VISIBLE);
                louvreRelative.setVisibility(View.VISIBLE);
                dropUpMainSights.setVisibility(View.VISIBLE);
            }
        });

        // Drop Down Main Sights onClick
        dropDownCityCenterHighlights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) infoCityCenterHighlights.getLayoutParams();
                layoutParams.addRule(RelativeLayout.START_OF, R.id.dropUpArrowCityCenterHighlights);
                dropDownCityCenterHighlights.setVisibility(View.GONE);
                versaillesRelative.setVisibility(View.VISIBLE);
                orsayRelative.setVisibility(View.VISIBLE);
                saintMaloRelative.setVisibility(View.VISIBLE);
                dropUpCityCenterHighlights.setVisibility(View.VISIBLE);
            }
        });

        // Drop Up Three Days In Paris onClick
        dropUpThreeDaysInParis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) infoThreeDaysInParis.getLayoutParams();
                layoutParams.addRule(RelativeLayout.START_OF, R.id.dropUpArrowThreeDaysInParis);
                dropDownThreeDaysInParis.setVisibility(View.VISIBLE);
                disneyLandRelative.setVisibility(View.GONE);
                sieneRiverRelative.setVisibility(View.GONE);
                montmartreRelative.setVisibility(View.GONE);
                dropUpThreeDaysInParis.setVisibility(View.INVISIBLE);
            }
        });


        // Drop Up onClick Main Sights onClick
        dropUpMainSights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) infoMainSights.getLayoutParams();
                layoutParams.addRule(RelativeLayout.START_OF, R.id.dropUpArrowMainSights);
                dropDownMainSights.setVisibility(View.VISIBLE);
                eiffelTowerRelative.setVisibility(View.GONE);
                theArcDeTriompheRelative.setVisibility(View.GONE);
                louvreRelative.setVisibility(View.GONE);
                dropUpMainSights.setVisibility(View.INVISIBLE);
            }
        });

        // Drop Up onClick Main Sights onClick
        dropUpCityCenterHighlights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) infoCityCenterHighlights.getLayoutParams();
                layoutParams.addRule(RelativeLayout.START_OF, R.id.dropUpArrowCityCenterHighlights);
                dropDownCityCenterHighlights.setVisibility(View.VISIBLE);
                versaillesRelative.setVisibility(View.GONE);
                orsayRelative.setVisibility(View.GONE);
                saintMaloRelative.setVisibility(View.GONE);
                dropUpCityCenterHighlights.setVisibility(View.INVISIBLE);
            }
        });

        // Initialize RecyclerView Three Days In Paris
        recyclerViewThreeDaysInParis.setHasFixedSize(true);
        Integer[] imageThreeDaysInParis = {R.drawable.eiffel_tower, R.drawable.france_cathedral, R.drawable.france, R.drawable.france_morning, R.drawable.paris_street_coffee, R.drawable.notre_dame_paris, R.drawable.paris_street_summer};
        for (int a = 0; a < imageThreeDaysInParis.length; a++) {
            ImageThreeDaysInParisPojo imageThreeDaysInParisPojo = new ImageThreeDaysInParisPojo(imageThreeDaysInParis[a]);
            imageThreeDaysInParisPojoArrayList.add(imageThreeDaysInParisPojo);
        }
        recyclerViewThreeDaysInParis.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewThreeDaysInParis.setItemAnimator(new DefaultItemAnimator());
        recyclerViewThreeDaysInParis.setAdapter(adapterImageThreeDaysInParis);

        // RecyclerView Main Sights
        recyclerViewMainSights.setHasFixedSize(true);
        Integer[] imageMainSights = {R.drawable.paris_street_animation, R.drawable.paris_street, R.drawable.paris_night_street};
        for (int b = 0; b < imageMainSights.length; b++) {
            ImageMainSightsPojo imageMainSightsPojo = new ImageMainSightsPojo(imageMainSights[b]);
            imageMainSightsPojoArrayList.add(imageMainSightsPojo);
        }
        recyclerViewMainSights.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewMainSights.setItemAnimator(new DefaultItemAnimator());
        recyclerViewMainSights.setAdapter(adapterImageMainSights);

        // RecyclerView City Center Highlights
        recyclerViewCityCenterHighlights.setHasFixedSize(true);
        Integer[] imageCityCenterHighlights = {R.drawable.paris_center, R.drawable.paris_center_image, R.drawable.paris_city_center, R.drawable.paris_view_center};
        for (int c = 0; c < imageCityCenterHighlights.length; c++) {
            ImageCityCenterHighlights imageCityCenterHighlightsPojo = new ImageCityCenterHighlights(imageCityCenterHighlights[c]);
            imageCityCenterHighlightsArrayList.add(imageCityCenterHighlightsPojo);
        }
        recyclerViewCityCenterHighlights.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerViewCityCenterHighlights.setItemAnimator(new DefaultItemAnimator());
        recyclerViewCityCenterHighlights.setAdapter(adapterImageCityCenterHighlights);
    }

    // Calling menu three dots
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_more, menu);

        return super.onCreateOptionsMenu(menu);
    }
}
