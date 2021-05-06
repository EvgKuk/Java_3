public class Test2 {
    @BeforeSuite
    public void taskBefore() {
        System.out.println(getClass().getSimpleName() + " before");
    }

    @Test(priority = 2)
    public void task1() {
        System.out.println(getClass().getSimpleName() + " task1");
    }

    @Test(priority = 9)
    public void task2() {
        System.out.println(getClass().getSimpleName() + " task2");
    }

    @Test(priority = 8)
    public void task3() {
        System.out.println(getClass().getSimpleName() + " task3");
    }

    @Test(priority = 1)
    public void task4() {
        System.out.println(getClass().getSimpleName() + " task3");
    }

}
