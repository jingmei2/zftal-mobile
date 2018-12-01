<%@page import="com.zfsoft.hrm.config.ICodeConstants"%>
<%@page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ct" uri="/custom-code"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/hrm/imageUpload.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery.ui.all.css" type="text/css" media="all" />
<%@ include file="/commons/hrm/head_v5.ini" %>
<style>
        .ui-autocomplete{
            z-index:12001;
            width: 500px
        }
    </style>
    <script type="text/javascript">
    $(function(){
    	$("#cancel").click(function(){
            history.go(-1);
            return false;
        });
        
        $(".close").click(function(){
        	history.go(-1);
            return false;
        });
        
        $("#save").click(function() {
            $.ajax({
              url:"<%=request.getContextPath() %>/basedata/basedata_savePicture.html",
              type:"post",
              dataType:"json",
              data:$("#form_edit").serialize(),
              success:function(data) {
            	  var callback = function(){
  					location.href = "<%=request.getContextPath() %>/basedata/basedata_setInfoClazzNew.html"
  				};
                 	openAlert("操作成功!", "s", "auto", callback);
              }
            });
            return false;
          });
        
    });
     </script>
</head>
<body>
  <jsp:include page="/WEB-INF/pages/globalweb/modal.jsp" flush="true"></jsp:include>
    <form name="search" id="form_edit" method="post">
    <input type="hidden" id="guid" name="model.classId" value="${model.classId }">
    <input type="hidden" id="classId" name="classId" value="${classId }">
            <div class="modal-header" style="background: #2587de;">
                <button type="button" class="close" style="color:#FFFFFF;"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title text-left" id="myModalLabel" style="color:#FFFFFF;">上传个人档案图标</h4>
            </div>
            <div class="modal-body" style="background-color: #fff;">
            <jsp:include page="../../globalweb/alert.jsp" flush="true"></jsp:include>
                <div class="tab" style="clear: both;max-height: 500px;overflow: auto;">
            <table width="100%"  border="0" class="formlist" cellpadding="0" cellspacing="0">
             <tbody>
             <tr>
	            <th width="30%">
	              <span class="red"></span>个人档案Logo图片
	            </th>
	            <td width="70%">
	              ${imageHtml }
	            </td>
	          </tr>
              
             </tbody>
            </table>
       </div> 
            </div>
            <div class="modal-footer" style="background-color: #fff;">
                <button type="button" class="btn btn-primary" id="save">保 存</button>
                <button type="button" class="btn btn-primary" id="cancel">取 消</button>
            </div>
    </form>

</body>
</html>