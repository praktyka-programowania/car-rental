<%@include file="/WEB-INF/common/header.jspf"%>
    <form:form commandName="car" method="post">
        <form:label path="company">Company</form:label>
        <form:input path="company" type="text" required="required"/>
        <form:label path="model">Model</form:label>
        <form:input path="model" type="text"/>
        <input type="submit" value="Search"/>
    </form:form>
<%@include file="/WEB-INF/common/footer.jspf"%>
