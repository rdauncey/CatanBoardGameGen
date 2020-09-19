package rdauncey.catanboardgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SeafarersDesertActivity extends AppCompatActivity {

    public static BoardType board = new BoardType("s-desert");
    public static int blockCount = board.boardSize;
    private BlockType brick = new BlockType("brick", "#bf5600", board.blockCounts.get("brick"), 'b');
    private BlockType stone = new BlockType("stone", "#9c9c9c", board.blockCounts.get("stone"), 's');
    private BlockType wood = new BlockType("wood", "#075e14", board.blockCounts.get("wood"), 'w');
    private BlockType wheat = new BlockType("wheat", "#ffdd00", board.blockCounts.get("wheat"), 'h');
    private BlockType sheep = new BlockType("sheep", "#34eb3a", board.blockCounts.get("sheep"), 'f');
    private BlockType desert = new BlockType("desert", "#ffd699", board.blockCounts.get("desert"), 'd');
    private BlockType gold = new BlockType("gold", "#ffd699", board.blockCounts.get("gold"), 'g');
    private BlockType[] blockTypes = {brick, stone, wood, wheat, sheep, desert, gold};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seafarers_desert);
        getWindow().setEnterTransition(new Fade());
        getWindow().setExitTransition(new Fade());
        drawBoardInitial();
    }

    private void drawBoardInitial() {
        for (int i = 1; i <= blockCount; i++) {
            TextView textView = findViewById(getResources().getIdentifier("text" + i, "id",
                    this.getPackageName()));
            textView.setText(" ");
            ImageView imageView = findViewById(getResources().getIdentifier("block" + i, "id",
                    this.getPackageName()));
            imageView.setBackground(getResources().getDrawable(R.drawable.hexagon));
        }
    }

    public void drawHex(int position, Character t, int number) {

        TextView textView = findViewById(getResources().getIdentifier("text" + position, "id",
                this.getPackageName()));
        textView.setTypeface(textView.getTypeface(), Typeface.BOLD);

        if (number == 0) {
            textView.setText("");
        }
        else if (number == 6 || number == 8) {
            textView.setText(String.format("%d", number));
            textView.setTextColor(Color.RED);
        }
        else {
            textView.setText(String.format("%d", number));
            textView.setTextColor(Color.BLACK);
        }

        ImageView imageView = findViewById(getResources().getIdentifier("block" + position, "id",
                this.getPackageName()));

        switch (t) {
            case 'b':   imageView.setBackground(getResources().getDrawable(R.drawable.brick_hex));
                break;
            case 's':   imageView.setBackground(getResources().getDrawable(R.drawable.stone_hex));
                break;
            case 'w':   imageView.setBackground(getResources().getDrawable(R.drawable.wood_hex));
                break;
            case 'f':   imageView.setBackground(getResources().getDrawable(R.drawable.sheep_hex));
                break;
            case 'h':   imageView.setBackground(getResources().getDrawable(R.drawable.wheat_hex));
                break;
            case 'd':   imageView.setBackground(getResources().getDrawable(R.drawable.desert_hex));
                break;
            case 'g':   imageView.setBackground(getResources().getDrawable(R.drawable.gold_hex));
                break;
        }

    }

    public void generateBoard(View view) {
        // Generate set of blocks
        List<BlockType> blocks = new ArrayList<>();

        for (BlockType blockType : blockTypes) {
            for (int i = 0; i < blockType.count; i++) {
                blocks.add(blockType);
            }
        }

        //Allow ourselves to generate random numbers
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>(board.boardNumbers);

        for (int j = 1; j <= blockCount; j++) {

            int blockIndex = random.nextInt(blocks.size());
            BlockType block = blocks.get(blockIndex);

            if (block.name.contentEquals("desert")) {
                drawHex(j, block.type, 0);
                blocks.remove(blockIndex);
            }

            else if (block.name.contentEquals("gold")) {

                //Check it is possible to not give a 6 or an 8
                int eightsCount = Collections.frequency(numbers, 8);
                int sixesCount = Collections.frequency(numbers, 6);
                if (numbers.size() == (eightsCount + sixesCount)) {
                    //If not possible, regenerate board
                    generateBoard(findViewById(R.id.generate));
                    return;
                }

                boolean numberChosen = false;
                while (!numberChosen) {
                    int numberIndex = random.nextInt(numbers.size());
                    int number = numbers.get(numberIndex);
                    if (number != 6 && number != 8) {
                        drawHex(j, block.type, number);
                        blocks.remove(blockIndex);
                        numbers.remove(numberIndex);
                        numberChosen = true;
                    }
                }
            }
            else {
                int numberIndex = random.nextInt(numbers.size());
                int number = numbers.get(numberIndex);
                drawHex(j, block.type, number);
                blocks.remove(blockIndex);
                numbers.remove(numberIndex);
            }
        }
    }
}