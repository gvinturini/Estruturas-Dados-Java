package com.digitalinnovation.stack;

import com.digitalinnovation.equalshashcode.Carro;

import java.util.Objects;

public class CarroStack {

    String marca;

    public String getMarca() {
        return marca;
    }

    public CarroStack(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroStack carro = (CarroStack) o;
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
