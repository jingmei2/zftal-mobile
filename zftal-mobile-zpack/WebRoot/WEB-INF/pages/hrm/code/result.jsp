<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
  <%@ include file="/commons/hrm/head.ini" %>
<script type="text/javascript">
$(function(){//回调父页面函数
	parent.callback('${data.html}',${data.success});
});
</script>
  </head>
  <body>
  </body>
</html>
