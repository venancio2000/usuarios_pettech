package br.com.fiap.api.usuarios_pettech.controller.exception;

public class ControllerNotFoundExeption extends  RuntimeException {
    public ControllerNotFoundExeption(String message) {
        super(message);
    }
}
