<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>劳动力市场管理系统-用户查询列表</title>
<link href="<%=request.getContextPath()%>/styles/css/common.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet" type="text/css" media="all" />
<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script>
	$(function(){
		//--------分页开始----------
		var sum = ${sum};
		$("#previous").click(function(){
			if($("#pageNo").val()<=1){
				alert("已到达首页");
				return ;
			}
			$("#pageNo").val(parseInt($("#pageNo").val())-1);
			$("#fm")[0].action="${pageContext.request.contextPath}/user/select";
			$("#fm").submit();
		});
		$("#next").click(function(){
			if($("#pageNo").val()>=sum){
				alert("已到达末页");
				return ;
			}
			$("#pageNo").val(parseInt($("#pageNo").val())+1);
			$("#fm")[0].action="${pageContext.request.contextPath}/user/select";
			$("#fm").submit();
		});
		$("#first").click(function(){
			$("#pageNo").val(1);
			$("#fm")[0].action="${pageContext.request.contextPath}/user/select";
			$("#fm").submit();
		});
		$("#last").click(function(){
			$("#pageNo").val(sum);
			$("#fm")[0].action="${pageContext.request.contextPath}/user/select";
			$("#fm").submit();
		});
		//--------分页结束----------
	});
</script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
	<div class="commonTitle">
	  <h2>当前位置：&nbsp;&gt;&gt; 系统管理&nbsp;&gt;&gt;用户管理 </h2>
	</div>

    <!--//commonTableSearch-->
    <form id="fm" action="" method="post">
   	 	<input type="hidden" name="uid" value=""/>
    	<input type="hidden" name="ActionType" value="" />
    <div id="buttenInsert">
    
    </div>
	
    <table width="101%" border="0" cellpadding="0" cellspacing="1" class="commonTable">
        <tr>
            <th>序号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>用户昵称</th>
            <th class="editColDefault">操作</th>
        </tr>
        <c:forEach items="${userList }" var="user" varStatus="status">
        <tr>
            <td align="center">${user.userId }</td>
            <td align="center">${user.userloginname }</td>
            <td align="center">${user.userpassword }</td>
			<td align="center">${user.userName }</td>
            <td align="center">
                <a href="#" class="btnIconDel" title="删除" onclick="delOneRow(this);"></a>
            </td>
        </tr>
        </c:forEach>
  	</table>
  	<!-- -----分页开始------- -->
  	<table align="right" width="30%" border="0" cellspacing="0" cellpadding="0">
    <tr align="center" class="line2">
      <td>
      	共${pageNo}页
      <input id="first" name="first" type="button" class="BUTTONs3"  value="首页" >
      <input id="previous" name="previous" type="button" class="BUTTONs3"  value="上一页" >
      <input type="text" id="pageNo" name="pageNo" value="${pageNo }" size="1"/>
      <input id="next" name="next" type="button" class="BUTTONs3"  value="下一页">
      <input id="last" name="last" type="button" class="BUTTONs3"  value="末页">
      </td>
    </tr>
	</table>  
	<!-- -----分页结束------- -->	
  	<table align="center" width="98%" border="0" cellspacing="0" cellpadding="0">
    <tr align="center" class="line2">
      <td><input name="button22" type="button" class="BUTTONs3"  value="打 印" >&nbsp;&nbsp;
      <input name="button23" type="button" class="BUTTONs3"  value="返 回"></td>
    </tr>
	</table>
	</form>
</body>
</html>