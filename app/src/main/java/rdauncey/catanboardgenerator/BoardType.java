package rdauncey.catanboardgenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardType {

    public String type;
    public int boardSize;
    public Map<String, Integer> blockCounts;
    public List<Integer> boardNumbers;

    BoardType(String type) {
        this.type = type;
        this.create();
    }

    private void create() {
        if (type.contentEquals("extension")) {
            // Number of blocks on the board
            this.boardSize = 30;

            // The set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 8,
                    8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12));

            // Load the counts of each type into the hash map
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 5);
            this.blockCounts.put("stone", 5);
            this.blockCounts.put("wood", 6);
            this.blockCounts.put("wheat", 6);
            this.blockCounts.put("sheep", 6);
            this.blockCounts.put("desert", 2);
        }

        else if (type.contentEquals("seafarers")) {
            // Number of blocks on the board (42 including sea?)
            this.boardSize = 27;

            // The set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 8,
                    8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12));

            // Load the counts of each type into the hash map
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 4);
            this.blockCounts.put("stone", 5);
            this.blockCounts.put("wood", 5);
            this.blockCounts.put("wheat", 5);
            this.blockCounts.put("sheep", 5);
            this.blockCounts.put("desert", 1);
            this.blockCounts.put("gold", 2);
        }

        else if (type.contentEquals("s-cloth")) {
            //Number of blocks: 24, but 4 are fixed (2 deserts, 2 gold fields)
            this.boardSize = 20;
            //Set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 8, 9, 9,
                    10, 10, 11, 11, 12, 12));
            //Block counts
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 3);
            this.blockCounts.put("stone", 4);
            this.blockCounts.put("wood", 4);
            this.blockCounts.put("wheat", 4);
            this.blockCounts.put("sheep", 5);
        }

        else if (type.contentEquals("s-four")) {
            // Number of blocks
            this.boardSize = 23;

            // Set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 8, 8,
                    9, 9, 9, 10, 10, 10, 11, 11, 12));

            // Load counts of types
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 4);
            this.blockCounts.put("stone", 4);
            this.blockCounts.put("wood", 4);
            this.blockCounts.put("wheat", 5);
            this.blockCounts.put("sheep", 4);
            this.blockCounts.put("desert", 2);
        }

        else if (type.contentEquals("s-fog")) {
            // Number of blocks
            this.boardSize = 15;

            // Set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 4, 5, 6, 6, 8, 8,
                    9, 9, 10, 11, 12));

            // Load counts of types
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 3);
            this.blockCounts.put("stone", 3);
            this.blockCounts.put("wood", 3);
            this.blockCounts.put("wheat", 3);
            this.blockCounts.put("sheep", 3);
        }

        else if (type.contentEquals("s-desert")) {
            // Number of blocks
            this.boardSize = 28;

            // Set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 8, 8, 8,
                    9, 9, 9, 10, 10, 10, 11, 11, 11, 12));

            // Load counts of types
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 5);
            this.blockCounts.put("stone", 4);
            this.blockCounts.put("wood", 5);
            this.blockCounts.put("wheat", 5);
            this.blockCounts.put("sheep", 4);
            this.blockCounts.put("desert", 3);
            this.blockCounts.put("gold", 2);
        }

        else if (type.contentEquals("s-tribe")) {
            // Number of blocks
            this.boardSize = 18;

            // Set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 8,
                    9, 9, 10, 10, 11, 11, 12));

            // Load counts of types
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 3);
            this.blockCounts.put("stone", 3);
            this.blockCounts.put("wood", 4);
            this.blockCounts.put("wheat", 4);
            this.blockCounts.put("sheep", 4);
        }

        else if (type.contentEquals("s-wonders")) {
            // Number of blocks
            this.boardSize = 27;

            // Set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 8, 8, 8,
                    9, 9, 9, 10, 10, 10, 11, 11, 11, 12));

            // Load counts of types
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 5);
            this.blockCounts.put("stone", 5);
            this.blockCounts.put("wood", 5);
            this.blockCounts.put("wheat", 5);
            this.blockCounts.put("sheep", 5);
            this.blockCounts.put("gold", 2);
        }

        else if (type.contentEquals("s-new")) {
            // Number of blocks
            this.boardSize = 42;

            // Set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 8, 8,
                    9, 9, 9, 10, 10, 10, 11, 11, 12));

            // Load counts of types
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 4);
            this.blockCounts.put("stone", 4);
            this.blockCounts.put("wood", 5);
            this.blockCounts.put("wheat", 5);
            this.blockCounts.put("sheep", 5);
            this.blockCounts.put("sea", 19);
        }

        //Set standard as default
        else {
            // Number of blocks on the board
            this.boardSize = 19;

            // The set of number tokens
            this.boardNumbers = new ArrayList<>(Arrays.asList(2, 3, 3, 4, 4, 5, 5, 6, 6, 8,
                    8, 9, 9, 10, 10, 11, 11, 12));

            // Load the counts of each type into the hash map
            this.blockCounts = new HashMap<>();
            this.blockCounts.put("brick", 3);
            this.blockCounts.put("stone", 3);
            this.blockCounts.put("wood", 4);
            this.blockCounts.put("wheat", 4);
            this.blockCounts.put("sheep", 4);
            this.blockCounts.put("desert", 1);
        }

    }
}
