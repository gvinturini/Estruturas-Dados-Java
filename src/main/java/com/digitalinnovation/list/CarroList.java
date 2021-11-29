package com.digitalinnovation.list;

import com.digitalinnovation.queue.CarroQueue;

import java.util.Objects;

public class CarroList {

    String marca;

    public String getMarca() {
        return marca;
    }

    public CarroList(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroList carro = (CarroList) o;
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
}
