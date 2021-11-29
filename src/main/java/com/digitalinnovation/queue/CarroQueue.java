package com.digitalinnovation.queue;

import com.digitalinnovation.stack.CarroStack;

import java.util.Objects;

public class CarroQueue {

    String marca;

    public String getMarca() {
        return marca;
    }

    public CarroQueue(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroQueue carro = (CarroQueue) o;
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
