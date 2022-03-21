public class Ball{
String colour;
int size;
String material;
String game;

public Ball(String colour, int size, String material, String game) {
    this.colour = colour;
    this.size = size;
    this.material = material;
    this.game = game;
}

@Override
public String toString() {
    return "Ball [colour=" + colour + ", game=" + game + ", material=" + material + ", size=" + size + "]";
}

public String getColour() {
    return colour;
}

public void setColour(String colour) {
    this.colour = colour;
}

public int getSize() {
    return size;
}

public void setSize(int size) {
    this.size = size;
}

public String getMaterial() {
    return material;
}

public void setMaterial(String material) {
    this.material = material;
}

public String getGame() {
    return game;
}

public void setGame(String game) {
    this.game = game;
}
static Ball b1=new Ball("white",180,"Rubber","Football");
static Ball b2=new Ball("Red",180,"Rubber","cricket");

public static void main(String[] args){
    b1.setMaterial("plastic");
    System.out.println(b1.getColour());
    System.out.println(b1.toString()); //it converts object into String
    System.out.println(b2.toString());
}
}














