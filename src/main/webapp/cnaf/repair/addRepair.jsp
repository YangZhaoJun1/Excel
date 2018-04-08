 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" ></c:set>
<jsp:include page="/initialEasyUI.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



 <body>

 <div class="easyui-panel" title="" style="width:100%;max-width:400px;padding:40px 60px; border:0px;">
	 <form action="" method="post" id="mainForm">
		 <input name="autoId" type="hidden" value="${param.cid }" />
		 <div style="margin-bottom:30px">
			 <label>车牌号：</label>
			 <input class="easyui-textbox" name="carId" style="width:100%" data-options="required:true">
		 </div>
		 <div style="margin-bottom:30px">
			 <label>维修日期：</label>
			 <input class="easyui-textbox" name="repairDate" style="width:100%" >
		 </div>
		 <div style="margin-bottom:30px">
			 <label>维修原因：</label>
			 <input class="easyui-textbox" name="reason" style="width:100%" >
		 </div>
		 <div style="margin-bottom:30px">
			 <label>维修金额（元）：</label>
			 <input class="easyui-textbox" name="money" style="width:100%" >
		 </div>
		 <div style="margin-bottom:30px">
			 <label>维修内容：</label>
			 <input class="easyui-textbox" name="position" style="width:100%" >
		 </div>
		 <div style="margin-bottom:30px">
			 <label>维修厂家：</label>
			 <input class="easyui-textbox" name="manufactor" style="width:100%" >
		 </div>
		 <div style="margin-bottom:30px">
			 <label>厂家电话：</label>
			 <input class="easyui-textbox" name="phone" style="width:100%" >
		 </div>
		 <div style="margin-bottom:30px">
			 <label>收据/正式发票：</label>
			 <input class="easyui-textbox" name="invoice" style="width:100%" >
		 </div>
		 <div style="margin-bottom:30px">
			 <label>车辆采购日期：</label>
			 <input class="easyui-textbox" name="buyDate" style="width:100%" >
		 </div>
		 <div style="margin-bottom:30px">
			 <label>驾驶员：</label>
			 <input class="easyui-textbox" name="driver" style="width:100%" >
		 </div>
	 </form>
 </div>
 </body>