package enum_boiler;

public enum EnumBoiler {
    UNIQUE_INSTANCE;

    private boolean empty;
    private boolean boiled;

    // enum's constructor is private default
    EnumBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            // add milk and chocolate mixture to boiler
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // bring boiled ingredients to the next level
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // boil ingredients
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }
}