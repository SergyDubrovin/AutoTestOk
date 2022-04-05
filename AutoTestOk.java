public class AutoTestOk {
    @org.junit.Test
    public void test() {
        open("https://ok.ru");
        User user = new User("Ivan Ivanov", "IvanVanonv", "jVmGqW");
        LoginPage loginPage = new loginPage();
        MainPage mainPage = new MainPage();
        loginPage.authorization(user);
        try {
            assertEquals(mainPage.getFullName(), user.getFullName());
        } catch (Exception e) {
            System.out.println("Incorrect username and/or password");
        }
    }
}
