/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import com.google.gson.Gson;
import config.Conexion;
import dao.ProductoDao;
import daoImpl.ProductoDaoImpl;
import model.Producto;

/**
 *
 * @author docente.fia
 */
public class Test {
private static ProductoDao pdao = new ProductoDaoImpl();
private static Gson gson = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        update();
    }
    
    public static void conex(){
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }
    }
    
    public static void insertar(){
        System.out.println(pdao.create(new Producto(0,"Imprsora HP","Mutifuncional",750,5)));
    }
     public static void update(){
        System.out.println(pdao.update(new Producto(5,"Impresora Cannon","Mutifuncional",850,10)));
    }
     public static void delete(){
        System.out.println(pdao.delete(1));
    }
      public static void read(){
        System.out.println(gson.toJson(pdao.read(2)));
    }
       public static void readll(){
        System.out.println(gson.toJson(pdao.readAll()));
    }
    
    
}
