<%@page import="com.zfsoft.hrm.config.ICodeConstants"%>
<%@page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ct" uri="/custom-code"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/laydate/theme/default/laydate.css" type="text/css"/>
<%@ include file="/commons/hrm/head_v5.ini" %>
<style>
        .ui-autocomplete{
            z-index:12001;
            width: 500px
        }
        
        .demo-input{padding-left: 10px; height: 38px; min-width: 262px; line-height: 38px; border: 1px solid #e6e6e6;  background-color: #fff;  border-radius: 2px;}
        
    </style>
    
    <script type="text/javascript" src="<%=request.getContextPath() %>/assets/js/jquery.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/laydate/laydate.js"></script>
    
    <script type="text/javascript">
    $(function(){
    	
    	$("img").mouseover(function(){
    		$(this).attr("width","160px");
    		$(this).attr("height","160px");
    	}).mouseout(function(){
    		$(this).attr("width","80px");
    		$(this).attr("height","80px");
    	});
    	
        $("#save_btn").click(function(){
            
            $.post("<%=request.getContextPath()%>/reportFix/reportFix_updateStatusById.html",$("#form_edit").serialize(),function(data){
            	if(data.code=='1'){
	               window.parent.$('#myModal_toji').modal('hide');
	               parent.location.reload();
            	}else{
            	   errorAlert(data.msg);
            	}
            },"json");
        });
      
        
        $("#cancel").click(function(){
        	window.parent.$('#myModal_toji').modal('hide');
        	return false;
        });
        
        $(".close").click(function(){
        	window.parent.$('#myModal_toji').modal('hide');
        	return false;
        });
        
     });
    
     </script>
</head>
<body>
    <form action="<%=request.getContextPath()%>/vote/vote_hdVoteAdd.html" name="search" id="form_edit" method="post">
        <div class="sl_mod modal-content">
            <div class="modal-header">
                <button type="button" class="close"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title text-left" id="myModalLabel">仓库信息</h4>
            </div>
            <div class="modal-body">
            <jsp:include page="../../globalweb/alert.jsp" flush="true"></jsp:include>
                <div class="tab" style="clear: both;max-height: 500px;overflow: auto;">
            <table width="100%"  border="0" class="formlist" cellpadding="0" cellspacing="0">
             <tbody>
              <tr>
              <!--缺字段名 value值 -->
                  <th width="30%" >
                     	名称
                  </th>
                   <td >
                       <input maxlength="50" placeholder="不要超过50个字符哦(^_^)" name="" type="text" value="" class="form-control" readonly="readonly"/>
                  </td>
              </tr>
              <tr>
                 <th width="30%" >
                                                            数量
                 </th>
                  <td >
                     <input maxlength="50" placeholder="不要超过50个字符哦(^_^)" name="" type="text" value="" class="form-control" readonly="readonly"/>
                 </td>
              </tr>
              <tr>
                 <th width="30%" >
                       	备注                                    
                 </th>
                  <td >
                      <input maxlength="50" placeholder="不要超过50个字符哦(^_^)" name="" type="text" value="" class="form-control" readonly="readonly"/>
                 </td>
              </tr>
               
             </tbody>
            </table>
       </div> 
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" id="save_btn">保存</button>
            </div>
        </div>
    </form>

</body>
</html>