package fr.brilhante.joao.typescript.generator.nested.subtypes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Animal animal = new Cat("Garfield", 10, "Persian", "Lasagna", Collections.emptyList());
            System.out.println("Original: " + animal);
            String serializedAnimal = mapper.writeValueAsString(animal);
            System.out.println("Serialized: " + serializedAnimal);
            Animal deserializedAnimal = mapper.readValue(serializedAnimal, Animal.class);
            System.out.println("Deserialized: " +deserializedAnimal);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
