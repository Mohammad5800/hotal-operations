package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void punchOutShouldCalculateHourWorked() {

        Employee employee =
                new Employee(
                        1,
                        "Tayeb",
                        "Fornt Desk",
                        20.00,
                        0

                );
        employee.punchIn(8);
        employee.punchOut(16);

        assertEquals(8,employee.getHoursWorked());
    }
}
