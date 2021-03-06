<%@page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="code" uri="/WEB-INF/code.tld" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<%@include file="/commons/hrm/head.ini" %>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/hrm/code.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/hrm/infoclass/property.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/hrm/select.js"></script>
	<script type="text/javascript">	
		var fixedWin = true;

		function fixedWindow( res ) {
			if( res ) {	//固定
				$("#mesbox_sel").hide();
				$("#message_list2").show();
				$("#mesbox_title").attr("style","background-image:none!important");
				$(".prompt").hide();
			} else {	//取消固定
				$("#message_list2").hide();
				$(".datetitle_01 li").attr("class","ico_xl");
				$(".prompt").show();
			}
			
			$("input[name='fixedWin']").val(res);
			fixedWin = res;
			
			return false;
		}

		$(function(){
			//显示、编辑、必填、同步、虚拟条件检索
			$("input:checkbox").click(function(){
				var object=document.getElementsByName("checkboxSel");
				var value = new Array();
				for(var i = 0; i < object.length; i++){
				  if(object[i].checked){					  
				    value.push(object[i].value);
				  }
				}	
				$("#checkboxSel").attr("value",value);
				$("form:first").submit();				
				return false;
			});
			
			$(".datetitle_01 li").hover(function(){
				if(fixedWin) return false;
				
				$(this).parent().next().show();
				$(this).attr("class","sel_dropdown")
			},function(){
				if(fixedWin) return false;
				
				$(this).parent().next().hide();
				$(".datetitle_01 li").attr("class","ico_xl");
			});
			
			$("#mesbox_sel").hover(function(){
				$("#mesbox_sel").show();
				$(".datetitle_01 li").attr("class","sel_dropdown");
			},function(){
				$("#mesbox_sel").hide();
				$(".datetitle_01 li").attr("class","ico_xl");
				if(fixedWin) $(".datetitle_01 li").removeClass("ico_xl");;
			})
			
			//固定窗口
			$("#Fixed_win").click(function(){
				fixedWindow(true);
			})
			
			//取消固定窗口
			$(".ico_close03").click(function(){
				fixedWindow(false);
			})

			//关闭提示信息
			$(".close").click(function(){
				$(".prompt").hide();
			})
			
			//目录增加
			$(".mes_add1").click(function(){
				showWindow("增加","<%=request.getContextPath() %>/infoclass/infocatalog_edit.html?type=${catalog.type}", 480, 180);
			})

			//信息类增加
			$(".mes_add2").click(function(){
				var cid = $(this).closest("ul").prev().attr("name");
				showWindow("增加","<%=request.getContextPath() %>/infoclass/infoclass_edit.html?catalog.guid="+cid, 480, 400);
			})
			
			var res = false;
			
			//信息类选择
			$(".mes_list_con ul li").click(function(){
				if( $(this).attr("name") == null ) return;
				if( res ) return;
				
				$("#guid").val( $(this).attr("name") );
				$("form:first").submit();
			})
                
			//信息类监听
			$(".mes_list_con li").hover(function(){
				if( $(this).attr("name") == null ) return;

				if( $(this).attr("editable") == "false" ) return;

				var $mes_list_tools=$("#mes_list_tools").html();
				
				res = false;

				$(this).append($mes_list_tools).css("position","relative").children(".mes_list_tools").show();
				if($(this).attr("xxly") == "system") {
					$(this).find("#btn_scxxl").css("height","0px");
				}

				//信息类修改
				$(".ico_edit_mes").click(function(){
					res = true;
					var guid = $(this).closest("li").attr("name");
					showWindow("修改","<%=request.getContextPath() %>/infoclass/infoclass_edit.html?guid="+guid, 480, 400);
				})

				//信息类删除
				$(".ico_delete_mes").click(function(){
					var guid = $(this).closest("li").attr("name");

					showConfirm("确定要删除吗？");

					$("#why_cancel").click(function(){
						divClose();
					})
					
					$("#why_sure").click(function(){
						$.post('<%=request.getContextPath() %>/infoclass/infoclass_remove.html', 'guid='+guid, function(data){
							var callback = function(){
								window.location.href = "<%=request.getContextPath() %>/infoclass/infoclass_list.html?catalog.type=baseData";
								//$("form:first").submit();
								//window.location.reload();
							};
							
							processDataCall(data, callback);

						}, "json");
					})

					return false;
				})
			},function(){
				$(this).find(".mes_list_tools").remove();
			})
			
			//信息类目录监听
			$(".mes_list_con h2").hover(function(){
				var $mes_list_tools=$("#mes_list_tools").html();
				$(this).append($mes_list_tools).css("position","relative").children(".mes_list_tools").css("display","block");

				//信息类目录修改
				$(".ico_edit_mes").click(function(){
					var guid = $(this).closest("h2").attr("name");
					showWindow("修改","<%=request.getContextPath() %>/infoclass/infocatalog_edit.html?guid="+guid, 480, 180);
				})

				//信息类目录删除
				$(".ico_delete_mes").click(function(){
					var len = $(this).closest("h2").next().find("li").length;

					if( len > 1 )
					{
						showWarning("该目录下存在信息类，无法删除！");
						return;
					}
					
					var guid = $(this).closest("h2").attr("name");

					showConfirm("确定要删除吗？");

					$("#why_cancel").click(function(){
						divClose();
					})

					$("#why_sure").click(function(){
						$.post('<%=request.getContextPath() %>/infoclass/infocatalog_remove.html', 'guid='+guid, function(data){
							var callback = function(){
								$("form:first").submit();
							};
							
							processDataCall(data, callback);
						}, "json");
					})
				})
			},function(){
				$(this).find(".mes_list_tools").remove();
			})
			//导出
            $("#btn_dc").click(function(){
            	window.open("<%=request.getContextPath() %>/infoclass/infoclass_expDate.html?catalog.type=teacher");
            })

		})
		
		var current = null;
		
		function currentF(name){
			if( name == null || name == "" || name == current )
			{
				return false;
			}

			
			$("li[name='" + current + "']").removeClass("current");
			current = name;
			$("input[name='guid']").val(name);
			
			$("li[name='" + name + "']").attr("class", "current");
		}		
	</script>
</head>

<body>
	<form action="<%=request.getContextPath() %>/infoclass/infoclass_list.html" method="post">
		<input type="hidden" id="guid" name="guid" value="${model.guid }" />
		<input type="hidden" name="catalog.type" value="${model.catalog.type }" />
		<input type="hidden" name="fixedWin" value="${fixedWin }" />
		<input type="hidden" id="checkboxSel" name="hdncheckboxSel" value="${init }"/>
	</form>
	
	<div id="mes_list_tools">
		<div class="mes_list_tools" style="display:none;">
			<span id="btn_xgxxl" class="ico_edit_mes"></span>
			<span id="btn_scxxl" class="ico_delete_mes"></span>
		</div>
	</div>
		
	<div class="selectbox" style="position:relative; z-index: 1;" >
		<ul class="datetitle_01">
			<li class="">信息类列表</li>
			<%--<a id="btn_dc" style='font-size:12px;color: blue;'>[数据字典导出]</a>
		--%></ul>
		<div class="mesbox_sel" id="mesbox_sel" style="display:none;">
			<c:forEach items="${list }" var="catalog">
			<div class="mes_list_con">
				<h2 name="${catalog.guid }"><a href="#">${catalog.name }</a></h2>
				<ul>
					<c:forEach items="${catalog.classes}" var="clasz">
					<li name="${clasz.guid }" editable="${clasz.typeInfo.editable }" xxly="${clasz.xxly}"><a href="#">${clasz.name }</a></li>
					</c:forEach>
					<li class="mes_add"><a id="btn_zjxxl" href="#"><span class="mes_add2" title="添加信息类">+ 添加</span></a></li>
				</ul>
				<div class="clear"></div>
			</div>
			</c:forEach>
			
			<div class="mes_list_con">
				<h3>&nbsp;<a id="btn_zjxxlml" href="#"><span class="mes_add1" title="添加信息类目录">+ 添加</span></a></h3>
				<div class="clear"></div>
			</div>
			<h1>
				<a href="#" id="Fixed_win" class="name" title="固定目录窗口">固定窗口</a>
			</h1>
		</div>
		
		<div class="mes_list" id="message_list2" style="display: block;">
			<a class="ico_close03"  onmouseover="this.className='ico_close02'" onmouseout="this.className='ico_close03'" href="#" title="取消固定"></a>
			
			<c:forEach items="${list }" var="catalog">
			<div class="mes_list_con">
				<h2 name="${catalog.guid}"><a href="#">${catalog.name }</a></h2>
				<ul>
					<c:forEach items="${catalog.classes}" var="clasz">
					<li name="${clasz.guid }" editable="${clasz.typeInfo.editable }" xxly="${clasz.xxly}"><a href="#">${clasz.name }</a></li>
					</c:forEach>
					<li class="mes_add"><a id="btn_zjxxl" href="#"><span class="mes_add2" title="添加信息类">+ 添加</span></a></li>
				</ul>
				<div class="clear"></div>
			</div>
			</c:forEach>
			
			<div class="mes_list_con">
				<h3>&nbsp;<a id="btn_zjxxlml" href="#"><span class="mes_add1" title="添加信息类目录">+ 添加</span></a></h3>
				<div class="clear"></div>
			</div>
		</div>
	</div>

	<div class="prompt" style="display: none; z-index: 0;">
		<h3><span>操作提示：</span></h3>
		<p>鼠标移动至"信息类列表"可以选择/切换信息类</p>
		<a class="close" title="隐藏"></a>
	</div>
    
    <jsp:include page="property_list.jsp" flush="true"></jsp:include>
    
	<script type="text/javascript">
		currentF("${model.guid}");
		
		<c:if test="${fixedWin eq false}">
			fixedWindow( false );
		</c:if>
	</script>
</body>
</html>