package rdauncey.catanboardgenerator;

public class BlockType {
    public String name;
    public String colour;
    public int count;
    public char type;

    BlockType(String name, String colour, int count, Character type) {
        this.name = name;
        this.colour = colour;
        this.count = count;
        this.type = type;
    }
}
