/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cruddao;

import Model.Conexion;

public class CrudDAO {

    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        System.out.println(conexion.getCon());
    }
    
}
