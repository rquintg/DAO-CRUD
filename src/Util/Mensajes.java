package Util;

import javax.swing.*;

public class Mensajes {

    public static void mostrarMensaje(String titulo, String msg, int tipo){
        JOptionPane.showMessageDialog(null, msg, titulo, tipo);
    }

    public static void mensajeError(String titulo, String msg){
        mostrarMensaje(titulo, msg,JOptionPane.ERROR_MESSAGE);
    }

    public static boolean mensajeConfirm(String titulo, String msg){
        JOptionPane jP = new JOptionPane();
        return JOptionPane.showConfirmDialog(null, msg, titulo, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
}
