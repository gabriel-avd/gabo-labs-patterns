package com.gabo.labs.creational.builder;

public class Usuario {
    private String nombre;
    private String apellido;

    private String email;
    private String telefono;
    private String direccion;

    private String metodoPago;
    private String token;

    private boolean medioContacto;


    private Usuario(String nombre,
                    String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static Usuario make(String nombre,
                               String apellido) {
        return new Usuario(nombre, apellido);
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.medioContacto + " " + this.email + " " + this.telefono
                + " " + this.direccion + " " + this.metodoPago + " " + this.token;
    }

    public BuilderUsuario setMedioContacto(boolean medioContacto) {
        this.medioContacto = medioContacto;

        if (!medioContacto) {
            throw new IllegalArgumentException("No se puede setear false el medio de contacto");
        }
        return new BuilderUsuario(this);
    }

    public static class BuilderUsuario {
        private Usuario usuario;

        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }

        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }

        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public BuilderMetodoPago setMetodoPago(String metodoPago) {
            if (usuario.direccion == null || usuario.telefono == null || usuario.email == null ||
                    usuario.direccion.isEmpty() || usuario.telefono.isEmpty() || usuario.email.isEmpty()) {
                throw new IllegalArgumentException("Email, Direccion o Telefono vacios");
            }
            usuario.metodoPago = metodoPago;
            return new BuilderMetodoPago(this.usuario);
        }

        public Usuario build() {
            return this.usuario;
        }
    }

    public static class BuilderMetodoPago {
        private Usuario usuario;

        public BuilderMetodoPago(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderMetodoPago setToken(String token) {
            usuario.token = token;

            return this;
        }

        public Usuario build() {
            return this.usuario;
        }
    }


}
