/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.sql.*;

/**
 *
 * @author alumno
 */
public class ListaResultados  {
  private String categoria;
  private String lugar;
  public ListaResultados(String categoria, String lugar) {
    this.categoria = categoria.toUpperCase();
    this.lugar = lugar.toUpperCase();
  }
  
  private ResultSet obtenerResultados() throws SQLException {
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    Connection conexion = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:XE", "system", "javaoracle");
    
    String query = "SELECT EQUIPO1, EQUIPO2, RESULTADO FROM RESULTADOS_RM WHERE"
        + " CATEGORIA = ? AND LUGAR = ?";
    PreparedStatement sql = conexion.prepareStatement(query);
    sql.setString(1, this.categoria);
    sql.setString(2, this.lugar);
    return sql.executeQuery();
  }
  
  public String htmlListado() throws SQLException {
    String html = "<tr><td class='etiqueta'>Equipo1</td><td class='etiqueta'>"
        + "Equipo2</td><td class='etiqueta'>Resultados</td></tr>";
    ResultSet partido = obtenerResultados();
    while (partido.next()) {
      html += String.format("<tr><td class='dato'>%s</td><td class='dato'>%s"
          + "</td><td class='dato'>%s</td></tr>", partido.getString("EQUIPO1"),
          partido.getString("EQUIPO2"), partido.getString("RESULTADO"));
    }
    return html;
  }
}
