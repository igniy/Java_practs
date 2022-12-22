package mirea.newpract13;

public class Shirt {
    String name;
    String color;
    String size;
    String id;

    public Shirt(String name, String color, String size, String id) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.id = id;
    }

    public static Shirt fromString(String str) {
        String[] arr = str.split(",");
        return new Shirt(arr[1], arr[2], arr[3], arr[0]);
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append("{ name: \"")
                .append(name)
                .append("\", color: \"")
                .append(color)
                .append("\", size: \"")
                .append(size)
                .append("\", id: \"")
                .append(id)
                .append("\" }")
                .toString();
    }
    public static void main(String[] args) {
        String[] shirtsStr = new String[11];
        shirtsStr[0] = "S001,Black Polo Shirt,Black,XL";
        shirtsStr[1] = "S002,Black Polo Shirt,Black,L";
        shirtsStr[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirtsStr[3] = "S004,Blue Polo Shirt,Blue,M";
        shirtsStr[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirtsStr[5] = "S006,Black T-Shirt,Black,XL";
        shirtsStr[6] = "S007,White T-Shirt,White,XL";
        shirtsStr[7] = "S008,White T-Shirt,White,L";
        shirtsStr[8] = "S009,Green T-Shirt,Green,S";
        shirtsStr[9] = "S010,Orange T-Shirt,Orange,S";
        shirtsStr[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirts = new Shirt[11];
        for (int i = 0; i < shirtsStr.length; i++) {
            shirts[i] = Shirt.fromString(shirtsStr[i]);
        }

        for (Shirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
}
