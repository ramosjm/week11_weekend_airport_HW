public enum PlaneType {
    BOING747(366),
    BOING767(181),
    BOING777(451),
    BOING787(290),
    AIRBUSA300(266),
    AIRBUSA310(220),
    AIRBUSA330(335);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

}
