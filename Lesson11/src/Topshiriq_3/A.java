package Topshiriq_3;

import java.util.Objects;

public abstract class A {
    public  int age;
      public abstract int getAge();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return getAge() == a.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }
}
