/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import config.Conexion;
import dao.ProductoDao;
import java.util.List;
import model.Producto;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author docente.fia
 */
public class ProductoDaoImpl implements ProductoDao{
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;
    

    @Override
    public int create(Producto t) {
        String SQL_CREATE_PROD ="insert into producto (nombre, descripcion,precio,stock) values(?,?,?,?)";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_CREATE_PROD);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getDescripcion());
            ps.setDouble(3, t.getPrecio());
            ps.setInt(4, t.getStock());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int update(Producto t) {
        String SQL_CREATE_PROD ="UPDATE producto set nombre=?, descripcion=?, precio=?, stock=? where id=?";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_CREATE_PROD);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getDescripcion());
            ps.setDouble(3, t.getPrecio());
            ps.setInt(4, t.getStock());
            ps.setInt(5, t.getId());
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        String SQL_DELETE_PROD ="DELETE FROM producto where id=?";
        int x = 0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_DELETE_PROD);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public Producto read(int id) {
        String SQL_RED_PROD ="SELECT *FROM producto WHERE id=?";
        Producto p = new Producto();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_RED_PROD);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return p;
    }

    @Override
    public List<Producto> readAll() {
        String SQL_TODO_PROD ="SELECT *FROM producto";
        List<Producto> lista = new ArrayList();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_TODO_PROD);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}
