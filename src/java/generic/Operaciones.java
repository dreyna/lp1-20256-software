/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package generic;

import java.util.List;

/**
 *
 * @author docente.fia
 * @param <T>
 */
public interface Operaciones<T> {
    int create(T t);
    int update(T t);
    int delete(int id);
    T read(int id);
    List<T> readAll();
}
