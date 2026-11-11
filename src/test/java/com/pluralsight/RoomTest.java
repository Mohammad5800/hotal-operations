package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void checkInShouldOccupyAndDirtyRoom() {

        Room room = new Room(2, 150.00, false, false);

        room.checkIn();

        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkOutShouldMakeRoomNotOccupied() {

        Room room = new Room(2, 150.00, false, false);

        room.checkIn();
        room.checkOut();

        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoomShouldMakeRoomClean() {

        Room room = new Room(2, 150.00,false, true);

        room.cleanRoom();

        assertFalse(room.isDirty());
    }
}
