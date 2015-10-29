package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tlds/tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_partidos_championscasa_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_partidos_ligacasa_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_partidos_ligafuera_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_partidos_championsfuera_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_partidos_championscasa_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_partidos_ligacasa_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_partidos_ligafuera_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_partidos_championsfuera_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_partidos_championscasa_nobody.release();
    _jspx_tagPool_partidos_ligacasa_nobody.release();
    _jspx_tagPool_partidos_ligafuera_nobody.release();
    _jspx_tagPool_partidos_championsfuera_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Resultados Real Madrid</title>\r\n");
      out.write("    <style>\r\n");
      out.write("      table {\r\n");
      out.write("        border: 2px solid darkblue;\r\n");
      out.write("        border-collapse: collapse;\r\n");
      out.write("        margin: auto;\r\n");
      out.write("      }\r\n");
      out.write("      td.titulo {\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        border-bottom: 4px solid darkblue;\r\n");
      out.write("        background-color: lightblue;\r\n");
      out.write("      }\r\n");
      out.write("      td.seccion {\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("        border-bottom: 2px solid darkblue;\r\n");
      out.write("        background-color: lightblue;\r\n");
      out.write("      }\r\n");
      out.write("      td.apartado {\r\n");
      out.write("        text-align: left;\r\n");
      out.write("        border-bottom: 2px solid darkblue;\r\n");
      out.write("        background-color: lightblue;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <table>\r\n");
      out.write("      <tr><td class=\"titulo\" colspan=\"3\">RESULTADOS DE LA SEMANA</td></tr>\r\n");
      out.write("      <tr><td class=\"seccion\" colspan=\"3\">CHAMPIONS</td></tr>\r\n");
      out.write("      <tr><td class=\"apartado\" colspan=\"3\">CASA</td></tr>\r\n");
      out.write("      ");
      if (_jspx_meth_partidos_championscasa_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <tr><td class=\"apartado\" colspan=\"3\">FUERA</td></tr>\r\n");
      out.write("      ");
      if (_jspx_meth_partidos_championsfuera_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <tr><td class=\"seccion\" colspan=\"3\">LIGA</td></tr>\r\n");
      out.write("      <tr><td class=\"apartado\" colspan=\"3\">CASA</td></tr>\r\n");
      out.write("      ");
      if (_jspx_meth_partidos_ligacasa_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <tr><td class=\"apartado\" colspan=\"3\">FUERA</td></tr>\r\n");
      out.write("      ");
      if (_jspx_meth_partidos_ligafuera_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_partidos_championscasa_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  partidos:championscasa
    tags.ChampionsCasa _jspx_th_partidos_championscasa_0 = (tags.ChampionsCasa) _jspx_tagPool_partidos_championscasa_nobody.get(tags.ChampionsCasa.class);
    _jspx_th_partidos_championscasa_0.setPageContext(_jspx_page_context);
    _jspx_th_partidos_championscasa_0.setParent(null);
    int _jspx_eval_partidos_championscasa_0 = _jspx_th_partidos_championscasa_0.doStartTag();
    if (_jspx_th_partidos_championscasa_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_partidos_championscasa_nobody.reuse(_jspx_th_partidos_championscasa_0);
      return true;
    }
    _jspx_tagPool_partidos_championscasa_nobody.reuse(_jspx_th_partidos_championscasa_0);
    return false;
  }

  private boolean _jspx_meth_partidos_championsfuera_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  partidos:championsfuera
    tags.ChampionsFuera _jspx_th_partidos_championsfuera_0 = (tags.ChampionsFuera) _jspx_tagPool_partidos_championsfuera_nobody.get(tags.ChampionsFuera.class);
    _jspx_th_partidos_championsfuera_0.setPageContext(_jspx_page_context);
    _jspx_th_partidos_championsfuera_0.setParent(null);
    int _jspx_eval_partidos_championsfuera_0 = _jspx_th_partidos_championsfuera_0.doStartTag();
    if (_jspx_th_partidos_championsfuera_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_partidos_championsfuera_nobody.reuse(_jspx_th_partidos_championsfuera_0);
      return true;
    }
    _jspx_tagPool_partidos_championsfuera_nobody.reuse(_jspx_th_partidos_championsfuera_0);
    return false;
  }

  private boolean _jspx_meth_partidos_ligacasa_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  partidos:ligacasa
    tags.LigaCasa _jspx_th_partidos_ligacasa_0 = (tags.LigaCasa) _jspx_tagPool_partidos_ligacasa_nobody.get(tags.LigaCasa.class);
    _jspx_th_partidos_ligacasa_0.setPageContext(_jspx_page_context);
    _jspx_th_partidos_ligacasa_0.setParent(null);
    int _jspx_eval_partidos_ligacasa_0 = _jspx_th_partidos_ligacasa_0.doStartTag();
    if (_jspx_th_partidos_ligacasa_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_partidos_ligacasa_nobody.reuse(_jspx_th_partidos_ligacasa_0);
      return true;
    }
    _jspx_tagPool_partidos_ligacasa_nobody.reuse(_jspx_th_partidos_ligacasa_0);
    return false;
  }

  private boolean _jspx_meth_partidos_ligafuera_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  partidos:ligafuera
    tags.LigaFuera _jspx_th_partidos_ligafuera_0 = (tags.LigaFuera) _jspx_tagPool_partidos_ligafuera_nobody.get(tags.LigaFuera.class);
    _jspx_th_partidos_ligafuera_0.setPageContext(_jspx_page_context);
    _jspx_th_partidos_ligafuera_0.setParent(null);
    int _jspx_eval_partidos_ligafuera_0 = _jspx_th_partidos_ligafuera_0.doStartTag();
    if (_jspx_th_partidos_ligafuera_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_partidos_ligafuera_nobody.reuse(_jspx_th_partidos_ligafuera_0);
      return true;
    }
    _jspx_tagPool_partidos_ligafuera_nobody.reuse(_jspx_th_partidos_ligafuera_0);
    return false;
  }
}
