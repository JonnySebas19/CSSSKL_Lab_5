import java.util.Objects;

public class ColorWithAlpha extends SimpleColor{
    private int alpha; // Invariant: Will be [0,225]
    public ColorWithAlpha(int newAlpha){
        super();

        if (newAlpha < 0 || newAlpha > 225){
            throw new ColorException();
        } else {
            this.alpha = newAlpha;
        }
    }
    public ColorWithAlpha(int R, int G, int B, int A){
        super(R, G, B);
        // We are initializing the colors in the SimpleColor class to these variables
        // This calls the constructor os it still goes through the color exception.

        if (A < 0 || A > 225){
            throw new ColorException();
        } else {
            this.alpha = A;
        }
    }
    public ColorWithAlpha(ColorWithAlpha obj){
        super(obj.getR(), obj.getG(), obj.getB());

        if (obj.alpha < 0 || obj.alpha > 225) {
            throw new ColorException();
        } else {
            this.alpha = obj.alpha;
        }
    }
    public int getAlpha(){
        return alpha;
    }
    public void setAlpha(int newAlpha){
        if (newAlpha < 0 || newAlpha > 225){
            throw new ColorException();
        } else {
            this.alpha = newAlpha;
        }
    }
    @Override
    public String toString(){
        return super.toString() + ", Alpha = " + alpha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()){
            return false;
        }


        ColorWithAlpha that = (ColorWithAlpha) o;

        return alpha == that.alpha
                && super.equals(that);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alpha);
    }
}
