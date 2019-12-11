import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class RoverKataTest {
    @Test
    void it_should_move_forward_from00() {
        Rover.Position position  = new Rover.Position(0,0);
        Rover.Heading  heading = Rover.Heading.NORTH;
        Rover          rover     = new Rover(position, heading);
        Rover.Position newPosition = rover.moveForward();

        assertThat(newPosition.x).isEqualTo(0);
        assertThat(newPosition.y).isEqualTo(1);
    }
    @Test
    void it_should_move_forward_from01() {
        Rover.Position position  = new Rover.Position(0,1);
        Rover.Heading  heading = Rover.Heading.NORTH;
        Rover          rover     = new Rover(position, heading);
        Rover.Position newPosition = rover.moveForward();

        assertThat(newPosition.x).isEqualTo(0);
        assertThat(newPosition.y).isEqualTo(2);
    }
    @Test
    void it_should_move_forward_to_east() {
        Rover.Position position  = new Rover.Position(0,0);
        Rover.Heading  heading = Rover.Heading.EAST;
        Rover          rover     = new Rover(position, heading);
        Rover.Position newPosition = rover.moveForward();

        assertThat(newPosition.x).isEqualTo(1);
        assertThat(newPosition.y).isEqualTo(0);
    }
    @Test
    void it_should_move_forward_to_west() {
        Rover.Position position  = new Rover.Position(0,0);
        Rover.Heading  heading = Rover.Heading.WEST;
        Rover          rover     = new Rover(position, heading);
        Rover.Position newPosition = rover.moveForward();

        assertThat(newPosition.x).isEqualTo(-1);
        assertThat(newPosition.y).isEqualTo(0);
    }
    @Test
    void it_should_move_forward_to_south() {
        Rover.Position position  = new Rover.Position(0,0);
        Rover.Heading  heading = Rover.Heading.SOUTH;
        Rover          rover     = new Rover(position, heading);
        Rover.Position newPosition = rover.moveForward();

        assertThat(newPosition.x).isEqualTo(0);
        assertThat(newPosition.y).isEqualTo(-1);
    }

    @Test
    void it_should_move_backward_from_00() {
        Rover.Position position  = new Rover.Position(0,0);
        Rover.Heading  heading = Rover.Heading.NORTH;
        Rover          rover     = new Rover(position, heading);
        Rover.Position newPosition = rover.moveBackward();

        assertThat(newPosition.x).isEqualTo(0);
        assertThat(newPosition.y).isEqualTo(-1);
    }
    @Test
    void it_should_turn_left_from_north() {
        Rover.Position position  = new Rover.Position(0,0);
        Rover.Heading  heading = Rover.Heading.NORTH;
        Rover          rover     = new Rover(position, heading);
        Rover.Heading newHeading = rover.turnLeft();

        assertThat(newHeading).isEqualTo(Rover.Heading.WEST);
    }

    @Test
    void it_should_turn_left_from_west() {
        Rover.Position position  = new Rover.Position(0,0);
        Rover.Heading  heading = Rover.Heading.WEST;
        Rover          rover     = new Rover(position, heading);
        Rover.Heading newHeading = rover.turnLeft();

        assertThat(newHeading).isEqualTo(Rover.Heading.SOUTH);
    }
}
