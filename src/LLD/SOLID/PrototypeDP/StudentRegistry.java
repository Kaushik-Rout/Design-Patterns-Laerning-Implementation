package LLD.SOLID.PrototypeDP;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentMap = new HashMap<>();

    public void registry(String key, Student student) {
        studentMap.put(key,student);
    }

    public Student get(String key) {
        return studentMap.get(key);
    }
}
