package com.example.AlmacenMotocicletas.DTOs;

import com.mongodb.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotBlank;

@Validated
public class MotocicletaDTO {

    @NotBlank
    private String id;
    @NotBlank
    private String marca;
    @NotBlank
    private String linea;
    @NotBlank
    private String modelo;
    @NotBlank
    private String cilindraje;
    @NotBlank
    private String valor;
    @NotBlank
    private String color;
    @NotBlank
    private String imagen;

    //Builder
    public MotocicletaDTO(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
