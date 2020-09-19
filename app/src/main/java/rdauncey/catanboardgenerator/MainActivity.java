package rdauncey.catanboardgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button classicButton;
    private Button extensionButton;
    private Button seafarersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setEnterTransition(new Fade());
        getWindow().setExitTransition(new Fade());

        classicButton = findViewById(R.id.classic_button);
        extensionButton = findViewById(R.id.extension_button);
        seafarersButton = findViewById(R.id.seafarers_button);
    }

    public void goClassic(View view) {
        Intent intent = new Intent(view.getContext(), StandardActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goExtension(View view) {
        Intent intent = new Intent(view.getContext(), ExtensionActivity.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void goSeafarers(View view) {
        Intent intent = new Intent(view.getContext(), SeafarersMenu.class);
        view.getContext().startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}