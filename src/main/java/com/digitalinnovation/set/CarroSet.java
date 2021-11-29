package com.digitalinnovation.set;

import com.digitalinnovation.list.CarroList;

import java.util.Objects;

public class CarroSet implements Comparable<CarroSet> {

    String marca;

    public String getMarca() {
        return marca;
    }

    public CarroSet(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroSet carro = (CarroSet) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "CarroStack{" +
                "marca='" + marca + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(CarroSet o) {
//        if (this.marca.length() < o.marca.length()) {
//            return -1;
//        } else if (this.marca.length() > o.marca.length()) {
//            return 1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(CarroSet o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}
