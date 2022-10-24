

class Room {
    int height, width, breadth;

    public Room(int p, int q, int r) {
        height = p;
        width = q;
        breadth = r;
    }

    public int volume() {
        return height * width * breadth;
    }
}

class RoomDemo {
    public static void main(String[] args) {
        Room r = new Room(1, 2, 3);
        System.out.println("Volume : "+ r.volume());
    }
}