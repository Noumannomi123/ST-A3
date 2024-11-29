import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTesting {
    private LoginApp loginApp = new LoginApp();

    @Test
    public void test_case_1() {
        String inputEmail = "johndoe@example.com"; // correct email
        String inputPassword = "password123"; //
        String expectedResult = "John Doe";
        String actualResult = loginApp.authenticateUser(inputEmail, inputPassword);
        assertEquals("Test Case 1 Failed", expectedResult, actualResult);
        System.out.println("Test Case 1 Passed");
    }

    @Test
    public void test_case_2() {
        String inputEmail = "notexist@example.com";  // Non-existent email
        String inputPassword = "password123";  // Any password
        String expectedResult = null;  // No user found
        String actualResult = loginApp.authenticateUser(inputEmail, inputPassword);
        assertEquals("Test Case 2 Failed: Non-existent email should result in null", expectedResult, actualResult);
        System.out.println("Test Case 2 Passed");
    }

    @Test
    public void test_case_3() {
        String inputEmail = "johndoe@example.com";
        String inputPassword = "wrongpassword";  // Incorrect password
        String expectedResult = null;  // User not found due to wrong password
        String actualResult = loginApp.authenticateUser(inputEmail, inputPassword);
        assertEquals("Test Case 3 Failed: Incorrect password should result in null", expectedResult, actualResult);
        System.out.println("Test Case 3 Passed");
    }

    @Test
    public void test_case_4() {
        String inputEmail = "johndoe@example.com";
        String inputPassword = "";  // Empty password
        String expectedResult = null;  // User not found due to missing password
        String actualResult = loginApp.authenticateUser(inputEmail, inputPassword);
        assertEquals("Test Case 4 Failed: Empty password should result in null", expectedResult, actualResult);
        System.out.println("Test Case 4 Passed");
    }

    @Test
    public void test_case_5() {
        String inputEmail = "";  // Empty email
        String inputPassword = "password123";  // Valid password
        String expectedResult = null;  // User not found due to missing email
        String actualResult = loginApp.authenticateUser(inputEmail, inputPassword);
        assertEquals("Test Case 5 Failed: Empty email should result in null", expectedResult, actualResult);
        System.out.println("Test Case 5 Passed");
    }

}