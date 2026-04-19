package crudstreaming;

import java.sql.*;

public class ServicioDAO {

    public void crear(ServicioStreaming s) {
        try (Connection con = Conexion.conectar()) {
            String sql = "INSERT INTO servicio (nombre, tipo, precio) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getNombre());
            ps.setString(2, s.getTipo());
            ps.setDouble(3, s.getPrecio());
            ps.executeUpdate();
            System.out.println("Servicio agregado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leer() {
        try (Connection con = Conexion.conectar()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicio");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("nombre") + " | " +
                    rs.getString("tipo") + " | $" +
                    rs.getDouble("precio")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizar(int id, double precio) {
        try (Connection con = Conexion.conectar()) {
            String sql = "UPDATE servicio SET precio=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Actualizado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        try (Connection con = Conexion.conectar()) {
            String sql = "DELETE FROM servicio WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Eliminado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}