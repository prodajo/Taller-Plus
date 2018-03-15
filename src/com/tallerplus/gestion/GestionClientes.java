package com.tallerplus.gestion;

import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Ficheros;
import com.tallerplus.objetos.Coche;

public class GestionClientes {

    /**
     * Añade un cliente al ArrayList de clientes que recibe y lo devuelve
     *
     * @param matricula matricula del vehiculo a reparar
     * @param motor tipo de combustible, diesel o gasolina
     * @param cilindrada cilindrada del vehiculo en cuestion
     * @param caballos potencia del vehiculo expresada en caballos de vapor
     * @param nombreDueño nombre del propietario del vehiculo
     * @param dni numero de identificacion personal del dueño del vehiculo
     * @param telefono telefono de contacto del dueño del vehiculo
     */
    public static boolean anadirCliente(String matricula, String motor, String cilindrada, String caballos, String nombreDueño, String dni, String telefono) {
        boolean encontrado = false;
        for (int i = 0; i < Ficheros.coches.size(); i++) {
            if (Ficheros.coches.get(i).getMatricula().equals(matricula)) {
                Mensajes.ventanaError("El cliente introducido ya existe.", "Gestión de clientes.");
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            Ficheros.coches.add(new Coche(matricula, motor, cilindrada, caballos, nombreDueño, telefono, dni));
            Mensajes.ventanaInfo("Cliente introducido con éxito", "Gestión de clientes.");
            Ficheros.escribirFicheroCoches();
        }

        return encontrado;
    }

    /**
     * Elimina un vehiculo de la lista de vehiculos que tenemos en el taller
     *
     * @param matricula matricula del vehiculo a eliminar
     * @param eb le indica si estamos modificando o borrando al cliente
     */
    public static void borrarCliente(String matricula, String eb) {
        boolean borrado = false; // indicador de borrado que solo salta a true en caso de que se encuentre el coche, posteriormente trataremos que no se encuentre con el 
        for (int i = 0; i < Ficheros.coches.size(); i++) {
            if (Ficheros.coches.get(i).getMatricula().equals(matricula)) {
                Ficheros.coches.remove(i);
                borrado = true;
                break;
            }

        }
        if (borrado == true) {
            Ficheros.escribirFicheroCoches();
            if (eb.equals("borrar")) {
                Mensajes.ventanaInfo("Cliente borrado", "Gestión de clientes.");
            }
        } else {
            Mensajes.ventanaError("No se ha encontrado al cliente a eliminar.", "Gestión de clientes.");
        }
    }
    
    /**
     * Edita los parámetros de un cliente en concreto.
     * @param numero Número de la posición del cliente en el ArrayList coches.
     * @param matricula Matrícula a insertar en el cliente indicado.
     * @param motor Motor a insertar en el cliente indicado.
     * @param cilindrada Cilindrada a insertar en el cliente indicado.
     * @param caballos Caballos a insertar en el cliente indicado.
     * @param nombreDueño Nombre del dueño a insertar en el cliente indicado.
     * @param dni DNI a insertar en el cliente indicado.
     * @param telefono Teléfono a insertar en el cliente indicado.
     * @return true si se ha editado el cliente.
     */
    public static boolean editarCliente(int numero, String matricula, String motor, String cilindrada, String caballos, String nombreDueño, String telefono, String dni) {
        boolean editado = false;
        Ficheros.coches.set(numero, new Coche(matricula, motor, cilindrada, caballos, nombreDueño, telefono, dni));
        editado = true;

        Ficheros.escribirFicheroUsuarios();

        return editado;
    }

}
