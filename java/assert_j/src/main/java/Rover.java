public class Rover {


    private final Position position;
    private final Heading  heading;

    public Rover(Position position, Heading heading) {
        this.position = position;
        this.heading  = heading;
    }

    public Position moveForward() {
        return new Position(this.position.x + heading.deltaX,
                            this.position.y + heading.deltaY);
    }

    public Position moveBackward() {
        return new Position(this.position.x - heading.deltaX,
                            this.position.y - heading.deltaY);
    }

    public Heading turnLeft() {
        if (heading == Heading.NORTH) return Heading.WEST;
        if (heading == Heading.WEST) return Heading.SOUTH;
        return null;
    }

    public enum Heading {
        NORTH(0, 1),
        EAST(1, 0),
        SOUTH(0, -1),
        WEST(-1, 0);

        int deltaX;
        int deltaY;

        Heading(int deltaX, int deltaY) {

            this.deltaX = deltaX;
            this.deltaY = deltaY;
        }

//        public Heading left(){
//            this.
//        }
    }

    public static class Position {
        final int x;
        final int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}

