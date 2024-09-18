
class Train {
    // public int reservation;
    // public int age;
    public int id, seat;

    Train() {
        this.id = 123;
        this.seat = 100;
    }

    public Train(int id, int seat) {
        this.id = id;
        this.seat = seat;
    }

    public void display() {
        System.out.println("TRAIN ID-" + id + "\n" + "SEATS-" + seat);
    }
}
