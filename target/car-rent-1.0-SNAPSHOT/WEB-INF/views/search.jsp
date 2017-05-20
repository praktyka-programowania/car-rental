<%@include file="/WEB-INF/common/header.jspf"%>

    <form:form commandName="car" method="post">
        <fieldset class="form-group">
            <form:label path="company">Company:</form:label>
            <form:select path="company" id="companyForm" class="select">
                <option value="" selected="selected">---</option>
                <c:forEach var="car" items="${list}">
                    <form:option value="${car.company}">${car.company}</form:option>
                </c:forEach>
            </form:select>
            <form:errors path="company" cssClass="text-warning"/>
        </fieldset>


        <fieldset class="form-group">
            <form:label path="model">Model:</form:label>
            <form:select path="model" id="modelForm" class="select">
                <option value="" selected="selected">---</option>
                <c:forEach var="car" items="${list}">
                    <form:option value="${car.model}" data-chained="${car.company}">${car.model}</form:option>
                </c:forEach>
            </form:select>
        </fieldset>


        <fieldset class="form-group">
            <form:label path="year">Year:</form:label>
            <form:select path="year" id="yearForm">
                <option value="0" selected="selected">---</option>
                <% for (int i = 2000; i < 2018; ++i) { %>
                <form:option value="<%= i%>"><%= i%></form:option>
                <%}%>
            </form:select>
        </fieldset>

    <input type="submit" value="Go searching">
    </form:form>

</div>
<script src="/resources/jquery-3.2.1.min.js"></script>
<script src="/resources/jquery.chained.js"></script>
<script src="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script>
   $(document).ready(
       function()
   {
       var previousOption;
       $('#companyForm option').each(function() {

           thisOption = this.text;
           if (this.text == previousOption) $(this).remove();
           previousOption= this.text;
       });


       $('#modelForm option').each(function() {

           thisOption = this.text;
           if (this.text == previousOption) $(this).remove();
           previousOption= this.text;
       });

       $("#modelForm").chained("#companyForm");
   });
</script>
</body>
</html>
