package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @org.junit.jupiter.api.Test
 void checkIn_room_should_be_occupied_and_dirty(){
   //arrange
        Room room = new Room(2,340);
    boolean occupied = true;
    boolean dirty = true;
//act
        room.checkIn();
        // assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

}