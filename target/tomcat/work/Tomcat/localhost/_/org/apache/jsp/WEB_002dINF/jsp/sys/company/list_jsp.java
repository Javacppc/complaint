/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-23 11:33:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.sys.company;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//已定义校验\r\n");
      out.write("\t$.extend($.fn.validatebox.defaults.rules, {    \r\n");
      out.write("\t    valDefaultOption : {    \r\n");
      out.write("\t        validator: function(value,param){\r\n");
      out.write("\t        \tif(value == \"--请选择--\"){\r\n");
      out.write("\t        \t\treturn false;\r\n");
      out.write("\t        \t}else{\r\n");
      out.write("\t        \t\treturn true;\r\n");
      out.write("\t        \t} \r\n");
      out.write("\t        },\r\n");
      out.write("\t        message: \"请选择有效的项目\"\r\n");
      out.write("\t    }\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t//创建表格\r\n");
      out.write("\t\t$(\"#mytable\").datagrid({\r\n");
      out.write("\t\t\turl:\"/company/list\",\r\n");
      out.write("\t\t\ttitle:\"单位管理\",\r\n");
      out.write("\t\t\trownumbers:true,\r\n");
      out.write("\t\t\tfit:true,//自适应\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\tsingleSelect : false,\r\n");
      out.write("\t\t\tcollapsible:true,\r\n");
      out.write("\t\t\tborder:false,\r\n");
      out.write("\t\t\t//显示在前台的域\r\n");
      out.write("\t\t    columns:[[\r\n");
      out.write("\t\t    \t{field:\"checkbox\",checkbox:true,width:\"10px\"},\r\n");
      out.write("\t\t        {field:\"companyid\",title:\"单位编号\",width:\"25%\"},    \r\n");
      out.write("\t\t        {field:\"companyname\",title:\"单位名称\",width:\"25%\"},\r\n");
      out.write("\t\t        {field:\"admindivi\",title:\"行政区划号码\",width:\"25%\"},\r\n");
      out.write("\t\t        {field:\"comlevel\",title:\"单位级别\",width:\"25%\",formatter:function(value, row, index) {\r\n");
      out.write("\t\t        \tif (value == 1) {\r\n");
      out.write("\t\t        \t\treturn \"市级\";\r\n");
      out.write("\t\t        \t} else if (value == 2) {\r\n");
      out.write("\t\t        \t\treturn \"区级\";\r\n");
      out.write("\t\t        \t} else if (value == 3) {\r\n");
      out.write("\t\t        \t\treturn \"局级\";\r\n");
      out.write("\t\t        \t}\r\n");
      out.write("\t\t          }\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    ]],\r\n");
      out.write("\t\t    pagination:true,\r\n");
      out.write("\t\t    toolbar:\"#tb\"\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t //点击新增按钮会弹出一个对话框\r\n");
      out.write("\t $(function() {\r\n");
      out.write("\t \t//点击新增按钮\r\n");
      out.write("\t\t$(\"#add\").click(function() {\r\n");
      out.write("\t\t\t$(\"input[name='companyid']\").removeAttr(\"readonly\");\r\n");
      out.write("\t\t\t$(\"#form\").form(\"clear\");\r\n");
      out.write("\t\t\t//下拉框置为  --请选择--\r\n");
      out.write("\t\t\t$(\"#comLevel\").combobox(\"setValue\", \"-1\");\r\n");
      out.write("\t\t    $(\"#parentCom\").combobox(\"setValue\", \"-1\");\r\n");
      out.write("\t\t\t//弹出对话框\r\n");
      out.write("\t\t\t$(\"#dlg\").dialog({\r\n");
      out.write("\t\t\t    title: '新增单位',    \r\n");
      out.write("\t\t\t    width: 400,\r\n");
      out.write("\t\t\t    height: 300,    \r\n");
      out.write("\t\t\t    closed: false,    \r\n");
      out.write("\t\t\t    modal: true   \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t });\r\n");
      out.write("\t \r\n");
      out.write("\t $(function() {\r\n");
      out.write("\t \t /**\r\n");
      out.write("\t \t * 获取所有已选中的列表框\r\n");
      out.write("\t \t */\r\n");
      out.write("\t\t function getSelectionsIds(){\r\n");
      out.write("\t    \tvar itemList = $(\"#mytable\");\r\n");
      out.write("\t    \tvar sels = itemList.datagrid(\"getSelections\");\r\n");
      out.write("\t    \tvar ids = [];\r\n");
      out.write("\t    \tfor(var i in sels){\r\n");
      out.write("\t    \t\tids.push(sels[i].companyid);\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t    \tids = ids.join(\",\");\r\n");
      out.write("\t    \treturn ids;\r\n");
      out.write("\t    }\r\n");
      out.write("\t \t$(\"#upd\").click(function() {\r\n");
      out.write("\t \t\tvar ids = getSelectionsIds();\r\n");
      out.write("        \tif(ids.length == 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','必须选择一个单位才能编辑!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tif(ids.indexOf(',') > 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','只能选择一个单位!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tvar select = $(\"#mytable\").datagrid(\"getSelected\");\r\n");
      out.write("        \t$(\"#form\").form(\"load\", select);\r\n");
      out.write("        \t$(\"#dlg\").dialog({\r\n");
      out.write("\t\t\t    title: '编辑新增单位',    \r\n");
      out.write("\t\t\t    width: 400,\r\n");
      out.write("\t\t\t    height: 300,    \r\n");
      out.write("\t\t\t    closed: false,    \r\n");
      out.write("\t\t\t    modal: true\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t \t});\r\n");
      out.write("\t \t$(\"#del\").click(function() {\r\n");
      out.write("\t \t\tvar ids = getSelectionsIds();\r\n");
      out.write("        \t$.messager.confirm('确认','确定删除ID为 '+ids+' 的单位吗？',function(r){\r\n");
      out.write("        \t    if (r){\r\n");
      out.write("        \t    \tvar params = {\"ids\":ids};\r\n");
      out.write("                \t$.post(\"/company/delete\",params, function(data){\r\n");
      out.write("            \t\t\tif(data.status == '200'){\r\n");
      out.write("            \t\t\t\t$.messager.alert('提示','删除单位成功!',undefined,function(){\r\n");
      out.write("            \t\t\t\t\t$(\"#mytable\").datagrid(\"reload\");\r\n");
      out.write("            \t\t\t\t});\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t\t});\r\n");
      out.write("        \t    }\r\n");
      out.write("        \t});\r\n");
      out.write("\t \t});\r\n");
      out.write("\t });\r\n");
      out.write(" \t //将数据展示在下拉框之中\r\n");
      out.write("\t $(function() {\r\n");
      out.write("\t \t$(\"#parentCom\").combobox({\r\n");
      out.write("\t\t    url:'/company/lc',\r\n");
      out.write("\t\t    valueField:'companyid', //下拉框的value属性   \r\n");
      out.write("\t\t    textField:'companyname', //显示在下拉框中的数据\r\n");
      out.write("\t\t    value:-1 //默认显示  --请选择--\r\n");
      out.write("\t\t});\r\n");
      out.write("\t });\r\n");
      out.write("\r\n");
      out.write("\t//onSubmit:  在提交前触发\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#fok\").click(function() {\r\n");
      out.write("\t\t\t$(\"#form\").form(\"submit\",{\r\n");
      out.write("\t\t\t    url:\"/company/change\",\r\n");
      out.write("\t\t\t    success:function(data){\r\n");
      out.write("\t\t\t    \tvar data = eval('(' + data + ')');\r\n");
      out.write("\t\t\t    \tif (data.status == 200) {\r\n");
      out.write("\t\t\t    \t\t$.messager.alert(\"通知\",data.msg,'info', function() {\r\n");
      out.write("\t\t\t    \t\t//重新加载datagrid中的数据\r\n");
      out.write("\t\t\t    \t\t$(\"#mytable\").datagrid(\"reload\");\r\n");
      out.write("\t\t    \t\t\t//关闭对话框窗口\r\n");
      out.write("\t\t    \t\t\t$(\"#dlg\").dialog(\"close\");\r\n");
      out.write("\t\t    \t\t\t//清除表单数据\r\n");
      out.write("\t\t    \t\t\t$(\"#form\").form(\"clear\");\r\n");
      out.write("\t\t    \t\t\t//重新恢复默认  请选择\r\n");
      out.write("\t\t    \t\t\t$(\"#comLevel\").combobox(\"setValue\", \"-1\");\r\n");
      out.write("\t\t    \t\t\t$(\"#parentCom\").combobox(\"setValue\", \"-1\");\r\n");
      out.write("\t\t\t    \t\t});\r\n");
      out.write("\t\t\t    \t} else {\r\n");
      out.write("\t\t\t    \t\talert(\"失败\");\r\n");
      out.write("\t\t\t    \t}\r\n");
      out.write("\t\t\t    }    \r\n");
      out.write("\t\t\t});  \r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table id=\"mytable\"></table>\r\n");
      out.write("\t<div id=\"tb\">\r\n");
      out.write("\t\t<a   id = \"add\" class=\"easyui-linkbutton\" iconCls =\"icon-add\">新增</a>\r\n");
      out.write("\t\t<a   id = \"upd\"  class=\"easyui-linkbutton\"  iconCls =\"icon-edit\">修改</a>\r\n");
      out.write("\t\t<a  id = \"del\"   class=\"easyui-linkbutton\"  iconCls =\"icon-remove\">删除</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t <div id=\"dlg\">\r\n");
      out.write("\t \t<form id=\"form\" method=\"post\">\r\n");
      out.write("\t \t<table id=\"table\" style=\"height: 100%;width: 100%\">\r\n");
      out.write("\t \t\t<tr>\r\n");
      out.write("\t\t \t\t<td style=\"text-align:center;width: 100px\">单位编号</td>\r\n");
      out.write("\t\t \t\t<td><input id=\"mycompanyid\" class=\"easyui-textbox\" name=\"companyid\" style=\"width:200px;\" readonly=\"readonly\"></td>\r\n");
      out.write("\t \t\t</tr>\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t<tr>\r\n");
      out.write("\t\t \t\t<td style=\"text-align:center;width: 100px\">单位名称</td>\r\n");
      out.write("\t\t \t\t<td><input class=\"easyui-textbox\" name=\"companyname\" style=\"width:200px\"> </td>\r\n");
      out.write("\t \t\t</tr>\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t<tr>\r\n");
      out.write("\t\t \t\t<td style=\"text-align:center;width: 100px\">行政区划号码</td>\r\n");
      out.write("\t\t \t\t<td> <input class=\"easyui-textbox\" name =\"admindivi\"  style=\"width:200px\"> </td>\r\n");
      out.write("\t \t\t</tr>\r\n");
      out.write("\t \t\t<tr>\r\n");
      out.write("\t\t \t\t<td style=\"text-align:center;width: 100px\">所属直接父单位</td>\r\n");
      out.write("\t\t \t\t<td>\r\n");
      out.write("\t\t \t\t\t<select id=\"parentCom\" class=\"easyui-combobox\"  validType=\"valDefaultOption\"  name=\"parentid\" style=\"width:200px;\">   \r\n");
      out.write("\t\t \t\t\t\t<option value=\"-1\">--请选择--</option>\r\n");
      out.write("\t\t \t\t\t\t<option value=\"0\">无父部门</option>\r\n");
      out.write("\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t \t\t</tr>\r\n");
      out.write("\t \t\t<tr>\r\n");
      out.write("\t\t \t\t<td style=\"text-align:center;width: 100px\">单位级别</td>\r\n");
      out.write("\t\t \t\t<td>\r\n");
      out.write("\t\t \t\t\t<select id=\"comLevel\" class=\"easyui-combobox\"  validType=\"valDefaultOption\" name=\"comlevel\" style=\"width:200px;\">   \r\n");
      out.write("\t\t \t\t\t\t<option value=\"-1\">--请选择--</option>\r\n");
      out.write("\t\t \t\t\t\t<option value=\"1\">市级</option>\r\n");
      out.write("\t\t \t\t\t\t<option value=\"2\">区级</option>\r\n");
      out.write("\t\t \t\t\t\t<option value=\"3\">所级</option>\r\n");
      out.write("\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t \t\t</tr>\r\n");
      out.write("\t \t\t<tr>\r\n");
      out.write("\t\t \t\t<td style=\"text-align:center;width: 100px\">备注</td>\r\n");
      out.write("\t\t \t\t<td><input class=\"easyui-textbox\" name =\"descript\" style=\"width:200px\"> </td>\r\n");
      out.write("\t \t\t</tr>\r\n");
      out.write("\t \t</table>\r\n");
      out.write("\t \t<div style=\"width: 100%;text-align: center;\"><a id = \"fok\" class=\"easyui-linkbutton\" iconCls =\"icon-ok\">提交</a></div>\r\n");
      out.write("\t \t</form>\r\n");
      out.write("\t </div>\r\n");
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
}