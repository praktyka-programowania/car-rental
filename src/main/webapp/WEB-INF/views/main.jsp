<%@include file="/WEB-INF/common/header.jspf"%>
<%@include file="/WEB-INF/common/navigation.jspf"%>
<div class="jumbotron">
    <h1>Navbar example</h1>
    <p>This example is a quick exercise to illustrate how the default, static navbar and fixed to top navbar work. It includes the responsive CSS and HTML, so it also adapts to your viewport and device.</p>
    <p>
        <a class="btn btn-lg btn-primary" href="#" role="button">View navbar docs &raquo;</a>
    </p>
</div>
<hr>
<div class="row">
    <div class="col-sm-12">
        <div class="row">
            <div class="col-md-6">
                <div class="well">
                    <h4 class="text-success"><span class="label label-success pull-right">{search_count_db}</span><a href="/search">Go searching</a>
                    </h4>
                </div>
            </div>
            <div class="col-md-6">
                <div class="well">
                    <h4 class="text-primary"><span class="label label-primary pull-right">{car_count_db}</span><a href="/display">Show all available</a>
                    </h4>
                </div>
            </div>
        </div><!--/row-->
    </div><!--/col-12-->
</div><!--/row-->

<%@include file="/WEB-INF/common/footer.jspf"%>
