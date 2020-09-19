package rdauncey.catanboardgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;

public class SeafarersMenu extends AppCompatActivity {
    private Button newShoresButton;
    private Button wondersButton;
    private Button forgottenTribeButton;
    private Button fourIslandsButton;
    private Button fogIslandButton;
    private Button newWorldButton;
    private Button desertButton;
    private Button clothButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seafarers_menu);
        getWindow().setEnterTransition(new Fade());
        getWindow().setExitTransition(new Fade());

        newShoresButton = findViewById(R.id.new_shores_button);
        wondersButton = findViewById(R.id.wonders_button);
        forgottenTribeButton = findViewById(R.id.forgotten_tribe_button);
        fourIslandsButton = findViewById(R.id.four_islands_button);
        fogIslandButton = findViewById(R.id.fog_island_button);
        newWorldButton = findViewById(R.id.new_button);
        desertButton = findViewById(R.id.desert_button);
        clothButton = findViewById(R.id.cloth_button);
    }

    public void goNewShores(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goWonders(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersWondersActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goForgottenTribe(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersTribeActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goFourIslands(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersFourActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goFogIsland(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersFogActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goNew(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersNewActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goDesert(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersDesertActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goCloth(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersClothActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}