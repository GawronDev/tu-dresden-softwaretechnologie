package drinks;

public class Bottle<D extends Drink> {
    private D content = null;

    public boolean isEmpty() {
        return content == null;
    }

    public void fill(D drink) {
        if (drink == null) {
            throw new IllegalArgumentException();
        }
        if (content != null) {
            throw new IllegalStateException();
        }
        content = drink;
    }

    public D empty() {
        if (content == null) {
            throw new IllegalStateException();
        }
        D drink = content;
        content = null;
        return drink;
    }
}
