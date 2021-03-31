package com.kar.steps.SnakeYMLRead;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class DbClass {

    public static void main(String[] args) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream("src/test/resources/products.yml");

        HashMap yamlMap = yaml.load(inputStream);

        System.out.println(yamlMap.keySet().toString());

        Stream.of(yamlMap.keySet().toString())
                .forEach(System.out::println);

        // Access HashMaps and ArrayList by key(s)
        HashMap products = (HashMap) yamlMap.get("products");
        HashMap product = (HashMap) products.get("ProductA");
        HashMap suite = (HashMap) product.get("suite");
        HashMap suiteName = (HashMap) suite.get("SuiteName_B");
        ArrayList environment = (ArrayList) suiteName.get("environment_1");
        System.out.println("Environment_1::::::::::::"+environment);
    }
}