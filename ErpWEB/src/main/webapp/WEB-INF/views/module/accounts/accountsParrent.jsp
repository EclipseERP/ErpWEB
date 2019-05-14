
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <c:import url="/WEB-INF/views/include/accountsHeader.jsp" ></c:import>
   <c:import url="/WEB-INF/views/module/accounts/accounts-menu.jsp"></c:import>
    
    <div class="content-wrapper" > 

    <div ng-view></div>
        <!-- Main content -->
    
		<!--Sales Graph and Calendar-->

    </div>
    
   <%@ include file="/WEB-INF/views/include/accountsFooter.jsp" %>