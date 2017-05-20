<%@include file="/WEB-INF/common/header.jspf"%>
<%@include file="/WEB-INF/common/navigation.jspf"%>
<hr>
<div class="row">
    <div class="col-sm-12">
        <div class="row">
            <div class="col-md-4">
                <div class="well">
                    <h4 class="text-danger"><span class="label label-danger pull-right">{rent_count_db}</span><a href="/">Cars rental store</a>
                    </h4>
                </div>
            </div>
            <div class="col-md-4">
                <div class="well">
                    <h4 class="text-success"><span class="label label-success pull-right">{search_count_db}</span><a href="/search">Go searching</a>
                    </h4>
                </div>
            </div>
            <div class="col-md-4">
                <div class="well">
                    <h4 class="text-primary"><span class="label label-primary pull-right">{car_count_db}</span><a href="/display">Show all available</a>
                    </h4>
                </div>
            </div>
        </div><!--/row-->
    </div><!--/col-12-->
</div><!--/row-->

<%@include file="/WEB-INF/common/footer.jspf"%>
