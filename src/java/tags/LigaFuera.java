/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author alumno
 */
public class LigaFuera extends TagSupport {
  private ListaResultados partidos;
  
  @Override
  public int doStartTag() throws JspTagException {
    this.partidos = new ListaResultados("LIGA", "FUERA");
    return EVAL_BODY_INCLUDE;
  }
  
  @Override
  public int doEndTag() throws JspTagException {
    try {
      pageContext.getOut().write(this.partidos.htmlListado());
      return EVAL_PAGE;
    } catch (SQLException | IOException ex) {
      Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
      return SKIP_PAGE;
    }
  }
}
