<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	//已定义校验
	$.extend($.fn.validatebox.defaults.rules, {    
	    valDefaultOption : {    
	        validator: function(value,param){
	        	if(value == "--请选择--"){
	        		return false;
	        	}else{
	        		return true;
	        	} 
	        },
	        message: "请选择有效的项目"
	    }
	});

	$(function() {
		//创建表格
		$("#table").datagrid({
			url:"/company/list",
			title:"单位管理",
			fit:true,//自适应
			striped : true,
			singleSelect : true ,
			//显示在前台的域
		    columns:[[    
		        {field:"companyid",title:"单位编号",width:"20%"},    
		        {field:"companyname",title:"单位名称",width:"20%"},
		        {field:"admindivi",title:"行政区划号码",width:"20%"},
		        {field:"comlevel",title:"单位级别",width:"20%",formatter:function(value, row, index) {
		        	if (value == 1) {
		        		return "市级";
		        	} else if (value == 2) {
		        		return "区级";
		        	} else if (value == 3) {
		        		return "局级";
		        	}
		          }
		        }
		    ]],
		    pagination:true,
		    toolbar:"#tb"
		}); 
	});

	 //点击新增按钮会弹出一个对话框
	 $(function() {
	 	//点击新增按钮
		$("#add").click(function() {
			//弹出对话框
			$("#dlg").dialog({
			    title: '新增单位',    
			    width: 400,
			    height: 300,    
			    closed: false,    
			    modal: true   
			});
		});
	 });
	 
	 $(function() {
	 	 /**
	 	 * 获取所有已选中的列表框
	 	 */
		 function getSelectionsIds(){
	    	var itemList = $("#table");
	    	var sels = itemList.datagrid("getSelections");
	    	var ids = [];
	    	for(var i in sels){
	    		ids.push(sels[i].id);
	    	}
	    	ids = ids.join(",");
	    	return ids;
	    }
	 	$("#upd").click(function() {
	 		var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','必须选择一个单位才能编辑!');
        		return ;
        	}
        	if(ids.indexOf(',') > 0){
        		$.messager.alert('提示','只能选择一个单位!');
        		return ;
        	}
        	var select = $("#table").datagrid("getSelected");
        	$("#form").form("load", select);
        	$("#dlg").dialog({
			    title: '编辑新增单位',    
			    width: 400,
			    height: 300,    
			    closed: false,    
			    modal: true
			});
	 	});
	 	$("#del").click(function() {
	 		var ids = getSelectionsIds();
        	if(ids.length == 0){
        		$.messager.alert('提示','未选中单位!');
        		return;
        	}
        	$.messager.confirm('确认','确定删除ID为 '+ids+' 的单位吗？',function(r){
        	    if (r){
        	    	var params = {"ids":ids};
                	$.post("/company/delete",params, function(data){
            			if(data.status == '200'){
            				$.messager.alert('提示','删除单位成功!',undefined,function(){
            					$("#table").datagrid("reload");
            				});
            			}
            		});
        	    }
        	});
	 	});
	 });
 	 //将数据展示在下拉框之中
	 $(function() {
	 	$("#parentCom").combobox({
		    url:'/company/lc',
		    valueField:'companyid', //下拉框的value属性   
		    textField:'companyname', //显示在下拉框中的数据
		    value:'-1' //默认显示  --请选择--
		});
	 });

	//onSubmit:  在提交前触发
	$(function() {
		$("#fok").click(function() {
			$("#form").form("submit",{
			    url:"/company/change",
			    success:function(data){
			    	var data = eval('(' + data + ')');
			    	if (data.status == "200") {
			    		$.messager.alert("通知",data.msg,'info', function() {
			    		//重新加载datagrid中的数据
			    		$("#table").datagrid("reload");
		    			//关闭对话框窗口
		    			$("#dlg").dialog("close");
		    			//清除表单数据
		    			$("#form").form("clear");
		    			//重新恢复默认  请选择
		    			$("#comLevel").combobox("setValue", "-1");
		    			$("#parentCom").combobox("setValue", "-1");
			    		});
			    	} else {
			    		alert("失败");
			    	}
			    }    
			});  
		});
	});
</script>
</head>
<body>
	<table id="table"></table>
	<div id="tb">
		<a   id = "add" class="easyui-linkbutton" iconCls ="icon-add">新增</a>
		<a   id = "upd"  class="easyui-linkbutton"  iconCls ="icon-edit">修改</a>
		<a  id = "del"   class="easyui-linkbutton"  iconCls ="icon-remove">删除</a>
	</div>
	 <div id="dlg">
	 	<form id="form" method="post">
	 	<table id="table" style="height: 100%;width: 100%">
	 		<tr>
		 		<td style="text-align:center;width: 100px">单位名称</td>
		 		<td><input class="easyui-textbox" name="companyname" style="width:200px"> </td>
	 		</tr>
	 		
	 		<tr>
		 		<td style="text-align:center;width: 100px">行政区划号码</td>
		 		<td> <input class="easyui-textbox" name ="admindivi"  style="width:200px"> </td>
	 		</tr>
	 		<tr>
		 		<td style="text-align:center;width: 100px">所属直接父单位</td>
		 		<td>
		 			<select id="parentCom" class="easyui-combobox"  validType="valDefaultOption"  name="parentid" style="width:200px;">   
		 				<option value="-1">--请选择--</option>
		 				<option value="0">无父部门</option>
					</select> 
				</td>
	 		</tr>
	 		<tr>
		 		<td style="text-align:center;width: 100px">单位级别</td>
		 		<td>
		 			<select id="comlevel" class="easyui-combobox"  validType="valDefaultOption" name="comlevel" style="width:200px;">   
		 				<option value="-1">--请选择--</option>
		 				<option value="1">市级</option>
		 				<option value="2">区级</option>
		 				<option value="3">所级</option>
					</select> 
				</td>
	 		</tr>
	 		<tr>
		 		<td style="text-align:center;width: 100px">备注</td>
		 		<td><input class="easyui-textbox" name ="descript" style="width:200px"> </td>
	 		</tr>
	 	</table>
	 	<div style="width: 100%;text-align: center;"><a id = "fok" class="easyui-linkbutton" iconCls ="icon-ok">提交</a></div>
	 	</form>
	 </div>
</body>
</html>