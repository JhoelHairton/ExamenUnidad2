/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Daou;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.coon1.ConnSc;
import pe.edu.upeu.modelo1.ResultadoTOA;

/**
 *
 * @author Usuario
 */
public class ResultadoDaou implements ResultadoDaoIu{
    ConnSc intance=ConnSc.getInstance();
    Connection conexion=intance.getConnection();
    PreparedStatement ps;
    ResultSet rs; 
            
    @Override
    public List listarResultados() {
        List<ResultadoTOA> lista=new ArrayList();
        String sql="select * from resultados";
        try {
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                   ResultadoTOA to=new ResultadoTOA();
                   to.setIdResultado(rs.getInt("id_resultado"));
                   to.setNombrepartida(rs.getString("nombre_partida"));
                   to.setNombrejugador1(rs.getString("nombre_jugador1"));
                   to.setNombrejugador2(rs.getString("nombre_jugador2"));
                   to.setGanador(rs.getString("ganador"));
                   to.setPunto(rs.getInt("punto"));
                   to.setEstado(rs.getString("estado"));
            }
            
        } catch (Exception e) {
        }
        return lista;
    }
    @Override
  
    public int crearResultado(ResultadoTOA re) {
        int exec=0;
        int i=0;
        String sql="insert into resultados(nombre_jugador1, nombre_jugador2)" 
                + "values(?,?)";
        try {
            ps=conexion.prepareStatement(sql);
            ps.setString(++i, re.getNombrejugador1());
            ps.setString(++i, re.getNombrejugador2());
            exec=ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return exec;
    }
    
    
    
}
