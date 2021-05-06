public class Test1 {
    @BeforeSuite
    public void taskBefore() {
        System.out.println(getClass().getSimpleName() + " before");
    }

    @Test(priority = 10)
    public void task1() {
        System.out.println(getClass().getSimpleName() + " task1");
    }

    @Test(priority = 3)
    public void task2() {
        System.out.println(getClass().getSimpleName() + " task2");
    }

    @Test(priority = 4)
    public void task3() {
        System.out.println(getClass().getSimpleName() + " task3");
    }

    @Test(priority = 3)
    public void task4() {
        System.out.println(getClass().getSimpleName() + " task3");
    }

    @AfterSuite
    public void taskAfter() {
        System.out.println(getClass().getSimpleName() + " after");
    }



//    @AfterSuite
//    public void taskAfter1() {
//        System.out.println(getClass().getSimpleName() + " after");
//    }

    //              Выполнение кода taskAfter1() выбросит Exeption
    //    - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //      Exception in thread "main" java.lang.RuntimeException:
    //      Допустимо использоватьтолько 1 экземпляр метода AfterSuite
    //      	at Main.start(Main.java:30)
    //      	at Main.main(Main.java:8)
    //    - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
}
