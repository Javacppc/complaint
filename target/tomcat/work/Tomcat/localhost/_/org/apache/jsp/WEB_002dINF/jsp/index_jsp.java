/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-23 11:19:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>12315投诉举报处理系统</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-easyui-1.4.1/themes/default/easyui.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-easyui-1.4.1/themes/icon.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-easyui-1.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-easyui-1.4.1/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("      <div data-options=\"region:'north'\" style=\"height:100px\">\r\n");
      out.write("            <img  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/12315tsjb.jpg\" style=\"height:97%;width:100%\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div data-options=\"region:'west',title:'后台管理',split:'true'\" style=\"width: 20%\">\r\n");
      out.write("           <div class=\"easyui-accordion\" data-options=\"fit:true,border:false\">\r\n");
      out.write("               ");
      if (_jspx_meth_auth_005fhasPermission_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_auth_005fhasPermission_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           </div>\r\n");
      out.write("      </div>\r\n");
      out.write("       <div data-options=\"region:'center'\" style=\"width:80%\">\r\n");
      out.write("            <div class=\"easyui-tabs\" data-options=\"border:false\" style=\"width: 100%;height:100%\" id=\"tabs-Easyui\">\r\n");
      out.write("                  <div data-options=\"title:'首页'\" style=\"background-size:100%,97%\">\r\n");
      out.write("                  </div>\r\n");
      out.write("            </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("\t      $(function(){\r\n");
      out.write("\t          $(\"#tree-Easyui\").tree({\r\n");
      out.write("\t               onClick:function(node){\r\n");
      out.write("\t                    //console.info(node);\r\n");
      out.write("\t                    //判断节点是否是叶子结点\r\n");
      out.write("\t                    var isLeaf = $(\"#tree-Easyui\").tree(\"isLeaf\",node.target);\r\n");
      out.write("\t                    if (!isLeaf) {\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (node.attributes==null||node.attributes.url==null) {\r\n");
      out.write("\t\t\t\t\t\t\t$.messger.alert(\"警告\",\"此功能正在开发中\");\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar url = node.attributes.url;\r\n");
      out.write("\t\t\t\t\t\tvar inMainTabs = $(\"#tabs-Easyui\").tabs(\"exists\",node.text);\r\n");
      out.write("\t\t\t\t\t\tif (inMainTabs) {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#tabs-Easyui\").tabs(\"select\",node.text);\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t    $(\"#tabs-Easyui\").tabs(\"add\",{\r\n");
      out.write("\t\t\t\t\t\t           title:node.text,\r\n");
      out.write("\t\t\t\t\t\t        closable:true,\r\n");
      out.write("\t\t\t\t\t\t         content:\"<iframe src='\"+url+\"'style='width:1022px;height:416px'/>\"\r\n");
      out.write("\t\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t               }\r\n");
      out.write("\t          });\r\n");
      out.write("\t          $(\"#atree-Easyui\").tree({\r\n");
      out.write("\t               onClick:function(node){\r\n");
      out.write("\t                    console.info(node);\r\n");
      out.write("\t                    //判断节点是否是叶子结点\r\n");
      out.write("\t                    var isLeaf = $(\"#tree-Easyui\").tree(\"isLeaf\",node.target);\r\n");
      out.write("\t                    if (!isLeaf) {\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (node.attributes==null||node.attributes.url==null) {\r\n");
      out.write("\t\t\t\t\t\t\t$.messger.alert(\"警告\",\"此功能正在开发中\");\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar url = node.attributes.url;\r\n");
      out.write("\t\t\t\t\t\tvar inMainTabs = $(\"#tabs-Easyui\").tabs(\"exists\",node.text);\r\n");
      out.write("\t\t\t\t\t\tif (inMainTabs) {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#tabs-Easyui\").tabs(\"select\",node.text);\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t    $(\"#tabs-Easyui\").tabs(\"add\",{\r\n");
      out.write("\t\t\t\t\t\t           title:node.text,\r\n");
      out.write("\t\t\t\t\t\t        closable:true,\r\n");
      out.write("\t\t\t\t\t\t         content:\"<iframe src='\"+url+\"'style='width:100%;height:97%'/>\"\r\n");
      out.write("\t\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t               }\r\n");
      out.write("\t          });\r\n");
      out.write("\t      });\r\n");
      out.write("      </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_auth_005fhasPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  auth:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_auth_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_auth_005fhasPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fhasPermission_005f0.setParent(null);
    // /WEB-INF/jsp/index.jsp(21,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fhasPermission_005f0.setName("系统管理");
    int _jspx_eval_auth_005fhasPermission_005f0 = _jspx_th_auth_005fhasPermission_005f0.doStartTag();
    if (_jspx_eval_auth_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                <div title=\"系统管理\">\r\n");
        out.write("\t                     <ul id=\"tree-Easyui\" class=\"easyui-tree\">\r\n");
        out.write("\t                         <li data-options=\"attributes:{url:'/company/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>单位管理</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/dept/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>部门管理</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/user/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>人员管理</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/role/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>角色管理</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/module/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>权限管理</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/report/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>公告管理</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t                     </ul>\r\n");
        out.write("\t                </div>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_auth_005fhasPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_auth_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f0);
    return false;
  }

  private boolean _jspx_meth_auth_005fhasPermission_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  auth:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_auth_005fhasPermission_005f1 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_auth_005fhasPermission_005f1.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fhasPermission_005f1.setParent(null);
    // /WEB-INF/jsp/index.jsp(45,16) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fhasPermission_005f1.setName("业务");
    int _jspx_eval_auth_005fhasPermission_005f1 = _jspx_th_auth_005fhasPermission_005f1.doStartTag();
    if (_jspx_eval_auth_005fhasPermission_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<div title=\"业务管理\">\r\n");
        out.write("\t\t\t\t\t<ul id=\"atree-Easyui\" class=\"easyui-tree\">\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_auth_005fhasPermission_005f2(_jspx_th_auth_005fhasPermission_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_auth_005fhasPermission_005f3(_jspx_th_auth_005fhasPermission_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_auth_005fhasPermission_005f4(_jspx_th_auth_005fhasPermission_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_auth_005fhasPermission_005f5(_jspx_th_auth_005fhasPermission_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_auth_005fhasPermission_005f6(_jspx_th_auth_005fhasPermission_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_auth_005fhasPermission_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_auth_005fhasPermission_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f1);
    return false;
  }

  private boolean _jspx_meth_auth_005fhasPermission_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_auth_005fhasPermission_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  auth:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_auth_005fhasPermission_005f2 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_auth_005fhasPermission_005f2.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fhasPermission_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_auth_005fhasPermission_005f1);
    // /WEB-INF/jsp/index.jsp(48,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fhasPermission_005f2.setName("登记");
    int _jspx_eval_auth_005fhasPermission_005f2 = _jspx_th_auth_005fhasPermission_005f2.doStartTag();
    if (_jspx_eval_auth_005fhasPermission_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/register/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>受理员登记</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_auth_005fhasPermission_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_auth_005fhasPermission_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f2);
    return false;
  }

  private boolean _jspx_meth_auth_005fhasPermission_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_auth_005fhasPermission_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  auth:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_auth_005fhasPermission_005f3 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_auth_005fhasPermission_005f3.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fhasPermission_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_auth_005fhasPermission_005f1);
    // /WEB-INF/jsp/index.jsp(53,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fhasPermission_005f3.setName("审核");
    int _jspx_eval_auth_005fhasPermission_005f3 = _jspx_th_auth_005fhasPermission_005f3.doStartTag();
    if (_jspx_eval_auth_005fhasPermission_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/review/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>案件审核与分流</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_auth_005fhasPermission_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_auth_005fhasPermission_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f3);
    return false;
  }

  private boolean _jspx_meth_auth_005fhasPermission_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_auth_005fhasPermission_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  auth:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_auth_005fhasPermission_005f4 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_auth_005fhasPermission_005f4.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fhasPermission_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_auth_005fhasPermission_005f1);
    // /WEB-INF/jsp/index.jsp(58,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fhasPermission_005f4.setName("反馈");
    int _jspx_eval_auth_005fhasPermission_005f4 = _jspx_th_auth_005fhasPermission_005f4.doStartTag();
    if (_jspx_eval_auth_005fhasPermission_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/feedback/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>办理员反馈</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_auth_005fhasPermission_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_auth_005fhasPermission_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f4);
    return false;
  }

  private boolean _jspx_meth_auth_005fhasPermission_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_auth_005fhasPermission_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  auth:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_auth_005fhasPermission_005f5 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_auth_005fhasPermission_005f5.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fhasPermission_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_auth_005fhasPermission_005f1);
    // /WEB-INF/jsp/index.jsp(63,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fhasPermission_005f5.setName("查询");
    int _jspx_eval_auth_005fhasPermission_005f5 = _jspx_th_auth_005fhasPermission_005f5.doStartTag();
    if (_jspx_eval_auth_005fhasPermission_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/query/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>投诉举报查询</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_auth_005fhasPermission_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_auth_005fhasPermission_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f5);
    return false;
  }

  private boolean _jspx_meth_auth_005fhasPermission_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_auth_005fhasPermission_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  auth:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_auth_005fhasPermission_005f6 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_auth_005fhasPermission_005f6.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fhasPermission_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_auth_005fhasPermission_005f1);
    // /WEB-INF/jsp/index.jsp(68,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fhasPermission_005f6.setName("报表");
    int _jspx_eval_auth_005fhasPermission_005f6 = _jspx_th_auth_005fhasPermission_005f6.doStartTag();
    if (_jspx_eval_auth_005fhasPermission_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<li data-options=\"attributes:{url:'/statis/'}\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>报表统计</span>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_auth_005fhasPermission_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_auth_005fhasPermission_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fauth_005fhasPermission_0026_005fname.reuse(_jspx_th_auth_005fhasPermission_005f6);
    return false;
  }
}
