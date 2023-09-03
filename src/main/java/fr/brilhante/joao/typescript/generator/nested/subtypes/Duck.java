package fr.brilhante.joao.typescript.generator.nested.subtypes;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Duck extends Bird {

    private String color;

    public Duck(String name, int age, String color) {
        super(name, age, true, true);
        this.color = color;
    }

}
