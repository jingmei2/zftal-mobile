<%@ page language="java" import="java.util.*,com.zfsoft.hrm.config.ICodeConstants" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!doctype html>
<html style="background:#FFFFFF;">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
     <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/wap.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/amazeui.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/app.css">
    <title>帮助说明详情</title>
</head>
<body >
    <%@ include file="/WEB-INF/pages/mobile/web/new/js.jsp" %>

    <div class="pet_content pet_content_list" style="padding-top: 0px;">
        <div class="pet_zlnr">
	            <div class="pet_zlnr_user" style="padding: 20px 20px 0;" align="center">
	                    <div class="pet_zlnr_user_r_name">${model.title}</div>
	
	            </div>
            <div class="pet_zlnr_nr">
	                <article data-am-widget="paragraph"
	                         class="am-paragraph am-paragraph-default"
	
	                         data-am-paragraph="{ tableScrollable: true, pureview: true }">
	                         <c:if test="${not empty model.content }">
			                    ${model.content}
	                         </c:if>
	                         <c:if test="${empty model.content }">
	                         	(^_^)提示：没有可显示的内容
	                         </c:if>
	                </article>
                
				
            </div>

        </div>


    </div>
<script src="js/jquery.min.js"></script>
<script src="js/amazeui.min.js"></script>
<script>
    $(function(){

        // 动态计算新闻列表文字样式
        auto_resize();
        $(window).resize(function() {
            auto_resize();
        });
        $('.am-list-thumb img').load(function(){
            auto_resize();
        });
        $('.pet_article_like li:last-child').css('border','none');
        function auto_resize(){
            $('.pet_list_one_nr').height($('.pet_list_one_img').height());
            // alert($('.pet_list_one_nr').height());
        }
        $('.pet_article_user').on('click',function(){
            if($('.pet_article_user_info_tab').hasClass('pet_article_user_info_tab_show')){
                $('.pet_article_user_info_tab').removeClass('pet_article_user_info_tab_show').addClass('pet_article_user_info_tab_cloes');
            }else{
                $('.pet_article_user_info_tab').removeClass('pet_article_user_info_tab_cloes').addClass('pet_article_user_info_tab_show');
            }
        });

        $('.pet_head_gd_ico').on('click',function(){
            $('.pet_more_list').addClass('pet_more_list_show');
        });
        $('.pet_more_close').on('click',function(){
            $('.pet_more_list').removeClass('pet_more_list_show');
        });
    });

</script>
</body>
</html>