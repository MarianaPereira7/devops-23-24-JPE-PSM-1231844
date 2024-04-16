package com.gregIturnquist.payroll;

import com.greglturnquist.payroll.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    @Test
    void whenSetValidJobYears_ThenGetJobYearsIsSuccessful() throws InstantiationException {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = "example@email.com";
        int jobYears = 0;

        Employee newEmployee = new Employee(firstName, lastName, description, jobYears, email);
        newEmployee.setJobYears(2);
        int expected = 2;

        //Act
        int result = newEmployee.getJobYears();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void createNewEmployee_whenResetInvalidJobYears_ThenGetJobYearsReturnsInitialValue() throws InstantiationException {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = "example@email.com";
        int jobYears = 3;

        Employee newEmployee = new Employee(firstName, lastName, description, jobYears, email);
        newEmployee.setJobYears(-22);
        int expected = 3;

        //Act
        int result = newEmployee.getJobYears();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetInvalidJobYears_ThenThrowsInstantiationException() throws InstantiationException {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = "example@email.com";
        int jobYears = -22;
        String expected = "Invalid employee data.";

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetNullFirstName_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = null;
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = "example@email.com";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetNullLastName_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = "Mariana";
        String lastName = null;
        String description = "Chemical Engineer";
        String email = "example@email.com";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetNullDescription_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = null;
        String email = "example@email.com";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetEmptyFirstName_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = " ";
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = "example@email.com";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetEmptyLastName_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = "Mariana";
        String lastName = " ";
        String description = "Chemical Engineer";
        String email = "example@email.com";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetEmptyDescription_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = " ";
        String email = "example@email.com";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetEmptyEmail_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = " ";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenSetNullEmail_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = null;
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenEmailWithoutSpecialCharacter_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = "exampleemail.com";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void whenEmailWithMoreThanOneSpecialCharacter_ThenThrowsInstantiationException() {
        //Arrange
        String firstName = "Mariana";
        String lastName = "Pereira";
        String description = "Chemical Engineer";
        String email = "exa@mple@email.com";
        String expected = "Invalid employee data.";
        int jobYears = 3;

        //Act
        Exception exception = assertThrows(InstantiationException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        String result = exception.getMessage();

        //Assert
        assertEquals(expected,result);
    }

}
