/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11_ejercicio_3;

import java.util.Objects;

/**
 *
 * @author Alumno
 * @param <K>
 * @param <V>
 */
public class OrderedPair<K,V > implements Pair<K,V> {
    
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Contacto{" + "DNI=" + key + ", Dato=" + value + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    
    
}
