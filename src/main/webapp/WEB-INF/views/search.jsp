<%@include file="/WEB-INF/common/header.jspf"%>
    <form:form commandName="car" method="post">
        <div class="form-group">
        <form:label path="company">Company</form:label>
        <form:input path="company" class="form-control" type="text" required="required"/>
        </div>

        <div class="form-group">
        <form:label path="model">Model</form:label>
        <form:input path="model" class="form-control" type="text"/>
        </div>

        <div class="form-group">
        <form:label path="year">Year</form:label>
        <form:input path="year" class="form-control" type="number" min="1990" max="2017"/>
        </div>

        <input type="submit" class="btn btn-primary" value="Search"/>
    </form:form>
<%@include file="/WEB-INF/common/footer.jspf"%>
