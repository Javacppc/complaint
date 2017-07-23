<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="auth" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/complain.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	.content {
		padding: 10px 10px 10px 10px;
	}
</style>
<title>12315投诉举报处理系统</title>
</head>
<body>
	<div data-options="region:'north'" style="height:100px">
        <img src="${pageContext.request.contextPath }/image/12315tsjb.jpg" style="height:95%;width:100%">
    </div>
	<!-- 功能选项 -->
	<div data-options="region:'west',title:'后台管理',split:'true'" style="width: 20%">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<auth:hasPermission name="系统管理">
				<div title="系统管理">
					<ul id="tree-Easyui" class="easyui-tree">
						<li data-options="attributes:{url:'/company'}">
							<span>单位管理</span>
						</li>
						<li data-options="attributes:{url:'/dept'}">
							<span>部门管理</span>
						</li>
						<li data-options="attributes:{url:'/user'}">
							<span>人员管理</span>
						</li>
						<li data-options="attributes:{url:'/role'}">
							<span>角色管理</span>
						</li>
						<li data-options="attributes:{url:'/module'}">
							<span>权限管理</span>
						</li>
						<li data-options="attributes:{url:'/report'}">
							<span>公告管理</span>
						</li>
					</ul>
				</div>
			</auth:hasPermission>
			<auth:hasPermission name="业务">
				<div title="业务管理">
					<ul id="atree-Easyui" class="easyui-tree">
						<auth:hasPermission name="登记">
							<li data-options="attributes:{url:'/register'}">
								<span>受理员登记</span>
							</li>
						</auth:hasPermission>
						<auth:hasPermission name="审核">
							<li data-options="attributes:{url:'/review'}">
								<span>案件审核与分流</span>
							</li>
						</auth:hasPermission>
						<auth:hasPermission name="反馈">
							<li data-options="attributes:{url:'/feedback'}">
								<span>办理员反馈</span>
							</li>
						</auth:hasPermission>
						<auth:hasPermission name="查询">
							<li data-options="attributes:{url:'/query'}">
								<span>投诉举报查询</span>
							</li>
						</auth:hasPermission>
						<auth:hasPermission name="报表">
							<li data-options="attributes:{url:'/statis'}">
								<span>报表统计</span>
							</li>
						</auth:hasPermission>
					</ul>
				</div>
			</auth:hasPermission>
		</div>
	</div>
	  <!-- 内容展示 -->
    <div data-options="region:'center'" style="width:80%;float:right;">
          <div class="easyui-tabs" data-options="border:false" style="width: 100%;height:100%" id="tabs-Easyui">
                <div data-options="title:'首页'">
                </div>
          </div>
    </div>
	
	<script type="text/javascript">
		$(function() {
			$("#tree-Easyui").tree({
				onClick: function(node) {
					//返回的是boolean类型的值
					var isCreate = $("#tabs-Easyui").tabs("exists",node.text);
					//防止每次打开同样的选项都需要新开一个选项卡
					if (isCreate) {
						//直接进入原来的选项卡
						tabs.tabs("select",node.text);
					} else {
						$("#tabs-Easyui").tabs("add",{
							title: node.text,
							closable: true,
							content: "<iframe src='"+node.attributes.url+"' style='width:100%;height:100%' />"
						});
					}
				}
			});
			$("#atree-Easyui").tree({
				onClick: function(node) {
					//返回的是boolean类型的值
					var isCreate = $("#tabs-Easyui").tabs("exists",node.text);
					if (isCreate) {
						tabs.tabs("select",node.text);
					} else {
						$("#tabs-Easyui").tabs("add",{
							title: node.text,
							closable: true,
							content: "<iframe src='"+node.attributes.url+"' style='width:100%;height:100%' />"
						});
					}
				}
			});
		});
	</script>
</body>
</html>