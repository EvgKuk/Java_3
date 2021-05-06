import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        start(Test1.class);
        System.out.println();
        start(Test2.class);
        System.out.println();
    }

    public static void start(Class c) throws Exception {
        Method[] methods = c.getDeclaredMethods();
        int bsCount = 0, asCount = 0;
        List<Method> tests = new ArrayList<>();

        /* Проверка на наличие только одного After и Before Suite.
            Добавление серии тестов в ArrayList/ */

        for (Method o : methods) {
            String type = o.getDeclaredAnnotations()[0].annotationType().getSimpleName();
            if (type.equals("BeforeSuite")) {
                bsCount++;
                if (bsCount > 1) throw new RuntimeException("Допустимо использовать" +
                                                                "только 1 экземпляр метода BeforeSuite");
            } else if (type.equals("AfterSuite")) {
                asCount++;
                if (asCount > 1) throw new RuntimeException("Допустимо использовать" +
                                                                "только 1 экземпляр метода AfterSuite");
            } else if (type.equals("Test")) {
                tests.add(o);
            }
        }

        /* Сортировка тестов по приоритету/ */

        tests.sort((o1, o2) -> o1.getAnnotation(Test.class).priority() - o2.getAnnotation(Test.class).priority());

        /* Добавление BeforeSuite в начале и AfterSuite в конце тестов./ */

        for (Method o : methods) {
            String type = o.getDeclaredAnnotations()[0].annotationType().getSimpleName();
            if (type.equals("BeforeSuite")) {
                tests.add(0, o);
            }
            if (type.equals("AfterSuite")) {
                tests.add(o);
            }
        }

        /* Показ информации и запуск тестов./ */
        for (Method i : tests) {
            try {
                System.out.print("(" + i.getDeclaredAnnotation(Test.class).priority() + ") ");
            } catch (NullPointerException e) {
            }
            i.invoke(c.newInstance(), null);
        }
    }

    public static void start(String className) {
        try {
            Class<?> c = Class.forName(className);
            Constructor<?> constructor = c.getConstructor(null);
            start(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
