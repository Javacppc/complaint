<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="auth" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>12315投诉举报处理系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
</head>
<body class="easyui-layout">
      <div data-options="region:'north'" style="height:100px">
            <img  src="${pageContext.request.contextPath }/image/12315tsjb.jpg" style="height:97%;width:100%">
      </div>
      <div data-options="region:'west',title:'后台管理',split:'true'" style="width: 20%">
           <div class="easyui-accordion" data-options="fit:true,border:false">
               <auth:hasPermission name="系统管理">
	                <div title="系统管理">
	                     <ul id="tree-Easyui" class="easyui-tree">
	                         <li data-options="attributes:{url:'/company/'}">
								<span>单位管理</span>
							</li>
							<li data-options="attributes:{url:'/dept/'}">
								<span>部门管理</span>
							</li>
							<li data-options="attributes:{url:'/user/'}">
								<span>人员管理</span>
							</li>
							<li data-options="attributes:{url:'/role/'}">
								<span>角色管理</span>
							</li>
							<li data-options="attributes:{url:'/module/'}">
								<span>权限管理</span>
							</li>
							<li data-options="attributes:{url:'/report/'}">
								<span>公告管理</span>
							</li>
	                     </ul>
	                </div>
                </auth:hasPermission>
                <auth:hasPermission name="业务">
				<div title="业务管理">
					<ul id="atree-Easyui" class="easyui-tree">
						<auth:hasPermission name="登记">
							<li data-options="attributes:{url:'/register/'}">
								<span>受理员登记</span>
							</li>
						</auth:hasPermission>
						<auth:hasPermission name="审核">
							<li data-options="attributes:{url:'/review/'}">
								<span>案件审核与分流</span>
							</li>
						</auth:hasPermission>
						<auth:hasPermission name="反馈">
							<li data-options="attributes:{url:'/feedback/'}">
								<span>办理员反馈</span>
							</li>
						</auth:hasPermission>
						<auth:hasPermission name="查询">
							<li data-options="attributes:{url:'/query/'}">
								<span>投诉举报查询</span>
							</li>
						</auth:hasPermission>
						<auth:hasPermission name="报表">
							<li data-options="attributes:{url:'/statis/'}">
								<span>报表统计</span>
							</li>
						</auth:hasPermission>
					</ul>
				</div>
			</auth:hasPermission>
           </div>
      </div>
       <div data-options="region:'center'" style="width:80%">
            <div class="easyui-tabs" data-options="border:false" style="width: 100%;height:100%" id="tabs-Easyui">
                  <div data-options="title:'首页'" style="background-size:100%,97%">
                  </div>
            </div>
      </div>
      <script type="text/javascript">
	      $(function(){
	          $("#tree-Easyui").tree({
	               onClick:function(node){
	                    //console.info(node);
	                    //判断节点是否是叶子结点
	                    var isLeaf = $("#tree-Easyui").tree("isLeaf",node.target);
	                    if (!isLeaf) {
							return;
						}
						if (node.attributes==null||node.attributes.url==null) {
							$.messger.alert("警告","此功能正在开发中");
							return;
						}
						var url = node.attributes.url;
						var inMainTabs = $("#tabs-Easyui").tabs("exists",node.text);
						if (inMainTabs) {
							$("#tabs-Easyui").tabs("select",node.text);
						}else{
						    $("#tabs-Easyui").tabs("add",{
						           title:node.text,
						        closable:true,
						         content:"<iframe src='"+url+"'style='width:1022px;height:416px'/>"
						    });
						}
	               }
	          });
	          $("#atree-Easyui").tree({
	               onClick:function(node){
	                    console.info(node);
	                    //判断节点是否是叶子结点
	                    var isLeaf = $("#tree-Easyui").tree("isLeaf",node.target);
	                    if (!isLeaf) {
							return;
						}
						if (node.attributes==null||node.attributes.url==null) {
							$.messger.alert("警告","此功能正在开发中");
							return;
						}
						var url = node.attributes.url;
						var inMainTabs = $("#tabs-Easyui").tabs("exists",node.text);
						if (inMainTabs) {
							$("#tabs-Easyui").tabs("select",node.text);
						}else{
						    $("#tabs-Easyui").tabs("add",{
						           title:node.text,
						        closable:true,
						         content:"<iframe src='"+url+"'style='width:100%;height:97%'/>"
						    });
						}
	               }
	          });
	      });
      </script>
</body>
</html>