<%@page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ct" uri="/custom-code"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<%@include file="/commons/hrm/head.ini" %>
	
	<script type="text/javascript">
		$(function(){
			$("#save").click(function(){
				if( $("#form1 input[name='model.userId']").val() == "" ) {
					alert("职工号不得为空，请重新输入！");
					return false;
				}
				
				$.post('<%=request.getContextPath() %>/retire/retire_save.html', $('form:last').serialize(), function(data){
					var callback = function(){
						$("form:first").submit();
					};
					processDataCall(data,callback);
				},"json");

				return false;
			})
			
			$("#cancel").click(function(){
				divClose();
				return false;
			})
		})
	</script>
</head>

<body>
	<form>
		<input type="hidden" name="state" value="1"/> 
		<div class="tab">
			<table width="100%"  border="0" class="formlist" cellpadding="0" cellspacing="0">
				<thead>
					<tr>
						<th colspan="2">
							<span>人员选择<font color="#0f5dc2" style="font-weight:normal;"></font></span>
						</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<td colspan="2">
							<div class="bz">"<span class="red">*</span>"为必填项</div>
							<div class="btn">
								<button id="save">增 加</button>
								<button id="cancel">取 消</button>
							</div>
						</td>
					</tr>
				</tfoot>
				<tbody id="form1">
					<tr>
						<th>
							<span class="red">*</span>职工号
						</th>
						<td>
							<%--<input type="text" class="text_nor" id="model.userId" name="model.userId" size="35" />
							--%><ct:selectPerson name="model.userId" id="model.userId" value="${model.userId }"/>
						</td>
					</tr>
					<!-- 20140425 add start -->
					<tr>
                        <th>退休通知人员</th>
                        <td>
                            <ct:selectPerson name="model.receiver" id="model.receiver" value="${model.receiver}" single="false"/>
                        </td>
                    </tr>
					<!-- 20140425 add end -->
				</tbody>
			</table>
		</div>
	</form>
</body>
</html>
