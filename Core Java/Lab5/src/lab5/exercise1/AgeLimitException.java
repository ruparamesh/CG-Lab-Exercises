package lab5.exercise1;

public class AgeLimitException extends Exception {

int age;
AgeLimitException(int age) {
    this.age =age;
}

public String toString() {
    return "Your age is: "+age+". It should be above 15";
}

}

