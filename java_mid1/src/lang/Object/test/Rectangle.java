package lang.Object.test;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    //내가 구현한 equals
    /*@Override
    public boolean equals(Object obj) {
        Rectangle rec = (Rectangle) obj;
        boolean result = (width == ((Rectangle) obj).width) && (height == ((Rectangle) obj).height);
        return result;
    }*/

    //정확한 equals 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public String toString() {
        return "Rectangle"+"{width = "+this.width+", height = "+this.height+"}";
    }
}
