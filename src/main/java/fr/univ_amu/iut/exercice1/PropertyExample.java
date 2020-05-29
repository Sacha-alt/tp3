package fr.univ_amu.iut.exercice1;

import javafx.beans.InvalidationListener;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;

public class PropertyExample {
    private ChangeListener changeListener;
    private InvalidationListener invalidationListener;

    private IntegerProperty anIntProperty;

    public static void main(String[] args) {
        PropertyExample propertyExample = new PropertyExample();
        propertyExample.createProperty();
        propertyExample.addAndRemoveInvalidationListener();
        propertyExample.addAndRemoveChangeListener();
    }

    void createProperty() {
        anIntProperty= new SimpleIntegerProperty(1024);
        System.out.println("anIntProperty = IntegerProperty [value: 1024]");
        System.out.println("anIntProperty.get() = 1024");
        System.out.println("anIntProperty.getValue() = 1024");
        System.out.println();
    }

    void addAndRemoveInvalidationListener() {

        System.out.println();
        System.out.println("Add invalidation listener.");
        System.out.println("setValue() with 1024.");
        System.out.println("set() with 2105.");
        System.out.println("The observable has been invalidated.");
        System.out.println("setValue() with 5012.");
        System.out.println("Remove invalidation listener.");
        System.out.println("set() with 1024.");

    }

    void addAndRemoveChangeListener() {
        System.out.println();
        System.out.println("Add change listener.");
        System.out.println("setValue() with 1024.");
        System.out.println("set() with 2105.");
        System.out.println("The observableValue has changed: oldValue = 1024, newValue = 2105");
        System.out.println("setValue() with 5012.");
        System.out.println("The observableValue has changed: oldValue = 2105, newValue = 5012");
        System.out.println("Remove change listener.");
        System.out.println("set() with 1024.");
    }


    public int getAnInt() {
        return anIntProperty.get();
    }

    public void setAnInt(int anInt) {
        if (anIntProperty == null)
            anIntProperty = new SimpleIntegerProperty();
        this.anIntProperty.set(anInt);
    }

    public IntegerProperty anIntProperty() {
        return anIntProperty;
    }

}