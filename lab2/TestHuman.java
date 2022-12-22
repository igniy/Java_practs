package mirea.lab2;

public class TestHuman {
    public static void main(String[] agrs){
        Human woman = new Human(171, 58, 18,"Tatiyana");
        System.out.println(woman);
        Hand hand = new Hand(1,2);
        hand.raise();
        hand.raise();
        System.out.println(hand);
        Legs legs = new Legs(5,4);
        legs.moveForward();
        System.out.println(legs);
        Head head = new Head("brown","brown","front");
        head.turnRight();
        System.out.println(head);
    }
}
