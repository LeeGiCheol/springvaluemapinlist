package com.example.springvaluemapinlist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Runner implements ApplicationRunner {

    @Value("#{${myMapProperties}}")
    private Map<String, List<String>> myMapProperties;

    private final Map<String, List<String>> myMapYml = new HashMap<>();

    public Runner(Map<String, List<String>> myMapProperties) {
        this.myMapProperties = myMapProperties;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Set<String> myMapPropertiesKeys = myMapProperties.keySet();
        for (String myMapPropertiesKey : myMapPropertiesKeys) {
            System.out.println("myMapPropertiesKey = " + myMapPropertiesKey);
            System.out.println("myMapProperties.get(myMapPropertiesKey) = " + myMapProperties.get(myMapPropertiesKey));
        }

        Set<String> myMapYmlKeys = myMapYml.keySet();
        for (String myMapYmlKey : myMapYmlKeys) {
            System.out.println("myMapYmlKey = " + myMapYmlKey);
            System.out.println("myMapYml.get(myMapYmlKey) = " + myMapYml.get(myMapYmlKey));
        }
    }
}
